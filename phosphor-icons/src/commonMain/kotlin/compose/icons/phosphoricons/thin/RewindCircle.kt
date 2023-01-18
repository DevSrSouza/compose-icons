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

public val ThinGroup.RewindCircle: ImageVector
    get() {
        if (_rewindCircle != null) {
            return _rewindCircle!!
        }
        _rewindCircle = Builder(name = "RewindCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(173.9f, 92.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, 0.2f)
                lineToRelative(-48.0f, 32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 6.6f)
                lineToRelative(48.0f, 32.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.2f, 0.7f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.9f, -0.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 176.0f, 160.0f)
                lineTo(176.0f, 96.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 173.9f, 92.5f)
                close()
                moveTo(168.0f, 152.5f)
                lineTo(131.2f, 128.0f)
                lineTo(168.0f, 103.5f)
                close()
                moveTo(117.9f, 92.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, 0.2f)
                lineToRelative(-48.0f, 32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 6.6f)
                lineToRelative(48.0f, 32.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.2f, 0.7f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.9f, -0.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 120.0f, 160.0f)
                lineTo(120.0f, 96.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 117.9f, 92.5f)
                close()
                moveTo(112.0f, 152.5f)
                lineTo(75.2f, 128.0f)
                lineTo(112.0f, 103.5f)
                close()
            }
        }
        .build()
        return _rewindCircle!!
    }

private var _rewindCircle: ImageVector? = null
