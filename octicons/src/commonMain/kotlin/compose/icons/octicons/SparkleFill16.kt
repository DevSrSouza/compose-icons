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

public val Octicons.SparkleFill16: ImageVector
    get() {
        if (_sparkleFill16 != null) {
            return _sparkleFill16!!
        }
        _sparkleFill16 = Builder(name = "SparkleFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.53f, 1.282f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.94f, 0.0f)
                lineToRelative(0.478f, 1.306f)
                arcToRelative(7.492f, 7.492f, 0.0f, false, false, 4.464f, 4.464f)
                lineToRelative(1.305f, 0.478f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.94f)
                lineToRelative(-1.305f, 0.478f)
                arcToRelative(7.492f, 7.492f, 0.0f, false, false, -4.464f, 4.464f)
                lineToRelative(-0.478f, 1.305f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.94f, 0.0f)
                lineToRelative(-0.478f, -1.305f)
                arcToRelative(7.492f, 7.492f, 0.0f, false, false, -4.464f, -4.464f)
                lineTo(1.282f, 8.47f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, -0.94f)
                lineToRelative(1.306f, -0.478f)
                arcToRelative(7.492f, 7.492f, 0.0f, false, false, 4.464f, -4.464f)
                close()
            }
        }
        .build()
        return _sparkleFill16!!
    }

private var _sparkleFill16: ImageVector? = null
