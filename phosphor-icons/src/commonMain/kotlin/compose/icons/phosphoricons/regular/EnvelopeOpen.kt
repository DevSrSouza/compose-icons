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

public val RegularGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.4f, 89.3f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.8f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 24.0f, 96.0f)
                lineTo(24.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 96.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 228.4f, 89.3f)
                close()
                moveTo(96.7f, 152.0f)
                lineTo(40.0f, 192.0f)
                lineTo(40.0f, 111.5f)
                close()
                moveTo(113.1f, 160.0f)
                horizontalLineToRelative(29.8f)
                lineToRelative(56.6f, 40.0f)
                lineTo(56.5f, 200.0f)
                close()
                moveTo(159.3f, 152.0f)
                lineTo(216.0f, 111.5f)
                lineTo(216.0f, 192.0f)
                close()
                moveTo(128.0f, 41.6f)
                lineToRelative(81.9f, 54.6f)
                lineToRelative(-67.0f, 47.8f)
                lineTo(113.1f, 144.0f)
                lineToRelative(-67.0f, -47.8f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
