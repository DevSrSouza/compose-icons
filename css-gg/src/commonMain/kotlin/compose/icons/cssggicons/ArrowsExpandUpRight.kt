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

public val CssGgIcons.ArrowsExpandUpRight: ImageVector
    get() {
        if (_arrowsExpandUpRight != null) {
            return _arrowsExpandUpRight!!
        }
        _arrowsExpandUpRight = Builder(name = "ArrowsExpandUpRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                verticalLineTo(3.0f)
                lineTo(21.0f, 3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.4142f)
                lineTo(13.6361f, 11.7782f)
                curveTo(13.2456f, 12.1687f, 12.6124f, 12.1687f, 12.2219f, 11.7782f)
                curveTo(11.8314f, 11.3876f, 11.8314f, 10.7545f, 12.2219f, 10.3639f)
                lineTo(17.5858f, 5.0f)
                lineTo(13.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 13.0f)
                curveTo(3.8954f, 13.0f, 3.0f, 13.8954f, 3.0f, 15.0f)
                lineTo(3.0f, 19.0f)
                curveTo(3.0f, 20.1046f, 3.8954f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(9.0f)
                curveTo(10.1046f, 21.0f, 11.0f, 20.1046f, 11.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 13.8954f, 10.1046f, 13.0f, 9.0f, 13.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(5.0f, 15.0f)
                lineTo(5.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _arrowsExpandUpRight!!
    }

private var _arrowsExpandUpRight: ImageVector? = null
