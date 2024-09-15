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
                moveTo(17.051f, 4.322f)
                lineTo(18.466f, 5.736f)
                lineTo(14.223f, 9.979f)
                lineTo(18.466f, 14.221f)
                lineTo(17.051f, 15.635f)
                lineTo(11.395f, 9.979f)
                lineTo(17.051f, 4.322f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.949f, 19.678f)
                lineTo(5.534f, 18.264f)
                lineTo(9.777f, 14.022f)
                lineTo(5.534f, 9.779f)
                lineTo(6.949f, 8.365f)
                lineTo(12.606f, 14.022f)
                lineTo(6.949f, 19.678f)
                close()
            }
        }
        .build()
        return _remote!!
    }

private var _remote: ImageVector? = null
