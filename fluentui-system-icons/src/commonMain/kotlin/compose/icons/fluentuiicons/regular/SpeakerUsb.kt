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

public val RegularGroup.SpeakerUsb: ImageVector
    get() {
        if (_speakerUsb != null) {
            return _speakerUsb!!
        }
        _speakerUsb = Builder(name = "SpeakerUsb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.2486f)
                curveTo(15.0f, 3.9529f, 14.8952f, 3.6667f, 14.7041f, 3.441f)
                curveTo(14.2582f, 2.9141f, 13.4694f, 2.8484f, 12.9425f, 3.2944f)
                lineTo(7.9752f, 7.4984f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 7.4984f, 2.0f, 8.5057f, 2.0f, 9.7484f)
                verticalLineTo(14.2484f)
                curveTo(2.0f, 15.491f, 3.0074f, 16.4984f, 4.25f, 16.4984f)
                horizontalLineTo(7.9751f)
                lineTo(12.9423f, 20.7042f)
                curveTo(13.168f, 20.8953f, 13.4542f, 21.0002f, 13.75f, 21.0002f)
                curveTo(14.4404f, 21.0002f, 15.0f, 20.4405f, 15.0f, 19.7502f)
                verticalLineTo(4.2486f)
                close()
                moveTo(8.5248f, 8.9984f)
                lineTo(13.5f, 4.7877f)
                verticalLineTo(19.2109f)
                lineTo(8.5249f, 14.9984f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 14.9984f, 3.5f, 14.6626f, 3.5f, 14.2484f)
                verticalLineTo(9.7484f)
                curveTo(3.5f, 9.3342f, 3.8358f, 8.9984f, 4.25f, 8.9984f)
                horizontalLineTo(8.5248f)
                close()
                moveTo(16.163f, 13.9552f)
                lineTo(17.5f, 16.0f)
                verticalLineTo(18.0f)
                curveTo(17.5f, 18.5523f, 17.9477f, 19.0f, 18.5f, 19.0f)
                horizontalLineTo(20.5f)
                curveTo(21.0523f, 19.0f, 21.5f, 18.5523f, 21.5f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(22.8329f, 13.9941f)
                curveTo(22.9419f, 13.8301f, 23.0f, 13.6376f, 23.0f, 13.4407f)
                verticalLineTo(10.0f)
                curveTo(23.0f, 9.4477f, 22.5523f, 9.0f, 22.0f, 9.0f)
                verticalLineTo(7.0f)
                curveTo(22.0f, 6.4477f, 21.5523f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(18.0f)
                curveTo(17.4477f, 6.0f, 17.0f, 6.4477f, 17.0f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(16.4477f, 9.0f, 16.0f, 9.4477f, 16.0f, 10.0f)
                verticalLineTo(13.408f)
                curveTo(16.0f, 13.6024f, 16.0567f, 13.7925f, 16.163f, 13.9552f)
                close()
                moveTo(18.5f, 7.5f)
                horizontalLineTo(20.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _speakerUsb!!
    }

private var _speakerUsb: ImageVector? = null
