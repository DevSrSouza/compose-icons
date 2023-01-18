package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.RealEstate: ImageVector
    get() {
        if (_realEstate != null) {
            return _realEstate!!
        }
        _realEstate = Builder(name = "RealEstate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                curveTo(4.5523f, 3.0f, 5.0f, 3.4477f, 5.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(21.5523f, 4.0f, 22.0f, 4.4477f, 22.0f, 5.0f)
                curveTo(22.0f, 5.5523f, 21.5523f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.5f)
                curveTo(5.0f, 21.7761f, 4.7761f, 22.0f, 4.5f, 22.0f)
                horizontalLineTo(3.5f)
                curveTo(3.2239f, 22.0f, 3.0f, 21.7761f, 3.0f, 21.5f)
                verticalLineTo(4.0f)
                close()
                moveTo(6.0f, 7.75f)
                curveTo(6.0f, 7.3358f, 6.3358f, 7.0f, 6.75f, 7.0f)
                horizontalLineTo(20.25f)
                curveTo(20.6642f, 7.0f, 21.0f, 7.3358f, 21.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(21.0f, 17.7688f, 19.7688f, 19.0f, 18.25f, 19.0f)
                horizontalLineTo(8.75f)
                curveTo(7.2312f, 19.0f, 6.0f, 17.7688f, 6.0f, 16.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(10.0f, 12.46f)
                verticalLineTo(15.5f)
                curveTo(10.0f, 15.7762f, 10.2239f, 16.0f, 10.5f, 16.0f)
                horizontalLineTo(12.25f)
                curveTo(12.3881f, 16.0f, 12.5f, 15.8881f, 12.5f, 15.75f)
                verticalLineTo(14.5f)
                curveTo(12.5f, 14.2239f, 12.7239f, 14.0f, 13.0f, 14.0f)
                horizontalLineTo(14.0f)
                curveTo(14.2761f, 14.0f, 14.5f, 14.2239f, 14.5f, 14.5f)
                verticalLineTo(15.75f)
                curveTo(14.5f, 15.8881f, 14.6119f, 16.0f, 14.75f, 16.0f)
                horizontalLineTo(16.5f)
                curveTo(16.7761f, 16.0f, 17.0f, 15.7762f, 17.0f, 15.5f)
                verticalLineTo(12.46f)
                curveTo(17.0f, 12.168f, 16.8724f, 11.8907f, 16.6508f, 11.7007f)
                lineTo(13.8254f, 9.2789f)
                curveTo(13.6382f, 9.1185f, 13.3618f, 9.1185f, 13.1746f, 9.2789f)
                lineTo(10.3492f, 11.7007f)
                curveTo(10.1276f, 11.8907f, 10.0f, 12.168f, 10.0f, 12.46f)
                close()
            }
        }
        .build()
        return _realEstate!!
    }

private var _realEstate: ImageVector? = null
