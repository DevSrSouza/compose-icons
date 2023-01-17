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

public val SolidGroup.Gamepad: ImageVector
    get() {
        if (_gamepad != null) {
            return _gamepad!!
        }
        _gamepad = Builder(name = "Gamepad", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 64.0f)
                curveTo(86.0f, 64.0f, 0.0f, 150.0f, 0.0f, 256.0f)
                reflectiveCurveTo(86.0f, 448.0f, 192.0f, 448.0f)
                lineTo(448.0f, 448.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, -86.0f, 192.0f, -192.0f)
                reflectiveCurveToRelative(-86.0f, -192.0f, -192.0f, -192.0f)
                lineTo(192.0f, 64.0f)
                close()
                moveTo(496.0f, 248.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                reflectiveCurveToRelative(-17.9f, 40.0f, -40.0f, 40.0f)
                close()
                moveTo(472.0f, 304.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                reflectiveCurveToRelative(-40.0f, -17.9f, -40.0f, -40.0f)
                reflectiveCurveToRelative(17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                close()
                moveTo(168.0f, 200.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                reflectiveCurveToRelative(24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(216.0f, 280.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                lineTo(168.0f, 280.0f)
                lineTo(136.0f, 280.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                lineTo(168.0f, 200.0f)
                close()
            }
        }
        .build()
        return _gamepad!!
    }

private var _gamepad: ImageVector? = null
