package com.example.apple.travelinindia.traveldata;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.apple.travelinindia.R;
import com.example.apple.travelinindia.cityactivity.AgraActivity;
import com.example.apple.travelinindia.cityactivity.AhmedabadActivity;
import com.example.apple.travelinindia.cityactivity.AjmerActivity;
import com.example.apple.travelinindia.cityactivity.AlappuzhaActivity;
import com.example.apple.travelinindia.cityactivity.Amritsar;
import com.example.apple.travelinindia.cityactivity.AndamanActivity;
import com.example.apple.travelinindia.cityactivity.AurangabadActivity;
import com.example.apple.travelinindia.cityactivity.BengaluruActivity;
import com.example.apple.travelinindia.cityactivity.BikanerActivity;
import com.example.apple.travelinindia.cityactivity.ChandigarhActivity;
import com.example.apple.travelinindia.cityactivity.ChennaiActivity;
import com.example.apple.travelinindia.cityactivity.DarjeelingActivity;
import com.example.apple.travelinindia.cityactivity.DehradunActivity;
import com.example.apple.travelinindia.cityactivity.DelhiActivity;
import com.example.apple.travelinindia.cityactivity.DharamshalaActivity;
import com.example.apple.travelinindia.cityactivity.FatehpurActivity;
import com.example.apple.travelinindia.cityactivity.GangtokActivity;
import com.example.apple.travelinindia.cityactivity.GoaActivity;
import com.example.apple.travelinindia.cityactivity.HampiActivity;
import com.example.apple.travelinindia.cityactivity.HaridwarActivity;
import com.example.apple.travelinindia.cityactivity.HimachalActivity;
import com.example.apple.travelinindia.cityactivity.HyderabadActivity;
import com.example.apple.travelinindia.cityactivity.JaipurActivity;
import com.example.apple.travelinindia.cityactivity.JaisalmerActivity;
import com.example.apple.travelinindia.cityactivity.JodhpurActivity;
import com.example.apple.travelinindia.cityactivity.KhajurahoActivity;
import com.example.apple.travelinindia.cityactivity.KochiActivity;
import com.example.apple.travelinindia.cityactivity.KodaikanalActivity;
import com.example.apple.travelinindia.cityactivity.KolkataActivity;
import com.example.apple.travelinindia.cityactivity.KovalamActivity;
import com.example.apple.travelinindia.cityactivity.MaduraiActivity;
import com.example.apple.travelinindia.cityactivity.MamallapuramActivity;
import com.example.apple.travelinindia.cityactivity.MumbaiActivity;
import com.example.apple.travelinindia.cityactivity.MunnarActivity;
import com.example.apple.travelinindia.cityactivity.MysoreActivity;
import com.example.apple.travelinindia.cityactivity.NainitalActivity;
import com.example.apple.travelinindia.cityactivity.PangongActivity;
import com.example.apple.travelinindia.cityactivity.Pondicherry;
import com.example.apple.travelinindia.cityactivity.PortblairActivity;
import com.example.apple.travelinindia.cityactivity.PuneActivity;
import com.example.apple.travelinindia.cityactivity.PushkarActivity;
import com.example.apple.travelinindia.cityactivity.RishikeshActivity;
import com.example.apple.travelinindia.cityactivity.ShimlaActivity;
import com.example.apple.travelinindia.cityactivity.ThiruActivity;
import com.example.apple.travelinindia.cityactivity.UdaipurActivity;
import com.example.apple.travelinindia.cityactivity.VaranasiActivity;
import com.example.apple.travelinindia.datamodel.DataModelTravel;

import java.util.ArrayList;
import java.util.List;

public class TravelAdapter extends RecyclerView.Adapter<TravelAdapter.MyViewHolder2> {
    private LayoutInflater inflater;

    private ArrayList<DataModelTravel> dataSet1;
     Context context;






    public TravelAdapter( ArrayList<DataModelTravel> data2, Context context ) {

        inflater= LayoutInflater.from(context);

        this.dataSet1 = data2;
        this.context = context;


    }



    @Override
    public TravelAdapter.MyViewHolder2 onCreateViewHolder( ViewGroup parent,
                                                           int viewType ) {
        View view = inflater.inflate(R.layout.second_view, parent, false);




        MyViewHolder2 myViewHolder2 = new MyViewHolder2(view);
        return myViewHolder2;
    }

