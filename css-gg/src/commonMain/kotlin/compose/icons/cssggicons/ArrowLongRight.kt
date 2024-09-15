package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongRight: ImageVector
    get() {
        if (_arrowLongRight != null) {
            return _arrowLongRight!!
        }
        _arrowLongRight = Builder(name = "ArrowLongRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.068f, 11.993f)
                lineTo(18.818f, 7.757f)
                lineTo(17.406f, 9.174f)
                lineTo(19.242f, 11.003f)
                lineTo(0.932f, 11.001f)
                lineTo(0.932f, 13.001f)
                lineTo(19.237f, 13.003f)
                lineTo(17.416f, 14.831f)
                lineTo(18.832f, 16.243f)
                lineTo(23.068f, 11.993f)
                close()
            }
        }
        .build()
        return _arrowLongRight!!
    }

private var _arrowLongRight: ImageVector? = null
