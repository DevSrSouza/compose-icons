package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(306.7f, 325.1f)
                lineTo(162.4f, 380.6f)
                curveToRelative(-19.4f, 7.5f, -38.5f, -11.6f, -31.0f, -31.0f)
                lineToRelative(55.5f, -144.3f)
                curveToRelative(3.3f, -8.5f, 9.9f, -15.1f, 18.4f, -18.4f)
                lineToRelative(144.3f, -55.5f)
                curveToRelative(19.4f, -7.5f, 38.5f, 11.6f, 31.0f, 31.0f)
                lineTo(325.1f, 306.7f)
                curveToRelative(-3.2f, 8.5f, -9.9f, 15.1f, -18.4f, 18.4f)
                close()
                moveTo(288.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
