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

public val CssGgIcons.MinimizeAlt: ImageVector
    get() {
        if (_minimizeAlt != null) {
            return _minimizeAlt!!
        }
        _minimizeAlt = Builder(name = "MinimizeAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.073f, 2.0f)
                lineTo(21.488f, 3.414f)
                lineTo(15.638f, 9.264f)
                horizontalLineTo(18.182f)
                verticalLineTo(11.264f)
                horizontalLineTo(12.182f)
                verticalLineTo(5.264f)
                horizontalLineTo(14.182f)
                verticalLineTo(7.891f)
                lineTo(20.073f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.182f, 12.264f)
                verticalLineTo(18.264f)
                horizontalLineTo(9.182f)
                verticalLineTo(15.842f)
                lineTo(3.414f, 21.61f)
                lineTo(2.0f, 20.196f)
                lineTo(7.932f, 14.264f)
                horizontalLineTo(5.182f)
                verticalLineTo(12.264f)
                horizontalLineTo(11.182f)
                close()
            }
        }
        .build()
        return _minimizeAlt!!
    }

private var _minimizeAlt: ImageVector? = null
