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

public val RemixIcons.ShieldCheckLine: ImageVector
    get() {
        if (_shieldCheckLine != null) {
            return _shieldCheckLine!!
        }
        _shieldCheckLine = Builder(name = "ShieldCheckLine", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(12.0f, 3.049f)
                lineTo(5.0f, 4.604f)
                verticalLineToRelative(9.185f)
                curveToRelative(0.0f, 1.337f, 0.668f, 2.586f, 1.781f, 3.328f)
                lineTo(12.0f, 20.597f)
                lineToRelative(5.219f, -3.48f)
                curveTo(18.332f, 16.375f, 19.0f, 15.127f, 19.0f, 13.79f)
                lineTo(19.0f, 4.604f)
                lineTo(12.0f, 3.05f)
                close()
                moveTo(16.452f, 8.222f)
                lineToRelative(1.415f, 1.414f)
                lineTo(11.503f, 16.0f)
                lineTo(7.26f, 11.757f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(2.828f, 2.828f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }
        .build()
        return _shieldCheckLine!!
    }

private var _shieldCheckLine: ImageVector? = null
