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

public val FilledGroup.VideoAdd: ImageVector
    get() {
        if (_videoAdd != null) {
            return _videoAdd!!
        }
        _videoAdd = Builder(name = "VideoAdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.25f)
                curveTo(16.0f, 18.0449f, 14.5449f, 19.5f, 12.75f, 19.5f)
                horizontalLineTo(12.6865f)
                curveTo(12.89f, 18.8699f, 13.0f, 18.1978f, 13.0f, 17.5f)
                curveTo(13.0f, 13.9101f, 10.0899f, 11.0f, 6.5f, 11.0f)
                curveTo(4.7535f, 11.0f, 3.1679f, 11.6888f, 2.0f, 12.8096f)
                verticalLineTo(7.75f)
                curveTo(2.0f, 5.9551f, 3.4551f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(12.75f)
                curveTo(14.5449f, 4.5f, 16.0f, 5.9551f, 16.0f, 7.75f)
                verticalLineTo(16.25f)
                close()
                moveTo(21.762f, 5.8933f)
                curveTo(21.9156f, 6.0741f, 22.0f, 6.3037f, 22.0f, 6.541f)
                verticalLineTo(17.4588f)
                curveTo(22.0f, 18.0111f, 21.5523f, 18.4588f, 21.0f, 18.4588f)
                curveTo(20.7627f, 18.4588f, 20.5332f, 18.3744f, 20.3524f, 18.2208f)
                lineTo(17.0f, 15.3709f)
                verticalLineTo(8.6279f)
                lineTo(20.3524f, 5.779f)
                curveTo(20.7732f, 5.4213f, 21.4043f, 5.4725f, 21.762f, 5.8933f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 9.5376f, 12.0f, 6.5f, 12.0f)
                curveTo(3.4624f, 12.0f, 1.0f, 14.4624f, 1.0f, 17.5f)
                curveTo(1.0f, 20.5376f, 3.4624f, 23.0f, 6.5f, 23.0f)
                curveTo(9.5376f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                close()
                moveTo(7.0006f, 18.0f)
                lineTo(7.0011f, 20.5035f)
                curveTo(7.0011f, 20.7797f, 6.7772f, 21.0035f, 6.5011f, 21.0035f)
                curveTo(6.225f, 21.0035f, 6.0011f, 20.7797f, 6.0011f, 20.5035f)
                lineTo(6.0006f, 18.0f)
                horizontalLineTo(3.4956f)
                curveTo(3.2197f, 18.0f, 2.9961f, 17.7762f, 2.9961f, 17.5f)
                curveTo(2.9961f, 17.2239f, 3.2197f, 17.0f, 3.4956f, 17.0f)
                horizontalLineTo(6.0005f)
                lineTo(6.0f, 14.4993f)
                curveTo(6.0f, 14.2231f, 6.2239f, 13.9993f, 6.5f, 13.9993f)
                curveTo(6.7761f, 13.9993f, 7.0f, 14.2231f, 7.0f, 14.4993f)
                lineTo(7.0005f, 17.0f)
                horizontalLineTo(9.4966f)
                curveTo(9.7725f, 17.0f, 9.9961f, 17.2239f, 9.9961f, 17.5f)
                curveTo(9.9961f, 17.7762f, 9.7725f, 18.0f, 9.4966f, 18.0f)
                horizontalLineTo(7.0006f)
                close()
            }
        }
        .build()
        return _videoAdd!!
    }

private var _videoAdd: ImageVector? = null
