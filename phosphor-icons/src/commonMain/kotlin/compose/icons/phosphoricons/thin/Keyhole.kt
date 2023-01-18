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

public val ThinGroup.Keyhole: ImageVector
    get() {
        if (_keyhole != null) {
            return _keyhole!!
        }
        _keyhole = Builder(name = "Keyhole", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(159.8f, 104.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -28.1f, -28.4f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 108.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 13.6f, 26.2f)
                lineTo(97.1f, 163.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, 16.7f)
                horizontalLineToRelative(39.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.7f)
                lineToRelative(-12.5f, -29.1f)
                arcTo(32.2f, 32.2f, 0.0f, false, false, 159.8f, 104.6f)
                close()
                moveTo(137.7f, 134.2f)
                lineTo(151.5f, 166.4f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -0.3f, 3.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, 1.8f)
                lineTo(108.1f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, -1.8f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -0.3f, -3.8f)
                lineToRelative(13.8f, -32.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.8f, -5.1f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -4.5f, -39.0f)
                arcTo(23.7f, 23.7f, 0.0f, false, true, 128.0f, 84.0f)
                lineToRelative(2.8f, 0.2f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 8.7f, 44.9f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 137.7f, 134.2f)
                close()
            }
        }
        .build()
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
