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

public val CssGgIcons.ChevronDoubleRightR: ImageVector
    get() {
        if (_chevronDoubleRightR != null) {
            return _chevronDoubleRightR!!
        }
        _chevronDoubleRightR = Builder(name = "ChevronDoubleRightR", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.464f, 7.757f)
                lineTo(7.05f, 9.172f)
                lineTo(9.879f, 12.0f)
                lineTo(7.05f, 14.828f)
                lineTo(8.465f, 16.243f)
                lineTo(12.707f, 12.0f)
                lineTo(8.464f, 7.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.293f, 9.172f)
                lineTo(12.707f, 7.757f)
                lineTo(16.95f, 12.0f)
                lineTo(12.707f, 16.243f)
                lineTo(11.293f, 14.828f)
                lineTo(14.121f, 12.0f)
                lineTo(11.293f, 9.172f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 5.0f)
                curveTo(23.0f, 2.791f, 21.209f, 1.0f, 19.0f, 1.0f)
                horizontalLineTo(5.0f)
                curveTo(2.791f, 1.0f, 1.0f, 2.791f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 21.209f, 2.791f, 23.0f, 5.0f, 23.0f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 23.0f, 23.0f, 21.209f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.105f, 3.895f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 21.0f, 21.0f, 20.105f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.895f, 20.105f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _chevronDoubleRightR!!
    }

private var _chevronDoubleRightR: ImageVector? = null
