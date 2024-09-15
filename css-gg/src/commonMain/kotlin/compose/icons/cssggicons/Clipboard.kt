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

public val CssGgIcons.Clipboard: ImageVector
    get() {
        if (_clipboard != null) {
            return _clipboard!!
        }
        _clipboard = Builder(name = "Clipboard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                curveTo(7.448f, 11.0f, 7.0f, 11.448f, 7.0f, 12.0f)
                curveTo(7.0f, 12.552f, 7.448f, 13.0f, 8.0f, 13.0f)
                horizontalLineTo(15.96f)
                curveTo(16.512f, 13.0f, 16.959f, 12.552f, 16.959f, 12.0f)
                curveTo(16.959f, 11.448f, 16.512f, 11.0f, 15.96f, 11.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.041f, 15.066f)
                curveTo(7.488f, 15.066f, 7.041f, 15.514f, 7.041f, 16.066f)
                curveTo(7.041f, 16.619f, 7.488f, 17.066f, 8.041f, 17.066f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 17.066f, 17.0f, 16.619f, 17.0f, 16.066f)
                curveTo(17.0f, 15.514f, 16.552f, 15.066f, 16.0f, 15.066f)
                horizontalLineTo(8.041f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 3.0f)
                curveTo(3.895f, 3.0f, 3.0f, 3.895f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.105f, 3.895f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.105f, 21.0f, 21.0f, 20.105f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.895f, 20.105f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(7.0f, 5.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                curveTo(17.0f, 7.657f, 15.657f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(10.0f)
                curveTo(8.343f, 9.0f, 7.0f, 7.657f, 7.0f, 6.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 5.0f)
                verticalLineTo(6.0f)
                curveTo(9.0f, 6.552f, 9.448f, 7.0f, 10.0f, 7.0f)
                horizontalLineTo(14.0f)
                curveTo(14.552f, 7.0f, 15.0f, 6.552f, 15.0f, 6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
