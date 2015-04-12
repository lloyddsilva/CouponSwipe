package couponswipe.cmu.edu.couponswipe.ui.intents;

import android.content.Context;
import android.content.Intent;

import couponswipe.cmu.edu.couponswipe.ui.DealPreferencesActivity;
import couponswipe.cmu.edu.couponswipe.ui.DealShortlistActivity;
import couponswipe.cmu.edu.couponswipe.ui.DealStackActivity;
import couponswipe.cmu.edu.couponswipe.ui.EditProfileActivity;
import couponswipe.cmu.edu.couponswipe.ui.LoginActivity;
import couponswipe.cmu.edu.couponswipe.ui.SignUpActivity;
import couponswipe.cmu.edu.couponswipe.ui.UserProfileActivity;
import couponswipe.cmu.edu.couponswipe.ui.ViewDealActivity;

/**
 * Created by vidya on 4/11/15.
 */
public class Intents {

    private static Intent intentToShortlist;
    private static Intent intentToProfile;
    private static Intent intentToPreferences;
    private static Intent intentToDeal;
    private static Intent intentToDealStack;
    private static Intent intentToSignUp;
    private static Intent intentToLogin;
    private static Intent intentToEditProfile;

    //Open the shortlisted deals list
    public static void openShortList(Context context)
    {
        intentToShortlist = new Intent(context, DealShortlistActivity.class);
        context.startActivity(intentToShortlist);
    }

    //Open user's deal preferences
    public static void openDealPreferences(Context context)
    {
        intentToPreferences = new Intent(context, DealPreferencesActivity.class);
        context.startActivity(intentToPreferences);
    }

    //Open user's profile
    public static void openUserProfile(Context context)
    {
        intentToProfile = new Intent(context, UserProfileActivity.class);
        context.startActivity(intentToProfile);
    }

    //Open a deal
    public static void openDeal(Context context)
    {
        intentToDeal = new Intent(context, ViewDealActivity.class);
        context.startActivity(intentToDeal);
    }

    //Open the deal stack
    public static void openDealStack(Context context)
    {
        intentToDealStack = new Intent(context, DealStackActivity.class);
        context.startActivity(intentToDealStack);
    }

    //Open sign up page
    public static void openSignUpPage(Context context)
    {
        intentToSignUp = new Intent(context, SignUpActivity.class);
        context.startActivity(intentToSignUp);
    }

    //Open login page
    public static void openLoginPage(Context context)
    {
        intentToLogin = new Intent(context, LoginActivity.class);
        context.startActivity(intentToLogin);
    }

    //Open the shortlisted deals list
    public static void openEditProfile(Context context)
    {
        intentToEditProfile = new Intent(context, EditProfileActivity.class);
        context.startActivity(intentToEditProfile);
    }

}
