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

public val CssGgIcons.ChevronDoubleUpO: ImageVector
    get() {
        if (_chevronDoubleUpO != null) {
            return _chevronDoubleUpO!!
        }
        _chevronDoubleUpO = Builder(name = "ChevronDoubleUpO", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 12.707f)
                lineTo(16.243f, 11.293f)
                lineTo(12.0f, 7.05f)
                lineTo(7.757f, 11.293f)
                lineTo(9.172f, 12.707f)
                lineTo(12.0f, 9.879f)
                lineTo(14.828f, 12.707f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 16.95f)
                lineTo(16.243f, 15.535f)
                lineTo(12.0f, 11.293f)
                lineTo(7.757f, 15.535f)
                lineTo(9.172f, 16.95f)
                lineTo(12.0f, 14.121f)
                lineTo(14.828f, 16.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 18.075f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.075f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 16.971f, 7.029f, 21.0f, 12.0f, 21.0f)
                curveTo(16.971f, 21.0f, 21.0f, 16.971f, 21.0f, 12.0f)
                curveTo(21.0f, 7.029f, 16.971f, 3.0f, 12.0f, 3.0f)
                curveTo(7.029f, 3.0f, 3.0f, 7.029f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _chevronDoubleUpO!!
    }

private var _chevronDoubleUpO: ImageVector? = null
