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

public val CssGgIcons.Terminal: ImageVector
    get() {
        if (_terminal != null) {
            return _terminal!!
        }
        _terminal = Builder(name = "Terminal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0333f, 14.8284f)
                lineTo(6.4475f, 16.2426f)
                lineTo(10.6902f, 12.0f)
                lineTo(6.4475f, 7.7573f)
                lineTo(5.0333f, 9.1715f)
                lineTo(7.8617f, 12.0f)
                lineTo(5.0333f, 14.8284f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 2.0f)
                curveTo(0.8954f, 2.0f, 0.0f, 2.8954f, 0.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(0.0f, 21.1046f, 0.8954f, 22.0f, 2.0f, 22.0f)
                horizontalLineTo(22.0f)
                curveTo(23.1046f, 22.0f, 24.0f, 21.1046f, 24.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(24.0f, 2.8954f, 23.1046f, 2.0f, 22.0f, 2.0f)
                horizontalLineTo(2.0f)
                close()
                moveTo(22.0f, 4.0f)
                horizontalLineTo(2.0f)
                lineTo(2.0f, 20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _terminal!!
    }

private var _terminal: ImageVector? = null
