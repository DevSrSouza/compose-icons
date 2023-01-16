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

public val MaterialDesignIcons.Printer3dNozzleOffOutline: ImageVector
    get() {
        if (_printer3dNozzleOffOutline != null) {
            return _printer3dNozzleOffOutline!!
        }
        _printer3dNozzleOffOutline = Builder(name = "Printer3dNozzleOffOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(5.1f, 7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.5f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                lineTo(14.0f, 15.9f)
                lineTo(20.9f, 22.8f)
                lineTo(22.1f, 21.5f)
                moveTo(12.0f, 15.0f)
                lineTo(8.5f, 11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.1f)
                lineTo(12.5f, 14.4f)
                lineTo(12.0f, 15.0f)
                moveTo(11.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                curveTo(13.0f, 20.7f, 11.7f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                curveTo(10.6f, 20.0f, 11.0f, 19.6f, 11.0f, 19.0f)
                verticalLineTo(18.0f)
                moveTo(9.0f, 5.8f)
                lineTo(7.0f, 3.8f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.2f)
                lineTo(14.9f, 11.7f)
                lineTo(15.5f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.8f)
                close()
            }
        }
        .build()
        return _printer3dNozzleOffOutline!!
    }

private var _printer3dNozzleOffOutline: ImageVector? = null
