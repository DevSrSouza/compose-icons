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

public val FilledGroup.VideoProhibited: ImageVector
    get() {
        if (_videoProhibited != null) {
            return _videoProhibited!!
        }
        _videoProhibited = Builder(name = "VideoProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.5f)
                curveTo(11.0f, 14.4264f, 13.1333f, 11.8511f, 16.0f, 11.1739f)
                verticalLineTo(8.25f)
                curveTo(16.0f, 6.4551f, 14.5449f, 5.0f, 12.75f, 5.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 5.0f, 2.0f, 6.4551f, 2.0f, 8.25f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 18.5449f, 3.4551f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(11.4982f)
                curveTo(11.1772f, 19.2304f, 11.0f, 18.3859f, 11.0f, 17.5f)
                close()
                moveTo(17.5f, 11.0f)
                curveTo(19.2465f, 11.0f, 20.8321f, 11.6888f, 22.0f, 12.8096f)
                verticalLineTo(7.041f)
                curveTo(22.0f, 6.8037f, 21.9156f, 6.5741f, 21.762f, 6.3933f)
                curveTo(21.4043f, 5.9725f, 20.7732f, 5.9213f, 20.3524f, 6.279f)
                lineTo(17.0f, 9.1279f)
                verticalLineTo(11.0189f)
                curveTo(17.165f, 11.0064f, 17.3318f, 11.0f, 17.5f, 11.0f)
                close()
                moveTo(23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                close()
                moveTo(13.5f, 17.5f)
                curveTo(13.5f, 18.3335f, 13.755f, 19.1075f, 14.1911f, 19.7482f)
                lineTo(19.7482f, 14.1911f)
                curveTo(19.1075f, 13.755f, 18.3335f, 13.5f, 17.5f, 13.5f)
                curveTo(15.2909f, 13.5f, 13.5f, 15.2909f, 13.5f, 17.5f)
                close()
                moveTo(17.5f, 21.5f)
                curveTo(19.7091f, 21.5f, 21.5f, 19.7091f, 21.5f, 17.5f)
                curveTo(21.5f, 16.6665f, 21.245f, 15.8925f, 20.8089f, 15.2518f)
                lineTo(15.2518f, 20.8089f)
                curveTo(15.8925f, 21.245f, 16.6665f, 21.5f, 17.5f, 21.5f)
                close()
            }
        }
        .build()
        return _videoProhibited!!
    }

private var _videoProhibited: ImageVector? = null
