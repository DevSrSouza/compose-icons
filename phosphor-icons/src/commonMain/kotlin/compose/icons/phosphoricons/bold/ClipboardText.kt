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

public val BoldGroup.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) {
            return _clipboardText!!
        }
        _clipboardText = Builder(name = "ClipboardText", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 156.0f)
                close()
                moveTo(160.0f, 104.0f)
                lineTo(96.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(220.0f, 48.0f)
                lineTo(220.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(56.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(36.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 56.0f, 28.0f)
                lineTo(90.5f, 28.0f)
                arcToRelative(51.9f, 51.9f, 0.0f, false, true, 75.0f, 0.0f)
                lineTo(200.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 220.0f, 48.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(27.9f, 27.9f, 0.0f, false, false, -27.7f, 24.0f)
                horizontalLineToRelative(55.4f)
                arcTo(27.9f, 27.9f, 0.0f, false, false, 128.0f, 36.0f)
                close()
                moveTo(196.0f, 52.0f)
                lineTo(178.6f, 52.0f)
                arcTo(53.2f, 53.2f, 0.0f, false, true, 180.0f, 64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 72.0f)
                lineTo(76.0f, 64.0f)
                arcToRelative(53.2f, 53.2f, 0.0f, false, true, 1.4f, -12.0f)
                lineTo(60.0f, 52.0f)
                lineTo(60.0f, 212.0f)
                lineTo(196.0f, 212.0f)
                close()
            }
        }
        .build()
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
