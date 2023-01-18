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

public val ThinGroup.Moon: ImageVector
    get() {
        if (_moon != null) {
            return _moon!!
        }
        _moon = Builder(name = "Moon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.5f, 151.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.9f, -2.9f)
                lineToRelative(-1.2f, 0.2f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 107.2f, 40.5f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, false, 0.1f, -0.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, -4.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.6f, -0.1f)
                arcTo(96.0f, 96.0f, 0.0f, true, false, 220.5f, 153.8f)
                arcTo(4.5f, 4.5f, 0.0f, false, false, 220.5f, 151.5f)
                close()
                moveTo(128.0f, 216.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 97.8f, 45.3f)
                arcTo(96.1f, 96.1f, 0.0f, false, false, 210.7f, 158.2f)
                arcTo(88.3f, 88.3f, 0.0f, false, true, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _moon!!
    }

private var _moon: ImageVector? = null
