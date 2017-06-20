package com.example.logonrm.carroretrofit;

//é quem vai enviar os serviços
public class APIUtils {

    //private APIUtils() {}

    public static final String BASE_URL = "http://10.3.1.16:3000";

    public static CarroAPI getAPIService() {

        return RetrofitClient.getClient(BASE_URL).create(CarroAPI.class);
    }
}
