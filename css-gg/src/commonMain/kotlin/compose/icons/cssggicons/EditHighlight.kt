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

public val CssGgIcons.EditHighlight: ImageVector
    get() {
        if (_editHighlight != null) {
            return _editHighlight!!
        }
        _editHighlight = Builder(name = "EditHighlight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(10.778f, 6.0f, 9.642f, 6.365f, 8.694f, 6.992f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.992f)
                horizontalLineTo(7.535f)
                curveTo(7.009f, 8.577f, 6.597f, 9.267f, 6.332f, 10.026f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.026f)
                horizontalLineTo(6.079f)
                curveTo(6.027f, 11.343f, 6.0f, 11.668f, 6.0f, 12.0f)
                curveTo(6.0f, 12.338f, 6.028f, 12.669f, 6.082f, 12.992f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.992f)
                horizontalLineTo(6.339f)
                curveTo(6.602f, 14.74f, 7.009f, 15.421f, 7.528f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(8.682f)
                curveTo(9.633f, 17.632f, 10.773f, 18.0f, 12.0f, 18.0f)
                curveTo(15.314f, 18.0f, 18.0f, 15.314f, 18.0f, 12.0f)
                curveTo(18.0f, 8.686f, 15.314f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _editHighlight!!
    }

private var _editHighlight: ImageVector? = null
