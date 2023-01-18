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

public val RegularGroup.VideoProhibited: ImageVector
    get() {
        if (_videoProhibited != null) {
            return _videoProhibited!!
        }
        _videoProhibited = Builder(name = "VideoProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 5.0f)
                curveTo(15.5449f, 5.0f, 17.0f, 6.4551f, 17.0f, 8.25f)
                verticalLineTo(8.423f)
                lineTo(20.8639f, 6.105f)
                curveTo(21.3638f, 5.8049f, 22.0f, 6.1649f, 22.0f, 6.748f)
                verticalLineTo(12.8096f)
                curveTo(21.5557f, 12.3832f, 21.051f, 12.0194f, 20.5f, 11.7322f)
                verticalLineTo(8.0731f)
                lineTo(17.0f, 10.1745f)
                verticalLineTo(11.0189f)
                curveTo(16.4805f, 11.0585f, 15.9782f, 11.159f, 15.5f, 11.3135f)
                verticalLineTo(8.25f)
                curveTo(15.5f, 7.2835f, 14.7165f, 6.5f, 13.75f, 6.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 6.5f, 3.5f, 7.2835f, 3.5f, 8.25f)
                verticalLineTo(16.75f)
                curveTo(3.5f, 17.7165f, 4.2835f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(11.0764f)
                curveTo(11.1572f, 19.0232f, 11.3004f, 19.5258f, 11.4982f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(8.25f)
                curveTo(2.0f, 6.4551f, 3.4551f, 5.0f, 5.25f, 5.0f)
                horizontalLineTo(13.75f)
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
