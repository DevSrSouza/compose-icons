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

public val LineAwesomeIcons.Intercom: ImageVector
    get() {
        if (_intercom != null) {
            return _intercom!!
        }
        _intercom = Builder(name = "Intercom", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(16.002f, 9.0f)
                curveTo(15.684f, 9.0f, 15.365f, 9.211f, 15.365f, 9.633f)
                lineTo(15.365f, 18.85f)
                curveTo(15.365f, 19.693f, 16.639f, 19.693f, 16.639f, 18.85f)
                lineTo(16.639f, 9.633f)
                curveTo(16.639f, 9.211f, 16.32f, 9.0f, 16.002f, 9.0f)
                close()
                moveTo(12.822f, 9.318f)
                curveTo(12.504f, 9.318f, 12.186f, 9.53f, 12.186f, 9.951f)
                lineTo(12.186f, 18.443f)
                curveTo(12.186f, 19.286f, 13.457f, 19.286f, 13.457f, 18.443f)
                lineTo(13.457f, 9.951f)
                curveTo(13.457f, 9.53f, 13.141f, 9.318f, 12.822f, 9.318f)
                close()
                moveTo(19.178f, 9.318f)
                curveTo(18.859f, 9.318f, 18.541f, 9.53f, 18.541f, 9.951f)
                lineTo(18.541f, 18.443f)
                curveTo(18.541f, 19.286f, 19.814f, 19.286f, 19.814f, 18.443f)
                lineTo(19.814f, 9.951f)
                curveTo(19.814f, 9.53f, 19.496f, 9.318f, 19.178f, 9.318f)
                close()
                moveTo(9.641f, 10.592f)
                curveTo(9.322f, 10.592f, 9.006f, 10.803f, 9.006f, 11.225f)
                lineTo(9.006f, 16.941f)
                curveTo(9.006f, 17.784f, 10.277f, 17.784f, 10.277f, 16.941f)
                lineTo(10.277f, 11.225f)
                curveTo(10.277f, 10.803f, 9.959f, 10.592f, 9.641f, 10.592f)
                close()
                moveTo(22.357f, 10.592f)
                curveTo(22.039f, 10.592f, 21.721f, 10.803f, 21.721f, 11.225f)
                lineTo(21.721f, 16.941f)
                curveTo(21.721f, 17.784f, 22.994f, 17.784f, 22.994f, 16.941f)
                lineTo(22.994f, 11.225f)
                curveTo(22.994f, 10.803f, 22.676f, 10.592f, 22.357f, 10.592f)
                close()
                moveTo(22.432f, 19.799f)
                curveTo(22.275f, 19.777f, 22.104f, 19.818f, 21.945f, 19.955f)
                curveTo(19.255f, 22.25f, 12.862f, 22.309f, 10.057f, 19.955f)
                curveTo(9.418f, 19.41f, 8.591f, 20.377f, 9.23f, 20.922f)
                curveTo(12.482f, 23.706f, 19.672f, 23.604f, 22.771f, 20.922f)
                curveTo(23.248f, 20.51f, 22.902f, 19.865f, 22.432f, 19.799f)
                close()
            }
        }
        .build()
        return _intercom!!
    }

private var _intercom: ImageVector? = null
