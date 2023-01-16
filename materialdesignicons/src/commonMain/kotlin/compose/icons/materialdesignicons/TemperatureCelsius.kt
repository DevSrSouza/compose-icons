package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TemperatureCelsius: ImageVector
    get() {
        if (_temperatureCelsius != null) {
            return _temperatureCelsius!!
        }
        _temperatureCelsius = Builder(name = "TemperatureCelsius", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 5.0f)
                curveTo(18.05f, 5.0f, 19.5f, 5.47f, 20.69f, 6.28f)
                lineTo(19.53f, 9.17f)
                curveTo(18.73f, 8.44f, 17.67f, 8.0f, 16.5f, 8.0f)
                curveTo(14.0f, 8.0f, 12.0f, 10.0f, 12.0f, 12.5f)
                curveTo(12.0f, 15.0f, 14.0f, 17.0f, 16.5f, 17.0f)
                curveTo(17.53f, 17.0f, 18.47f, 16.66f, 19.23f, 16.08f)
                lineTo(20.37f, 18.93f)
                curveTo(19.24f, 19.61f, 17.92f, 20.0f, 16.5f, 20.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 9.0f, 12.5f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 16.5f, 5.0f)
                moveTo(6.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 3.0f)
                moveTo(6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _temperatureCelsius!!
    }

private var _temperatureCelsius: ImageVector? = null
