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

public val CssGgIcons.ColorBucket: ImageVector
    get() {
        if (_colorBucket != null) {
            return _colorBucket!!
        }
        _colorBucket = Builder(name = "ColorBucket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.2035f, 2.0038f)
                curveTo(9.4641f, 2.0038f, 10.5067f, 3.1074f, 10.6786f, 4.5424f)
                lineTo(19.1622f, 13.0259f)
                lineTo(11.384f, 20.8041f)
                curveTo(10.2124f, 21.9757f, 8.3129f, 21.9757f, 7.1413f, 20.8041f)
                lineTo(2.8987f, 16.5615f)
                curveTo(1.7271f, 15.3899f, 1.7271f, 13.4904f, 2.8987f, 12.3188f)
                lineTo(5.7035f, 9.514f)
                verticalLineTo(4.961f)
                curveTo(5.7035f, 3.3278f, 6.8228f, 2.0038f, 8.2035f, 2.0038f)
                close()
                moveTo(8.7035f, 4.961f)
                verticalLineTo(6.514f)
                lineTo(7.7035f, 7.514f)
                verticalLineTo(4.961f)
                curveTo(7.7035f, 4.6343f, 7.9273f, 4.3696f, 8.2035f, 4.3696f)
                curveTo(8.4796f, 4.3696f, 8.7035f, 4.6343f, 8.7035f, 4.961f)
                close()
                moveTo(8.7035f, 10.8754f)
                verticalLineTo(9.3425f)
                lineTo(4.3129f, 13.733f)
                curveTo(3.9224f, 14.1236f, 3.9224f, 14.7567f, 4.3129f, 15.1473f)
                lineTo(8.5555f, 19.3899f)
                curveTo(8.9461f, 19.7804f, 9.5792f, 19.7804f, 9.9698f, 19.3899f)
                lineTo(16.3337f, 13.0259f)
                lineTo(10.7035f, 7.3957f)
                verticalLineTo(10.8754f)
                curveTo(10.7035f, 10.9184f, 10.7027f, 10.9612f, 10.7012f, 11.0038f)
                horizontalLineTo(8.6917f)
                curveTo(8.6994f, 10.9625f, 8.7035f, 10.9195f, 8.7035f, 10.8754f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8586f, 16.8749f)
                curveTo(15.687f, 18.0465f, 15.687f, 19.946f, 16.8586f, 21.1175f)
                curveTo(18.0302f, 22.2891f, 19.9297f, 22.2891f, 21.1013f, 21.1175f)
                curveTo(22.2728f, 19.946f, 22.2728f, 18.0465f, 21.1013f, 16.8749f)
                lineTo(18.9799f, 14.7536f)
                lineTo(16.8586f, 16.8749f)
                close()
            }
        }
        .build()
        return _colorBucket!!
    }

private var _colorBucket: ImageVector? = null
