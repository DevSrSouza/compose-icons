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

public val BoldGroup.EnvelopeSimpleOpen: ImageVector
    get() {
        if (_envelopeSimpleOpen != null) {
            return _envelopeSimpleOpen!!
        }
        _envelopeSimpleOpen = Builder(name = "EnvelopeSimpleOpen", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.7f, 86.0f)
                lineToRelative(-96.0f, -64.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -13.4f, 0.0f)
                lineToRelative(-96.0f, 64.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 20.0f, 96.0f)
                verticalLineTo(200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(96.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 230.7f, 86.0f)
                close()
                moveTo(128.0f, 46.4f)
                lineToRelative(74.9f, 49.9f)
                lineTo(141.6f, 140.0f)
                horizontalLineTo(114.4f)
                lineTo(53.1f, 96.3f)
                close()
                moveTo(44.0f, 196.0f)
                verticalLineTo(119.3f)
                lineToRelative(59.6f, 42.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.9f, 2.2f)
                horizontalLineToRelative(35.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.9f, -2.2f)
                lineTo(212.0f, 119.3f)
                verticalLineTo(196.0f)
                close()
            }
        }
        .build()
        return _envelopeSimpleOpen!!
    }

private var _envelopeSimpleOpen: ImageVector? = null
