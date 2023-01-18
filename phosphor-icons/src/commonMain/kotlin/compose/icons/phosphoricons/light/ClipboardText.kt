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

public val LightGroup.ClipboardText: ImageVector
    get() {
        if (_clipboardText != null) {
            return _clipboardText!!
        }
        _clipboardText = Builder(name = "ClipboardText", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 158.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 152.0f)
                close()
                moveTo(160.0f, 114.0f)
                lineTo(96.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(214.0f, 48.0f)
                lineTo(214.0f, 216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(56.0f, 230.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(42.0f, 48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 56.0f, 34.0f)
                lineTo(93.2f, 34.0f)
                arcToRelative(45.8f, 45.8f, 0.0f, false, true, 69.6f, 0.0f)
                lineTo(200.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 214.0f, 48.0f)
                close()
                moveTo(94.0f, 64.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(68.0f)
                lineTo(162.0f, 64.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -68.0f, 0.0f)
                close()
                moveTo(202.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(170.3f, 46.0f)
                arcTo(44.9f, 44.9f, 0.0f, false, true, 174.0f, 64.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 78.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(82.0f, 64.0f)
                arcToRelative(44.9f, 44.9f, 0.0f, false, true, 3.7f, -18.0f)
                lineTo(56.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                lineTo(54.0f, 216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(200.0f, 218.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _clipboardText!!
    }

private var _clipboardText: ImageVector? = null
