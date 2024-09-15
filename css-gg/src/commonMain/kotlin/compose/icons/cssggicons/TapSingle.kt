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

public val CssGgIcons.TapSingle: ImageVector
    get() {
        if (_tapSingle != null) {
            return _tapSingle!!
        }
        _tapSingle = Builder(name = "TapSingle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.049f, 3.114f)
                curveTo(14.193f, 3.114f, 16.139f, 3.957f, 17.576f, 5.33f)
                lineTo(16.161f, 6.744f)
                curveTo(15.087f, 5.733f, 13.64f, 5.114f, 12.049f, 5.114f)
                curveTo(10.409f, 5.114f, 8.922f, 5.772f, 7.839f, 6.839f)
                lineTo(6.424f, 5.425f)
                curveTo(7.87f, 3.996f, 9.856f, 3.114f, 12.049f, 3.114f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.977f, 11.886f)
                curveTo(10.977f, 11.334f, 11.424f, 10.886f, 11.977f, 10.886f)
                curveTo(12.529f, 10.886f, 12.977f, 11.334f, 12.977f, 11.886f)
                verticalLineTo(13.886f)
                horizontalLineTo(10.977f)
                verticalLineTo(11.886f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.977f, 6.886f)
                curveTo(9.215f, 6.886f, 6.977f, 9.125f, 6.977f, 11.886f)
                verticalLineTo(15.886f)
                curveTo(6.977f, 18.647f, 9.215f, 20.886f, 11.977f, 20.886f)
                curveTo(14.738f, 20.886f, 16.977f, 18.647f, 16.977f, 15.886f)
                verticalLineTo(11.886f)
                curveTo(16.977f, 9.125f, 14.738f, 6.886f, 11.977f, 6.886f)
                close()
                moveTo(14.977f, 15.886f)
                verticalLineTo(11.886f)
                curveTo(14.977f, 10.229f, 13.634f, 8.886f, 11.977f, 8.886f)
                curveTo(10.32f, 8.886f, 8.977f, 10.229f, 8.977f, 11.886f)
                verticalLineTo(15.886f)
                curveTo(8.977f, 17.543f, 10.32f, 18.886f, 11.977f, 18.886f)
                curveTo(13.634f, 18.886f, 14.977f, 17.543f, 14.977f, 15.886f)
                close()
            }
        }
        .build()
        return _tapSingle!!
    }

private var _tapSingle: ImageVector? = null
