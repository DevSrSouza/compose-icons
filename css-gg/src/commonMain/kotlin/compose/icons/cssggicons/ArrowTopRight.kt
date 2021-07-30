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

public val CssGgIcons.ArrowTopRight: ImageVector
    get() {
        if (_arrowTopRight != null) {
            return _arrowTopRight!!
        }
        _arrowTopRight = Builder(name = "ArrowTopRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5253f, 5.4948f)
                lineTo(10.5206f, 7.4948f)
                lineTo(15.0782f, 7.5054f)
                lineTo(5.4747f, 17.0896f)
                lineTo(6.8875f, 18.5052f)
                lineTo(16.5173f, 8.8948f)
                lineTo(16.5065f, 13.5088f)
                lineTo(18.5065f, 13.5134f)
                lineTo(18.5253f, 5.5135f)
                lineTo(10.5253f, 5.4948f)
                close()
            }
        }
        .build()
        return _arrowTopRight!!
    }

private var _arrowTopRight: ImageVector? = null
