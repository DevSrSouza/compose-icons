package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.5f, 136.5f)
                lineToRelative(-82.1f, 81.9f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, -84.8f, -84.8f)
                lineToRelative(98.1f, -97.9f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 56.6f, 56.6f)
                curveToRelative(-0.1f, 0.0f, -0.1f, 0.1f, -0.2f, 0.2f)
                lineToRelative(-95.8f, 92.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.6f, -17.2f)
                lineToRelative(95.7f, -92.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.7f, -22.5f)
                lineTo(62.5f, 150.6f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 51.0f, 50.9f)
                lineToRelative(82.0f, -82.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
