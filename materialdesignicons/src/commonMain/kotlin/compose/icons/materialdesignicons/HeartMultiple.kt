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

public val MaterialDesignIcons.HeartMultiple: ImageVector
    get() {
        if (_heartMultiple != null) {
            return _heartMultiple!!
        }
        _heartMultiple = Builder(name = "HeartMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.5f, 20.0f)
                curveTo(6.9f, 13.9f, 3.5f, 10.8f, 3.5f, 7.1f)
                curveTo(3.5f, 4.0f, 5.9f, 1.6f, 9.0f, 1.6f)
                curveTo(10.7f, 1.6f, 12.4f, 2.4f, 13.5f, 3.7f)
                curveTo(14.6f, 2.4f, 16.3f, 1.6f, 18.0f, 1.6f)
                curveTo(21.1f, 1.6f, 23.5f, 4.0f, 23.5f, 7.1f)
                curveTo(23.5f, 10.9f, 20.1f, 14.0f, 13.5f, 20.0f)
                moveTo(12.0f, 21.1f)
                curveTo(5.4f, 15.2f, 1.5f, 11.7f, 1.5f, 7.0f)
                curveTo(1.5f, 6.8f, 1.5f, 6.6f, 1.5f, 6.4f)
                curveTo(0.9f, 7.3f, 0.5f, 8.4f, 0.5f, 9.6f)
                curveTo(0.5f, 13.4f, 3.9f, 16.5f, 10.5f, 22.4f)
                lineTo(12.0f, 21.1f)
                close()
            }
        }
        .build()
        return _heartMultiple!!
    }

private var _heartMultiple: ImageVector? = null
