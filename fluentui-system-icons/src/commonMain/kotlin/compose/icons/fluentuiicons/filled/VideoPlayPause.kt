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

public val FilledGroup.VideoPlayPause: ImageVector
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
                curveTo(11.7012f, 10.8815f, 11.9759f, 11.4174f, 12.0f, 11.9627f)
                verticalLineTo(7.75f)
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
            }
        }
        .build()
        return _videoPlayPause!!
    }

private var _videoPlayPause: ImageVector? = null
