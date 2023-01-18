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

public val BoldGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.7f, 86.0f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -13.4f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 20.0f, 96.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 96.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 230.7f, 86.0f)
                close()
                moveTo(89.8f, 152.0f)
                lineTo(44.0f, 184.3f)
                verticalLineToRelative(-65.0f)
                close()
                moveTo(114.4f, 164.0f)
                horizontalLineToRelative(27.2f)
                lineToRelative(45.3f, 32.0f)
                lineTo(69.1f, 196.0f)
                close()
                moveTo(166.2f, 152.0f)
                lineTo(212.0f, 119.3f)
                verticalLineToRelative(65.0f)
                close()
                moveTo(128.0f, 46.4f)
                lineToRelative(74.9f, 49.9f)
                lineTo(141.6f, 140.0f)
                lineTo(114.4f, 140.0f)
                lineTo(53.1f, 96.3f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
