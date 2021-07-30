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

public val CssGgIcons.TapDouble: ImageVector
    get() {
        if (_tapDouble != null) {
            return _tapDouble!!
        }
        _tapDouble = Builder(name = "TapDouble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.9236f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(14.9236f, 12.3431f, 13.5804f, 11.0f, 11.9236f, 11.0f)
                curveTo(10.2667f, 11.0f, 8.9235f, 12.3431f, 8.9235f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(8.9235f, 19.6569f, 10.2667f, 21.0f, 11.9236f, 21.0f)
                curveTo(13.5804f, 21.0f, 14.9236f, 19.6569f, 14.9236f, 18.0f)
                close()
                moveTo(11.9236f, 9.0f)
                curveTo(9.1621f, 9.0f, 6.9236f, 11.2386f, 6.9236f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(6.9236f, 20.7614f, 9.1621f, 23.0f, 11.9236f, 23.0f)
                curveTo(14.685f, 23.0f, 16.9236f, 20.7614f, 16.9236f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(16.9236f, 11.2386f, 14.685f, 9.0f, 11.9236f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9236f, 14.0f)
                curveTo(10.9236f, 13.4477f, 11.3713f, 13.0f, 11.9236f, 13.0f)
                curveTo(12.4758f, 13.0f, 12.9236f, 13.4477f, 12.9236f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.9236f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9235f, 1.0f)
                curveTo(14.7023f, 1.0f, 17.2164f, 2.1334f, 19.0286f, 3.9631f)
                lineTo(17.6144f, 5.3773f)
                curveTo(16.1641f, 3.9095f, 14.15f, 3.0f, 11.9235f, 3.0f)
                curveTo(9.7744f, 3.0f, 7.8231f, 3.8475f, 6.3858f, 5.2265f)
                lineTo(4.9713f, 3.8121f)
                curveTo(6.7708f, 2.0712f, 9.2221f, 1.0f, 11.9235f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.9233f, 5.0f)
                curveTo(13.5809f, 5.0f, 15.1038f, 5.5761f, 16.3029f, 6.539f)
                lineTo(14.8768f, 7.9651f)
                curveTo(14.0493f, 7.3583f, 13.0281f, 7.0f, 11.9233f, 7.0f)
                curveTo(10.848f, 7.0f, 9.852f, 7.3394f, 9.0366f, 7.917f)
                lineTo(7.6078f, 6.4882f)
                curveTo(8.7969f, 5.5559f, 10.2952f, 5.0f, 11.9233f, 5.0f)
                close()
            }
        }
        .build()
        return _tapDouble!!
    }

private var _tapDouble: ImageVector? = null
