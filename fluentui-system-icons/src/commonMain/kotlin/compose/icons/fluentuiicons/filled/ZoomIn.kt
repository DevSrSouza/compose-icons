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

public val FilledGroup.ZoomIn: ImageVector
    get() {
        if (_zoomIn != null) {
            return _zoomIn!!
        }
        _zoomIn = Builder(name = "ZoomIn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 10.0f)
                curveTo(17.5f, 11.7101f, 16.9276f, 13.2866f, 15.964f, 14.5483f)
                lineTo(20.7071f, 19.2929f)
                curveTo(21.0976f, 19.6834f, 21.0976f, 20.3166f, 20.7071f, 20.7071f)
                curveTo(20.3466f, 21.0676f, 19.7794f, 21.0953f, 19.3871f, 20.7903f)
                lineTo(19.2929f, 20.7071f)
                lineTo(14.5483f, 15.964f)
                curveTo(13.2866f, 16.9276f, 11.7101f, 17.5f, 10.0f, 17.5f)
                curveTo(5.8579f, 17.5f, 2.5f, 14.1421f, 2.5f, 10.0f)
                curveTo(2.5f, 5.8579f, 5.8579f, 2.5f, 10.0f, 2.5f)
                curveTo(14.1421f, 2.5f, 17.5f, 5.8579f, 17.5f, 10.0f)
                close()
                moveTo(10.0f, 5.5f)
                curveTo(9.4477f, 5.5f, 9.0f, 5.9477f, 9.0f, 6.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.5f)
                curveTo(5.9477f, 9.0f, 5.5f, 9.4477f, 5.5f, 10.0f)
                curveTo(5.5f, 10.5523f, 5.9477f, 11.0f, 6.5f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.5f)
                curveTo(9.0f, 14.0523f, 9.4477f, 14.5f, 10.0f, 14.5f)
                curveTo(10.5523f, 14.5f, 11.0f, 14.0523f, 11.0f, 13.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.5f)
                curveTo(14.0523f, 11.0f, 14.5f, 10.5523f, 14.5f, 10.0f)
                curveTo(14.5f, 9.4477f, 14.0523f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 5.9477f, 10.5523f, 5.5f, 10.0f, 5.5f)
                close()
            }
        }
        .build()
        return _zoomIn!!
    }

private var _zoomIn: ImageVector? = null
