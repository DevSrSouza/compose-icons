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

public val FilledGroup.DocumentProhibited: ImageVector
    get() {
        if (_documentProhibited != null) {
            return _documentProhibited!!
        }
        _documentProhibited = Builder(name = "DocumentProhibited", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 9.1046f, 12.8954f, 10.0f, 14.0f, 10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.1046f, 19.1046f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(11.1904f)
                curveTo(12.3112f, 20.8321f, 13.0f, 19.2465f, 13.0f, 17.5f)
                curveTo(13.0f, 13.9101f, 10.0899f, 11.0f, 6.5f, 11.0f)
                curveTo(5.6141f, 11.0f, 4.7696f, 11.1772f, 4.0f, 11.4982f)
                verticalLineTo(4.0f)
                curveTo(4.0f, 2.8954f, 4.8954f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(13.5f, 2.5f)
                verticalLineTo(8.0f)
                curveTo(13.5f, 8.2761f, 13.7239f, 8.5f, 14.0f, 8.5f)
                horizontalLineTo(19.5f)
                lineTo(13.5f, 2.5f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 20.5376f, 9.5376f, 23.0f, 6.5f, 23.0f)
                curveTo(3.4624f, 23.0f, 1.0f, 20.5376f, 1.0f, 17.5f)
                curveTo(1.0f, 14.4624f, 3.4624f, 12.0f, 6.5f, 12.0f)
                curveTo(9.5376f, 12.0f, 12.0f, 14.4624f, 12.0f, 17.5f)
                close()
                moveTo(2.5f, 17.5f)
                curveTo(2.5f, 18.3335f, 2.755f, 19.1075f, 3.1911f, 19.7482f)
                lineTo(8.7482f, 14.1911f)
                curveTo(8.1075f, 13.755f, 7.3335f, 13.5f, 6.5f, 13.5f)
                curveTo(4.2909f, 13.5f, 2.5f, 15.2909f, 2.5f, 17.5f)
                close()
                moveTo(6.5f, 21.5f)
                curveTo(8.7091f, 21.5f, 10.5f, 19.7091f, 10.5f, 17.5f)
                curveTo(10.5f, 16.6665f, 10.245f, 15.8925f, 9.8089f, 15.2518f)
                lineTo(4.2518f, 20.8089f)
                curveTo(4.8925f, 21.245f, 5.6665f, 21.5f, 6.5f, 21.5f)
                close()
            }
        }
        .build()
        return _documentProhibited!!
    }

private var _documentProhibited: ImageVector? = null
