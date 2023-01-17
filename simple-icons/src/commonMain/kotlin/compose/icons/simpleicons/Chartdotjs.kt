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

public val SimpleIcons.Chartdotjs: ImageVector
    get() {
        if (_chartdotjs != null) {
            return _chartdotjs!!
        }
        _chartdotjs = Builder(name = "Chartdotjs", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(1.605f, 6.0f)
                verticalLineToRelative(12.0f)
                lineTo(12.0f, 24.0f)
                lineToRelative(10.395f, -6.0f)
                lineTo(22.395f, 6.0f)
                close()
                moveTo(12.0f, 1.41f)
                lineToRelative(9.172f, 5.295f)
                verticalLineToRelative(10.59f)
                lineTo(12.0f, 22.59f)
                lineToRelative(-9.172f, -5.295f)
                lineTo(2.828f, 6.705f)
                close()
                moveTo(5.902f, 8.334f)
                curveToRelative(-1.306f, 0.0f, -1.983f, 0.956f, -2.574f, 2.41f)
                verticalLineToRelative(6.262f)
                lineTo(12.0f, 22.014f)
                lineToRelative(8.672f, -5.008f)
                verticalLineToRelative(-5.971f)
                curveToRelative(-0.447f, -0.264f, -0.894f, -0.412f, -1.336f, -0.412f)
                curveToRelative(-4.275f, 0.0f, -3.97f, 4.885f, -6.717f, 5.8f)
                curveToRelative(-2.748f, 0.917f, -3.511f, -8.089f, -6.717f, -8.089f)
                close()
                moveTo(18.266f, 8.791f)
                curveToRelative(-2.9f, 0.0f, -2.137f, 4.732f, -5.342f, 4.732f)
                curveToRelative(-1.63f, 0.0f, -2.52f, -1.317f, -3.477f, -1.981f)
                curveToRelative(0.148f, 0.326f, 0.3f, 0.655f, 0.442f, 0.98f)
                curveToRelative(0.467f, 1.068f, 0.922f, 2.09f, 1.379f, 2.734f)
                curveToRelative(0.228f, 0.322f, 0.455f, 0.541f, 0.644f, 0.644f)
                arcToRelative(0.595f, 0.595f, 0.0f, false, false, 0.549f, 0.05f)
                curveToRelative(0.558f, -0.187f, 0.968f, -0.571f, 1.36f, -1.112f)
                curveToRelative(0.39f, -0.541f, 0.74f, -1.228f, 1.154f, -1.916f)
                curveToRelative(0.413f, -0.688f, 0.894f, -1.385f, 1.59f, -1.918f)
                curveToRelative(0.695f, -0.534f, 1.607f, -0.881f, 2.77f, -0.881f)
                curveToRelative(0.465f, 0.0f, 0.908f, 0.136f, 1.337f, 0.352f)
                verticalLineToRelative(-0.121f)
                curveToRelative(-0.633f, -0.849f, -1.348f, -1.563f, -2.406f, -1.563f)
                close()
                moveTo(11.586f, 8.943f)
                curveToRelative(-0.868f, 0.0f, -1.491f, 0.82f, -2.076f, 2.06f)
                curveToRelative(0.094f, 0.055f, 0.192f, 0.106f, 0.277f, 0.167f)
                curveToRelative(1.06f, 0.761f, 1.798f, 1.853f, 3.137f, 1.853f)
                curveToRelative(0.678f, 0.0f, 1.067f, -0.218f, 1.418f, -0.585f)
                curveToRelative(-0.722f, -1.546f, -1.432f, -3.492f, -2.756f, -3.495f)
                close()
            }
        }
        .build()
        return _chartdotjs!!
    }

private var _chartdotjs: ImageVector? = null
