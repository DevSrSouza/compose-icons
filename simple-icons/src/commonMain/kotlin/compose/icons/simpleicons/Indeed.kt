package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Indeed: ImageVector
    get() {
        if (_indeed != null) {
            return _indeed!!
        }
        _indeed = Builder(name = "Indeed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.566f, 21.5633f)
                verticalLineToRelative(-8.762f)
                curveToRelative(0.2553f, 0.0231f, 0.5009f, 0.0346f, 0.758f, 0.0346f)
                curveToRelative(1.2225f, 0.0f, 2.3739f, -0.3206f, 3.3506f, -0.8928f)
                verticalLineToRelative(9.6182f)
                curveToRelative(0.0f, 0.8219f, -0.1957f, 1.4287f, -0.5757f, 1.8338f)
                curveToRelative(-0.378f, 0.4033f, -0.8808f, 0.6049f, -1.491f, 0.6049f)
                curveToRelative(-0.6007f, 0.0f, -1.0766f, -0.2016f, -1.468f, -0.6183f)
                curveToRelative(-0.3781f, -0.4032f, -0.5739f, -1.01f, -0.5739f, -1.8184f)
                close()
                moveTo(11.589f, 0.5659f)
                curveToRelative(2.5447f, -0.8929f, 5.4424f, -0.8449f, 7.6186f, 0.987f)
                curveToRelative(0.405f, 0.3687f, 0.8673f, 0.8334f, 1.0515f, 1.3806f)
                curveToRelative(0.2207f, 0.6913f, -0.7695f, -0.073f, -0.9057f, -0.167f)
                curveToRelative(-0.71f, -0.4532f, -1.4182f, -0.8334f, -2.2127f, -1.0946f)
                curveTo(12.8614f, 0.3873f, 8.8122f, 2.709f, 6.2945f, 6.315f)
                curveToRelative(-1.0516f, 1.5939f, -1.7367f, 3.2721f, -2.299f, 5.1174f)
                curveToRelative(-0.0614f, 0.2017f, -0.1094f, 0.4647f, -0.2207f, 0.6413f)
                curveToRelative(-0.1113f, 0.2036f, -0.048f, -0.5453f, -0.048f, -0.5702f)
                curveToRelative(0.0845f, -0.7623f, 0.2438f, -1.4997f, 0.4414f, -2.237f)
                curveTo(5.3292f, 5.3375f, 7.897f, 2.0655f, 11.5891f, 0.5658f)
                close()
                moveTo(16.5171f, 7.6246f)
                curveToRelative(0.0f, 1.6686f, -1.353f, 3.0224f, -3.0205f, 3.0224f)
                curveToRelative(-1.6677f, 0.0f, -3.0186f, -1.3538f, -3.0186f, -3.0224f)
                curveToRelative(0.0f, -1.6687f, 1.351f, -3.0224f, 3.0186f, -3.0224f)
                curveToRelative(1.6676f, 0.0f, 3.0205f, 1.3518f, 3.0205f, 3.0224f)
                close()
            }
        }
        .build()
        return _indeed!!
    }

private var _indeed: ImageVector? = null
