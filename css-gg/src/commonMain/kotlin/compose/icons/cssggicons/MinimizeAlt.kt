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
                moveTo(20.0735f, 2.0f)
                lineTo(21.4877f, 3.4142f)
                lineTo(15.6378f, 9.2642f)
                horizontalLineTo(18.1824f)
                verticalLineTo(11.2642f)
                horizontalLineTo(12.1824f)
                verticalLineTo(5.2642f)
                horizontalLineTo(14.1824f)
                verticalLineTo(7.8911f)
                lineTo(20.0735f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1824f, 12.2642f)
                verticalLineTo(18.2642f)
                horizontalLineTo(9.1824f)
                verticalLineTo(15.8422f)
                lineTo(3.4142f, 21.6104f)
                lineTo(2.0f, 20.1962f)
                lineTo(7.932f, 14.2642f)
                horizontalLineTo(5.1824f)
                verticalLineTo(12.2642f)
                horizontalLineTo(11.1824f)
                close()
            }
        }
        .build()
        return _minimizeAlt!!
    }

private var _minimizeAlt: ImageVector? = null
