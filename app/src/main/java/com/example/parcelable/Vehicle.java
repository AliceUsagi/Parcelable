package com.example.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {

    public String name;
    public String kilometers;

    public Vehicle(String name, String kilometers){
        this.name = name;
        this.kilometers = kilometers;
    }

    protected Vehicle(Parcel in) {
        name = in.readString();
        kilometers = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(kilometers);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    public String getName(){
        return this.name;
    }

    public String getKilometers(){
        return this.kilometers;
    }

    public void setName(){
        this.name = name;
    }

    public void setKilometers(){
        this.kilometers = kilometers;
    }
}
