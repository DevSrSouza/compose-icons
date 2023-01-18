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

public val RemixIcons.LeafFill: ImageVector
    get() {
        if (_leafFill != null) {
            return _leafFill!!
        }
        _leafFill = Builder(name = "LeafFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 9.627f, -5.373f, 14.0f, -12.0f, 14.0f)
                horizontalLineTo(7.098f)
                curveToRelative(0.212f, -3.012f, 1.15f, -4.835f, 3.598f, -7.001f)
                curveToRelative(1.204f, -1.065f, 1.102f, -1.68f, 0.509f, -1.327f)
                curveToRelative(-4.084f, 2.43f, -6.112f, 5.714f, -6.202f, 10.958f)
                lineTo(5.0f, 22.0f)
                horizontalLineTo(3.0f)
                curveToRelative(0.0f, -1.363f, 0.116f, -2.6f, 0.346f, -3.732f)
                curveTo(3.116f, 16.974f, 3.0f, 15.218f, 3.0f, 13.0f)
                curveTo(3.0f, 7.477f, 7.477f, 3.0f, 13.0f, 3.0f)
                curveToRelative(2.0f, 0.0f, 4.0f, 1.0f, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _leafFill!!
    }

private var _leafFill: ImageVector? = null
