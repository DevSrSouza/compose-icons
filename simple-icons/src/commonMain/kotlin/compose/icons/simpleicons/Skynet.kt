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

public val SimpleIcons.Skynet: ImageVector
    get() {
        if (_skynet != null) {
            return _skynet!!
        }
        _skynet = Builder(name = "Skynet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(-4.0E-4f, 6.4602f)
                lineToRelative(21.3893f, 11.297f)
                curveToRelative(0.561f, 0.2935f, 0.6633f, 1.0532f, 0.1999f, 1.4846f)
                horizontalLineToRelative(-0.011f)
                arcToRelative(10.0399f, 10.0399f, 0.0f, false, true, -2.2335f, 1.5307f)
                curveToRelative(-6.912f, 3.4734f, -14.9917f, -1.838f, -14.5438f, -9.5605f)
                lineToRelative(2.8601f, 1.9752f)
                curveToRelative(0.856f, 4.508f, 5.6187f, 7.1094f, 9.8742f, 5.3932f)
                close()
                moveTo(8.6473f, 9.6111f)
                lineTo(23.0134f, 15.2896f)
                arcToRelative(0.8704f, 0.8704f, 0.0f, false, true, 0.5197f, 1.0466f)
                verticalLineToRelative(0.0182f)
                curveToRelative(-0.1537f, 0.5377f, -0.7668f, 0.7938f, -1.2575f, 0.5252f)
                close()
                moveTo(13.9369f, 2.1736f)
                curveToRelative(2.7093f, -0.2325f, 6.0946f, 0.7869f, 8.1116f, 3.3871f)
                curveToRelative(1.699f, 2.1951f, 2.0497f, 4.8772f, 1.9298f, 7.6465f)
                verticalLineToRelative(-0.007f)
                curveToRelative(-0.0478f, 0.5874f, -0.6494f, 0.9616f, -1.1975f, 0.745f)
                lineToRelative(-9.7652f, -3.8596f)
                lineToRelative(9.0656f, 2.4313f)
                arcToRelative(7.296f, 7.296f, 0.0f, false, false, -1.0677f, -4.5631f)
                curveToRelative(-2.9683f, -4.7678f, -9.9847f, -4.5344f, -12.6297f, 0.4201f)
                arcToRelative(7.5048f, 7.5048f, 0.0f, false, false, -0.398f, 0.8831f)
                lineTo(5.5546f, 7.9614f)
                curveToRelative(0.069f, -0.1017f, 0.1417f, -0.198f, 0.2144f, -0.2962f)
                curveToRelative(0.1163f, -0.2416f, 0.2417f, -0.487f, 0.3798f, -0.7268f)
                curveToRelative(1.6118f, -2.7911f, 4.3102f, -4.4338f, 7.1558f, -4.6973f)
                curveToRelative(0.2108f, -0.0182f, 0.4215f, -0.049f, 0.6323f, -0.0672f)
                close()
            }
        }
        .build()
        return _skynet!!
    }

private var _skynet: ImageVector? = null
