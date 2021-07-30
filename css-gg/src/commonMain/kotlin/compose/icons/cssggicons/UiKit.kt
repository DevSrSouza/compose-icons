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

public val CssGgIcons.UiKit: ImageVector
    get() {
        if (_uiKit != null) {
            return _uiKit!!
        }
        _uiKit = Builder(name = "UiKit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 6.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4477f, 6.0f, 9.0f, 6.4477f, 9.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(9.0f, 17.5523f, 9.4477f, 18.0f, 10.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5523f, 18.0f, 15.0f, 17.5523f, 15.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(15.0f, 6.4477f, 14.5523f, 6.0f, 14.0f, 6.0f)
                close()
                moveTo(10.0f, 4.0f)
                curveTo(8.3432f, 4.0f, 7.0f, 5.3432f, 7.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(7.0f, 18.6569f, 8.3432f, 20.0f, 10.0f, 20.0f)
                horizontalLineTo(14.0f)
                curveTo(15.6569f, 20.0f, 17.0f, 18.6569f, 17.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 5.3432f, 15.6569f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 7.4594f)
                lineTo(3.4932f, 7.0416f)
                curveTo(1.6646f, 6.7368f, 0.0f, 8.1469f, 0.0f, 10.0007f)
                verticalLineTo(14.918f)
                curveTo(0.0f, 16.7718f, 1.6646f, 18.1819f, 3.4932f, 17.8772f)
                lineTo(6.0f, 17.4594f)
                verticalLineTo(15.4318f)
                lineTo(3.1644f, 15.9044f)
                curveTo(2.5549f, 16.006f, 2.0f, 15.5359f, 2.0f, 14.918f)
                verticalLineTo(10.0007f)
                curveTo(2.0f, 9.3828f, 2.5549f, 8.9128f, 3.1644f, 9.0143f)
                lineTo(6.0f, 9.4869f)
                verticalLineTo(7.4594f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.4594f)
                lineTo(20.5068f, 7.0416f)
                curveTo(22.3354f, 6.7368f, 24.0f, 8.1469f, 24.0f, 10.0007f)
                verticalLineTo(14.918f)
                curveTo(24.0f, 16.7718f, 22.3354f, 18.1819f, 20.5068f, 17.8772f)
                lineTo(18.0f, 17.4594f)
                verticalLineTo(15.4318f)
                lineTo(20.8356f, 15.9044f)
                curveTo(21.4451f, 16.006f, 22.0f, 15.5359f, 22.0f, 14.918f)
                verticalLineTo(10.0007f)
                curveTo(22.0f, 9.3828f, 21.4451f, 8.9128f, 20.8356f, 9.0143f)
                lineTo(18.0f, 9.4869f)
                verticalLineTo(7.4594f)
                close()
            }
        }
        .build()
        return _uiKit!!
    }

private var _uiKit: ImageVector? = null
