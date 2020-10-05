package pens.lab.app.belajaractivity.modul.profile;

import pens.lab.app.belajaractivity.base.BasePresenter;
import pens.lab.app.belajaractivity.base.BaseView;

/**
 * Created by fahrul on 13/03/19.
 */

public interface ProfileContract {
    interface View extends BaseView<Presenter> {
        void redirectToCount();
    }

    interface Presenter extends BasePresenter {
        void performProfile(String email, String password);
    }
}
