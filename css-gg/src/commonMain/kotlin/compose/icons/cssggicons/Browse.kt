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

public val CssGgIcons.Browse: ImageVector
    get() {
        if (_browse != null) {
            return _browse!!
        }
        _browse = Builder(name = "Browse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.364f, 13.1214f)
                curveTo(15.2876f, 14.045f, 15.4831f, 15.4211f, 14.9504f, 16.5362f)
                lineTo(16.4853f, 18.0711f)
                curveTo(16.8758f, 18.4616f, 16.8758f, 19.0948f, 16.4853f, 19.4853f)
                curveTo(16.0948f, 19.8758f, 15.4616f, 19.8758f, 15.0711f, 19.4853f)
                lineTo(13.5361f, 17.9504f)
                curveTo(12.421f, 18.4831f, 11.045f, 18.2876f, 10.1213f, 17.364f)
                curveTo(8.9497f, 16.1924f, 8.9497f, 14.2929f, 10.1213f, 13.1214f)
                curveTo(11.2929f, 11.9498f, 13.1924f, 11.9498f, 14.364f, 13.1214f)
                close()
                moveTo(12.9497f, 15.9498f)
                curveTo(13.3403f, 15.5593f, 13.3403f, 14.9261f, 12.9497f, 14.5356f)
                curveTo(12.5592f, 14.145f, 11.9261f, 14.145f, 11.5355f, 14.5356f)
                curveTo(11.145f, 14.9261f, 11.145f, 15.5593f, 11.5355f, 15.9498f)
                curveTo(11.9261f, 16.3403f, 12.5592f, 16.3403f, 12.9497f, 15.9498f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 4.0f)
                curveTo(4.0f, 2.3431f, 5.3432f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 1.0f, 20.0f, 2.3431f, 20.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 21.6569f, 18.6569f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(7.0f)
                curveTo(5.3432f, 23.0f, 4.0f, 21.6569f, 4.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(7.0f, 3.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 3.0f, 18.0f, 3.4477f, 18.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 20.5523f, 17.5523f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 21.0f, 6.0f, 20.5523f, 6.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 3.4477f, 6.4477f, 3.0f, 7.0f, 3.0f)
                close()
            }
        }
        .build()
        return _browse!!
    }

private var _browse: ImageVector? = null
