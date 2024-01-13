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

public val SolidGroup.HouseFire: ImageVector
    get() {
        if (_houseFire != null) {
            return _houseFire!!
        }
        _houseFire = Builder(name = "HouseFire", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 350.1f)
                lineToRelative(0.0f, 1.9f)
                lineTo(256.0f, 352.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                lineTo(160.0f, 512.0f)
                lineTo(128.1f, 512.0f)
                curveToRelative(-1.5f, 0.0f, -3.0f, -0.1f, -4.5f, -0.2f)
                curveToRelative(-1.2f, 0.1f, -2.4f, 0.2f, -3.6f, 0.2f)
                lineTo(104.0f, 512.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                lineTo(64.0f, 360.0f)
                curveToRelative(0.0f, -0.9f, 0.0f, -1.9f, 0.1f, -2.8f)
                lineTo(64.1f, 287.6f)
                lineTo(32.0f, 287.6f)
                curveToRelative(-18.0f, 0.0f, -32.0f, -14.0f, -32.0f, -32.1f)
                curveToRelative(0.0f, -9.0f, 3.0f, -17.0f, 10.0f, -24.0f)
                lineTo(266.4f, 8.0f)
                curveToRelative(7.0f, -7.0f, 15.0f, -8.0f, 22.0f, -8.0f)
                reflectiveCurveToRelative(15.0f, 2.0f, 21.0f, 7.0f)
                lineTo(447.3f, 128.1f)
                curveToRelative(-12.3f, -1.0f, -25.0f, 3.0f, -34.8f, 11.7f)
                curveToRelative(-35.4f, 31.6f, -65.6f, 67.7f, -87.3f, 102.8f)
                curveTo(304.3f, 276.5f, 288.0f, 314.9f, 288.0f, 350.1f)
                close()
                moveTo(480.0f, 512.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, -71.6f, -160.0f, -160.0f)
                curveToRelative(0.0f, -76.7f, 62.5f, -144.7f, 107.2f, -179.4f)
                curveToRelative(5.0f, -3.9f, 10.9f, -5.8f, 16.8f, -5.8f)
                curveToRelative(7.9f, -0.1f, 16.0f, 3.1f, 22.0f, 9.2f)
                lineToRelative(46.0f, 46.0f)
                lineToRelative(11.3f, -11.3f)
                curveToRelative(11.7f, -11.7f, 30.6f, -12.7f, 42.3f, -1.0f)
                curveTo(624.5f, 268.0f, 640.0f, 320.2f, 640.0f, 352.0f)
                curveToRelative(0.0f, 88.4f, -71.6f, 160.0f, -160.0f, 160.0f)
                close()
                moveTo(544.0f, 400.2f)
                curveToRelative(0.0f, -36.5f, -37.0f, -73.0f, -54.8f, -88.4f)
                curveToRelative(-5.4f, -4.7f, -13.1f, -4.7f, -18.5f, 0.0f)
                curveTo(453.0f, 327.1f, 416.0f, 363.6f, 416.0f, 400.2f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                reflectiveCurveToRelative(64.0f, -28.7f, 64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _houseFire!!
    }

private var _houseFire: ImageVector? = null
