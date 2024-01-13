package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Moon16: ImageVector
    get() {
        if (_moon16 != null) {
            return _moon16!!
        }
        _moon16 = Builder(name = "Moon16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.598f, 1.591f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.785f, -0.175f)
                arcToRelative(7.001f, 7.001f, 0.0f, true, true, -8.967f, 8.967f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.961f, -0.96f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 7.046f, -7.046f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.175f, -0.786f)
                close()
                moveTo(11.214f, 3.536f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, true, -7.678f, 7.678f)
                arcToRelative(5.499f, 5.499f, 0.0f, true, false, 7.678f, -7.678f)
                close()
            }
        }
        .build()
        return _moon16!!
    }

private var _moon16: ImageVector? = null
