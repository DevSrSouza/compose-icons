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

public val BoldGroup.EnvelopeSimple: ImageVector
    get() {
        if (_envelopeSimple != null) {
            return _envelopeSimple!!
        }
        _envelopeSimple = Builder(name = "EnvelopeSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                horizontalLineTo(32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f)
                verticalLineTo(192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(193.2f, 68.0f)
                lineTo(128.0f, 127.7f)
                lineTo(62.8f, 68.0f)
                close()
                moveTo(44.0f, 188.0f)
                verticalLineTo(83.3f)
                lineToRelative(75.9f, 69.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 16.2f, 0.0f)
                lineTo(212.0f, 83.3f)
                verticalLineTo(188.0f)
                close()
            }
        }
        .build()
        return _envelopeSimple!!
    }

private var _envelopeSimple: ImageVector? = null
