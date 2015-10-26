package com.example.youtek.lessionparsequery2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by youtek on 26/10/2015.
 */
public class ListAdapter extends ArrayAdapter<SinhVien> {

    public ListAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public ListAdapter(Context context, int resource, List<SinhVien> items) {
        super(context, resource, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.activity_dong_sinh_vien, null);
        }

        SinhVien p = getItem(position);

        if (p != null) {
            // Anh xa + Gan gia tri
            TextView txtvHoTen = (TextView) v.findViewById(R.id.textViewHoTen);
            txtvHoTen.setText(p.HoTen);
            TextView txtvNamSinh = (TextView) v.findViewById(R.id.textViewNamSinh);
            txtvNamSinh.setText(String.valueOf(p.NamSinh));
            TextView txtvToan = (TextView) v.findViewById(R.id.textViewToan);
            txtvToan.setText(String.valueOf(p.Toan));
            TextView txtvLy = (TextView) v.findViewById(R.id.textViewLy);
            txtvLy.setText(String.valueOf(p.Ly));
            TextView txtvHoa = (TextView) v.findViewById(R.id.textViewHoa);
            txtvHoa.setText(String.valueOf(p.Ly));
            TextView txtvTong = (TextView) v.findViewById(R.id.textViewTong);
            txtvTong.setText(String.valueOf(p.Tong));


        }

        return v;
    }

}
