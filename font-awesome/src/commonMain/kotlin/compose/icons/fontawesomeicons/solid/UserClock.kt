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

public val SolidGroup.UserClock: ImageVector
    get() {
        if (_userClock != null) {
            return _userClock!!
        }
        _userClock = Builder(name = "UserClock", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(496.0f, 224.0f)
                curveToRelative(-79.6f, 0.0f, -144.0f, 64.4f, -144.0f, 144.0f)
                reflectiveCurveToRelative(64.4f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.4f, 144.0f, -144.0f)
                reflectiveCurveToRelative(-64.4f, -144.0f, -144.0f, -144.0f)
                close()
                moveTo(560.0f, 374.3f)
                curveToRelative(0.0f, 5.3f, -4.4f, 9.7f, -9.7f, 9.7f)
                horizontalLineToRelative(-60.6f)
                curveToRelative(-5.3f, 0.0f, -9.7f, -4.4f, -9.7f, -9.7f)
                verticalLineToRelative(-76.6f)
                curveToRelative(0.0f, -5.3f, 4.4f, -9.7f, 9.7f, -9.7f)
                horizontalLineToRelative(12.6f)
                curveToRelative(5.3f, 0.0f, 9.7f, 4.4f, 9.7f, 9.7f)
                lineTo(512.0f, 352.0f)
                horizontalLineToRelative(38.3f)
                curveToRelative(5.3f, 0.0f, 9.7f, 4.4f, 9.7f, 9.7f)
                verticalLineToRelative(12.6f)
                close()
                moveTo(320.0f, 368.0f)
                curveToRelative(0.0f, -27.8f, 6.7f, -54.1f, 18.2f, -77.5f)
                curveToRelative(-8.0f, -1.5f, -16.2f, -2.5f, -24.6f, -2.5f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16.0f, -72.9f, 16.0f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16.0f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288.0f, 0.0f, 348.2f, 0.0f, 422.4f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(347.1f)
                curveToRelative(-45.3f, -31.9f, -75.1f, -84.5f, -75.1f, -144.0f)
                close()
                moveTo(224.0f, 256.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, -57.3f, 128.0f, -128.0f)
                reflectiveCurveTo(294.7f, 0.0f, 224.0f, 0.0f)
                reflectiveCurveTo(96.0f, 57.3f, 96.0f, 128.0f)
                reflectiveCurveToRelative(57.3f, 128.0f, 128.0f, 128.0f)
                close()
            }
        }
        .build()
        return _userClock!!
    }

private var _userClock: ImageVector? = null
