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

public val CssGgIcons.Ratio: ImageVector
    get() {
        if (_ratio != null) {
            return _ratio!!
        }
        _ratio = Builder(name = "Ratio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                lineTo(10.0f, 8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 2.0f)
                curveTo(1.7909f, 2.0f, 0.0f, 3.7909f, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(0.0f, 20.2091f, 1.7909f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(22.2091f, 22.0f, 24.0f, 20.2091f, 24.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 3.7909f, 22.2091f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.8954f, 4.0f, 2.0f, 4.8954f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1046f, 2.8954f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1046f, 20.0f, 22.0f, 19.1046f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.8954f, 21.1046f, 4.0f, 20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _ratio!!
    }

private var _ratio: ImageVector? = null
