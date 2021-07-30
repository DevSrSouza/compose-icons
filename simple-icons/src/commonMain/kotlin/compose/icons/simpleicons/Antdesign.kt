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

public val SimpleIcons.Antdesign: ImageVector
    get() {
        if (_antdesign != null) {
            return _antdesign!!
        }
        _antdesign = Builder(name = "Antdesign", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.4511f, 6.6808f)
                curveToRelative(0.5091f, -0.5064f, 0.5091f, -1.3316f, 0.0f, -1.838f)
                lineToRelative(-1.8729f, -1.873f)
                lineToRelative(0.0027f, 0.0027f)
                curveToRelative(-0.4957f, -0.4957f, -1.3478f, -1.3478f, -2.5535f, -2.5508f)
                curveToRelative(-0.568f, -0.5547f, -1.487f, -0.5493f, -2.0498f, 0.0134f)
                lineTo(0.426f, 10.9787f)
                arcToRelative(1.4426f, 1.4426f, 0.0f, false, false, 0.0f, 2.047f)
                lineToRelative(10.549f, 10.541f)
                arcToRelative(1.4506f, 1.4506f, 0.0f, false, false, 2.0497f, 0.0f)
                lineToRelative(4.4238f, -4.4211f)
                curveToRelative(0.509f, -0.5064f, 0.509f, -1.3317f, 0.0f, -1.8381f)
                arcToRelative(1.3049f, 1.3049f, 0.0f, false, false, -1.8408f, 0.0f)
                lineToRelative(-3.3493f, 3.3546f)
                curveToRelative(-0.1393f, 0.1394f, -0.3564f, 0.1394f, -0.4957f, 0.0f)
                lineToRelative(-8.4268f, -8.4188f)
                curveToRelative(-0.1394f, -0.1393f, -0.1394f, -0.3563f, 0.0f, -0.4956f)
                lineTo(11.76f, 3.3289f)
                curveToRelative(0.0107f, -0.0108f, 0.0241f, -0.0188f, 0.0349f, -0.0295f)
                curveToRelative(0.1393f, -0.1099f, 0.3322f, -0.0992f, 0.4608f, 0.0295f)
                lineToRelative(3.3547f, 3.352f)
                curveToRelative(0.509f, 0.509f, 1.3343f, 0.509f, 1.8407f, 0.0f)
                close()
                moveTo(9.2065f, 12.0558f)
                arcToRelative(2.8482f, 2.8456f, 0.0f, true, false, 5.6965f, 0.0f)
                arcToRelative(2.8482f, 2.8456f, 0.0f, true, false, -5.6965f, 0.0f)
                close()
                moveTo(23.5737f, 11.0215f)
                lineToRelative(-3.293f, -3.277f)
                curveToRelative(-0.5092f, -0.5063f, -1.3344f, -0.5063f, -1.8408f, 0.0028f)
                arcToRelative(1.2968f, 1.2968f, 0.0f, false, false, 0.0f, 1.838f)
                lineToRelative(2.2239f, 2.2213f)
                curveToRelative(0.1393f, 0.1393f, 0.1393f, 0.3564f, 0.0f, 0.4957f)
                lineToRelative(-2.1918f, 2.189f)
                arcToRelative(1.2968f, 1.2968f, 0.0f, false, false, 0.0f, 1.8382f)
                arcToRelative(1.3049f, 1.3049f, 0.0f, false, false, 1.8408f, 0.0f)
                lineToRelative(3.2635f, -3.2609f)
                arcToRelative(1.445f, 1.445f, 0.0f, false, false, -0.0026f, -2.047f)
                close()
            }
        }
        .build()
        return _antdesign!!
    }

private var _antdesign: ImageVector? = null
