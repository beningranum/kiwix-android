package org.kiwix.kiwixmobile.tests.activities;

import android.Manifest;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.rule.GrantPermissionRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.kiwix.kiwixmobile.zim_manager.ZimManageActivity;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class ZimManageActivityTest {

  @Rule
  public ActivityTestRule<ZimManageActivity> mActivityTestRule = new ActivityTestRule<>(
      ZimManageActivity.class);
  @Rule
  public GrantPermissionRule readPermissionRule =
      GrantPermissionRule.grant(Manifest.permission.READ_EXTERNAL_STORAGE);
  @Rule
  public GrantPermissionRule writePermissionRule =
      GrantPermissionRule.grant(Manifest.permission.WRITE_EXTERNAL_STORAGE);

  @Test
  public void ZimManageActivitySimple() {

  }
}
