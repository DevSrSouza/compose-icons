package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.HatCowboy: ImageVector
    get() {
        if (_hatCowboy != null) {
            return _hatCowboy!!
        }
        _hatCowboy = Builder(name = "HatCowboy", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 64.0f)
                curveToRelative(14.4f, 0.0f, 22.3f, -7.0f, 30.8f, -14.4f)
                curveTo(360.4f, 41.1f, 370.7f, 32.0f, 392.0f, 32.0f)
                curveToRelative(49.3f, 0.0f, 84.4f, 152.2f, 97.9f, 221.9f)
                curveTo(447.8f, 272.1f, 390.9f, 288.0f, 320.0f, 288.0f)
                reflectiveCurveToRelative(-127.8f, -15.9f, -169.9f, -34.1f)
                curveTo(163.6f, 184.2f, 198.7f, 32.0f, 248.0f, 32.0f)
                curveToRelative(21.3f, 0.0f, 31.6f, 9.1f, 41.2f, 17.6f)
                curveTo(297.7f, 57.0f, 305.6f, 64.0f, 320.0f, 64.0f)
                close()
                moveTo(111.1f, 270.7f)
                curveToRelative(47.2f, 24.5f, 117.5f, 49.3f, 209.0f, 49.3f)
                reflectiveCurveToRelative(161.8f, -24.8f, 208.9f, -49.3f)
                curveToRelative(24.8f, -12.9f, 49.8f, -28.3f, 70.1f, -47.7f)
                curveToRelative(7.9f, -7.9f, 20.2f, -9.2f, 29.6f, -3.3f)
                curveToRelative(9.5f, 5.9f, 13.5f, 17.9f, 9.9f, 28.5f)
                curveToRelative(-13.5f, 37.7f, -38.4f, 72.3f, -66.1f, 100.6f)
                curveTo(523.7f, 398.9f, 443.6f, 448.0f, 320.0f, 448.0f)
                reflectiveCurveToRelative(-203.6f, -49.1f, -252.5f, -99.2f)
                curveTo(39.8f, 320.4f, 14.9f, 285.8f, 1.4f, 248.1f)
                curveToRelative(-3.6f, -10.6f, 0.4f, -22.6f, 9.9f, -28.5f)
                curveToRelative(9.5f, -5.9f, 21.7f, -4.5f, 29.6f, 3.3f)
                curveToRelative(20.4f, 19.4f, 45.3f, 34.8f, 70.1f, 47.7f)
                close()
            }
        }
        .build()
        return _hatCowboy!!
    }

private var _hatCowboy: ImageVector? = null
