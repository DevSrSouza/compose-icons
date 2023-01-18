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

public val RegularGroup.VideoPlayPause: ImageVector
    get() {
        if (_videoPlayPause != null) {
            return _videoPlayPause!!
        }
        _videoPlayPause = Builder(name = "VideoPlayPause", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.75f)
                curveTo(12.0f, 6.7835f, 12.7835f, 6.0f, 13.75f, 6.0f)
                horizontalLineTo(15.25f)
                curveTo(16.2165f, 6.0f, 17.0f, 6.7835f, 17.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(17.0f, 17.2165f, 16.2165f, 18.0f, 15.25f, 18.0f)
                horizontalLineTo(13.75f)
                curveTo(12.7835f, 18.0f, 12.0f, 17.2165f, 12.0f, 16.25f)
                verticalLineTo(12.1198f)
                curveTo(11.9757f, 12.6708f, 11.6956f, 13.2117f, 11.1607f, 13.5368f)
                lineTo(4.6589f, 17.4886f)
                curveTo(3.4927f, 18.1974f, 2.0f, 17.3578f, 2.0f, 15.9931f)
                verticalLineTo(8.0044f)
                curveTo(2.0f, 6.6322f, 3.5074f, 5.7938f, 4.6731f, 6.5177f)
                lineTo(11.1749f, 10.5547f)
                curveTo(11.7012f, 10.8815f, 11.9759f, 11.4174f, 12.0f, 11.9626f)
                verticalLineTo(7.75f)
                close()
                moveTo(13.75f, 7.5f)
                curveTo(13.6119f, 7.5f, 13.5f, 7.6119f, 13.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(13.5f, 16.3881f, 13.6119f, 16.5f, 13.75f, 16.5f)
                horizontalLineTo(15.25f)
                curveTo(15.3881f, 16.5f, 15.5f, 16.3881f, 15.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(15.5f, 7.6119f, 15.3881f, 7.5f, 15.25f, 7.5f)
                horizontalLineTo(13.75f)
                close()
                moveTo(18.0f, 7.75f)
                curveTo(18.0f, 6.7835f, 18.7835f, 6.0f, 19.75f, 6.0f)
                horizontalLineTo(21.25f)
                curveTo(22.2165f, 6.0f, 23.0f, 6.7835f, 23.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(23.0f, 17.2165f, 22.2165f, 18.0f, 21.25f, 18.0f)
                horizontalLineTo(19.75f)
                curveTo(18.7835f, 18.0f, 18.0f, 17.2165f, 18.0f, 16.25f)
                verticalLineTo(7.75f)
                close()
                moveTo(19.75f, 7.5f)
                curveTo(19.6119f, 7.5f, 19.5f, 7.6119f, 19.5f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(19.5f, 16.3881f, 19.6119f, 16.5f, 19.75f, 16.5f)
                horizontalLineTo(21.25f)
                curveTo(21.3881f, 16.5f, 21.5f, 16.3881f, 21.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(21.5f, 7.6119f, 21.3881f, 7.5f, 21.25f, 7.5f)
                horizontalLineTo(19.75f)
                close()
                moveTo(3.5f, 8.0044f)
                verticalLineTo(15.9931f)
                curveTo(3.5f, 16.1881f, 3.7132f, 16.308f, 3.8798f, 16.2067f)
                lineTo(10.3816f, 12.255f)
                curveTo(10.5409f, 12.1582f, 10.542f, 11.9274f, 10.3836f, 11.829f)
                lineTo(3.8819f, 7.792f)
                curveTo(3.7153f, 7.6886f, 3.5f, 7.8083f, 3.5f, 8.0044f)
                close()
            }
        }
        .build()
        return _videoPlayPause!!
    }

private var _videoPlayPause: ImageVector? = null
