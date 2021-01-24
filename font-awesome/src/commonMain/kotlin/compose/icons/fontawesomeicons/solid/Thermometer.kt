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
                moveTo(476.8f, 20.4f)
                curveToRelative(-37.5f, -30.7f, -95.5f, -26.3f, -131.9f, 10.2f)
                lineToRelative(-45.7f, 46.0f)
                lineToRelative(50.5f, 50.5f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0.0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0.0f)
                lineToRelative(-50.4f, -50.5f)
                lineToRelative(-45.1f, 45.4f)
                lineToRelative(50.3f, 50.4f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0.0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0.0f)
                lineTo(209.0f, 167.4f)
                lineToRelative(-45.1f, 45.4f)
                lineTo(214.0f, 263.0f)
                curveToRelative(3.1f, 3.1f, 3.1f, 8.2f, 0.0f, 11.3f)
                lineToRelative(-11.3f, 11.3f)
                curveToRelative(-3.1f, 3.1f, -8.2f, 3.1f, -11.3f, 0.0f)
                lineToRelative(-50.1f, -50.2f)
                lineTo(96.0f, 281.1f)
                verticalLineTo(382.0f)
                lineTo(7.0f, 471.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineToRelative(89.0f, -89.0f)
                horizontalLineToRelative(99.9f)
                lineTo(484.0f, 162.6f)
                curveToRelative(34.9f, -34.9f, 42.2f, -101.5f, -7.2f, -142.2f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
