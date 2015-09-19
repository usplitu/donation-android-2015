package app.donation;

import android.app.Application;
import android.util.Log;

public class DonationApp extends Application
{
  @Override
  public void onCreate()
  {
    super.onCreate();
    Log.v("Donate", "Donation App Started");
  }
}