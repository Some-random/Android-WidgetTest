package com.example.bob_jiang.widgettestagain;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.RemoteViews;

import com.example.android.widgettestagain.R;

/**
 * Created by Bob_JIANG on 10/7/2015.
 */
public class StackWidgetProvider extends AppWidgetProvider {
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        // update each of the widgets with the remote adapter
        for (int i = 0; i < appWidgetIds.length; ++i) {
        }
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }
}
