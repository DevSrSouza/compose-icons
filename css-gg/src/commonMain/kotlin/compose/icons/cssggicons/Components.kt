package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Components: ImageVector
    get() {
        if (_components != null) {
            return _components!!
        }
        _components = Builder(name = "Components", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.757f, 6.343f)
                lineTo(12.0f, 2.1f)
                lineTo(16.243f, 6.343f)
                lineTo(12.0f, 10.586f)
                lineTo(7.757f, 6.343f)
                close()
                moveTo(10.586f, 6.343f)
                lineTo(12.0f, 4.929f)
                lineTo(13.414f, 6.343f)
                lineTo(12.0f, 7.757f)
                lineTo(10.586f, 6.343f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.1f, 12.0f)
                lineTo(6.343f, 7.757f)
                lineTo(10.586f, 12.0f)
                lineTo(6.343f, 16.243f)
                lineTo(2.1f, 12.0f)
                close()
                moveTo(4.929f, 12.0f)
                lineTo(6.343f, 10.586f)
                lineTo(7.757f, 12.0f)
                lineTo(6.343f, 13.414f)
                lineTo(4.929f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.414f, 12.0f)
                lineTo(17.657f, 16.243f)
                lineTo(21.899f, 12.0f)
                lineTo(17.657f, 7.757f)
                lineTo(13.414f, 12.0f)
                close()
                moveTo(17.657f, 10.586f)
                lineTo(16.243f, 12.0f)
                lineTo(17.657f, 13.414f)
                lineTo(19.071f, 12.0f)
                lineTo(17.657f, 10.586f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.757f, 17.657f)
                lineTo(12.0f, 13.414f)
                lineTo(16.243f, 17.657f)
                lineTo(12.0f, 21.899f)
                lineTo(7.757f, 17.657f)
                close()
                moveTo(10.586f, 17.657f)
                lineTo(12.0f, 16.243f)
                lineTo(13.414f, 17.657f)
                lineTo(12.0f, 19.071f)
                lineTo(10.586f, 17.657f)
                close()
            }
        }
        .build()
        return _components!!
    }

private var _components: ImageVector? = null
