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

public val SolidGroup.GrinHearts: ImageVector
    get() {
        if (_grinHearts != null) {
            return _grinHearts!!
        }
        _grinHearts = Builder(name = "GrinHearts", defaultWidth = 496.0.dp, defaultHeight =
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
                moveTo(90.4f, 183.6f)
                curveToRelative(6.7f, -17.6f, 26.7f, -26.7f, 44.9f, -21.9f)
                lineToRelative(7.1f, 1.9f)
                lineToRelative(2.0f, -7.1f)
                curveToRelative(5.0f, -18.1f, 22.8f, -30.9f, 41.5f, -27.9f)
                curveToRelative(21.4f, 3.4f, 34.4f, 24.2f, 28.8f, 44.5f)
                lineTo(195.3f, 243.0f)
                curveToRelative(-1.2f, 4.5f, -5.9f, 7.2f, -10.5f, 6.0f)
                lineToRelative(-70.2f, -18.2f)
                curveToRelative(-20.4f, -5.4f, -31.9f, -27.0f, -24.2f, -47.2f)
                close()
                moveTo(248.0f, 432.0f)
                curveToRelative(-60.6f, 0.0f, -134.5f, -38.3f, -143.8f, -93.3f)
                curveToRelative(-2.0f, -11.8f, 9.2f, -21.5f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200.0f, 336.0f, 248.0f, 336.0f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.6f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-9.3f, 55.0f, -83.2f, 93.3f, -143.8f, 93.3f)
                close()
                moveTo(381.4f, 230.7f)
                lineToRelative(-70.2f, 18.2f)
                curveToRelative(-4.5f, 1.2f, -9.2f, -1.5f, -10.5f, -6.0f)
                lineTo(281.3f, 173.0f)
                curveToRelative(-5.6f, -20.3f, 7.4f, -41.1f, 28.8f, -44.5f)
                curveToRelative(18.6f, -3.0f, 36.4f, 9.8f, 41.5f, 27.9f)
                lineToRelative(2.0f, 7.1f)
                lineToRelative(7.1f, -1.9f)
                curveToRelative(18.2f, -4.7f, 38.2f, 4.3f, 44.9f, 21.9f)
                curveToRelative(7.7f, 20.3f, -3.8f, 41.9f, -24.2f, 47.2f)
                close()
            }
        }
        .build()
        return _grinHearts!!
    }

private var _grinHearts: ImageVector? = null
