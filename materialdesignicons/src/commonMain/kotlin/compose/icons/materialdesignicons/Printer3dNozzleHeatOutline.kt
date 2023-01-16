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

public val MaterialDesignIcons.Printer3dNozzleHeatOutline: ImageVector
    get() {
        if (_printer3dNozzleHeatOutline != null) {
            return _printer3dNozzleHeatOutline!!
        }
        _printer3dNozzleHeatOutline = Builder(name = "Printer3dNozzleHeatOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 14.5f)
                lineTo(21.6f, 16.7f)
                lineTo(23.0f, 18.9f)
                lineTo(21.0f, 22.0f)
                lineTo(19.2f, 21.1f)
                lineTo(20.7f, 18.9f)
                lineTo(19.2f, 16.7f)
                lineTo(21.2f, 13.6f)
                lineTo(23.0f, 14.5f)
                moveTo(18.7f, 14.5f)
                lineTo(17.2f, 16.7f)
                lineTo(18.7f, 18.9f)
                lineTo(16.7f, 22.0f)
                lineTo(14.9f, 21.1f)
                lineTo(16.3f, 18.9f)
                lineTo(14.9f, 16.7f)
                lineTo(16.9f, 13.6f)
                lineTo(18.7f, 14.5f)
                moveTo(4.0f, 2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.5f)
                lineTo(10.0f, 17.0f)
                horizontalLineTo(8.0f)
                lineTo(4.5f, 13.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                moveTo(4.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.5f)
                lineTo(9.0f, 15.0f)
                lineTo(12.5f, 11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _printer3dNozzleHeatOutline!!
    }

private var _printer3dNozzleHeatOutline: ImageVector? = null
