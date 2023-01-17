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

public val SimpleIcons.Openwrt: ImageVector
    get() {
        if (_openwrt != null) {
            return _openwrt!!
        }
        _openwrt = Builder(name = "Openwrt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 0.0f)
                curveToRelative(-3.906f, 0.0f, -7.4465f, 1.5949f, -10.006f, 4.1543f)
                lineToRelative(1.6953f, 1.6953f)
                curveToRelative(2.1278f, -2.1278f, 5.069f, -3.4395f, 8.3105f, -3.4395f)
                curveToRelative(3.2416f, 0.0f, 6.1833f, 1.3122f, 8.3105f, 3.4395f)
                lineToRelative(1.6953f, -1.6953f)
                curveToRelative(-2.56f, -2.5594f, -6.0999f, -4.1543f, -10.006f, -4.1543f)
                close()
                moveTo(12.0f, 4.3203f)
                curveToRelative(-2.7091f, 0.0f, -5.1685f, 1.1138f, -6.9473f, 2.8926f)
                lineToRelative(1.6953f, 1.6953f)
                curveToRelative(1.346f, -1.346f, 3.2079f, -2.1777f, 5.252f, -2.1777f)
                curveToRelative(2.0435f, 0.0f, 3.9053f, 0.8317f, 5.252f, 2.1777f)
                lineToRelative(1.6953f, -1.6953f)
                curveToRelative(-1.7782f, -1.7782f, -4.2381f, -2.8926f, -6.9473f, -2.8926f)
                close()
                moveTo(4.2715f, 8.0762f)
                curveToRelative(-1.3295f, 1.6792f, -2.1113f, 3.7906f, -2.1113f, 6.084f)
                curveToRelative(0.0f, 5.4189f, 4.4216f, 9.8398f, 9.8398f, 9.8398f)
                curveToRelative(5.4183f, 0.0f, 9.8398f, -4.4209f, 9.8398f, -9.8398f)
                curveToRelative(0.0f, -2.2934f, -0.7983f, -4.4048f, -2.1113f, -6.084f)
                lineToRelative(-1.7129f, 1.7129f)
                curveToRelative(0.8974f, 1.2298f, 1.4297f, 2.7427f, 1.4297f, 4.3711f)
                curveToRelative(0.0f, 4.1053f, -3.34f, 7.4473f, -7.4453f, 7.4473f)
                curveToRelative(-4.1052f, 0.0f, -7.4473f, -3.342f, -7.4473f, -7.4473f)
                curveToRelative(0.0f, -1.6284f, 0.5317f, -3.1413f, 1.4297f, -4.3711f)
                lineToRelative(-1.7109f, -1.7129f)
                close()
                moveTo(12.0f, 8.6426f)
                curveToRelative(-1.5128f, 0.0f, -2.8928f, 0.6163f, -3.9062f, 1.6133f)
                lineToRelative(1.6953f, 1.6953f)
                curveToRelative(1.2219f, -1.2195f, 3.2006f, -1.2195f, 4.4219f, 0.0f)
                lineToRelative(1.6953f, -1.6953f)
                curveToRelative(-1.0354f, -1.0361f, -2.4416f, -1.6176f, -3.9062f, -1.6133f)
                close()
                moveTo(12.0f, 12.5313f)
                curveToRelative(-0.8997f, 0.0f, -1.6289f, 0.7291f, -1.6289f, 1.6289f)
                curveToRelative(0.0f, 0.8992f, 0.7292f, 1.6289f, 1.6289f, 1.6289f)
                curveToRelative(0.8998f, 0.0f, 1.6289f, -0.7297f, 1.6289f, -1.6289f)
                curveToRelative(-0.0019f, -0.8992f, -0.7297f, -1.6277f, -1.6289f, -1.6289f)
                close()
            }
        }
        .build()
        return _openwrt!!
    }

private var _openwrt: ImageVector? = null
