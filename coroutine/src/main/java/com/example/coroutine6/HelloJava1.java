package com.example.coroutine6;

public class HelloJava1 {
    TestThread testThread;

    public HelloJava1(TestImpl test) {
        this.testThread = new TestThread(test);
    }

    public void start() {
        Thread thread = new Thread((testThread));
        thread.start();
    }

    class TestThread implements Runnable {

        public TestThread(TestImpl testImpl) {
            this.testImpl = testImpl;
        }

        TestImpl testImpl;

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (testImpl != null) {
                testImpl.finish();
            }
        }
    }

    interface TestImpl {
        void finish();

        void error();
    }
}
