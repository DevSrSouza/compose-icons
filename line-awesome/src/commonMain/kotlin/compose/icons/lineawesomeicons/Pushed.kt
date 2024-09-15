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

public val LineAwesomeIcons.Pushed: ImageVector
    get() {
        if (_pushed != null) {
            return _pushed!!
        }
        _pushed = Builder(name = "Pushed", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.531f, 4.004f)
                curveTo(20.409f, 3.994f, 20.288f, 4.001f, 20.168f, 4.023f)
                lineTo(5.631f, 6.402f)
                curveTo(4.822f, 6.547f, 4.238f, 7.383f, 4.484f, 8.363f)
                lineTo(10.115f, 27.025f)
                curveTo(10.463f, 28.166f, 12.082f, 28.322f, 12.672f, 27.4f)
                lineTo(14.563f, 23.072f)
                lineTo(27.391f, 10.678f)
                curveTo(28.27f, 9.778f, 27.62f, 8.379f, 26.457f, 8.277f)
                lineTo(20.955f, 7.797f)
                lineTo(21.705f, 6.006f)
                curveTo(22.192f, 4.904f, 21.384f, 4.073f, 20.531f, 4.004f)
                close()
                moveTo(20.371f, 5.154f)
                curveTo(20.644f, 5.116f, 20.773f, 5.288f, 20.65f, 5.551f)
                lineTo(19.75f, 7.689f)
                lineTo(10.244f, 6.816f)
                lineTo(20.371f, 5.154f)
                close()
                moveTo(5.969f, 7.576f)
                lineTo(19.295f, 8.793f)
                lineTo(14.102f, 21.152f)
                lineTo(5.641f, 8.063f)
                curveTo(5.475f, 7.79f, 5.696f, 7.528f, 5.969f, 7.576f)
                close()
                moveTo(20.488f, 8.904f)
                lineTo(26.414f, 9.426f)
                curveTo(26.629f, 9.484f, 26.722f, 9.708f, 26.555f, 9.885f)
                lineTo(15.682f, 20.355f)
                lineTo(20.488f, 8.904f)
                close()
                moveTo(6.756f, 11.91f)
                lineTo(13.598f, 22.498f)
                curveTo(13.223f, 23.301f, 11.713f, 26.736f, 11.713f, 26.736f)
                curveTo(11.574f, 26.95f, 11.288f, 26.904f, 11.207f, 26.674f)
                lineTo(6.756f, 11.91f)
                close()
            }
        }
        .build()
        return _pushed!!
    }

private var _pushed: ImageVector? = null
