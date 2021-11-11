package com.example.coroutine6;

import org.jetbrains.annotations.NotNull;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

class HelloJava2 {
    Continuation continuation;
    public HelloJava2(Continuation o) {
        continuation = o;
    }

    public void susMethod() {

        NetWork netWork = new NetWork();
        /*netWork.loadApi(new Continuation<Object>() {
            @Override
            public CoroutineContext getContext() {
                return EmptyCoroutineContext.INSTANCE;
            }

            @Override
            public void resume(Object value) {
                //拿数据
                System.out.println("resume");
            }

            @Override
            public void resumeWithException(@NotNull Throwable throwable) {
                //处理异常
            }
        });*/

        netWork.loadApi(continuation);
    }
}
