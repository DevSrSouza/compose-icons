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

public val SolidGroup.GrinSquint: ImageVector
    get() {
        if (_grinSquint != null) {
            return _grinSquint!!
        }
        _grinSquint = Builder(name = "GrinSquint", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(281.8f, 197.7f)
                lineToRelative(80.0f, -48.0f)
                curveToRelative(11.6f, -6.9f, 24.0f, 7.7f, 15.4f, 18.0f)
                lineTo(343.6f, 208.0f)
                lineToRelative(33.6f, 40.3f)
                curveToRelative(8.7f, 10.4f, -3.9f, 24.8f, -15.4f, 18.0f)
                lineToRelative(-80.0f, -48.0f)
                curveToRelative(-7.7f, -4.7f, -7.7f, -15.9f, 0.0f, -20.6f)
                close()
                moveTo(118.8f, 167.7f)
                curveToRelative(-8.6f, -10.3f, 3.8f, -24.9f, 15.4f, -18.0f)
                lineToRelative(80.0f, 48.0f)
                curveToRelative(7.8f, 4.7f, 7.8f, 15.9f, 0.0f, 20.6f)
                lineToRelative(-80.0f, 48.0f)
                curveToRelative(-11.5f, 6.8f, -24.0f, -7.6f, -15.4f, -18.0f)
                lineToRelative(33.6f, -40.3f)
                lineToRelative(-33.6f, -40.3f)
                close()
                moveTo(248.0f, 432.0f)
                curveToRelative(-60.6f, 0.0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2.0f, -11.9f, 9.4f, -21.6f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200.0f, 336.0f, 248.0f, 336.0f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.5f, -3.7f, 22.6f, 6.2f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55.0f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
            }
        }
        .build()
        return _grinSquint!!
    }

private var _grinSquint: ImageVector? = null
