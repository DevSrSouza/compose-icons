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

public val CssGgIcons.Smartphone: ImageVector
    get() {
        if (_smartphone != null) {
            return _smartphone!!
        }
        _smartphone = Builder(name = "Smartphone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 4.0f)
                curveTo(5.0f, 2.8954f, 5.8954f, 2.0f, 7.0f, 2.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1046f, 2.0f, 19.0f, 2.8954f, 19.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.1046f, 18.1046f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(7.0f)
                curveTo(5.8954f, 22.0f, 5.0f, 21.1046f, 5.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 4.0f)
                close()
            }
        }
        .build()
        return _smartphone!!
    }

private var _smartphone: ImageVector? = null
