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

public val RegularGroup.VideoClipMultiple: ImageVector
    get() {
        if (_videoClipMultiple != null) {
            return _videoClipMultiple!!
        }
        _videoClipMultiple = Builder(name = "VideoClipMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 7.7518f)
                verticalLineTo(13.249f)
                curveTo(8.0f, 13.8419f, 8.6554f, 14.2003f, 9.1546f, 13.8805f)
                lineTo(13.7729f, 10.9213f)
                curveTo(14.08f, 10.7246f, 14.0799f, 10.276f, 13.7729f, 10.0793f)
                lineTo(9.1546f, 7.1203f)
                curveTo(8.6554f, 6.8005f, 8.0f, 7.1589f, 8.0f, 7.7518f)
                close()
                moveTo(5.25f, 3.0f)
                curveTo(3.4551f, 3.0f, 2.0f, 4.4551f, 2.0f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(2.0f, 17.0449f, 3.4551f, 18.5f, 5.25f, 18.5f)
                horizontalLineTo(15.75f)
                curveTo(17.5449f, 18.5f, 19.0f, 17.0449f, 19.0f, 15.25f)
                verticalLineTo(6.25f)
                curveTo(19.0f, 4.4551f, 17.5449f, 3.0f, 15.75f, 3.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 6.25f)
                curveTo(3.5f, 5.2835f, 4.2835f, 4.5f, 5.25f, 4.5f)
                horizontalLineTo(15.75f)
                curveTo(16.7165f, 4.5f, 17.5f, 5.2835f, 17.5f, 6.25f)
                verticalLineTo(15.25f)
                curveTo(17.5f, 16.2165f, 16.7165f, 17.0f, 15.75f, 17.0f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 17.0f, 3.5f, 16.2165f, 3.5f, 15.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(5.0107f, 19.5f)
                curveTo(5.5883f, 20.4021f, 6.5992f, 21.0f, 7.7498f, 21.0f)
                horizontalLineTo(16.2498f)
                curveTo(19.1493f, 21.0f, 21.4998f, 18.6495f, 21.4998f, 15.75f)
                verticalLineTo(8.75f)
                curveTo(21.4998f, 7.5994f, 20.9019f, 6.5884f, 19.9998f, 6.0109f)
                verticalLineTo(15.75f)
                curveTo(19.9998f, 17.8211f, 18.3209f, 19.5f, 16.2498f, 19.5f)
                horizontalLineTo(5.0107f)
                close()
            }
        }
        .build()
        return _videoClipMultiple!!
    }

private var _videoClipMultiple: ImageVector? = null
