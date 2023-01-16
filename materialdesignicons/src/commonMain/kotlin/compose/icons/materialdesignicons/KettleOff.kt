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

public val MaterialDesignIcons.KettleOff: ImageVector
    get() {
        if (_kettleOff != null) {
            return _kettleOff!!
        }
        _kettleOff = Builder(name = "KettleOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(4.7f, 6.6f)
                curveTo(4.3f, 7.3f, 4.0f, 8.1f, 4.0f, 9.0f)
                curveTo(4.0f, 10.2f, 4.5f, 11.3f, 5.4f, 12.3f)
                curveTo(4.5f, 13.5f, 4.0f, 15.0f, 4.0f, 16.5f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.1f, 4.9f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(19.3f, 22.0f, 19.6f, 21.9f, 19.9f, 21.8f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(8.2f, 10.1f)
                lineTo(7.6f, 10.4f)
                curveTo(7.2f, 10.0f, 7.0f, 9.5f, 7.0f, 9.0f)
                verticalLineTo(8.9f)
                lineTo(8.2f, 10.1f)
                moveTo(8.0f, 17.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.5f)
                curveTo(6.0f, 14.9f, 7.5f, 12.7f, 9.7f, 11.6f)
                lineTo(10.5f, 12.4f)
                curveTo(9.0f, 13.6f, 8.0f, 15.4f, 8.0f, 17.5f)
                moveTo(16.9f, 10.1f)
                lineTo(19.0f, 8.0f)
                lineTo(22.0f, 11.0f)
                lineTo(20.0f, 13.0f)
                curveTo(20.7f, 14.1f, 21.0f, 15.3f, 21.0f, 16.5f)
                verticalLineTo(17.8f)
                lineTo(12.2f, 9.0f)
                horizontalLineTo(12.5f)
                curveTo(14.0f, 9.0f, 15.6f, 9.4f, 16.9f, 10.1f)
                moveTo(9.5f, 6.3f)
                lineTo(7.4f, 4.2f)
                curveTo(8.8f, 3.5f, 10.6f, 3.0f, 12.5f, 3.0f)
                curveTo(14.7f, 3.0f, 16.8f, 3.6f, 18.3f, 4.7f)
                lineTo(16.3f, 6.7f)
                curveTo(15.3f, 6.1f, 13.9f, 5.8f, 12.5f, 5.8f)
                curveTo(11.4f, 5.8f, 10.4f, 5.9f, 9.5f, 6.3f)
                close()
            }
        }
        .build()
        return _kettleOff!!
    }

private var _kettleOff: ImageVector? = null
