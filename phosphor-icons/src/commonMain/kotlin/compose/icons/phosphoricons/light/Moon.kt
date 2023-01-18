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

public val LightGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.4f, 150.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -5.7f, -4.3f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.7f, 0.3f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 109.1f, 41.1f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, 0.2f, -1.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -3.7f, -5.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -4.0f, -0.2f)
                arcTo(98.0f, 98.0f, 0.0f, true, false, 222.4f, 154.3f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 222.4f, 150.9f)
                close()
                moveTo(128.0f, 214.0f)
                arcTo(86.0f, 86.0f, 0.0f, false, true, 95.2f, 48.5f)
                arcTo(98.1f, 98.1f, 0.0f, false, false, 207.5f, 160.8f)
                arcTo(86.1f, 86.1f, 0.0f, false, true, 128.0f, 214.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
