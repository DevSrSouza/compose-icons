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

public val MaterialDesignIcons.SausageOff: ImageVector
    get() {
        if (_sausageOff != null) {
            return _sausageOff!!
        }
        _sausageOff = Builder(name = "SausageOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.8f, 22.7f)
                lineTo(16.3f, 18.2f)
                curveTo(14.2f, 19.9f, 11.4f, 21.0f, 8.5f, 21.0f)
                curveTo(7.1f, 21.0f, 5.9f, 20.2f, 5.3f, 19.0f)
                lineTo(3.0f, 20.5f)
                verticalLineTo(14.5f)
                lineTo(5.3f, 16.0f)
                curveTo(5.8f, 14.8f, 7.1f, 14.0f, 8.5f, 14.0f)
                curveTo(9.5f, 14.0f, 10.5f, 13.7f, 11.3f, 13.2f)
                lineTo(1.1f, 3.0f)
                lineTo(2.4f, 1.7f)
                lineTo(22.1f, 21.4f)
                lineTo(20.8f, 22.7f)
                moveTo(21.0f, 8.5f)
                curveTo(21.0f, 7.1f, 20.2f, 5.9f, 19.0f, 5.3f)
                lineTo(20.5f, 3.0f)
                horizontalLineTo(14.5f)
                lineTo(16.0f, 5.3f)
                curveTo(14.8f, 5.8f, 14.0f, 7.1f, 14.0f, 8.5f)
                curveTo(14.0f, 9.2f, 13.9f, 9.8f, 13.6f, 10.4f)
                lineTo(18.7f, 15.6f)
                curveTo(20.2f, 13.6f, 21.0f, 11.1f, 21.0f, 8.5f)
                close()
            }
        }
        .build()
        return _sausageOff!!
    }

private var _sausageOff: ImageVector? = null
