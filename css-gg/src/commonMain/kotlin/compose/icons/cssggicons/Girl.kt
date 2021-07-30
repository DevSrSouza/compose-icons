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

public val CssGgIcons.Girl: ImageVector
    get() {
        if (_girl != null) {
            return _girl!!
        }
        _girl = Builder(name = "Girl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 12.5523f, 9.5523f, 13.0f, 9.0f, 13.0f)
                curveTo(8.4477f, 13.0f, 8.0f, 12.5523f, 8.0f, 12.0f)
                curveTo(8.0f, 11.4477f, 8.4477f, 11.0f, 9.0f, 11.0f)
                curveTo(9.5523f, 11.0f, 10.0f, 11.4477f, 10.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                curveTo(15.5523f, 13.0f, 16.0f, 12.5523f, 16.0f, 12.0f)
                curveTo(16.0f, 11.4477f, 15.5523f, 11.0f, 15.0f, 11.0f)
                curveTo(14.4477f, 11.0f, 14.0f, 11.4477f, 14.0f, 12.0f)
                curveTo(14.0f, 12.5523f, 14.4477f, 13.0f, 15.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0244f, 2.0f)
                lineTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.7424f, 17.9425f, 2.4324f, 12.788f, 2.0306f)
                lineTo(12.7886f, 2.0282f)
                curveTo(12.5329f, 2.0089f, 12.278f, 1.9996f, 12.0244f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 11.3014f, 19.9105f, 10.6237f, 19.7422f, 9.9777f)
                curveTo(16.1597f, 10.2313f, 12.7359f, 8.5246f, 10.7605f, 5.6025f)
                curveTo(9.3132f, 7.0789f, 7.2982f, 7.9967f, 5.0688f, 8.0025f)
                curveTo(4.389f, 9.1787f, 4.0f, 10.5439f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(11.9785f, 4.0f)
                lineTo(12.0236f, 4.0f)
                lineTo(12.0f, 4.0f)
                lineTo(11.9785f, 4.0f)
                close()
            }
        }
        .build()
        return _girl!!
    }

private var _girl: ImageVector? = null
