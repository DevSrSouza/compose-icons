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

public val MaterialDesignIcons.MeterElectricOutline: ImageVector
    get() {
        if (_meterElectricOutline != null) {
            return _meterElectricOutline!!
        }
        _meterElectricOutline = Builder(name = "MeterElectricOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                curveTo(21.0f, 6.03f, 16.97f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(3.0f, 6.03f, 3.0f, 11.0f)
                curveTo(3.0f, 14.92f, 5.5f, 18.24f, 9.0f, 19.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.94f)
                curveTo(11.33f, 20.0f, 11.66f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(12.67f, 20.0f, 13.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.5f)
                curveTo(18.5f, 18.24f, 21.0f, 14.92f, 21.0f, 11.0f)
                moveTo(12.0f, 18.0f)
                curveTo(8.14f, 18.0f, 5.0f, 14.86f, 5.0f, 11.0f)
                reflectiveCurveTo(8.14f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(19.0f, 7.14f, 19.0f, 11.0f)
                reflectiveCurveTo(15.86f, 18.0f, 12.0f, 18.0f)
                moveTo(8.0f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                moveTo(12.75f, 10.0f)
                lineTo(9.75f, 13.0f)
                lineTo(11.0f, 14.25f)
                lineTo(9.75f, 15.5f)
                lineTo(11.25f, 17.0f)
                lineTo(14.25f, 14.0f)
                lineTo(13.0f, 12.75f)
                lineTo(14.25f, 11.5f)
                lineTo(12.75f, 10.0f)
                close()
            }
        }
        .build()
        return _meterElectricOutline!!
    }

private var _meterElectricOutline: ImageVector? = null
