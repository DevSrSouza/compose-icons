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

public val ThinGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.2f, 92.7f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.4f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 28.0f, 96.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 226.2f, 92.7f)
                close()
                moveTo(103.6f, 152.0f)
                lineTo(36.0f, 199.8f)
                verticalLineToRelative(-96.0f)
                close()
                moveTo(111.8f, 156.0f)
                horizontalLineToRelative(32.4f)
                lineToRelative(67.9f, 48.0f)
                lineTo(43.9f, 204.0f)
                close()
                moveTo(152.4f, 152.0f)
                lineTo(220.0f, 103.8f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(128.0f, 36.8f)
                lineToRelative(89.0f, 59.3f)
                lineTo(144.2f, 148.0f)
                lineTo(111.8f, 148.0f)
                lineTo(39.0f, 96.1f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
