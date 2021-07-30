package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Pocket: ImageVector
    get() {
        if (_pocket != null) {
            return _pocket!!
        }
        _pocket = Builder(name = "Pocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 15.9706f, 16.9706f, 20.0f, 12.0f, 20.0f)
                curveTo(7.0294f, 20.0f, 3.0f, 15.9706f, 3.0f, 11.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(1.0f, 2.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 17.0751f, 18.0751f, 22.0f, 12.0f, 22.0f)
                curveTo(5.9249f, 22.0f, 1.0f, 17.0751f, 1.0f, 11.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.2929f, 14.6935f)
                curveTo(11.6834f, 15.084f, 12.3166f, 15.084f, 12.7071f, 14.6935f)
                lineTo(16.9497f, 10.4508f)
                curveTo(17.3403f, 10.0603f, 17.3403f, 9.4271f, 16.9497f, 9.0366f)
                curveTo(16.5592f, 8.6461f, 15.9261f, 8.6461f, 15.5355f, 9.0366f)
                lineTo(12.0f, 12.5721f)
                lineTo(8.4645f, 9.0366f)
                curveTo(8.0739f, 8.6461f, 7.4408f, 8.6461f, 7.0503f, 9.0366f)
                curveTo(6.6597f, 9.4271f, 6.6597f, 10.0603f, 7.0503f, 10.4508f)
                lineTo(11.2929f, 14.6935f)
                close()
            }
        }
        .build()
        return _pocket!!
    }

private var _pocket: ImageVector? = null
