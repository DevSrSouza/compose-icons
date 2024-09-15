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

public val CssGgIcons.ChevronDoubleLeft: ImageVector
    get() {
        if (_chevronDoubleLeft != null) {
            return _chevronDoubleLeft!!
        }
        _chevronDoubleLeft = Builder(name = "ChevronDoubleLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.364f, 7.757f)
                lineTo(16.95f, 6.343f)
                lineTo(11.293f, 12.0f)
                lineTo(16.95f, 17.657f)
                lineTo(18.364f, 16.243f)
                lineTo(14.121f, 12.0f)
                lineTo(18.364f, 7.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.293f, 6.343f)
                lineTo(12.707f, 7.757f)
                lineTo(8.464f, 12.0f)
                lineTo(12.707f, 16.243f)
                lineTo(11.293f, 17.657f)
                lineTo(5.636f, 12.0f)
                lineTo(11.293f, 6.343f)
                close()
            }
        }
        .build()
        return _chevronDoubleLeft!!
    }

private var _chevronDoubleLeft: ImageVector? = null
