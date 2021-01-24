package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.GrinTongue: ImageVector
    get() {
        if (_grinTongue != null) {
            return _grinTongue!!
        }
        _grinTongue = Builder(name = "GrinTongue", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                curveToRelative(0.0f, 106.3f, 67.0f, 196.7f, 161.0f, 232.0f)
                curveToRelative(-5.6f, -12.2f, -9.0f, -25.7f, -9.0f, -40.0f)
                verticalLineToRelative(-45.5f)
                curveToRelative(-24.7f, -16.2f, -43.5f, -38.1f, -47.8f, -63.8f)
                curveToRelative(-2.0f, -11.8f, 9.3f, -21.5f, 20.7f, -17.9f)
                curveTo(155.1f, 330.5f, 200.0f, 336.0f, 248.0f, 336.0f)
                reflectiveCurveToRelative(92.9f, -5.5f, 123.1f, -15.2f)
                curveToRelative(11.4f, -3.6f, 22.6f, 6.1f, 20.7f, 17.9f)
                curveToRelative(-4.3f, 25.7f, -23.1f, 47.6f, -47.8f, 63.8f)
                lineTo(344.0f, 448.0f)
                curveToRelative(0.0f, 14.3f, -3.4f, 27.8f, -9.0f, 40.0f)
                curveToRelative(94.0f, -35.3f, 161.0f, -125.7f, 161.0f, -232.0f)
                curveTo(496.0f, 119.0f, 385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(168.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(328.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(293.1f, 374.6f)
                curveToRelative(-14.4f, -6.5f, -31.1f, 2.2f, -34.6f, 17.6f)
                lineToRelative(-1.8f, 7.8f)
                curveToRelative(-2.1f, 9.2f, -15.2f, 9.2f, -17.3f, 0.0f)
                lineToRelative(-1.8f, -7.8f)
                curveToRelative(-3.5f, -15.4f, -20.2f, -24.1f, -34.6f, -17.6f)
                curveToRelative(-0.9f, 0.4f, 0.3f, -0.2f, -18.9f, 9.4f)
                verticalLineToRelative(63.0f)
                curveToRelative(0.0f, 35.2f, 28.0f, 64.5f, 63.1f, 64.9f)
                curveToRelative(35.7f, 0.5f, 64.9f, -28.4f, 64.9f, -64.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(-19.5f, -9.6f, -18.2f, -8.9f, -19.0f, -9.3f)
                close()
            }
        }
        .build()
        return _grinTongue!!
    }

private var _grinTongue: ImageVector? = null
