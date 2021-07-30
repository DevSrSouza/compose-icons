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

public val SolidGroup.Smog: ImageVector
    get() {
        if (_smog != null) {
            return _smog!!
        }
        _smog = Builder(name = "Smog", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(624.0f, 368.0f)
                lineTo(80.0f, 368.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(544.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(144.0f, 464.0f)
                lineTo(16.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(128.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(560.0f, 464.0f)
                lineTo(224.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(144.0f, 288.0f)
                horizontalLineToRelative(156.1f)
                curveToRelative(22.5f, 19.7f, 51.6f, 32.0f, 83.9f, 32.0f)
                reflectiveCurveToRelative(61.3f, -12.3f, 83.9f, -32.0f)
                lineTo(528.0f, 288.0f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveTo(589.9f, 64.0f, 528.0f, 64.0f)
                curveToRelative(-18.0f, 0.0f, -34.7f, 4.6f, -49.7f, 12.1f)
                curveTo(454.0f, 31.0f, 406.8f, 0.0f, 352.0f, 0.0f)
                curveToRelative(-41.0f, 0.0f, -77.8f, 17.3f, -104.0f, 44.8f)
                curveTo(221.8f, 17.3f, 185.0f, 0.0f, 144.0f, 0.0f)
                curveTo(64.5f, 0.0f, 0.0f, 64.5f, 0.0f, 144.0f)
                reflectiveCurveToRelative(64.5f, 144.0f, 144.0f, 144.0f)
                close()
            }
        }
        .build()
        return _smog!!
    }

private var _smog: ImageVector? = null
