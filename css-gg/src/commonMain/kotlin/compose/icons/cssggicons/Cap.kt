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

public val CssGgIcons.Cap: ImageVector
    get() {
        if (_cap != null) {
            return _cap!!
        }
        _cap = Builder(name = "Cap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.988f, 3.2203f)
                curveTo(13.9959f, 3.148f, 14.0f, 3.0745f, 14.0f, 3.0f)
                curveTo(14.0f, 1.8954f, 13.1046f, 1.0f, 12.0f, 1.0f)
                curveTo(10.8954f, 1.0f, 10.0f, 1.8954f, 10.0f, 3.0f)
                curveTo(10.0f, 3.0745f, 10.0041f, 3.148f, 10.012f, 3.2203f)
                curveTo(5.998f, 4.1253f, 3.0f, 7.7126f, 3.0f, 12.0f)
                curveTo(3.0f, 12.3883f, 3.0246f, 12.7709f, 3.0723f, 13.1462f)
                curveTo(1.8695f, 13.5369f, 1.0f, 14.6669f, 1.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.6569f, 2.3431f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(21.6569f, 23.0f, 23.0f, 21.6569f, 23.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 14.6669f, 22.1305f, 13.5369f, 20.9277f, 13.1462f)
                curveTo(20.9754f, 12.7709f, 21.0f, 12.3883f, 21.0f, 12.0f)
                curveTo(21.0f, 7.7126f, 18.002f, 4.1253f, 13.988f, 3.2203f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 12.3402f, 5.0241f, 12.674f, 5.0706f, 13.0f)
                horizontalLineTo(18.9294f)
                curveTo(18.9759f, 12.674f, 19.0f, 12.3402f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(3.0f, 16.0f)
                curveTo(3.0f, 15.4477f, 3.4477f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(20.5523f, 15.0f, 21.0f, 15.4477f, 21.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.5523f, 20.5523f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _cap!!
    }

private var _cap: ImageVector? = null
