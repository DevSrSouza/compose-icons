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
                horizontalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                horizontalLineTo(160.0f)
                horizontalLineTo(128.1f)
                curveToRelative(-1.5f, 0.0f, -3.0f, -0.1f, -4.5f, -0.2f)
                curveToRelative(-1.2f, 0.1f, -2.4f, 0.2f, -3.6f, 0.2f)
                horizontalLineTo(104.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, -0.9f, 0.0f, -1.9f, 0.1f, -2.8f)
                verticalLineTo(287.6f)
                horizontalLineTo(32.0f)
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
                moveTo(453.5f, 163.8f)
                curveToRelative(19.7f, 17.8f, 38.2f, 37.0f, 55.5f, 57.7f)
                curveToRelative(7.9f, -9.9f, 16.8f, -20.7f, 26.5f, -29.5f)
                curveToRelative(5.6f, -5.1f, 14.4f, -5.1f, 20.0f, 0.0f)
                curveToRelative(24.7f, 22.7f, 45.6f, 52.7f, 60.4f, 81.1f)
                curveToRelative(14.5f, 28.0f, 24.2f, 56.7f, 24.2f, 76.9f)
                curveTo(640.0f, 437.9f, 568.7f, 512.0f, 480.0f, 512.0f)
                curveToRelative(-89.7f, 0.0f, -160.0f, -74.2f, -160.0f, -161.9f)
                curveToRelative(0.0f, -26.4f, 12.7f, -58.6f, 32.4f, -90.6f)
                curveToRelative(20.0f, -32.4f, 48.1f, -66.1f, 81.4f, -95.8f)
                curveToRelative(5.6f, -5.0f, 14.2f, -5.0f, 19.8f, 0.0f)
                close()
                moveTo(530.0f, 433.0f)
                curveToRelative(30.0f, -21.0f, 38.0f, -63.0f, 20.0f, -96.0f)
                curveToRelative(-2.0f, -4.0f, -4.0f, -8.0f, -7.0f, -12.0f)
                lineToRelative(-36.0f, 42.0f)
                reflectiveCurveToRelative(-58.0f, -74.0f, -62.0f, -79.0f)
                curveToRelative(-30.0f, 37.0f, -45.0f, 58.0f, -45.0f, 82.0f)
                curveToRelative(0.0f, 49.0f, 36.0f, 78.0f, 81.0f, 78.0f)
                curveToRelative(18.0f, 0.0f, 34.0f, -5.0f, 49.0f, -15.0f)
                close()
            }
        }
        .build()
        return _houseFire!!
    }

private var _houseFire: ImageVector? = null
