# Example Android Application Architecture

## Activity Lifecycle

The content of the main activity is determined by which fragment (MainFragment1 or MainFragment2) is
visible. Note that the current fragment does not change when you switch to another app using the
home button or recent apps button. The fragment in the main activity also stays the same when you
start the child activity. This is because the main activity is not unloaded when it is covered up by
another app or activity. Note that the chosen fragment is reset if you use the back button to exit
the application; in that case the activity is destroyed (and recreated when you return to it). These
same rules apply to the child activity.
