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

public val MaterialDesignIcons.ThermostatBox: ImageVector
    get() {
        if (_thermostatBox != null) {
            return _thermostatBox!!
        }
        _thermostatBox = Builder(name = "ThermostatBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(12.0f, 5.0f)
                curveTo(13.57f, 5.0f, 15.0f, 5.5f, 16.19f, 6.4f)
                lineTo(14.0f, 8.56f)
                curveTo(13.43f, 8.21f, 12.74f, 8.0f, 12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 12.0f)
                curveTo(8.0f, 13.1f, 8.45f, 14.1f, 9.17f, 14.83f)
                lineTo(7.05f, 16.95f)
                curveTo(5.78f, 15.68f, 5.0f, 13.93f, 5.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 5.0f)
                moveTo(17.6f, 7.81f)
                curveTo(18.5f, 9.0f, 19.0f, 10.43f, 19.0f, 12.0f)
                curveTo(19.0f, 13.93f, 18.22f, 15.68f, 16.95f, 16.95f)
                lineTo(14.83f, 14.83f)
                curveTo(15.55f, 14.1f, 16.0f, 13.1f, 16.0f, 12.0f)
                curveTo(16.0f, 11.26f, 15.79f, 10.57f, 15.43f, 10.0f)
                lineTo(17.6f, 7.81f)
                close()
            }
        }
        .build()
        return _thermostatBox!!
    }

private var _thermostatBox: ImageVector? = null
