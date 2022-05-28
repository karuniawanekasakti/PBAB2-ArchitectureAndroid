package com.example.architectureandroid.viewmodels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.architectureandroid.models.DogRandomResponse;
import com.example.architectureandroid.models.DogRepository;

public class DogRandomViewModel extends AndroidViewModel {

    private DogRepository dogrepository = new DogRepository();

    public LiveData<DogRandomResponse> getDogRandomLiveData() {
        return dogRandomLiveData;
    }

    private LiveData<DogRandomResponse> dogRandomLiveData;

    public DogRandomViewModel(@NonNull Application application) {
        super(application);
        dogRandomLiveData = dogrepository.getDogLiveData();
    }

    public void fetchDogData() {
        dogRandomLiveData = dogrepository.getRandomDogData();
    }
}
