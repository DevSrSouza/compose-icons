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

public val LineAwesomeIcons.EllipsisHSolid: ImageVector
    get() {
        if (_ellipsisHSolid != null) {
            return _ellipsisHSolid!!
        }
        _ellipsisHSolid = Builder(name = "EllipsisHSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                curveTo(4.8945f, 14.0f, 4.0f, 14.8945f, 4.0f, 16.0f)
                curveTo(4.0f, 17.1055f, 4.8945f, 18.0f, 6.0f, 18.0f)
                curveTo(7.1055f, 18.0f, 8.0f, 17.1055f, 8.0f, 16.0f)
                curveTo(8.0f, 14.8945f, 7.1055f, 14.0f, 6.0f, 14.0f)
                close()
                moveTo(16.0f, 14.0f)
                curveTo(14.8945f, 14.0f, 14.0f, 14.8945f, 14.0f, 16.0f)
                curveTo(14.0f, 17.1055f, 14.8945f, 18.0f, 16.0f, 18.0f)
                curveTo(17.1055f, 18.0f, 18.0f, 17.1055f, 18.0f, 16.0f)
                curveTo(18.0f, 14.8945f, 17.1055f, 14.0f, 16.0f, 14.0f)
                close()
                moveTo(26.0f, 14.0f)
                curveTo(24.8945f, 14.0f, 24.0f, 14.8945f, 24.0f, 16.0f)
                curveTo(24.0f, 17.1055f, 24.8945f, 18.0f, 26.0f, 18.0f)
                curveTo(27.1055f, 18.0f, 28.0f, 17.1055f, 28.0f, 16.0f)
                curveTo(28.0f, 14.8945f, 27.1055f, 14.0f, 26.0f, 14.0f)
                close()
            }
        }
        .build()
        return _ellipsisHSolid!!
    }

private var _ellipsisHSolid: ImageVector? = null
