package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.YoutubeSquare: ImageVector
    get() {
        if (_youtubeSquare != null) {
            return _youtubeSquare!!
        }
        _youtubeSquare = Builder(name = "YoutubeSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(16.0f, 11.0801f)
                curveTo(16.0f, 11.0801f, 11.6093f, 11.0791f, 10.5293f, 11.3691f)
                curveTo(9.9293f, 11.5391f, 9.4491f, 12.0091f, 9.2891f, 12.6191f)
                curveTo(8.9991f, 13.7091f, 9.0f, 16.0098f, 9.0f, 16.0098f)
                curveTo(9.0f, 16.0098f, 8.9991f, 18.3102f, 9.2891f, 19.4102f)
                curveTo(9.4491f, 20.0102f, 9.9293f, 20.4709f, 10.5293f, 20.6309f)
                curveTo(11.6093f, 20.9209f, 16.0f, 20.9199f, 16.0f, 20.9199f)
                curveTo(16.0f, 20.9199f, 20.3907f, 20.9209f, 21.4707f, 20.6309f)
                curveTo(22.0707f, 20.4609f, 22.5509f, 20.0104f, 22.7109f, 19.4004f)
                curveTo(23.0009f, 18.3104f, 23.0f, 16.0098f, 23.0f, 16.0098f)
                curveTo(23.0f, 16.0098f, 23.0009f, 13.7191f, 22.7109f, 12.6191f)
                curveTo(22.5509f, 12.0091f, 22.0707f, 11.5391f, 21.4707f, 11.3691f)
                curveTo(20.3907f, 11.0791f, 16.0f, 11.0801f, 16.0f, 11.0801f)
                close()
                moveTo(14.0f, 13.1563f)
                lineTo(19.0f, 16.0117f)
                lineTo(14.0f, 18.8535f)
                lineTo(14.0f, 13.1563f)
                close()
            }
        }
        .build()
        return _youtubeSquare!!
    }

private var _youtubeSquare: ImageVector? = null
