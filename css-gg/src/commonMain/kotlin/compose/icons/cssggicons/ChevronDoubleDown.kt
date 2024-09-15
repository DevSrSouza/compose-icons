package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.757f, 5.636f)
                lineTo(6.343f, 7.05f)
                lineTo(12.0f, 12.707f)
                lineTo(17.657f, 7.05f)
                lineTo(16.243f, 5.636f)
                lineTo(12.0f, 9.879f)
                lineTo(7.757f, 5.636f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.343f, 12.707f)
                lineTo(7.757f, 11.293f)
                lineTo(12.0f, 15.536f)
                lineTo(16.243f, 11.293f)
                lineTo(17.657f, 12.707f)
                lineTo(12.0f, 18.364f)
                lineTo(6.343f, 12.707f)
                close()
            }
        }
        .build()
        return _chevronDoubleDown!!
    }

private var _chevronDoubleDown: ImageVector? = null
