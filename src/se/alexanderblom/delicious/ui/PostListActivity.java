package se.alexanderblom.delicious.ui;

import se.alexanderblom.delicious.fragments.PostListFragment;
import android.app.Fragment;
import android.os.Bundle;

public class PostListActivity extends ContainerActivity {
	public static final String EXTRA_TAG = "tag";

	@Override
	protected Fragment createFragment(Bundle savedInstanceState) {
		String tag = getIntent().getStringExtra(EXTRA_TAG);
		return PostListFragment.newInstance(tag);
	}
}
