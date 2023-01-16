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

public val MaterialDesignIcons.Printer3dNozzleAlertOutline: ImageVector
    get() {
        if (_printer3dNozzleAlertOutline != null) {
            return _printer3dNozzleAlertOutline!!
        }
        _printer3dNozzleAlertOutline = Builder(name = "Printer3dNozzleAlertOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.5f)
                lineTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                lineTo(7.5f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                moveTo(10.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                curveTo(10.6f, 20.0f, 11.0f, 19.5f, 11.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                curveTo(13.0f, 20.7f, 11.7f, 22.0f, 10.0f, 22.0f)
                moveTo(7.0f, 9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.5f)
                lineTo(12.0f, 15.0f)
                lineTo(15.5f, 11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                moveTo(21.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _printer3dNozzleAlertOutline!!
    }

private var _printer3dNozzleAlertOutline: ImageVector? = null
