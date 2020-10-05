package pens.lab.app.belajaractivity.modul.profile;

import android.content.Intent;
import android.view.View;

import pens.lab.app.belajaractivity.base.BaseFragmentHolderActivity;


public class ProfileActivity extends BaseFragmentHolderActivity {
    ProfileFragment profileFragment;
    private final int UPDATE_REQUEST = 2019;

    private String email;
    private String password;

    @Override
    protected void initializeFragment() {
        initializeView();

        btBack.setVisibility(View.GONE);
        btOptionMenu.setVisibility(View.GONE);
//        ivIcon.setImageResource(R.drawable.....);
        ivIcon.setVisibility(View.VISIBLE);

        profileFragment = new ProfileFragment();
        setCurrentFragment(profileFragment, false);

        setData(email,password);


    }

    public void setData (String email, String password) {
        Intent intent = getIntent();
        this.email = intent.getStringExtra("email");
        this.password = intent.getStringExtra("password");
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


}
