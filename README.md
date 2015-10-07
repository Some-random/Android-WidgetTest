# Android-WidgetTest
Steps:
1 declare the AppWidgetProvider class in your application's AndroidManifest.xml file (receiver, update callback)
2 declare AppWidgetProviderInfo class as an xml in /xml directory to specify various arguments (which is used as source by AppWidgetProvider class)
3 create the appwidget layout in /layout folder and add margins in /values folder
4 implement AppWidgetProvider class. The most important callback is onUpdate(). Pay attention to the use of pending intent, remote view and appwidgetmanager
(5 configuration activity)
(6 collection view)
