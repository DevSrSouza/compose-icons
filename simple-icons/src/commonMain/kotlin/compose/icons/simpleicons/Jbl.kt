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

public val SimpleIcons.Jbl: ImageVector
    get() {
        if (_jbl != null) {
            return _jbl!!
        }
        _jbl = Builder(name = "Jbl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 5.2645f)
                lineToRelative(2.0221f, 4.5892f)
                lineToRelative(2.0217f, -4.5892f)
                close()
                moveTo(2.0221f, 12.8655f)
                curveToRelative(0.6982f, 0.0f, 1.2656f, -0.5655f, 1.2656f, -1.2606f)
                curveToRelative(0.0f, -0.6985f, -0.5674f, -1.2618f, -1.2656f, -1.2618f)
                curveToRelative(-0.7003f, 0.0f, -1.2661f, 0.5633f, -1.2661f, 1.2618f)
                curveToRelative(0.0f, 0.6951f, 0.5658f, 1.2607f, 1.2661f, 1.2607f)
                close()
                moveTo(0.9284f, 16.2265f)
                curveToRelative(0.0f, 0.9572f, 0.862f, 2.509f, 3.3142f, 2.509f)
                curveToRelative(2.4529f, 0.0f, 3.3154f, -1.1872f, 3.3154f, -2.509f)
                lineTo(7.558f, 5.2645f)
                lineTo(5.3693f, 5.2645f)
                lineToRelative(0.0011f, 11.3428f)
                curveToRelative(0.0f, 0.6196f, -0.5037f, 1.1392f, -1.1261f, 1.1392f)
                curveToRelative(-0.6231f, 0.0f, -1.1279f, -0.5045f, -1.1279f, -1.124f)
                lineToRelative(-0.0016f, -2.3108f)
                lineTo(0.9284f, 14.3117f)
                close()
                moveTo(9.2169f, 18.5384f)
                lineTo(9.2169f, 5.2645f)
                horizontalLineToRelative(4.3745f)
                curveToRelative(0.8441f, 0.0f, 2.187f, 0.693f, 2.187f, 2.1628f)
                verticalLineToRelative(2.2611f)
                curveToRelative(0.0f, 0.6612f, -0.5798f, 1.8328f, -1.4412f, 1.8328f)
                curveToRelative(0.8614f, 0.0f, 1.4412f, 0.7422f, 1.4412f, 1.3045f)
                verticalLineToRelative(3.9788f)
                curveToRelative(0.0f, 0.6767f, -0.5463f, 1.7339f, -2.187f, 1.7339f)
                close()
                moveTo(12.5971f, 10.9794f)
                curveToRelative(0.7955f, 0.0f, 0.9944f, -0.134f, 0.9944f, -2.2147f)
                curveToRelative(0.0f, -2.0801f, -0.199f, -2.246f, -0.9944f, -2.246f)
                horizontalLineToRelative(-1.1948f)
                verticalLineToRelative(4.4575f)
                close()
                moveTo(13.5915f, 14.7902f)
                curveToRelative(0.0f, -2.0812f, 0.0f, -2.6906f, -0.8636f, -2.6906f)
                horizontalLineToRelative(-1.3256f)
                verticalLineToRelative(5.3482f)
                lineToRelative(1.3255f, 0.0027f)
                curveToRelative(0.8636f, 0.0f, 0.8636f, -0.5807f, 0.8636f, -2.6603f)
                close()
                moveTo(17.3705f, 18.5384f)
                lineTo(24.0f, 18.5384f)
                verticalLineToRelative(-4.2267f)
                horizontalLineToRelative(-2.1886f)
                lineToRelative(0.0016f, 2.3107f)
                curveToRelative(0.0f, 0.6196f, -0.5047f, 1.1241f, -1.1273f, 1.1241f)
                curveToRelative(-0.622f, 0.0f, -1.1273f, -0.5045f, -1.1273f, -1.124f)
                lineTo(19.5584f, 5.2644f)
                horizontalLineToRelative(-2.188f)
                close()
            }
        }
        .build()
        return _jbl!!
    }

private var _jbl: ImageVector? = null
