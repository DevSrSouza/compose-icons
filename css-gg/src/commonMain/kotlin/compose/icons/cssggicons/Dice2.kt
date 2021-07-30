package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Dice2: ImageVector
    get() {
        if (_dice2 != null) {
            return _dice2!!
        }
        _dice2 = Builder(name = "Dice2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 14.9431f)
                curveTo(16.0954f, 14.9431f, 15.2f, 15.8385f, 15.2f, 16.9431f)
                curveTo(15.2f, 18.0477f, 16.0954f, 18.9431f, 17.2f, 18.9431f)
                curveTo(18.3045f, 18.9431f, 19.2f, 18.0477f, 19.2f, 16.9431f)
                curveTo(19.2f, 15.8385f, 18.3045f, 14.9431f, 17.2f, 14.9431f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0552f, 7.0552f)
                curveTo(5.0552f, 5.9506f, 5.9506f, 5.0552f, 7.0552f, 5.0552f)
                curveTo(8.1597f, 5.0552f, 9.0552f, 5.9506f, 9.0552f, 7.0552f)
                curveTo(9.0552f, 8.1597f, 8.1597f, 9.0552f, 7.0552f, 9.0552f)
                curveTo(5.9506f, 9.0552f, 5.0552f, 8.1597f, 5.0552f, 7.0552f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 1.0f)
                curveTo(2.3431f, 1.0f, 1.0f, 2.3431f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.6569f, 2.3431f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 23.0f, 23.0f, 21.6569f, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.3431f, 21.6569f, 1.0f, 20.0f, 1.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 3.0f, 3.0f, 3.4477f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.5523f, 3.4477f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 21.0f, 21.0f, 20.5523f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.4477f, 20.5523f, 3.0f, 20.0f, 3.0f)
                close()
            }
        }
        .build()
        return _dice2!!
    }

private var _dice2: ImageVector? = null
