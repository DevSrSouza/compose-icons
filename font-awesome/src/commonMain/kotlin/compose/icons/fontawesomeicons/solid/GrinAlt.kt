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

public val SolidGroup.GrinAlt: ImageVector
    get() {
        if (_grinAlt != null) {
            return _grinAlt!!
        }
        _grinAlt = Builder(name = "GrinAlt", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(311.7f, 136.7f)
                curveToRelative(7.6f, -11.4f, 24.7f, -11.7f, 32.7f, 0.0f)
                curveToRelative(12.4f, 18.4f, 15.1f, 36.9f, 15.7f, 55.3f)
                curveToRelative(-0.5f, 18.4f, -3.3f, 36.9f, -15.7f, 55.3f)
                curveToRelative(-7.6f, 11.4f, -24.7f, 11.7f, -32.7f, 0.0f)
                curveToRelative(-12.4f, -18.4f, -15.1f, -36.9f, -15.7f, -55.3f)
                curveToRelative(0.5f, -18.4f, 3.3f, -36.9f, 15.7f, -55.3f)
                close()
                moveTo(151.7f, 136.7f)
                curveToRelative(7.6f, -11.4f, 24.7f, -11.7f, 32.7f, 0.0f)
                curveToRelative(12.4f, 18.4f, 15.1f, 36.9f, 15.7f, 55.3f)
                curveToRelative(-0.5f, 18.4f, -3.3f, 36.9f, -15.7f, 55.3f)
                curveToRelative(-7.6f, 11.4f, -24.7f, 11.7f, -32.7f, 0.0f)
                curveToRelative(-12.4f, -18.4f, -15.1f, -36.9f, -15.7f, -55.3f)
                curveToRelative(0.5f, -18.4f, 3.3f, -36.9f, 15.7f, -55.3f)
                close()
                moveTo(248.0f, 432.0f)
                curveToRelative(-60.6f, 0.0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2.0f, -11.8f, 9.3f, -21.6f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200.0f, 336.0f, 248.0f, 336.0f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.7f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55.0f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
            }
        }
        .build()
        return _grinAlt!!
    }

private var _grinAlt: ImageVector? = null
