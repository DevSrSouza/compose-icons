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

public val SolidGroup.StreetView: ImageVector
    get() {
        if (_streetView != null) {
            return _streetView!!
        }
        _streetView = Builder(name = "StreetView", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 64.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, false, 192.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 128.0f, 0.0f)
                close()
                moveTo(224.0f, 160.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(1.8f)
                lineToRelative(11.1f, 99.5f)
                curveToRelative(1.8f, 16.2f, 15.5f, 28.5f, 31.8f, 28.5f)
                horizontalLineToRelative(38.7f)
                curveToRelative(16.3f, 0.0f, 30.0f, -12.3f, 31.8f, -28.5f)
                lineTo(318.2f, 304.0f)
                lineTo(320.0f, 304.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(352.0f, 224.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(224.0f, 160.0f)
                close()
                moveTo(132.3f, 394.2f)
                curveToRelative(13.0f, -2.4f, 21.7f, -14.9f, 19.3f, -27.9f)
                reflectiveCurveToRelative(-14.9f, -21.7f, -27.9f, -19.3f)
                curveToRelative(-32.4f, 5.9f, -60.9f, 14.2f, -82.0f, 24.8f)
                curveToRelative(-10.5f, 5.3f, -20.3f, 11.7f, -27.8f, 19.6f)
                curveTo(6.4f, 399.5f, 0.0f, 410.5f, 0.0f, 424.0f)
                curveToRelative(0.0f, 21.4f, 15.5f, 36.1f, 29.1f, 45.0f)
                curveToRelative(14.7f, 9.6f, 34.3f, 17.3f, 56.4f, 23.4f)
                curveTo(130.2f, 504.7f, 190.4f, 512.0f, 256.0f, 512.0f)
                reflectiveCurveToRelative(125.8f, -7.3f, 170.4f, -19.6f)
                curveToRelative(22.1f, -6.1f, 41.8f, -13.8f, 56.4f, -23.4f)
                curveToRelative(13.7f, -8.9f, 29.1f, -23.6f, 29.1f, -45.0f)
                curveToRelative(0.0f, -13.5f, -6.4f, -24.5f, -14.0f, -32.6f)
                curveToRelative(-7.5f, -7.9f, -17.3f, -14.3f, -27.8f, -19.6f)
                curveToRelative(-21.0f, -10.6f, -49.5f, -18.9f, -82.0f, -24.8f)
                curveToRelative(-13.0f, -2.4f, -25.5f, 6.3f, -27.9f, 19.3f)
                reflectiveCurveToRelative(6.3f, 25.5f, 19.3f, 27.9f)
                curveToRelative(30.2f, 5.5f, 53.7f, 12.8f, 69.0f, 20.5f)
                curveToRelative(3.2f, 1.6f, 5.8f, 3.1f, 7.9f, 4.5f)
                curveToRelative(3.6f, 2.4f, 3.6f, 7.2f, 0.0f, 9.6f)
                curveToRelative(-8.8f, 5.7f, -23.1f, 11.8f, -43.0f, 17.3f)
                curveTo(374.3f, 457.0f, 318.5f, 464.0f, 256.0f, 464.0f)
                reflectiveCurveToRelative(-118.3f, -7.0f, -157.7f, -17.9f)
                curveToRelative(-19.9f, -5.5f, -34.2f, -11.6f, -43.0f, -17.3f)
                curveToRelative(-3.6f, -2.4f, -3.6f, -7.2f, 0.0f, -9.6f)
                curveToRelative(2.1f, -1.4f, 4.8f, -2.9f, 7.9f, -4.5f)
                curveToRelative(15.3f, -7.7f, 38.8f, -14.9f, 69.0f, -20.5f)
                close()
            }
        }
        .build()
        return _streetView!!
    }

private var _streetView: ImageVector? = null
