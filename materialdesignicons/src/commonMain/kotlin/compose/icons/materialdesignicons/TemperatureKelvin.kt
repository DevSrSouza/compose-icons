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

public val MaterialDesignIcons.TemperatureKelvin: ImageVector
    get() {
        if (_temperatureKelvin != null) {
            return _temperatureKelvin!!
        }
        _temperatureKelvin = Builder(name = "TemperatureKelvin", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(11.0f)
                lineTo(15.0f, 5.0f)
                horizontalLineTo(19.0f)
                lineTo(13.88f, 10.78f)
                lineTo(19.0f, 20.0f)
                horizontalLineTo(15.38f)
                lineTo(11.76f, 13.17f)
                lineTo(10.0f, 15.15f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _temperatureKelvin!!
    }

private var _temperatureKelvin: ImageVector? = null
