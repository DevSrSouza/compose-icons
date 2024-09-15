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
                moveTo(10.525f, 5.495f)
                lineTo(10.521f, 7.495f)
                lineTo(15.078f, 7.505f)
                lineTo(5.475f, 17.09f)
                lineTo(6.888f, 18.505f)
                lineTo(16.517f, 8.895f)
                lineTo(16.507f, 13.509f)
                lineTo(18.507f, 13.513f)
                lineTo(18.525f, 5.513f)
                lineTo(10.525f, 5.495f)
                close()
            }
        }
        .build()
        return _arrowTopRight!!
    }

private var _arrowTopRight: ImageVector? = null
