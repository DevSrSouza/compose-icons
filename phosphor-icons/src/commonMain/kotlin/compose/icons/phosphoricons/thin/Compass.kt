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

public val ThinGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 28.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 100.0f, 100.0f)
                arcTo(100.2f, 100.2f, 0.0f, false, false, 128.1f, 28.0f)
                close()
                moveTo(128.1f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.1f, 220.0f)
                close()
                moveTo(171.5f, 79.2f)
                lineToRelative(-62.0f, 28.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.0f, 2.1f)
                lineTo(82.0f, 168.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.9f, 4.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.1f)
                lineToRelative(1.6f, -0.3f)
                lineToRelative(59.4f, -25.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.0f, -2.0f)
                lineToRelative(28.1f, -62.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.3f, -5.3f)
                close()
                moveTo(142.1f, 141.9f)
                lineTo(93.3f, 162.8f)
                lineTo(114.2f, 114.0f)
                lineToRelative(50.9f, -23.1f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
