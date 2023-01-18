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

public val BoldGroup.NotePencil: ImageVector
    get() {
        if (_notePencil != null) {
            return _notePencil!!
        }
        _notePencil = Builder(name = "NotePencil", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.5f, 55.5f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 84.0f, 128.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 8.5f, -3.5f)
                lineToRelative(96.0f, -96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.5f, 55.5f)
                close()
                moveTo(192.0f, 49.0f)
                lineToRelative(15.0f, 15.0f)
                lineTo(196.0f, 75.0f)
                lineTo(181.0f, 60.0f)
                close()
                moveTo(123.0f, 148.0f)
                lineTo(108.0f, 148.0f)
                lineTo(108.0f, 133.0f)
                lineToRelative(56.0f, -56.0f)
                lineToRelative(15.0f, 15.0f)
                close()
                moveTo(228.0f, 128.6f)
                lineTo(228.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                horizontalLineToRelative(79.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(52.0f, 52.0f)
                lineTo(52.0f, 204.0f)
                lineTo(204.0f, 204.0f)
                lineTo(204.0f, 128.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
            }
        }
        .build()
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
