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

public val CssGgIcons.ArrowTopLeft: ImageVector
    get() {
        if (_arrowTopLeft != null) {
            return _arrowTopLeft!!
        }
        _arrowTopLeft = Builder(name = "ArrowTopLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.475f, 5.495f)
                lineTo(13.479f, 7.495f)
                lineTo(8.922f, 7.505f)
                lineTo(18.525f, 17.09f)
                lineTo(17.112f, 18.505f)
                lineTo(7.483f, 8.895f)
                lineTo(7.493f, 13.509f)
                lineTo(5.493f, 13.513f)
                lineTo(5.475f, 5.513f)
                lineTo(13.475f, 5.495f)
                close()
            }
        }
        .build()
        return _arrowTopLeft!!
    }

private var _arrowTopLeft: ImageVector? = null
