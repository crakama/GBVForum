package com.dadaabs.mreport;

import android.view.View;

/**
 * Created by crakama on 11/20/2016.
 */

public interface ClickListenerChatFirebase {

    void clickImageChat(View view, int position, String nameUser, String urlPhotoUser, String urlPhotoClick);


    void clickImageMapChat(View view, int position,String latitude,String longitude);

}