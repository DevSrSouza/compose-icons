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

public val CssGgIcons.SwapVertical: ImageVector
    get() {
        if (_swapVertical != null) {
            return _swapVertical!!
        }
        _swapVertical = Builder(name = "SwapVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                horizontalLineTo(13.5f)
                lineTo(13.5f, 10.0f)
                horizontalLineTo(15.5f)
                lineTo(15.5f, 16.0f)
                horizontalLineTo(17.0f)
                lineTo(14.5f, 19.0f)
                lineTo(12.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 8.0f)
                horizontalLineTo(9.5f)
                lineTo(9.5f, 14.0f)
                horizontalLineTo(11.5f)
                lineTo(11.5f, 8.0f)
                horizontalLineTo(13.0f)
                lineTo(10.5f, 5.0f)
                lineTo(8.0f, 8.0f)
                close()
            }
        }
        .build()
        return _swapVertical!!
    }

private var _swapVertical: ImageVector? = null
