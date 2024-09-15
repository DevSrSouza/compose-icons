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

public val CssGgIcons.ArrowDownO: ImageVector
    get() {
        if (_arrowDownO != null) {
            return _arrowDownO!!
        }
        _arrowDownO = Builder(name = "ArrowDownO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.828f, 12.026f)
                lineTo(16.243f, 13.44f)
                lineTo(12.0f, 17.683f)
                lineTo(7.757f, 13.44f)
                lineTo(9.172f, 12.026f)
                lineTo(11.0f, 13.854f)
                verticalLineTo(6.317f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.854f)
                lineTo(14.828f, 12.026f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.778f, 19.778f)
                curveTo(15.482f, 24.074f, 8.518f, 24.074f, 4.222f, 19.778f)
                curveTo(-0.074f, 15.482f, -0.074f, 8.518f, 4.222f, 4.222f)
                curveTo(8.518f, -0.074f, 15.482f, -0.074f, 19.778f, 4.222f)
                curveTo(24.074f, 8.518f, 24.074f, 15.482f, 19.778f, 19.778f)
                close()
                moveTo(18.364f, 18.364f)
                curveTo(14.849f, 21.879f, 9.151f, 21.879f, 5.636f, 18.364f)
                curveTo(2.121f, 14.849f, 2.121f, 9.151f, 5.636f, 5.636f)
                curveTo(9.151f, 2.121f, 14.849f, 2.121f, 18.364f, 5.636f)
                curveTo(21.879f, 9.151f, 21.879f, 14.849f, 18.364f, 18.364f)
                close()
            }
        }
        .build()
        return _arrowDownO!!
    }

private var _arrowDownO: ImageVector? = null
