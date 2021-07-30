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

public val CssGgIcons.ClapperBoard: ImageVector
    get() {
        if (_clapperBoard != null) {
            return _clapperBoard!!
        }
        _clapperBoard = Builder(name = "ClapperBoard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(20.1702f, 3.0f)
                lineTo(20.1663f, 3.0045f)
                curveTo(21.7458f, 3.0908f, 23.0f, 4.399f, 23.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 19.6569f, 21.6569f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 21.0f, 1.0f, 19.6569f, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(1.0f, 4.3432f, 2.3431f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(20.1702f)
                close()
                moveTo(10.4764f, 5.0f)
                horizontalLineTo(16.4764f)
                lineTo(13.089f, 9.0f)
                horizontalLineTo(7.089f)
                lineTo(10.4764f, 5.0f)
                close()
                moveTo(5.089f, 9.0f)
                lineTo(8.4764f, 5.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 5.0f, 3.0f, 5.4477f, 3.0f, 6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.089f)
                close()
                moveTo(3.0f, 11.0f)
                verticalLineTo(18.0f)
                curveTo(3.0f, 18.5523f, 3.4477f, 19.0f, 4.0f, 19.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 19.0f, 21.0f, 18.5523f, 21.0f, 18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 9.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 5.4477f, 20.5523f, 5.0f, 20.0f, 5.0f)
                horizontalLineTo(18.4764f)
                lineTo(15.089f, 9.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _clapperBoard!!
    }

private var _clapperBoard: ImageVector? = null
