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

public val SolidGroup.UserAlt: ImageVector
    get() {
        if (_userAlt != null) {
            return _userAlt!!
        }
        _userAlt = Builder(name = "UserAlt", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 288.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, -64.5f, 144.0f, -144.0f)
                reflectiveCurveTo(335.5f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(112.0f, 64.5f, 112.0f, 144.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                close()
                moveTo(384.0f, 320.0f)
                horizontalLineToRelative(-55.1f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16.0f, -72.9f, 16.0f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16.0f)
                lineTo(128.0f, 320.0f)
                curveTo(57.3f, 320.0f, 0.0f, 377.3f, 0.0f, 448.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -70.7f, -57.3f, -128.0f, -128.0f, -128.0f)
                close()
            }
        }
        .build()
        return _userAlt!!
    }

private var _userAlt: ImageVector? = null
