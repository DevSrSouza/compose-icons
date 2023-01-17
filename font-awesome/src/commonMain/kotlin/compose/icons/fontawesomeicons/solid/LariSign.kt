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

public val SolidGroup.LariSign: ImageVector
    get() {
        if (_lariSign != null) {
            return _lariSign!!
        }
        _lariSign = Builder(name = "LariSign", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(96.7f)
                curveToRelative(5.3f, -0.4f, 10.6f, -0.7f, 16.0f, -0.7f)
                reflectiveCurveToRelative(10.7f, 0.2f, 16.0f, 0.7f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(49.4f)
                curveToRelative(54.9f, 25.2f, 95.8f, 75.5f, 108.2f, 136.2f)
                curveToRelative(3.5f, 17.3f, -7.7f, 34.2f, -25.0f, 37.7f)
                reflectiveCurveToRelative(-34.2f, -7.7f, -37.7f, -25.0f)
                curveToRelative(-6.1f, -29.9f, -22.5f, -55.9f, -45.4f, -74.3f)
                verticalLineTo(256.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(161.0f)
                curveToRelative(-5.2f, -0.7f, -10.6f, -1.0f, -16.0f, -1.0f)
                reflectiveCurveToRelative(-10.8f, 0.3f, -16.0f, 1.0f)
                verticalLineToRelative(95.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(188.1f)
                curveTo(82.7f, 211.5f, 64.0f, 247.6f, 64.0f, 288.0f)
                curveToRelative(0.0f, 70.7f, 57.3f, 128.0f, 128.0f, 128.0f)
                horizontalLineTo(352.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(192.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(48.9f)
                curveTo(18.5f, 382.0f, 0.0f, 337.2f, 0.0f, 288.0f)
                curveToRelative(0.0f, -77.5f, 45.9f, -144.3f, 112.0f, -174.6f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
            }
        }
        .build()
        return _lariSign!!
    }

private var _lariSign: ImageVector? = null
