package com.example.zhong.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 2018/4/9.
 */

public class ActivityCollector {

    public static List<Activity> activities=new ArrayList<>();

    public static void addActivity(Activity activity){
        activities.add(activity);
    }

    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }

    public static void finishAll(){
        for(Activity actvity : activities){
            if(!actvity.isFinishing()){
                actvity.finish();
            }
        }
        activities.clear();
    }

}
