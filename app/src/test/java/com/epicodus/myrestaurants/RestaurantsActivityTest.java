package com.epicodus.myrestaurants;

import android.widget.ListView;

import com.epicodus.myrestaurants.ui.RestaurantListActivity;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;


import static junit.framework.Assert.assertNotNull;

@RunWith(RobolectricTestRunner.class)

public class RestaurantsActivityTest {
    private RestaurantListActivity activity;
    private ListView mRestaurantListView;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(RestaurantListActivity.class);
        mRestaurantListView = (ListView) activity.findViewById(R.id.listView);
    }
    @Test
    public void restaurantListViewPopulates() {
        assertNotNull(mRestaurantListView.getAdapter());
        Assert.assertEquals(mRestaurantListView.getAdapter().getCount(), 15);
    }
}
