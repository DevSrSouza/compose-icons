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

public val FilledGroup.DocumentDismiss: ImageVector
    get() {
        if (_documentDismiss != null) {
            return _documentDismiss!!
        }
        _documentDismiss = Builder(name = "DocumentDismiss", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(6.5f, 12.0f)
                curveTo(3.4624f, 12.0f, 1.0f, 14.4624f, 1.0f, 17.5f)
                curveTo(1.0f, 20.5376f, 3.4624f, 23.0f, 6.5f, 23.0f)
                curveTo(9.5376f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 9.5376f, 12.0f, 6.5f, 12.0f)
                close()
                moveTo(8.9782f, 15.7313f)
                lineTo(7.2084f, 17.5001f)
                lineTo(8.9781f, 19.2697f)
                curveTo(9.1733f, 19.465f, 9.1733f, 19.7816f, 8.9781f, 19.9768f)
                curveTo(8.7828f, 20.1721f, 8.4662f, 20.1721f, 8.271f, 19.9768f)
                lineTo(6.5011f, 18.207f)
                lineTo(4.7325f, 19.9746f)
                curveTo(4.5372f, 20.1699f, 4.2206f, 20.1699f, 4.0254f, 19.9746f)
                curveTo(3.8301f, 19.7794f, 3.8301f, 19.4628f, 4.0254f, 19.2675f)
                lineTo(5.794f, 17.4999f)
                lineTo(4.0254f, 15.7312f)
                curveTo(3.8301f, 15.536f, 3.8301f, 15.2194f, 4.0254f, 15.0241f)
                curveTo(4.2206f, 14.8289f, 4.5372f, 14.8289f, 4.7325f, 15.0241f)
                lineTo(6.5013f, 16.793f)
                lineTo(8.2711f, 15.0242f)
                curveTo(8.4664f, 14.829f, 8.783f, 14.829f, 8.9782f, 15.0242f)
                curveTo(9.1735f, 15.2195f, 9.1735f, 15.5361f, 8.9782f, 15.7313f)
                close()
            }
        }
        .build()
        return _documentDismiss!!
    }

private var _documentDismiss: ImageVector? = null
