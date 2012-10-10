package main.taskexecutor;
import main.taskexecutor.callbacks.TaskCompletedCallback;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
/**
 * @author nseidm1
 * 
 */
public abstract class TaskExecutorActivity extends FragmentActivity implements TaskCompletedCallback
{
    protected static TaskExecutor mTaskExecutor;
    protected Handler mHandler = new Handler();
    @Override
    public void onCreate(Bundle bundle)
    {
	super.onCreate(bundle);
	if (mTaskExecutor == null)
	    mTaskExecutor = new TaskExecutor();
    }
    @Override
    public void onResume()
    {
	super.onResume();
	mTaskExecutor.onResume(this, mHandler);
    }
    @Override
    public void onPause()
    {
	super.onPause();
	mTaskExecutor.onPause();
    }
}