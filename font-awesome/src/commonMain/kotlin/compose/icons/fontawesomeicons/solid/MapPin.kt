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

public val SolidGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 288.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 316.94f)
                verticalLineToRelative(156.69f)
                lineToRelative(22.02f, 33.02f)
                curveToRelative(4.75f, 7.12f, 15.22f, 7.12f, 19.97f, 0.0f)
                lineTo(176.0f, 473.63f)
                lineTo(176.0f, 316.94f)
                curveToRelative(-10.39f, 1.92f, -21.06f, 3.06f, -32.0f, 3.06f)
                reflectiveCurveToRelative(-21.61f, -1.14f, -32.0f, -3.06f)
                close()
                moveTo(144.0f, 0.0f)
                curveTo(64.47f, 0.0f, 0.0f, 64.47f, 0.0f, 144.0f)
                reflectiveCurveToRelative(64.47f, 144.0f, 144.0f, 144.0f)
                reflectiveCurveToRelative(144.0f, -64.47f, 144.0f, -144.0f)
                reflectiveCurveTo(223.53f, 0.0f, 144.0f, 0.0f)
                close()
                moveTo(144.0f, 76.0f)
                curveToRelative(-37.5f, 0.0f, -68.0f, 30.5f, -68.0f, 68.0f)
                curveToRelative(0.0f, 6.62f, -5.38f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveToRelative(-12.0f, -5.38f, -12.0f, -12.0f)
                curveToRelative(0.0f, -50.73f, 41.28f, -92.0f, 92.0f, -92.0f)
                curveToRelative(6.62f, 0.0f, 12.0f, 5.38f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.38f, 12.0f, -12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
