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

public val SolidGroup.UserShield: ImageVector
    get() {
        if (_userShield != null) {
            return _userShield!!
        }
        _userShield = Builder(name = "UserShield", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(622.3f, 271.1f)
                lineToRelative(-115.2f, -45.0f)
                curveToRelative(-4.1f, -1.6f, -12.6f, -3.7f, -22.2f, 0.0f)
                lineToRelative(-115.2f, 45.0f)
                curveToRelative(-10.7f, 4.2f, -17.7f, 14.0f, -17.7f, 24.9f)
                curveToRelative(0.0f, 111.6f, 68.7f, 188.8f, 132.9f, 213.9f)
                curveToRelative(9.6f, 3.7f, 18.0f, 1.6f, 22.2f, 0.0f)
                curveTo(558.4f, 489.9f, 640.0f, 420.5f, 640.0f, 296.0f)
                curveToRelative(0.0f, -10.9f, -7.0f, -20.7f, -17.7f, -24.9f)
                close()
                moveTo(496.0f, 462.4f)
                lineTo(496.0f, 273.3f)
                lineToRelative(95.5f, 37.3f)
                curveToRelative(-5.6f, 87.1f, -60.9f, 135.4f, -95.5f, 151.8f)
                close()
                moveTo(224.0f, 256.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(294.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(96.0f, 57.3f, 96.0f, 128.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                close()
                moveTo(320.0f, 296.0f)
                curveToRelative(0.0f, -2.5f, 0.8f, -4.8f, 1.1f, -7.2f)
                curveToRelative(-2.5f, -0.1f, -4.9f, -0.8f, -7.5f, -0.8f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16.0f, -72.9f, 16.0f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16.0f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288.0f, 0.0f, 348.2f, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(6.8f, 0.0f, 13.3f, -1.5f, 19.2f, -4.0f)
                curveToRelative(-54.0f, -42.9f, -99.2f, -116.7f, -99.2f, -212.0f)
                close()
            }
        }
        .build()
        return _userShield!!
    }

private var _userShield: ImageVector? = null
