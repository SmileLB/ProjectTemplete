package com.example.administrator.superdemo.common.rx;

/**
 * Created by LiBing
 * on 2017/7/4 0004
 * describe:
 */

public class RxHttpReponseCompat {

    /*public static <T> ObservableTransformer<BaseBean<T>,T> compatResult(){


        return  new ObservableTransformer<BaseBean<T>, T>() {
            @Override
            public ObservableSource<T> apply(Observable<BaseBean<T>> baseBeanObservable) {

                return baseBeanObservable.flatMap(new Function<BaseBean<T>, ObservableSource<T>>() {
                    @Override
                    public ObservableSource<T> apply(@NonNull final BaseBean<T> tBaseBean) throws Exception {

                        if(tBaseBean.success()){

                            return Observable.create(new ObservableOnSubscribe<T>() {
                                @Override
                                public void subscribe(ObservableEmitter<T> subscriber) throws Exception {

                                    try {
                                        subscriber.onNext(tBaseBean.getData());
                                        subscriber.onComplete();
                                    }
                                    catch (Exception e){
                                        subscriber.onError(e);
                                    }
                                }
                            });
                        }
                        else {
                            return  Observable.error(new ApiException(tBaseBean.getStatus(),tBaseBean.getMessage()));
                        }

                    }
                }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
            }
        };

    }
*/


//    public static  <T> Observable.Transformer<BaseBean<T>,T> compatResult(){
//
//        return  new Observable.Transformer<BaseBean<T>, T>() {
//            @Override
//            public Observable<T> call(Observable<BaseBean<T>> baseBeanObservable) {
//
//                return baseBeanObservable.flatMap(new Func1<BaseBean<T>, Observable<T>>() {
//                    @Override
//                    public Observable<T> call(final BaseBean<T> tBaseBean) {
//
//                        if(tBaseBean.success()){
//
//                            return Observable.create(new Observable.OnSubscribe<T>() {
//                                @Override
//                                public void call(Subscriber<? super T> subscriber) {
//
//                                    try {
//                                        subscriber.onNext(tBaseBean.getData());
//                                        subscriber.onCompleted();
//                                    }
//                                    catch (Exception e){
//                                        subscriber.onError(e);
//                                    }
//
//                                }
//                            });
//
//                        }
//                        else {
//                            return  Observable.error(new ApiException(tBaseBean.getStatus(),tBaseBean.getMessage()));
//                        }
//                    }
//                }).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
//            }
//        };
//    }
}
