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

public val FilledGroup.CopyAdd: ImageVector
    get() {
        if (_copyAdd != null) {
            return _copyAdd!!
        }
        _copyAdd = Builder(name = "CopyAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 6.75f)
                lineTo(4.5028f, 4.627f)
                curveTo(3.6274f, 4.9351f, 3.0f, 5.7693f, 3.0f, 6.75f)
                verticalLineTo(17.2542f)
                curveTo(3.0f, 19.8776f, 5.1266f, 22.0042f, 7.75f, 22.0042f)
                horizontalLineTo(12.8136f)
                curveTo(12.3866f, 21.5601f, 12.0222f, 21.0554f, 11.7345f, 20.5043f)
                lineTo(7.75f, 20.5042f)
                curveTo(5.9551f, 20.5042f, 4.5f, 19.0491f, 4.5f, 17.2542f)
                verticalLineTo(6.75f)
                close()
                moveTo(19.0f, 11.1739f)
                curveTo(18.5185f, 11.0602f, 18.0163f, 11.0f, 17.5f, 11.0f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 18.1978f, 11.11f, 18.8699f, 11.3135f, 19.5f)
                horizontalLineTo(7.75f)
                curveTo(6.5074f, 19.5f, 5.5f, 18.4926f, 5.5f, 17.25f)
                verticalLineTo(4.25f)
                curveTo(5.5f, 3.0074f, 6.5074f, 2.0f, 7.75f, 2.0f)
                horizontalLineTo(16.75f)
                curveTo(17.9926f, 2.0f, 19.0f, 3.0074f, 19.0f, 4.25f)
                verticalLineTo(11.1739f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(18.0011f, 20.5035f)
                lineTo(18.0006f, 18.0f)
                horizontalLineTo(20.4966f)
                curveTo(20.7725f, 18.0f, 20.9961f, 17.7762f, 20.9961f, 17.5f)
                curveTo(20.9961f, 17.2239f, 20.7725f, 17.0f, 20.4966f, 17.0f)
                horizontalLineTo(18.0005f)
                lineTo(18.0f, 14.4993f)
                curveTo(18.0f, 14.2231f, 17.7761f, 13.9993f, 17.5f, 13.9993f)
                curveTo(17.2239f, 13.9993f, 17.0f, 14.2231f, 17.0f, 14.4993f)
                lineTo(17.0005f, 17.0f)
                horizontalLineTo(14.4956f)
                curveTo(14.2197f, 17.0f, 13.9961f, 17.2239f, 13.9961f, 17.5f)
                curveTo(13.9961f, 17.7762f, 14.2197f, 18.0f, 14.4956f, 18.0f)
                horizontalLineTo(17.0006f)
                lineTo(17.0011f, 20.5035f)
                curveTo(17.0011f, 20.7797f, 17.225f, 21.0035f, 17.5011f, 21.0035f)
                curveTo(17.7773f, 21.0035f, 18.0011f, 20.7797f, 18.0011f, 20.5035f)
                close()
            }
        }
        .build()
        return _copyAdd!!
    }

private var _copyAdd: ImageVector? = null
