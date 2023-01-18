package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(206.8f, 125.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineToRelative(-82.0f, 82.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, -73.6f, -73.6f)
                lineTo(150.5f, 38.6f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 51.0f, 50.9f)
                lineTo(102.2f, 190.1f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 88.0f, 196.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -14.1f, -34.1f)
                lineToRelative(83.2f, -84.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.8f, 5.6f)
                lineTo(79.5f, 167.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(195.8f, 83.8f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, -39.6f)
                lineTo(56.9f, 144.9f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 62.2f, 62.2f)
                lineToRelative(82.1f, -81.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 206.8f, 125.2f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
