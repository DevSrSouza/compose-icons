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

public val CssGgIcons.ChevronDoubleUpR: ImageVector
    get() {
        if (_chevronDoubleUpR != null) {
            return _chevronDoubleUpR!!
        }
        _chevronDoubleUpR = Builder(name = "ChevronDoubleUpR", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 12.481f)
                lineTo(16.243f, 11.067f)
                lineTo(12.0f, 6.824f)
                lineTo(7.757f, 11.067f)
                lineTo(9.172f, 12.481f)
                lineTo(12.0f, 9.653f)
                lineTo(14.828f, 12.481f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 16.724f)
                lineTo(16.243f, 15.31f)
                lineTo(12.0f, 11.067f)
                lineTo(7.757f, 15.31f)
                lineTo(9.172f, 16.724f)
                lineTo(12.0f, 13.896f)
                lineTo(14.828f, 16.724f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 4.774f)
                curveTo(23.0f, 2.565f, 21.209f, 0.774f, 19.0f, 0.774f)
                horizontalLineTo(5.0f)
                curveTo(2.791f, 0.774f, 1.0f, 2.565f, 1.0f, 4.774f)
                verticalLineTo(18.774f)
                curveTo(1.0f, 20.983f, 2.791f, 22.774f, 5.0f, 22.774f)
                horizontalLineTo(19.0f)
                curveTo(21.209f, 22.774f, 23.0f, 20.983f, 23.0f, 18.774f)
                verticalLineTo(4.774f)
                close()
                moveTo(19.0f, 2.774f)
                horizontalLineTo(5.0f)
                curveTo(3.895f, 2.774f, 3.0f, 3.67f, 3.0f, 4.774f)
                verticalLineTo(18.774f)
                curveTo(3.0f, 19.879f, 3.895f, 20.774f, 5.0f, 20.774f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 20.774f, 21.0f, 19.879f, 21.0f, 18.774f)
                verticalLineTo(4.774f)
                curveTo(21.0f, 3.67f, 20.105f, 2.774f, 19.0f, 2.774f)
                close()
            }
        }
        .build()
        return _chevronDoubleUpR!!
    }

private var _chevronDoubleUpR: ImageVector? = null
