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

public val RemixIcons.ShieldStarFill: ImageVector
    get() {
        if (_shieldStarFill != null) {
            return _shieldStarFill!!
        }
        _shieldStarFill = Builder(name = "ShieldStarFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                lineToRelative(2.939f, 1.545f)
                lineToRelative(-0.561f, -3.272f)
                lineToRelative(2.377f, -2.318f)
                lineToRelative(-3.286f, -0.478f)
                lineTo(12.0f, 6.0f)
                lineToRelative(-1.47f, 2.977f)
                lineToRelative(-3.285f, 0.478f)
                lineToRelative(2.377f, 2.318f)
                lineToRelative(-0.56f, 3.272f)
                lineTo(12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _shieldStarFill!!
    }

private var _shieldStarFill: ImageVector? = null
