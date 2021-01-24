package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.GrinTongue: ImageVector
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
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(312.0f, 408.0f)
                curveToRelative(0.0f, 35.6f, -29.1f, 64.5f, -64.9f, 64.0f)
                curveToRelative(-35.1f, -0.5f, -63.1f, -29.8f, -63.1f, -65.0f)
                verticalLineToRelative(-42.8f)
                lineToRelative(17.7f, -8.8f)
                curveToRelative(15.0f, -7.5f, 31.5f, 1.7f, 34.9f, 16.5f)
                lineToRelative(2.8f, 12.1f)
                curveToRelative(2.1f, 9.2f, 15.2f, 9.2f, 17.3f, 0.0f)
                lineToRelative(2.8f, -12.1f)
                curveToRelative(3.4f, -14.8f, 19.8f, -24.1f, 34.9f, -16.5f)
                lineToRelative(17.7f, 8.8f)
                lineTo(312.1f, 408.0f)
                close()
                moveTo(340.2f, 433.3f)
                curveToRelative(2.2f, -8.1f, 3.8f, -16.5f, 3.8f, -25.3f)
                verticalLineToRelative(-43.5f)
                curveToRelative(14.2f, -12.4f, 24.4f, -27.5f, 27.3f, -44.5f)
                curveToRelative(1.7f, -9.9f, -7.7f, -18.5f, -17.7f, -15.3f)
                curveToRelative(-25.9f, 8.3f, -64.4f, 13.1f, -105.6f, 13.1f)
                reflectiveCurveToRelative(-79.6f, -4.8f, -105.6f, -13.1f)
                curveToRelative(-9.9f, -3.1f, -19.4f, 5.3f, -17.7f, 15.3f)
                curveToRelative(2.9f, 17.0f, 13.1f, 32.1f, 27.3f, 44.5f)
                lineTo(152.0f, 408.0f)
                curveToRelative(0.0f, 8.8f, 1.6f, 17.2f, 3.8f, 25.3f)
                curveTo(91.8f, 399.9f, 48.0f, 333.0f, 48.0f, 256.0f)
                curveToRelative(0.0f, -110.3f, 89.7f, -200.0f, 200.0f, -200.0f)
                reflectiveCurveToRelative(200.0f, 89.7f, 200.0f, 200.0f)
                curveToRelative(0.0f, 77.0f, -43.8f, 143.9f, -107.8f, 177.3f)
                close()
                moveTo(168.0f, 176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(328.0f, 176.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _grinTongue!!
    }

private var _grinTongue: ImageVector? = null
