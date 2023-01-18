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

public val BoldGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 20.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 108.0f, 108.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.1f, 20.0f)
                close()
                moveTo(128.1f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.1f, 212.0f)
                close()
                moveTo(163.1f, 77.3f)
                lineTo(106.7f, 99.9f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -6.7f, 6.7f)
                lineTo(77.4f, 163.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 93.0f, 178.7f)
                lineToRelative(56.5f, -22.6f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 6.7f, -6.7f)
                lineToRelative(22.5f, -56.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -15.6f, -15.6f)
                close()
                moveTo(135.8f, 135.7f)
                lineTo(110.0f, 146.1f)
                lineToRelative(10.4f, -25.8f)
                lineTo(146.1f, 110.0f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
