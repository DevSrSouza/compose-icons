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

public val ThinGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 52.0f)
                lineTo(32.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 52.0f)
                close()
                moveTo(128.0f, 138.6f)
                lineTo(42.3f, 60.0f)
                lineTo(213.7f, 60.0f)
                close()
                moveTo(104.6f, 128.0f)
                lineTo(36.0f, 190.9f)
                lineTo(36.0f, 65.1f)
                close()
                moveTo(110.5f, 133.4f)
                lineTo(125.3f, 146.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.4f, 0.0f)
                lineToRelative(14.8f, -13.5f)
                lineTo(213.7f, 196.0f)
                lineTo(42.3f, 196.0f)
                close()
                moveTo(151.4f, 128.0f)
                lineTo(220.0f, 65.1f)
                lineTo(220.0f, 190.9f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
