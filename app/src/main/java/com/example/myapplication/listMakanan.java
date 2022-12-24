package com.example.myapplication;

import android.os.Parcel;
import android.os.Parcelable;

public class listMakanan implements Parcelable {
    private String namaMakanan,description;
    private int image,price;

    protected listMakanan(Parcel in) {
        namaMakanan = in.readString();
        description = in.readString();
        image = in.readInt();
        price = in.readInt();
    }

    public static final Creator<listMakanan> CREATOR = new Creator<listMakanan>() {
        @Override
        public listMakanan createFromParcel(Parcel in) {
            return new listMakanan(in);
        }

        @Override
        public listMakanan[] newArray(int size) {
            return new listMakanan[size];
        }
    };

    public String getNamaMakanan() {
        return namaMakanan;
    }

    public void setNamaMakanan(String namaMakanan) {
        this.namaMakanan = namaMakanan;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public listMakanan(String namaMakanan, String description, int image, int price) {
        this.namaMakanan = namaMakanan;
        this.description = description;
        this.image = image;
        this.price = price;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(namaMakanan);
        parcel.writeString(description);
        parcel.writeInt(image);
        parcel.writeInt(price);
    }
}
