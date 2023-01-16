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

public val CssGgIcons.Yinyang: ImageVector
    get() {
        if (_yinyang != null) {
            return _yinyang!!
        }
        _yinyang = Builder(name = "Yinyang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 16.0f)
                curveTo(14.0f, 17.1046f, 13.1046f, 18.0f, 12.0f, 18.0f)
                curveTo(10.8954f, 18.0f, 10.0f, 17.1046f, 10.0f, 16.0f)
                curveTo(10.0f, 14.8954f, 10.8954f, 14.0f, 12.0f, 14.0f)
                curveTo(13.1046f, 14.0f, 14.0f, 14.8954f, 14.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(9.7909f, 12.0f, 8.0f, 10.2091f, 8.0f, 8.0f)
                curveTo(8.0f, 5.7909f, 9.7909f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(14.2091f, 20.0f, 16.0f, 18.2091f, 16.0f, 16.0f)
                curveTo(16.0f, 13.7909f, 14.2091f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveTo(14.0f, 9.1046f, 13.1046f, 10.0f, 12.0f, 10.0f)
                curveTo(10.8954f, 10.0f, 10.0f, 9.1046f, 10.0f, 8.0f)
                curveTo(10.0f, 6.8954f, 10.8954f, 6.0f, 12.0f, 6.0f)
                curveTo(13.1046f, 6.0f, 14.0f, 6.8954f, 14.0f, 8.0f)
                close()
            }
        }
        .build()
        return _yinyang!!
    }

private var _yinyang: ImageVector? = null