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

public val MaterialDesignIcons.ThermostatAuto: ImageVector
    get() {
        if (_thermostatAuto != null) {
            return _thermostatAuto!!
        }
        _thermostatAuto = Builder(name = "ThermostatAuto", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                curveTo(12.4f, 22.0f, 12.7f, 22.0f, 13.1f, 21.9f)
                lineTo(15.4f, 15.3f)
                lineTo(14.8f, 14.7f)
                curveTo(15.5f, 14.0f, 16.0f, 13.0f, 16.0f, 11.9f)
                curveTo(16.0f, 11.2f, 15.8f, 10.5f, 15.4f, 9.9f)
                lineTo(17.6f, 7.7f)
                curveTo(18.5f, 9.0f, 19.0f, 10.4f, 19.0f, 12.0f)
                horizontalLineTo(20.0f)
                curveTo(20.3f, 12.0f, 20.6f, 12.1f, 20.8f, 12.2f)
                curveTo(20.8f, 12.2f, 20.9f, 12.2f, 20.9f, 12.3f)
                curveTo(21.3f, 12.5f, 21.7f, 12.9f, 21.9f, 13.4f)
                curveTo(22.0f, 12.9f, 22.0f, 12.5f, 22.0f, 12.0f)
                curveTo(22.0f, 6.5f, 17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(14.0f, 8.6f)
                curveTo(13.4f, 8.2f, 12.7f, 8.0f, 12.0f, 8.0f)
                curveTo(9.8f, 8.0f, 8.0f, 9.8f, 8.0f, 12.0f)
                curveTo(8.0f, 13.1f, 8.4f, 14.1f, 9.2f, 14.8f)
                lineTo(7.1f, 16.9f)
                curveTo(5.8f, 15.7f, 5.0f, 13.9f, 5.0f, 12.0f)
                curveTo(5.0f, 8.1f, 8.1f, 5.0f, 12.0f, 5.0f)
                curveTo(13.6f, 5.0f, 15.0f, 5.5f, 16.2f, 6.4f)
                lineTo(14.0f, 8.6f)
                moveTo(20.0f, 14.0f)
                horizontalLineTo(18.0f)
                lineTo(14.8f, 23.0f)
                horizontalLineTo(16.7f)
                lineTo(17.4f, 21.0f)
                horizontalLineTo(20.6f)
                lineTo(21.3f, 23.0f)
                horizontalLineTo(23.2f)
                lineTo(20.0f, 14.0f)
                moveTo(17.8f, 19.7f)
                lineTo(19.0f, 16.0f)
                lineTo(20.2f, 19.7f)
                horizontalLineTo(17.8f)
                close()
            }
        }
        .build()
        return _thermostatAuto!!
    }

private var _thermostatAuto: ImageVector? = null
