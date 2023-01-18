package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Storage: ImageVector
    get() {
        if (_storage != null) {
            return _storage!!
        }
        _storage = Builder(name = "Storage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                horizontalLineTo(19.0f)
                curveTo(20.5977f, 7.0f, 21.9037f, 8.2489f, 21.9949f, 9.8237f)
                lineTo(22.0f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 15.5977f, 20.7511f, 16.9037f, 19.1763f, 16.9949f)
                lineTo(19.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveTo(3.4023f, 17.0f, 2.0963f, 15.7511f, 2.0051f, 14.1763f)
                lineTo(2.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 8.4023f, 3.2489f, 7.0963f, 4.8237f, 7.0051f)
                lineTo(5.0f, 7.0f)
                horizontalLineTo(19.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.0f, 8.5f)
                horizontalLineTo(5.0f)
                curveTo(4.1716f, 8.5f, 3.5f, 9.1716f, 3.5f, 10.0f)
                verticalLineTo(14.0f)
                curveTo(3.5f, 14.8284f, 4.1716f, 15.5f, 5.0f, 15.5f)
                horizontalLineTo(19.0f)
                curveTo(19.8284f, 15.5f, 20.5f, 14.8284f, 20.5f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(20.5f, 9.1716f, 19.8284f, 8.5f, 19.0f, 8.5f)
                close()
                moveTo(18.0f, 10.0f)
                curveTo(18.5523f, 10.0f, 19.0f, 10.4477f, 19.0f, 11.0f)
                curveTo(19.0f, 11.5523f, 18.5523f, 12.0f, 18.0f, 12.0f)
                curveTo(17.4477f, 12.0f, 17.0f, 11.5523f, 17.0f, 11.0f)
                curveTo(17.0f, 10.4477f, 17.4477f, 10.0f, 18.0f, 10.0f)
                close()
                moveTo(14.0f, 10.0f)
                curveTo(14.5523f, 10.0f, 15.0f, 10.4477f, 15.0f, 11.0f)
                curveTo(15.0f, 11.5523f, 14.5523f, 12.0f, 14.0f, 12.0f)
                curveTo(13.4477f, 12.0f, 13.0f, 11.5523f, 13.0f, 11.0f)
                curveTo(13.0f, 10.4477f, 13.4477f, 10.0f, 14.0f, 10.0f)
                close()
            }
        }
        .build()
        return _storage!!
    }

private var _storage: ImageVector? = null
