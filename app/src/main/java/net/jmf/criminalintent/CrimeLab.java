package net.jmf.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by amodu on 10/9/2016.
 */

public class CrimeLab {
    private List<Crime> mCrimes;
    private static CrimeLab sCrimeLab;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    private CrimeLab(Context context) {
        mCrimes = new ArrayList<>();
        for (int i = 0; i < 50; ++i) {
            Crime crime = new Crime();
            crime.setTitle("Crime # " + i);
            crime.setSolved((i%2) == 0);
            mCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (crime.getId() == id) {
                return crime;
            }
        }
        return null;
    }
}
