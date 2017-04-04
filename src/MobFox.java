// ...

import com.mobfox.sdk.bannerads.Banner;
import com.mobfox.sdk.bannerads.BannerListener;

// ...

Banner banner;

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    
    banner = (Banner) findViewById(R.id.banner);
    
    final Activity self = this;
    banner.setListener(new BannerListener() {
        @Override
        public void onBannerError(View banner, Exception e) {
            Toast.makeText(self, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onBannerLoaded(View banner) {
            Toast.makeText(self, "loaded", Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onBannerClosed(View banner) {
            Toast.makeText(self, "closed", Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onBannerFinished() {
            Toast.makeText(self, "finished", Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onBannerClicked(View banner) {
            Toast.makeText(self, "clicked", Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onNoFill(View banner) {
            Toast.makeText(self, "no fill", Toast.LENGTH_SHORT).show();
        }
    });
    banner.setInventoryHash("<your-publication-hash>");
    banner.load();
}

//permission dialog for marshmello and above
@Override
public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    banner.onRequestPermissionsResult(requestCode, permissions, grantResults);
}

// ...