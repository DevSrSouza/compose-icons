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

public val CssGgIcons.EditShadows: ImageVector
    get() {
        if (_editShadows != null) {
            return _editShadows!!
        }
        _editShadows = Builder(name = "EditShadows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3056f, 6.9919f)
                curveTo(14.3578f, 6.365f, 13.2215f, 6.0f, 12.0f, 6.0f)
                curveTo(8.6863f, 6.0f, 6.0f, 8.6863f, 6.0f, 12.0f)
                curveTo(6.0f, 15.3137f, 8.6863f, 18.0f, 12.0f, 18.0f)
                curveTo(13.2267f, 18.0f, 14.3675f, 17.6318f, 15.3178f, 17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(16.4722f)
                curveTo(16.9906f, 15.4208f, 17.3981f, 14.7404f, 17.6614f, 13.9919f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.9919f)
                horizontalLineTo(17.9184f)
                curveTo(17.9721f, 12.6693f, 18.0f, 12.3379f, 18.0f, 12.0f)
                curveTo(18.0f, 11.6683f, 17.9731f, 11.3428f, 17.9213f, 11.0258f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0258f)
                horizontalLineTo(17.6676f)
                curveTo(17.4033f, 9.2669f, 16.9909f, 8.5774f, 16.465f, 7.9919f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.9919f)
                horizontalLineTo(15.3056f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _editShadows!!
    }

private var _editShadows: ImageVector? = null
