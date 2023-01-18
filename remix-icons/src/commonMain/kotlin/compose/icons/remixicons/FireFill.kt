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

public val RemixIcons.FireFill: ImageVector
    get() {
        if (_fireFill != null) {
            return _fireFill!!
        }
        _fireFill = Builder(name = "FireFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -5.138f, -12.963f)
                curveTo(8.204f, 8.774f, 11.5f, 6.5f, 11.0f, 1.5f)
                curveToRelative(6.0f, 4.0f, 9.0f, 8.0f, 3.0f, 14.0f)
                curveToRelative(1.0f, 0.0f, 2.5f, 0.0f, 5.0f, -2.47f)
                curveToRelative(0.27f, 0.773f, 0.5f, 1.604f, 0.5f, 2.47f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _fireFill!!
    }

private var _fireFill: ImageVector? = null
