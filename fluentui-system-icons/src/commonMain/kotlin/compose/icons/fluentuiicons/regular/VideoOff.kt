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

public val RegularGroup.VideoOff: ImageVector
    get() {
        if (_videoOff != null) {
            return _videoOff!!
        }
        _videoOff = Builder(name = "VideoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(3.7866f, 4.8473f)
                curveTo(2.7268f, 5.3827f, 2.0f, 6.4815f, 2.0f, 7.75f)
                verticalLineTo(16.25f)
                curveTo(2.0f, 18.0449f, 3.4551f, 19.5f, 5.25f, 19.5f)
                horizontalLineTo(13.75f)
                curveTo(15.0185f, 19.5f, 16.1172f, 18.7733f, 16.6526f, 17.7136f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(15.4765f, 16.5374f)
                curveTo(15.3394f, 17.3672f, 14.6186f, 18.0f, 13.75f, 18.0f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 18.0f, 3.5f, 17.2165f, 3.5f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(3.5f, 6.8813f, 4.1329f, 6.1605f, 4.9627f, 6.0235f)
                lineTo(15.4765f, 16.5374f)
                close()
                moveTo(15.5f, 12.3182f)
                verticalLineTo(7.75f)
                curveTo(15.5f, 6.7835f, 14.7165f, 6.0f, 13.75f, 6.0f)
                horizontalLineTo(9.1819f)
                lineTo(7.6819f, 4.5f)
                horizontalLineTo(13.75f)
                curveTo(15.5449f, 4.5f, 17.0f, 5.9551f, 17.0f, 7.75f)
                verticalLineTo(7.923f)
                lineTo(20.8639f, 5.605f)
                curveTo(21.3638f, 5.3049f, 22.0f, 5.6649f, 22.0f, 6.248f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 18.0514f, 21.83f, 18.2932f, 21.5967f, 18.4151f)
                lineTo(20.5f, 17.3183f)
                verticalLineTo(7.5731f)
                lineTo(17.0f, 9.6745f)
                verticalLineTo(13.8182f)
                lineTo(15.5f, 12.3182f)
                close()
            }
        }
        .build()
        return _videoOff!!
    }

private var _videoOff: ImageVector? = null
