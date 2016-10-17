package net.jmf.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


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
    }

    public void addCrime(Crime c) {
        mCrimes.add(c);
    }

    public void removeDeletedCrimes() {
        for (Crime crime : mCrimes) {
            if (crime.isDelete()) {
                mCrimes.remove(crime);
            }
        }
    }

    public List<Crime> getCrimes() {
        return mCrimes;
    }

    public Crime getCrime(UUID id) {
        for (Crime crime : mCrimes) {
            if (id.equals(crime.getId())) {
                return crime;
            }
        }
        return null;
    }
}
