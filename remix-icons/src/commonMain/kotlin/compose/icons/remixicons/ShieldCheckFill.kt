package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.ShieldCheckFill: ImageVector
    get() {
        if (_shieldCheckFill != null) {
            return _shieldCheckFill!!
        }
        _shieldCheckFill = Builder(name = "ShieldCheckFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineToRelative(8.217f, 1.826f)
                curveToRelative(0.457f, 0.102f, 0.783f, 0.507f, 0.783f, 0.976f)
                verticalLineToRelative(9.987f)
                curveToRelative(0.0f, 2.006f, -1.003f, 3.88f, -2.672f, 4.992f)
                lineTo(12.0f, 23.0f)
                lineToRelative(-6.328f, -4.219f)
                curveTo(4.002f, 17.668f, 3.0f, 15.795f, 3.0f, 13.79f)
                lineTo(3.0f, 3.802f)
                curveToRelative(0.0f, -0.469f, 0.326f, -0.874f, 0.783f, -0.976f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(16.452f, 8.222f)
                lineToRelative(-4.95f, 4.949f)
                lineToRelative(-2.828f, -2.828f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(11.503f, 16.0f)
                lineToRelative(6.364f, -6.364f)
                lineToRelative(-1.415f, -1.414f)
                close()
            }
        }
        .build()
        return _shieldCheckFill!!
    }

private var _shieldCheckFill: ImageVector? = null