    @Override
    public void onBindViewHolder( final MyViewHolder2 holder, final int listPosition ) {
        final ImageView imageView = holder.imageViewIcon2;
        final TextView nameofPlace = holder.nameOfPlace;


        imageView.setImageResource(dataSet1.get(listPosition).getImage());
        nameofPlace.setText(dataSet1.get(listPosition).getName());




    }

    public static class MyViewHolder2 extends RecyclerView.ViewHolder implements View.OnClickListener {


        ImageView imageViewIcon2;
        TextView nameOfPlace;
        private final Context context;



        public MyViewHolder2( View itemView ) {
            super(itemView);
            this.imageViewIcon2 = itemView.findViewById(R.id.imageView2);
            this.nameOfPlace = itemView.findViewById(R.id.nameofPlace);
            context = itemView.getContext();
            itemView.setOnClickListener(this);



        }

        @Override
        public void onClick( View v ) {
            final Intent intent;
//            Toast.makeText(v.getContext(), "position = " + getLayoutPosition(), Toast.LENGTH_SHORT).show();

            //go through each item if you have few items within recycler view

            if(getAdapterPosition()==0){
                 intent = new Intent(context, AgraActivity.class);
                context.startActivity(intent);




            }else if(getAdapterPosition()==1){

                intent = new Intent(context, DelhiActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==2){
                intent = new Intent(context, JaipurActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==3){
                intent = new Intent(context, VaranasiActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==4){
                intent = new Intent(context, MumbaiActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==5){
                intent = new Intent(context, UdaipurActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 6){
                intent = new Intent(context, JodhpurActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 7) {
                intent = new Intent(context, GoaActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 8) {
                intent = new Intent(context, KochiActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 9){
                intent = new Intent(context, JaisalmerActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 10){
                intent = new Intent(context, RishikeshActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 11){
                intent = new Intent(context, HimachalActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 12){
                intent = new Intent(context, Amritsar.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 13){
                intent = new Intent(context, BengaluruActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 14){
                intent = new Intent(context, ShimlaActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 15){
                intent = new Intent(context, ChennaiActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==16){
                intent = new Intent(context, KolkataActivity.class);
                context.startActivity(intent);
            }else if(getAdapterPosition()==17){
                intent = new Intent(context, DarjeelingActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==18){
                intent = new Intent(context, MysoreActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()== 19){
                intent = new Intent(context, AlappuzhaActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==20){
                intent = new Intent(context, DharamshalaActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==21){
                intent = new Intent(context, MunnarActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==22){
                intent = new Intent(context, FatehpurActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==23){
                intent = new Intent(context, HaridwarActivity.class);
                context.startActivity(intent);

            }else if (getAdapterPosition()==24){
                intent = new Intent(context, ChandigarhActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==25){
                intent = new Intent(context, KhajurahoActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==26){
                intent = new Intent(context, HampiActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==27){
                intent = new Intent(context, GangtokActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==28){
                intent = new Intent(context, PushkarActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==29){
                intent = new Intent(context, ThiruActivity.class);
                context.startActivity(intent);
            }else if(getAdapterPosition()==30){
                intent = new Intent(context, Pondicherry.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==31){
                intent = new Intent(context, MaduraiActivity.class);
                context.startActivity(intent);


            }else if(getAdapterPosition()==32){
                intent = new Intent(context, AhmedabadActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==33){
                intent = new Intent(context, HyderabadActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==34){
                intent = new Intent(context, AurangabadActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==35){
                intent = new Intent(context, KovalamActivity.class);
                context.startActivity(intent);

            }else if (getAdapterPosition()==36){
                intent = new Intent(context, NainitalActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==37){
                intent = new Intent (context, PuneActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==38){
                intent = new Intent(context, AjmerActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==39){
                intent = new Intent(context, PortblairActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==40){
                intent = new Intent(context, PangongActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==41){
                intent = new Intent(context, MamallapuramActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==42){
                intent = new Intent(context, KodaikanalActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==43){
                intent = new Intent(context, BikanerActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==44){
                intent = new Intent(context, DehradunActivity.class);
                context.startActivity(intent);

            }else if(getAdapterPosition()==45) {
                intent = new Intent (context, AndamanActivity.class);
                context.startActivity(intent);

            }

        }
    }

    @Override
    public int getItemCount() {
        return dataSet1.size();
    }

    public void setFilter( List<DataModelTravel> dataModel2s ) {
        dataSet1 = new ArrayList<>();
        dataSet1.addAll(dataModel2s);
        notifyDataSetChanged();
    }






}
