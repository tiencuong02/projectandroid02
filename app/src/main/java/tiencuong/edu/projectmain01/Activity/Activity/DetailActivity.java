package tiencuong.edu.projectmain01.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import tiencuong.edu.projectmain01.Activity.Domain.PopularDomain;
import tiencuong.edu.projectmain01.Activity.Helper.ManagmentCart;
import tiencuong.edu.projectmain01.R;

public class DetailActivity extends AppCompatActivity {
private Button addToCartBtn;
private TextView titleTxt,feeTxt,descriptionTxt,reviewTxt,scoreTxt;
private ImageView picItem,backBtn;
private PopularDomain object;
private int numberOrder = 1;
private ManagmentCart managmentCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        managmentCart = new ManagmentCart(this);

        initView();
//        getBundle();
    }

    private void getBundle() {
        object=(PopularDomain) getIntent().getSerializableExtra("object");
        int drawableResourceId=this.getResources().getIdentifier(object.getPicUrl(),getString(R.string.drawable),this.getPackageName());

        Glide.with(this)
                .load(drawableResourceId)
                .into(picItem);

        titleTxt.setText(object.getTitle());
        feeTxt.setText("$" + object.getPrice());
        descriptionTxt.setText(object.getDescription());
        reviewTxt.setText(object.getReview() + "");
        scoreTxt.setText(object.getScore() + "");

        addToCartBtn.setOnClickListener(v -> {
            object.setNumberinCart(numberOrder);
            managmentCart.insertFood(object);
        });
        backBtn.setOnClickListener(v -> finish());

    }

    private void initView() {
        addToCartBtn=findViewById(R.id.addToCartBtn);
        feeTxt=findViewById(R.id.priceTxt);
        titleTxt=findViewById(R.id.titleTxt);
        descriptionTxt=findViewById(R.id.descriptionTxt);
        picItem =findViewById(R.id.itemPic);
        reviewTxt=findViewById(R.id.reviewTxt);
        scoreTxt=findViewById(R.id.scoreTxt);
        backBtn=findViewById(R.id.backBtn);
    }
}