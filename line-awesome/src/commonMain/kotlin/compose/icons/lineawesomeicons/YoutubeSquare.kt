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
                moveTo(16.0f, 11.08f)
                curveTo(16.0f, 11.08f, 11.609f, 11.079f, 10.529f, 11.369f)
                curveTo(9.929f, 11.539f, 9.449f, 12.009f, 9.289f, 12.619f)
                curveTo(8.999f, 13.709f, 9.0f, 16.01f, 9.0f, 16.01f)
                curveTo(9.0f, 16.01f, 8.999f, 18.31f, 9.289f, 19.41f)
                curveTo(9.449f, 20.01f, 9.929f, 20.471f, 10.529f, 20.631f)
                curveTo(11.609f, 20.921f, 16.0f, 20.92f, 16.0f, 20.92f)
                curveTo(16.0f, 20.92f, 20.391f, 20.921f, 21.471f, 20.631f)
                curveTo(22.071f, 20.461f, 22.551f, 20.01f, 22.711f, 19.4f)
                curveTo(23.001f, 18.31f, 23.0f, 16.01f, 23.0f, 16.01f)
                curveTo(23.0f, 16.01f, 23.001f, 13.719f, 22.711f, 12.619f)
                curveTo(22.551f, 12.009f, 22.071f, 11.539f, 21.471f, 11.369f)
                curveTo(20.391f, 11.079f, 16.0f, 11.08f, 16.0f, 11.08f)
                close()
                moveTo(14.0f, 13.156f)
                lineTo(19.0f, 16.012f)
                lineTo(14.0f, 18.854f)
                lineTo(14.0f, 13.156f)
                close()
            }
        }
        .build()
        return _youtubeSquare!!
    }

private var _youtubeSquare: ImageVector? = null
