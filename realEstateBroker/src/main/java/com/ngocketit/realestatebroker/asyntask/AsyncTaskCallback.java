package com.ngocketit.realestatebroker.asyntask;

public interface AsyncTaskCallback<Prams, Progress, Result> {
    void onPreExecute();
    void onProgressUpdate(Progress... values);
    void onPostExecute(Result result);
}
