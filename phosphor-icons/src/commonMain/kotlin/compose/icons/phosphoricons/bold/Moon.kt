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

public val BoldGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.1f, 149.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.6f, -8.5f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, false, -3.3f, 0.6f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -98.3f, -98.4f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, 0.4f, -2.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -7.5f, -11.8f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, -7.9f, -0.4f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 228.2f, 156.0f)
                arcTo(12.5f, 12.5f, 0.0f, false, false, 228.1f, 149.1f)
                close()
                moveTo(128.0f, 208.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 88.1f, 58.6f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 197.4f, 167.9f)
                arcTo(80.4f, 80.4f, 0.0f, false, true, 128.0f, 208.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
