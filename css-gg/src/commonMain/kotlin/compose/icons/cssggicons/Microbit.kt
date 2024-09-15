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

public val CssGgIcons.Microbit: ImageVector
    get() {
        if (_microbit != null) {
            return _microbit!!
        }
        _microbit = Builder(name = "Microbit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                curveTo(8.105f, 14.0f, 9.0f, 13.105f, 9.0f, 12.0f)
                curveTo(9.0f, 10.895f, 8.105f, 10.0f, 7.0f, 10.0f)
                curveTo(5.895f, 10.0f, 5.0f, 10.895f, 5.0f, 12.0f)
                curveTo(5.0f, 13.105f, 5.895f, 14.0f, 7.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 13.105f, 18.105f, 14.0f, 17.0f, 14.0f)
                curveTo(15.895f, 14.0f, 15.0f, 13.105f, 15.0f, 12.0f)
                curveTo(15.0f, 10.895f, 15.895f, 10.0f, 17.0f, 10.0f)
                curveTo(18.105f, 10.0f, 19.0f, 10.895f, 19.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 5.0f)
                curveTo(3.134f, 5.0f, 0.0f, 8.134f, 0.0f, 12.0f)
                curveTo(0.0f, 15.866f, 3.134f, 19.0f, 7.0f, 19.0f)
                horizontalLineTo(17.0f)
                curveTo(20.866f, 19.0f, 24.0f, 15.866f, 24.0f, 12.0f)
                curveTo(24.0f, 8.134f, 20.866f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineTo(7.0f)
                curveTo(4.791f, 8.0f, 3.0f, 9.791f, 3.0f, 12.0f)
                curveTo(3.0f, 14.209f, 4.791f, 16.0f, 7.0f, 16.0f)
                horizontalLineTo(17.0f)
                curveTo(19.209f, 16.0f, 21.0f, 14.209f, 21.0f, 12.0f)
                curveTo(21.0f, 9.791f, 19.209f, 8.0f, 17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _microbit!!
    }

private var _microbit: ImageVector? = null
