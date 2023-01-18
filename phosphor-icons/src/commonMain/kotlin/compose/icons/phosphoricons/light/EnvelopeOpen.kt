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

public val LightGroup.EnvelopeOpen: ImageVector
    get() {
        if (_envelopeOpen != null) {
            return _envelopeOpen!!
        }
        _envelopeOpen = Builder(name = "EnvelopeOpen", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.3f, 91.0f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -6.6f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 96.0f)
                lineTo(26.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 227.3f, 91.0f)
                close()
                moveTo(100.2f, 152.0f)
                lineTo(38.0f, 195.9f)
                lineTo(38.0f, 107.6f)
                close()
                moveTo(112.5f, 158.0f)
                horizontalLineToRelative(31.0f)
                lineToRelative(62.3f, 44.0f)
                lineTo(50.2f, 202.0f)
                close()
                moveTo(155.8f, 152.0f)
                lineTo(218.0f, 107.6f)
                verticalLineToRelative(88.3f)
                close()
                moveTo(128.0f, 39.2f)
                lineToRelative(85.4f, 57.0f)
                lineTo(143.5f, 146.0f)
                horizontalLineToRelative(-31.0f)
                lineTo(42.6f, 96.2f)
                close()
            }
        }
        .build()
        return _envelopeOpen!!
    }

private var _envelopeOpen: ImageVector? = null
