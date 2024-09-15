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

public val CssGgIcons.MoreO: ImageVector
    get() {
        if (_moreO != null) {
            return _moreO!!
        }
        _moreO = Builder(name = "MoreO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 13.105f, 14.0f, 12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 13.105f, 10.0f, 12.0f)
                curveTo(10.0f, 10.895f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                curveTo(18.105f, 14.0f, 19.0f, 13.105f, 19.0f, 12.0f)
                curveTo(19.0f, 10.895f, 18.105f, 10.0f, 17.0f, 10.0f)
                curveTo(15.895f, 10.0f, 15.0f, 10.895f, 15.0f, 12.0f)
                curveTo(15.0f, 13.105f, 15.895f, 14.0f, 17.0f, 14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(24.0f, 12.0f)
                curveTo(24.0f, 18.627f, 18.627f, 24.0f, 12.0f, 24.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                curveTo(18.627f, 0.0f, 24.0f, 5.373f, 24.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.523f, 17.523f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                curveTo(17.523f, 2.0f, 22.0f, 6.477f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _moreO!!
    }

private var _moreO: ImageVector? = null
