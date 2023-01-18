package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.2f, 123.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, 8.4f)
                lineToRelative(-82.0f, 82.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, true, -76.4f, -76.4f)
                lineTo(149.1f, 37.2f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 53.8f, 53.7f)
                lineTo(103.6f, 191.5f)
                arcTo(21.9f, 21.9f, 0.0f, false, true, 88.0f, 198.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -15.6f, -37.6f)
                lineToRelative(83.3f, -84.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.6f, 8.4f)
                lineTo(81.0f, 168.9f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, -3.0f, 7.1f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 17.1f, 7.1f)
                lineTo(194.4f, 82.4f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -36.8f, -36.8f)
                lineTo(58.3f, 146.3f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, 59.4f, 59.4f)
                lineToRelative(82.1f, -81.9f)
                arcTo(5.8f, 5.8f, 0.0f, false, true, 208.2f, 123.8f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
