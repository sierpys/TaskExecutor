package com.taskexecutor;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

import com.taskexecutor.callbacks.TaskCompletedCallback;

public abstract class TaskExecutorActivity extends FragmentActivity implements TaskCompletedCallback
{
	protected static TaskExecutor mTaskExecutor;

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
		mTaskExecutor.onResume(this);
	}

	@Override
	public void onPause()
	{
		super.onPause();
		mTaskExecutor.onPause();
	}
}