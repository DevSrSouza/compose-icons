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

public val MaterialDesignIcons.MeterElectric: ImageVector
    get() {
        if (_meterElectric != null) {
            return _meterElectric!!
        }
        _meterElectric = Builder(name = "MeterElectric", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(7.04f, 2.0f, 3.0f, 6.04f, 3.0f, 11.0f)
                curveTo(3.0f, 14.91f, 5.5f, 18.24f, 9.0f, 19.47f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.94f)
                curveTo(11.33f, 20.0f, 11.66f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(12.67f, 20.0f, 13.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.47f)
                curveTo(18.5f, 18.23f, 21.0f, 14.9f, 21.0f, 11.0f)
                curveTo(21.0f, 6.04f, 16.96f, 2.0f, 12.0f, 2.0f)
                moveTo(14.25f, 14.0f)
                lineTo(11.25f, 17.0f)
                lineTo(9.75f, 15.5f)
                lineTo(11.0f, 14.25f)
                lineTo(9.75f, 13.0f)
                lineTo(12.75f, 10.0f)
                lineTo(14.25f, 11.5f)
                lineTo(13.0f, 12.75f)
                lineTo(14.25f, 14.0f)
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _meterElectric!!
    }

private var _meterElectric: ImageVector? = null
