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

public val BoldGroup.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) {
            return _fastForwardCircle!!
        }
        _fastForwardCircle = Builder(name = "FastForwardCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -4.6f, 9.5f)
                lineToRelative(-36.0f, 28.0f)
                arcTo(12.7f, 12.7f, 0.0f, false, true, 144.0f, 168.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, -5.3f, -1.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 132.0f, 156.0f)
                lineTo(132.0f, 136.9f)
                lineToRelative(-0.6f, 0.6f)
                lineToRelative(-36.0f, 28.0f)
                arcTo(12.7f, 12.7f, 0.0f, false, true, 88.0f, 168.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, -5.3f, -1.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.0f, 156.0f)
                lineTo(76.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.7f, -10.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.7f, 1.3f)
                lineToRelative(36.0f, 28.0f)
                lineToRelative(0.6f, 0.6f)
                lineTo(132.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 6.7f, -10.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.7f, 1.3f)
                lineToRelative(36.0f, 28.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 192.0f, 128.0f)
                close()
            }
        }
        .build()
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
