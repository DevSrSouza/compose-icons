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

public val CssGgIcons.ArrowTopRightR: ImageVector
    get() {
        if (_arrowTopRightR != null) {
            return _arrowTopRightR!!
        }
        _arrowTopRightR = Builder(name = "ArrowTopRightR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 13.9633f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.9633f)
                horizontalLineTo(10.0f)
                verticalLineTo(9.9633f)
                horizontalLineTo(12.5858f)
                lineTo(7.2562f, 15.2929f)
                lineTo(8.6704f, 16.7071f)
                lineTo(14.0f, 11.3775f)
                verticalLineTo(13.9633f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 19.0f)
                curveTo(23.0f, 21.2091f, 21.2091f, 23.0f, 19.0f, 23.0f)
                horizontalLineTo(5.0f)
                curveTo(2.7909f, 23.0f, 1.0f, 21.2091f, 1.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(1.0f, 2.7909f, 2.7909f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(19.0f)
                curveTo(21.2091f, 1.0f, 23.0f, 2.7909f, 23.0f, 5.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.8954f, 21.0f, 3.0f, 20.1046f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.8954f, 3.8954f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 3.0f, 21.0f, 3.8954f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.1046f, 20.1046f, 21.0f, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _arrowTopRightR!!
    }

private var _arrowTopRightR: ImageVector? = null
