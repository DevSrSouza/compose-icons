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

public val CssGgIcons.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.853f, 8.0f)
                curveTo(6.853f, 5.239f, 9.092f, 3.0f, 11.853f, 3.0f)
                curveTo(14.615f, 3.0f, 16.853f, 5.239f, 16.853f, 8.0f)
                curveTo(16.853f, 10.761f, 14.615f, 13.0f, 11.853f, 13.0f)
                curveTo(9.092f, 13.0f, 6.853f, 10.761f, 6.853f, 8.0f)
                close()
                moveTo(11.853f, 11.0f)
                curveTo(10.196f, 11.0f, 8.853f, 9.657f, 8.853f, 8.0f)
                curveTo(8.853f, 6.343f, 10.196f, 5.0f, 11.853f, 5.0f)
                curveTo(13.51f, 5.0f, 14.853f, 6.343f, 14.853f, 8.0f)
                curveTo(14.853f, 9.657f, 13.51f, 11.0f, 11.853f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.129f)
                curveTo(6.252f, 14.203f, 8.419f, 15.662f, 10.941f, 15.949f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.853f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.853f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.941f)
                verticalLineTo(15.927f)
                curveTo(16.845f, 15.396f, 19.853f, 12.049f, 19.853f, 8.0f)
                curveTo(19.853f, 6.436f, 19.405f, 4.978f, 18.629f, 3.745f)
                lineTo(16.925f, 4.793f)
                curveTo(17.513f, 5.721f, 17.853f, 6.821f, 17.853f, 8.0f)
                curveTo(17.853f, 11.314f, 15.167f, 14.0f, 11.853f, 14.0f)
                curveTo(9.666f, 14.0f, 7.752f, 12.83f, 6.704f, 11.081f)
                lineTo(5.0f, 12.129f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
