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

public val SolidGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 384.0f)
                curveToRelative(9.6f, -31.9f, 29.5f, -59.1f, 49.2f, -86.2f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(5.2f, -7.1f, 10.4f, -14.2f, 15.4f, -21.4f)
                curveToRelative(19.8f, -28.5f, 31.4f, -63.0f, 31.4f, -100.3f)
                curveTo(368.0f, 78.8f, 289.2f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(16.0f, 78.8f, 16.0f, 176.0f)
                curveToRelative(0.0f, 37.3f, 11.6f, 71.9f, 31.4f, 100.3f)
                curveToRelative(5.0f, 7.2f, 10.2f, 14.3f, 15.4f, 21.4f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(19.8f, 27.1f, 39.7f, 54.4f, 49.2f, 86.2f)
                horizontalLineTo(272.0f)
                close()
                moveTo(192.0f, 512.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                verticalLineTo(416.0f)
                horizontalLineTo(112.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                close()
                moveTo(112.0f, 176.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                reflectiveCurveToRelative(-16.0f, -7.2f, -16.0f, -16.0f)
                curveToRelative(0.0f, -61.9f, 50.1f, -112.0f, 112.0f, -112.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null
