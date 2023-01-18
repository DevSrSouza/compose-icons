package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Paperclip: ImageVector
    get() {
        if (_paperclip != null) {
            return _paperclip!!
        }
        _paperclip = Builder(name = "Paperclip", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.7f, 122.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                lineToRelative(-82.1f, 81.9f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -79.2f, -79.2f)
                lineTo(147.7f, 35.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 56.6f, 56.5f)
                lineTo(105.0f, 192.9f)
                arcTo(23.8f, 23.8f, 0.0f, false, true, 88.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -17.0f, -41.0f)
                lineToRelative(83.3f, -84.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.4f, 11.2f)
                lineTo(82.4f, 170.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 176.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.3f, 5.7f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 88.0f, 184.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 5.7f, -2.3f)
                lineTo(192.9f, 81.0f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 200.0f, 64.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.0f, -17.0f)
                lineTo(59.8f, 147.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 56.5f, 56.6f)
                lineToRelative(82.0f, -82.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 209.7f, 122.3f)
                close()
            }
        }
        .build()
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
