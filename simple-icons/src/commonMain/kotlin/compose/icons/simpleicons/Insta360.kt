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

public val SimpleIcons.Insta360: ImageVector
    get() {
        if (_insta360 != null) {
            return _insta360!!
        }
        _insta360 = Builder(name = "Insta360", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.402f, 11.19f)
                curveToRelative(-0.701f, 0.7f, -1.838f, 0.7f, -2.54f, 0.0f)
                arcToRelative(1.796f, 1.796f, 0.0f, true, true, 2.539f, 0.0f)
                moveToRelative(0.998f, -3.614f)
                arcToRelative(6.17f, 6.17f, 0.0f, false, false, -4.39f, -1.818f)
                arcToRelative(6.17f, 6.17f, 0.0f, false, false, -4.392f, 1.818f)
                arcToRelative(6.217f, 6.217f, 0.0f, false, false, 0.0f, 8.782f)
                arcToRelative(6.169f, 6.169f, 0.0f, false, false, 4.39f, 1.819f)
                arcToRelative(6.169f, 6.169f, 0.0f, false, false, 4.392f, -1.82f)
                arcToRelative(6.217f, 6.217f, 0.0f, false, false, 0.0f, -8.78f)
                moveToRelative(1.554f, 10.33f)
                arcToRelative(8.353f, 8.353f, 0.0f, false, true, -5.945f, 2.462f)
                arcToRelative(8.353f, 8.353f, 0.0f, false, true, -5.944f, -2.46f)
                curveToRelative(-3.277f, -3.277f, -3.277f, -8.607f, 0.0f, -11.883f)
                arcToRelative(8.353f, 8.353f, 0.0f, false, true, 5.944f, -2.46f)
                arcToRelative(8.35f, 8.35f, 0.0f, false, true, 5.944f, 2.46f)
                curveToRelative(3.278f, 3.276f, 3.278f, 8.606f, 0.0f, 11.882f)
                moveToRelative(4.51f, -11.293f)
                arcToRelative(20.81f, 20.81f, 0.0f, false, true, -0.137f, -0.292f)
                arcToRelative(2.779f, 2.779f, 0.0f, false, true, 0.485f, -3.007f)
                curveToRelative(0.018f, -0.014f, 0.08f, -0.08f, 0.117f, -0.118f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.053f, -0.069f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, -0.097f, -0.81f)
                arcToRelative(0.296f, 0.296f, 0.0f, false, false, -0.026f, -0.02f)
                arcToRelative(1.113f, 1.113f, 0.0f, false, false, -0.18f, -0.11f)
                lineToRelative(-0.068f, -0.034f)
                arcTo(19.08f, 19.08f, 0.0f, false, false, 9.71f, 0.443f)
                lineToRelative(-0.016f, 0.022f)
                arcToRelative(11.708f, 11.708f, 0.0f, false, false, -6.012f, 3.218f)
                curveToRelative(-3.75f, 3.75f, -4.44f, 9.403f, -2.065f, 13.852f)
                curveToRelative(0.023f, 0.043f, 0.107f, 0.195f, 0.123f, 0.233f)
                arcToRelative(2.778f, 2.778f, 0.0f, false, true, -0.556f, 2.919f)
                arcToRelative(4.39f, 4.39f, 0.0f, false, false, -0.072f, 0.08f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, 0.0f, 0.934f)
                curveToRelative(0.06f, 0.056f, 0.127f, 0.105f, 0.198f, 0.146f)
                lineToRelative(0.01f, 0.006f)
                arcToRelative(19.08f, 19.08f, 0.0f, false, false, 13.0f, 1.677f)
                verticalLineToRelative(0.002f)
                arcToRelative(11.708f, 11.708f, 0.0f, false, false, 5.997f, -3.216f)
                curveToRelative(3.709f, -3.708f, 4.423f, -9.277f, 2.144f, -13.702f)
            }
        }
        .build()
        return _insta360!!
    }

private var _insta360: ImageVector? = null
