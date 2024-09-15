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

public val CssGgIcons.Designmodo: ImageVector
    get() {
        if (_designmodo != null) {
            return _designmodo!!
        }
        _designmodo = Builder(name = "Designmodo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 4.054f)
                curveTo(4.239f, 4.054f, 2.0f, 6.293f, 2.0f, 9.054f)
                curveTo(2.0f, 11.816f, 4.239f, 14.054f, 7.0f, 14.054f)
                curveTo(9.761f, 14.054f, 12.0f, 11.816f, 12.0f, 9.054f)
                curveTo(12.0f, 6.293f, 9.761f, 4.054f, 7.0f, 4.054f)
                close()
                moveTo(5.0f, 9.054f)
                curveTo(5.0f, 10.159f, 5.895f, 11.054f, 7.0f, 11.054f)
                curveTo(8.105f, 11.054f, 9.0f, 10.159f, 9.0f, 9.054f)
                curveTo(9.0f, 7.95f, 8.105f, 7.054f, 7.0f, 7.054f)
                curveTo(5.895f, 7.054f, 5.0f, 7.95f, 5.0f, 9.054f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.554f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.554f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.554f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.55f, 16.946f)
                curveTo(12.679f, 16.946f, 13.698f, 16.479f, 14.425f, 15.727f)
                curveTo(14.41f, 15.743f, 14.394f, 15.759f, 14.379f, 15.774f)
                lineTo(16.5f, 17.895f)
                curveTo(15.233f, 19.162f, 13.483f, 19.946f, 11.55f, 19.946f)
                curveTo(9.617f, 19.946f, 7.867f, 19.162f, 6.601f, 17.895f)
                lineTo(8.722f, 15.774f)
                curveTo(9.446f, 16.498f, 10.446f, 16.946f, 11.55f, 16.946f)
                close()
            }
        }
        .build()
        return _designmodo!!
    }

private var _designmodo: ImageVector? = null
