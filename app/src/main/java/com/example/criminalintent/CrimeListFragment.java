package com.example.criminalintent;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.criminalintent.Models.Crime;
import com.example.criminalintent.Models.CrimeLab;

import java.util.List;

public class  CrimeListFragment extends Fragment
{
    private static final String TAG = "CriminalListFragment: ";
    private Button mCrime1;
    private Button mCrime2;

    private List<Crime> mCrimes;

    @Override
    public void onCreate( Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        mCrimes = CrimeLab.get(getActivity()).getmCrimes();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.fragment_crime_list, container, false);

        mCrime1 = v.findViewById(R.id.crime1);
        mCrime1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Crime crime = mCrimes.get(0);
                Toast.makeText(getActivity(), crime.getTitle() + "clicked",Toast.LENGTH_SHORT).show();
            }
        });
        mCrime2 = v.findViewById(R.id.crime2);
        mCrime2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Crime crime = mCrimes.get(1);
                Toast.makeText(getActivity(), crime.getTitle() + "clicked",Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }

}
