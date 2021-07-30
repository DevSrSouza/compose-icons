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

public val CssGgIcons.Designmodo: ImageVector
    get() {
        if (_designmodo != null) {
            return _designmodo!!
        }
        _designmodo = Builder(name = "Designmodo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 4.0544f)
                curveTo(4.2386f, 4.0544f, 2.0f, 6.293f, 2.0f, 9.0544f)
                curveTo(2.0f, 11.8159f, 4.2386f, 14.0544f, 7.0f, 14.0544f)
                curveTo(9.7614f, 14.0544f, 12.0f, 11.8159f, 12.0f, 9.0544f)
                curveTo(12.0f, 6.293f, 9.7614f, 4.0544f, 7.0f, 4.0544f)
                close()
                moveTo(5.0f, 9.0544f)
                curveTo(5.0f, 10.159f, 5.8954f, 11.0544f, 7.0f, 11.0544f)
                curveTo(8.1046f, 11.0544f, 9.0f, 10.159f, 9.0f, 9.0544f)
                curveTo(9.0f, 7.9499f, 8.1046f, 7.0544f, 7.0f, 7.0544f)
                curveTo(5.8954f, 7.0544f, 5.0f, 7.9499f, 5.0f, 9.0544f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.5544f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.5544f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.5544f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5503f, 16.9457f)
                curveTo(12.6786f, 16.9457f, 13.6977f, 16.4786f, 14.4249f, 15.7272f)
                curveTo(14.4097f, 15.7429f, 14.3943f, 15.7585f, 14.3788f, 15.774f)
                lineTo(16.5001f, 17.8954f)
                curveTo(15.2334f, 19.1621f, 13.4834f, 19.9457f, 11.5503f, 19.9457f)
                curveTo(9.6173f, 19.9457f, 7.8673f, 19.1622f, 6.6006f, 17.8954f)
                lineTo(8.7219f, 15.7741f)
                curveTo(9.4458f, 16.498f, 10.4458f, 16.9457f, 11.5503f, 16.9457f)
                close()
            }
        }
        .build()
        return _designmodo!!
    }

private var _designmodo: ImageVector? = null
