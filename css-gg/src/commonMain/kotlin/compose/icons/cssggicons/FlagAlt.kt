package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.FlagAlt: ImageVector
    get() {
        if (_flagAlt != null) {
            return _flagAlt!!
        }
        _flagAlt = Builder(name = "FlagAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.4388f, 7.0f)
                lineTo(14.8387f, 4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.8387f)
                lineTo(12.4388f, 7.0f)
                close()
                moveTo(19.0f, 12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(19.0f)
                lineTo(15.0f, 7.0f)
                lineTo(19.0f, 12.0f)
                close()
            }
        }
        .build()
        return _flagAlt!!
    }

private var _flagAlt: ImageVector? = null
