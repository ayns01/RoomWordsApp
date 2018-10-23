package com.example.ayana.roomwordsapp;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

// Entity: Each word is represented by an entity in the DB.
//         Room can create DB table from this.
@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;
    public Word(@NonNull String word) {this.mWord = word;}
    public String getWord() {return this.mWord;}
}
