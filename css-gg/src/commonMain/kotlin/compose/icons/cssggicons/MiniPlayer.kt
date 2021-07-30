package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.MiniPlayer: ImageVector
    get() {
        if (_miniPlayer != null) {
            return _miniPlayer!!
        }
        _miniPlayer = Builder(name = "MiniPlayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 6.0f)
                curveTo(3.0f, 4.3432f, 4.3432f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                curveTo(19.6569f, 3.0f, 21.0f, 4.3432f, 21.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(21.0f, 19.6569f, 19.6569f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(4.3432f, 21.0f, 3.0f, 19.6569f, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(6.0f, 5.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 5.0f, 19.0f, 5.4477f, 19.0f, 6.0f)
                verticalLineTo(12.2676f)
                curveTo(18.7058f, 12.0974f, 18.3643f, 12.0f, 18.0f, 12.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 12.0f, 12.0f, 12.8954f, 12.0f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(12.0f, 18.3643f, 12.0974f, 18.7058f, 12.2676f, 19.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 19.0f, 5.0f, 18.5523f, 5.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(5.0f, 5.4477f, 5.4477f, 5.0f, 6.0f, 5.0f)
                close()
            }
        }
        .build()
        return _miniPlayer!!
    }

private var _miniPlayer: ImageVector? = null
