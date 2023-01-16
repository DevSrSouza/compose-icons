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

public val MaterialDesignIcons.HeartMultipleOutline: ImageVector
    get() {
        if (_heartMultipleOutline != null) {
            return _heartMultipleOutline!!
        }
        _heartMultipleOutline = Builder(name = "HeartMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.1f)
                lineTo(10.5f, 22.4f)
                curveTo(3.9f, 16.5f, 0.5f, 13.4f, 0.5f, 9.6f)
                curveTo(0.5f, 8.4f, 0.9f, 7.3f, 1.5f, 6.4f)
                curveTo(1.5f, 6.6f, 1.5f, 6.8f, 1.5f, 7.0f)
                curveTo(1.5f, 11.7f, 5.4f, 15.2f, 12.0f, 21.1f)
                moveTo(13.6f, 17.0f)
                curveTo(18.3f, 12.7f, 21.5f, 9.9f, 21.6f, 7.0f)
                curveTo(21.6f, 5.0f, 20.1f, 3.5f, 18.1f, 3.5f)
                curveTo(16.5f, 3.5f, 15.0f, 4.5f, 14.5f, 5.9f)
                horizontalLineTo(12.6f)
                curveTo(12.0f, 4.5f, 10.5f, 3.5f, 9.0f, 3.5f)
                curveTo(7.0f, 3.5f, 5.5f, 5.0f, 5.5f, 7.0f)
                curveTo(5.5f, 9.9f, 8.6f, 12.7f, 13.4f, 17.0f)
                lineTo(13.5f, 17.1f)
                moveTo(18.0f, 1.5f)
                curveTo(21.1f, 1.5f, 23.5f, 3.9f, 23.5f, 7.0f)
                curveTo(23.5f, 10.7f, 20.1f, 13.8f, 13.5f, 19.8f)
                curveTo(6.9f, 13.9f, 3.5f, 10.8f, 3.5f, 7.0f)
                curveTo(3.5f, 3.9f, 5.9f, 1.5f, 9.0f, 1.5f)
                curveTo(10.7f, 1.5f, 12.4f, 2.3f, 13.5f, 3.6f)
                curveTo(14.6f, 2.3f, 16.3f, 1.5f, 18.0f, 1.5f)
                close()
            }
        }
        .build()
        return _heartMultipleOutline!!
    }

private var _heartMultipleOutline: ImageVector? = null
