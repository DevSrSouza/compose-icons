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

public val RemixIcons.ShieldKeyholeFill: ImageVector
    get() {
        if (_shieldKeyholeFill != null) {
            return _shieldKeyholeFill!!
        }
        _shieldKeyholeFill = Builder(name = "ShieldKeyholeFill", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineToRelative(8.217f, 1.826f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.783f, 0.976f)
                verticalLineToRelative(9.987f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -2.672f, 4.992f)
                lineTo(12.0f, 23.0f)
                lineToRelative(-6.328f, -4.219f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 3.0f, 13.79f)
                lineTo(3.0f, 3.802f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.783f, -0.976f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(12.0f, 7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.0f, 3.732f)
                lineTo(11.0f, 15.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.001f, -4.268f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _shieldKeyholeFill!!
    }

private var _shieldKeyholeFill: ImageVector? = null
