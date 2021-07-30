package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ChevronRightR: ImageVector
    get() {
        if (_chevronRightR != null) {
            return _chevronRightR!!
        }
        _chevronRightR = Builder(name = "ChevronRightR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4853f, 12.0451f)
                lineTo(12.2426f, 7.8025f)
                lineTo(10.8284f, 9.2167f)
                lineTo(13.6568f, 12.0451f)
                lineTo(10.8284f, 14.8736f)
                lineTo(12.2426f, 16.2878f)
                lineTo(16.4853f, 12.0451f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 4.0f)
                curveTo(1.0f, 2.3431f, 2.3431f, 1.0f, 4.0f, 1.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 1.0f, 23.0f, 2.3431f, 23.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(23.0f, 21.6569f, 21.6569f, 23.0f, 20.0f, 23.0f)
                horizontalLineTo(4.0f)
                curveTo(2.3431f, 23.0f, 1.0f, 21.6569f, 1.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(4.0f, 3.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 3.0f, 21.0f, 3.4477f, 21.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 3.4477f, 3.4477f, 3.0f, 4.0f, 3.0f)
                close()
            }
        }
        .build()
        return _chevronRightR!!
    }

private var _chevronRightR: ImageVector? = null
