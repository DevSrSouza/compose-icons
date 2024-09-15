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

public val CssGgIcons.Smile: ImageVector
    get() {
        if (_smile != null) {
            return _smile!!
        }
        _smile = Builder(name = "Smile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 14.105f, 13.105f, 15.0f, 12.0f, 15.0f)
                curveTo(10.895f, 15.0f, 10.0f, 14.105f, 10.0f, 13.0f)
                horizontalLineTo(8.0f)
                curveTo(8.0f, 15.209f, 9.791f, 17.0f, 12.0f, 17.0f)
                curveTo(14.209f, 17.0f, 16.0f, 15.209f, 16.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 10.0f)
                curveTo(10.0f, 10.552f, 9.552f, 11.0f, 9.0f, 11.0f)
                curveTo(8.448f, 11.0f, 8.0f, 10.552f, 8.0f, 10.0f)
                curveTo(8.0f, 9.448f, 8.448f, 9.0f, 9.0f, 9.0f)
                curveTo(9.552f, 9.0f, 10.0f, 9.448f, 10.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 11.0f)
                curveTo(15.552f, 11.0f, 16.0f, 10.552f, 16.0f, 10.0f)
                curveTo(16.0f, 9.448f, 15.552f, 9.0f, 15.0f, 9.0f)
                curveTo(14.448f, 9.0f, 14.0f, 9.448f, 14.0f, 10.0f)
                curveTo(14.0f, 10.552f, 14.448f, 11.0f, 15.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(20.0f, 16.418f, 16.418f, 20.0f, 12.0f, 20.0f)
                curveTo(7.582f, 20.0f, 4.0f, 16.418f, 4.0f, 12.0f)
                curveTo(4.0f, 7.582f, 7.582f, 4.0f, 12.0f, 4.0f)
                curveTo(16.418f, 4.0f, 20.0f, 7.582f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _smile!!
    }

private var _smile: ImageVector? = null
