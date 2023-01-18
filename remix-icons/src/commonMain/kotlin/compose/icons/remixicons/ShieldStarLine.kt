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

public val RemixIcons.ShieldStarLine: ImageVector
    get() {
        if (_shieldStarLine != null) {
            return _shieldStarLine!!
        }
        _shieldStarLine = Builder(name = "ShieldStarLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.604f)
                verticalLineToRelative(9.185f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.781f, 3.328f)
                lineTo(12.0f, 20.597f)
                lineToRelative(5.219f, -3.48f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 19.0f, 13.79f)
                verticalLineTo(4.604f)
                lineTo(12.0f, 3.05f)
                lineTo(5.0f, 4.604f)
                close()
                moveTo(3.783f, 2.826f)
                lineTo(12.0f, 1.0f)
                lineToRelative(8.217f, 1.826f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.783f, 0.976f)
                verticalLineToRelative(9.987f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.672f, 4.992f)
                lineTo(12.0f, 23.0f)
                lineToRelative(-6.328f, -4.219f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 3.0f, 13.79f)
                verticalLineTo(3.802f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.783f, -0.976f)
                close()
                moveTo(12.0f, 13.5f)
                lineToRelative(-2.939f, 1.545f)
                lineToRelative(0.561f, -3.272f)
                lineToRelative(-2.377f, -2.318f)
                lineToRelative(3.286f, -0.478f)
                lineTo(12.0f, 6.0f)
                lineToRelative(1.47f, 2.977f)
                lineToRelative(3.285f, 0.478f)
                lineToRelative(-2.377f, 2.318f)
                lineToRelative(0.56f, 3.272f)
                lineTo(12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _shieldStarLine!!
    }

private var _shieldStarLine: ImageVector? = null
