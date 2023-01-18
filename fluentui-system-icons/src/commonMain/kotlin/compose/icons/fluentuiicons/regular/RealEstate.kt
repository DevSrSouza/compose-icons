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

public val RegularGroup.RealEstate: ImageVector
    get() {
        if (_realEstate != null) {
            return _realEstate!!
        }
        _realEstate = Builder(name = "RealEstate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.46f)
                curveTo(10.0f, 12.168f, 10.1276f, 11.8907f, 10.3492f, 11.7007f)
                lineTo(13.1746f, 9.2789f)
                curveTo(13.3618f, 9.1185f, 13.6382f, 9.1185f, 13.8254f, 9.2789f)
                lineTo(16.6508f, 11.7007f)
                curveTo(16.8724f, 11.8907f, 17.0f, 12.168f, 17.0f, 12.46f)
                verticalLineTo(15.5f)
                curveTo(17.0f, 15.7762f, 16.7761f, 16.0f, 16.5f, 16.0f)
                horizontalLineTo(14.75f)
                curveTo(14.6119f, 16.0f, 14.5f, 15.8881f, 14.5f, 15.75f)
                verticalLineTo(14.5f)
                curveTo(14.5f, 14.2239f, 14.2761f, 14.0f, 14.0f, 14.0f)
                horizontalLineTo(13.0f)
                curveTo(12.7239f, 14.0f, 12.5f, 14.2239f, 12.5f, 14.5f)
                verticalLineTo(15.75f)
                curveTo(12.5f, 15.8881f, 12.3881f, 16.0f, 12.25f, 16.0f)
                horizontalLineTo(10.5f)
                curveTo(10.2239f, 16.0f, 10.0f, 15.7762f, 10.0f, 15.5f)
                verticalLineTo(12.46f)
                close()
                moveTo(7.0f, 21.034f)
                verticalLineTo(18.2503f)
                curveTo(7.6267f, 18.721f, 8.4058f, 19.0f, 9.25f, 19.0f)
                horizontalLineTo(17.75f)
                curveTo(19.8211f, 19.0f, 21.5f, 17.3211f, 21.5f, 15.25f)
                verticalLineTo(7.3229f)
                curveTo(21.8112f, 6.9703f, 22.0f, 6.5072f, 22.0f, 6.0f)
                curveTo(22.0f, 4.8954f, 21.1046f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(6.7322f)
                curveTo(6.3865f, 3.4022f, 5.7407f, 3.0f, 5.0f, 3.0f)
                curveTo(3.8954f, 3.0f, 3.0f, 3.8954f, 3.0f, 5.0f)
                verticalLineTo(21.034f)
                curveTo(3.0f, 21.5675f, 3.4325f, 22.0f, 3.966f, 22.0f)
                horizontalLineTo(6.0339f)
                curveTo(6.5675f, 22.0f, 7.0f, 21.5675f, 7.0f, 21.034f)
                close()
                moveTo(5.0f, 4.5f)
                curveTo(5.241f, 4.5f, 5.4437f, 4.6713f, 5.49f, 4.8992f)
                lineTo(5.6119f, 5.5f)
                horizontalLineTo(20.0f)
                curveTo(20.2761f, 5.5f, 20.5f, 5.7239f, 20.5f, 6.0f)
                curveTo(20.5f, 6.2761f, 20.2761f, 6.5f, 20.0f, 6.5f)
                horizontalLineTo(5.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(4.5f)
                verticalLineTo(5.0f)
                curveTo(4.5f, 4.7239f, 4.7239f, 4.5f, 5.0f, 4.5f)
                close()
                moveTo(9.25f, 17.5f)
                curveTo(8.0074f, 17.5f, 7.0f, 16.4926f, 7.0f, 15.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.25f)
                curveTo(20.0f, 16.4926f, 18.9926f, 17.5f, 17.75f, 17.5f)
                horizontalLineTo(9.25f)
                close()
            }
        }
        .build()
        return _realEstate!!
    }

private var _realEstate: ImageVector? = null
