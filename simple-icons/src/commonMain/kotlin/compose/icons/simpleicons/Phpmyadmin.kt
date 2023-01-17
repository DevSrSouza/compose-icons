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

public val SimpleIcons.Phpmyadmin: ImageVector
    get() {
        if (_phpmyadmin != null) {
            return _phpmyadmin!!
        }
        _phpmyadmin = Builder(name = "Phpmyadmin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.463f, 3.476f)
                curveTo(6.69f, 5.225f, 7.497f, 7.399f, 7.68f, 9.798f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, true, -0.672f, 5.254f)
                arcToRelative(4.29f, 4.29f, 0.0f, false, true, 2.969f, -1.523f)
                curveToRelative(0.05f, -0.004f, 0.099f, -0.006f, 0.148f, -0.008f)
                curveToRelative(0.08f, -0.491f, 0.47f, -3.45f, -0.977f, -6.68f)
                curveToRelative(-1.068f, -2.386f, -3.0f, -3.16f, -3.685f, -3.365f)
                close()
                moveTo(7.24f, 3.513f)
                reflectiveCurveToRelative(2.406f, 1.066f, 3.326f, 5.547f)
                curveToRelative(0.607f, 2.955f, 0.049f, 4.836f, -0.402f, 5.773f)
                arcToRelative(7.347f, 7.347f, 0.0f, false, true, 4.506f, -1.994f)
                curveToRelative(0.86f, -0.065f, 1.695f, 0.02f, 2.482f, 0.233f)
                curveToRelative(-0.1f, -0.741f, -0.593f, -3.414f, -2.732f, -5.92f)
                curveToRelative(-3.263f, -3.823f, -7.18f, -3.64f, -7.18f, -3.64f)
                close()
                moveTo(22.057f, 13.214f)
                lineTo(4.137f, 16.263f)
                arcToRelative(2.284f, 2.284f, 0.0f, false, true, 1.535f, 2.254f)
                arcToRelative(2.31f, 2.31f, 0.0f, false, true, -0.106f, 0.61f)
                curveToRelative(0.055f, -0.027f, 2.689f, -1.275f, 6.342f, -2.034f)
                curveToRelative(3.238f, -0.673f, 5.723f, -0.36f, 6.285f, -0.273f)
                arcToRelative(6.46f, 6.46f, 0.0f, false, true, 3.864f, -3.606f)
                close()
                moveTo(15.844f, 17.292f)
                curveToRelative(-2.318f, 0.0f, -4.641f, 0.495f, -6.614f, 1.166f)
                curveToRelative(-2.868f, 0.976f, -2.951f, 1.348f, -5.55f, 1.043f)
                curveTo(1.844f, 19.286f, 0.0f, 18.386f, 0.0f, 18.386f)
                reflectiveCurveToRelative(2.406f, 1.97f, 4.914f, 2.127f)
                curveToRelative(1.986f, 0.125f, 3.505f, -0.822f, 5.315f, -1.414f)
                curveToRelative(2.661f, -0.871f, 4.511f, -0.97f, 6.253f, -0.975f)
                curveTo(19.361f, 18.116f, 24.0f, 19.353f, 24.0f, 19.353f)
                reflectiveCurveToRelative(-2.11f, -1.044f, -5.033f, -1.72f)
                arcToRelative(13.885f, 13.885f, 0.0f, false, false, -3.123f, -0.34f)
                close()
            }
        }
        .build()
        return _phpmyadmin!!
    }

private var _phpmyadmin: ImageVector? = null
