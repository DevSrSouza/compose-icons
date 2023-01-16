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

public val MaterialDesignIcons.Torch: ImageVector
    get() {
        if (_torch != null) {
            return _torch!!
        }
        _torch = Builder(name = "Torch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.6f, 9.6f)
                curveTo(9.0f, 10.2f, 9.5f, 10.7f, 10.2f, 11.0f)
                horizontalLineTo(14.2f)
                curveTo(14.5f, 10.9f, 14.7f, 10.7f, 14.9f, 10.5f)
                curveTo(15.9f, 9.5f, 16.3f, 8.0f, 15.8f, 6.7f)
                lineTo(15.7f, 6.5f)
                curveTo(15.6f, 6.2f, 15.4f, 6.0f, 15.2f, 5.8f)
                curveTo(15.1f, 5.6f, 14.9f, 5.5f, 14.8f, 5.3f)
                curveTo(14.4f, 5.0f, 14.0f, 4.7f, 13.6f, 4.3f)
                curveTo(12.7f, 3.4f, 12.6f, 2.0f, 13.1f, 1.0f)
                curveTo(12.6f, 1.1f, 12.1f, 1.4f, 11.7f, 1.8f)
                curveTo(10.2f, 3.0f, 9.6f, 5.1f, 10.3f, 7.0f)
                verticalLineTo(7.2f)
                curveTo(10.3f, 7.3f, 10.2f, 7.4f, 10.1f, 7.5f)
                curveTo(10.0f, 7.6f, 9.8f, 7.5f, 9.7f, 7.4f)
                lineTo(9.6f, 7.3f)
                curveTo(9.0f, 6.5f, 8.9f, 5.3f, 9.3f, 4.3f)
                curveTo(8.4f, 5.1f, 7.9f, 6.4f, 8.0f, 7.7f)
                curveTo(8.0f, 8.0f, 8.1f, 8.3f, 8.2f, 8.6f)
                curveTo(8.2f, 8.9f, 8.4f, 9.3f, 8.6f, 9.6f)
                moveTo(12.3f, 8.1f)
                curveTo(12.4f, 7.6f, 12.2f, 7.2f, 12.1f, 6.8f)
                curveTo(12.0f, 6.4f, 12.0f, 6.0f, 12.2f, 5.6f)
                lineTo(12.5f, 6.2f)
                curveTo(12.9f, 6.8f, 13.6f, 7.0f, 13.8f, 7.8f)
                verticalLineTo(8.1f)
                curveTo(13.8f, 8.6f, 13.6f, 9.1f, 13.3f, 9.4f)
                curveTo(13.1f, 9.5f, 12.9f, 9.7f, 12.7f, 9.7f)
                curveTo(12.1f, 9.9f, 11.4f, 9.6f, 11.0f, 9.2f)
                curveTo(11.8f, 9.2f, 12.2f, 8.6f, 12.3f, 8.1f)
                moveTo(15.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                lineTo(13.0f, 22.0f)
                horizontalLineTo(11.0f)
                lineTo(10.0f, 14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _torch!!
    }

private var _torch: ImageVector? = null
