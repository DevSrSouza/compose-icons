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

public val MaterialDesignIcons.Printer3dOff: ImageVector
    get() {
        if (_printer3dOff != null) {
            return _printer3dOff!!
        }
        _printer3dOff = Builder(name = "Printer3dOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.3f, 2.0f)
                lineTo(1.0f, 3.3f)
                lineTo(2.1f, 4.4f)
                curveTo(2.0f, 4.6f, 2.0f, 4.8f, 2.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.3f)
                lineTo(8.7f, 11.0f)
                lineTo(6.5f, 12.1f)
                curveTo(6.2f, 12.3f, 6.0f, 12.6f, 6.0f, 13.0f)
                verticalLineTo(18.2f)
                curveTo(6.0f, 18.6f, 6.2f, 18.9f, 6.5f, 19.1f)
                lineTo(11.4f, 21.8f)
                curveTo(11.6f, 21.9f, 11.8f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(12.4f, 21.9f, 12.6f, 21.8f)
                lineTo(17.1f, 19.3f)
                lineTo(20.8f, 23.0f)
                lineTo(22.1f, 21.7f)
                lineTo(2.3f, 2.0f)
                moveTo(4.9f, 2.0f)
                horizontalLineTo(4.8f)
                lineTo(9.8f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.3f, 20.7f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(4.9f)
                curveTo(5.0f, 2.0f, 5.0f, 2.0f, 4.9f, 2.0f)
                moveTo(19.0f, 4.0f)
                curveTo(19.6f, 4.0f, 20.0f, 4.4f, 20.0f, 5.0f)
                reflectiveCurveTo(19.6f, 6.0f, 19.0f, 6.0f)
                reflectiveCurveTo(18.0f, 5.6f, 18.0f, 5.0f)
                reflectiveCurveTo(18.4f, 4.0f, 19.0f, 4.0f)
                moveTo(12.4f, 9.6f)
                lineTo(18.0f, 15.2f)
                verticalLineTo(13.0f)
                curveTo(18.0f, 12.6f, 17.8f, 12.3f, 17.5f, 12.1f)
                lineTo(12.6f, 9.7f)
                curveTo(12.5f, 9.7f, 12.5f, 9.6f, 12.4f, 9.6f)
                moveTo(10.2f, 12.5f)
                lineTo(12.2f, 14.5f)
                lineTo(12.0f, 14.6f)
                lineTo(9.0f, 13.0f)
                lineTo(10.2f, 12.5f)
                moveTo(8.0f, 14.7f)
                lineTo(11.0f, 16.3f)
                verticalLineTo(19.3f)
                lineTo(8.0f, 17.7f)
                verticalLineTo(14.7f)
                moveTo(13.7f, 16.0f)
                lineTo(15.6f, 17.9f)
                lineTo(13.0f, 19.3f)
                verticalLineTo(16.3f)
                lineTo(13.7f, 16.0f)
                close()
            }
        }
        .build()
        return _printer3dOff!!
    }

private var _printer3dOff: ImageVector? = null
