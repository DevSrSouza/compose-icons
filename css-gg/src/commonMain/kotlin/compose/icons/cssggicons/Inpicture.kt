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

public val CssGgIcons.Inpicture: ImageVector
    get() {
        if (_inpicture != null) {
            return _inpicture!!
        }
        _inpicture = Builder(name = "Inpicture", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 6.0f)
                curveTo(1.0f, 4.8954f, 1.8954f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 4.0f, 23.0f, 4.8954f, 23.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(23.0f, 19.1046f, 22.1046f, 20.0f, 21.0f, 20.0f)
                horizontalLineTo(3.0f)
                curveTo(1.8954f, 20.0f, 1.0f, 19.1046f, 1.0f, 18.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(3.0f, 6.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 6.0f)
                close()
            }
        }
        .build()
        return _inpicture!!
    }

private var _inpicture: ImageVector? = null
