package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.RssSolid: ImageVector
    get() {
        if (_rssSolid != null) {
            return _rssSolid!!
        }
        _rssSolid = Builder(name = "RssSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 9.0f)
                curveTo(14.93f, 9.0f, 23.0f, 17.07f, 23.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                curveTo(27.0f, 14.85f, 17.15f, 5.0f, 5.0f, 5.0f)
                close()
                moveTo(5.0f, 12.0f)
                lineTo(5.0f, 16.0f)
                curveTo(11.07f, 16.0f, 16.0f, 20.93f, 16.0f, 27.0f)
                lineTo(20.0f, 27.0f)
                curveTo(20.0f, 18.72f, 13.28f, 12.0f, 5.0f, 12.0f)
                close()
                moveTo(8.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 27.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 8.0f, 21.0f)
                close()
            }
        }
        .build()
        return _rssSolid!!
    }

private var _rssSolid: ImageVector? = null
