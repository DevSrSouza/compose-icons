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

public val SolidGroup.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(name = "Thermometer", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 382.1f)
                verticalLineTo(293.3f)
                curveToRelative(0.0f, -14.9f, 5.9f, -29.1f, 16.4f, -39.6f)
                lineToRelative(27.3f, -27.3f)
                lineToRelative(57.0f, 57.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-57.0f, -57.0f)
                lineToRelative(41.4f, -41.4f)
                lineToRelative(57.0f, 57.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-57.0f, -57.0f)
                lineToRelative(41.4f, -41.4f)
                lineToRelative(57.0f, 57.0f)
                curveToRelative(6.2f, 6.2f, 16.4f, 6.2f, 22.6f, 0.0f)
                reflectiveCurveToRelative(6.2f, -16.4f, 0.0f, -22.6f)
                lineToRelative(-57.0f, -57.0f)
                lineToRelative(45.5f, -45.5f)
                curveTo(355.2f, 10.9f, 381.4f, 0.0f, 408.8f, 0.0f)
                curveTo(465.8f, 0.0f, 512.0f, 46.2f, 512.0f, 103.2f)
                curveToRelative(0.0f, 27.4f, -10.9f, 53.6f, -30.2f, 73.0f)
                lineTo(258.3f, 399.6f)
                curveToRelative(-10.5f, 10.5f, -24.7f, 16.4f, -39.6f, 16.4f)
                horizontalLineTo(129.9f)
                lineTo(41.0f, 505.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(89.0f, -89.0f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
