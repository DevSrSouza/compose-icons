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

public val CssGgIcons.MathDivide: ImageVector
    get() {
        if (_mathDivide != null) {
            return _mathDivide!!
        }
        _mathDivide = Builder(name = "MathDivide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                curveTo(14.0f, 8.105f, 13.105f, 9.0f, 12.0f, 9.0f)
                curveTo(10.895f, 9.0f, 10.0f, 8.105f, 10.0f, 7.0f)
                curveTo(10.0f, 5.895f, 10.895f, 5.0f, 12.0f, 5.0f)
                curveTo(13.105f, 5.0f, 14.0f, 5.895f, 14.0f, 7.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 11.448f, 3.448f, 11.0f, 4.0f, 11.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 11.0f, 21.0f, 11.448f, 21.0f, 12.0f)
                curveTo(21.0f, 12.552f, 20.552f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 13.0f, 3.0f, 12.552f, 3.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(13.105f, 19.0f, 14.0f, 18.105f, 14.0f, 17.0f)
                curveTo(14.0f, 15.895f, 13.105f, 15.0f, 12.0f, 15.0f)
                curveTo(10.895f, 15.0f, 10.0f, 15.895f, 10.0f, 17.0f)
                curveTo(10.0f, 18.105f, 10.895f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _mathDivide!!
    }

private var _mathDivide: ImageVector? = null
