package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Remote: ImageVector
    get() {
        if (_remote != null) {
            return _remote!!
        }
        _remote = Builder(name = "Remote", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0514f, 4.3218f)
                lineTo(18.4656f, 5.736f)
                lineTo(14.223f, 9.9786f)
                lineTo(18.4656f, 14.2213f)
                lineTo(17.0514f, 15.6355f)
                lineTo(11.3946f, 9.9786f)
                lineTo(17.0514f, 4.3218f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.9486f, 19.6785f)
                lineTo(5.5344f, 18.2643f)
                lineTo(9.7771f, 14.0216f)
                lineTo(5.5344f, 9.779f)
                lineTo(6.9486f, 8.3648f)
                lineTo(12.6055f, 14.0216f)
                lineTo(6.9486f, 19.6785f)
                close()
            }
        }
        .build()
        return _remote!!
    }

private var _remote: ImageVector? = null
