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

public val CssGgIcons.Info: ImageVector
    get() {
        if (_info != null) {
            return _info!!
        }
        _info = Builder(name = "Info", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 10.9794f)
                curveTo(11.0f, 10.4271f, 11.4477f, 9.9794f, 12.0f, 9.9794f)
                curveTo(12.5523f, 9.9794f, 13.0f, 10.4271f, 13.0f, 10.9794f)
                verticalLineTo(16.9794f)
                curveTo(13.0f, 17.5317f, 12.5523f, 17.9794f, 12.0f, 17.9794f)
                curveTo(11.4477f, 17.9794f, 11.0f, 17.5317f, 11.0f, 16.9794f)
                verticalLineTo(10.9794f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0511f)
                curveTo(11.4477f, 6.0511f, 11.0f, 6.4989f, 11.0f, 7.0511f)
                curveTo(11.0f, 7.6034f, 11.4477f, 8.0512f, 12.0f, 8.0512f)
                curveTo(12.5523f, 8.0512f, 13.0f, 7.6034f, 13.0f, 7.0511f)
                curveTo(13.0f, 6.4989f, 12.5523f, 6.0511f, 12.0f, 6.0511f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(16.4183f, 20.0f, 20.0f, 16.4183f, 20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _info!!
    }

private var _info: ImageVector? = null
