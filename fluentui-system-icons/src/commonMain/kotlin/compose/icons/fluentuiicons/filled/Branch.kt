package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Branch: ImageVector
    get() {
        if (_branch != null) {
            return _branch!!
        }
        _branch = Builder(name = "Branch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.5f)
                curveTo(4.0f, 3.567f, 5.567f, 2.0f, 7.5f, 2.0f)
                curveTo(9.433f, 2.0f, 11.0f, 3.567f, 11.0f, 5.5f)
                curveTo(11.0f, 7.0896f, 9.9403f, 8.4316f, 8.4889f, 8.8583f)
                curveTo(9.1768f, 11.1112f, 11.272f, 12.75f, 13.75f, 12.75f)
                horizontalLineTo(14.0805f)
                curveTo(14.4239f, 11.1774f, 15.8244f, 10.0f, 17.5f, 10.0f)
                curveTo(19.433f, 10.0f, 21.0f, 11.567f, 21.0f, 13.5f)
                curveTo(21.0f, 15.433f, 19.433f, 17.0f, 17.5f, 17.0f)
                curveTo(15.8244f, 17.0f, 14.4239f, 15.8226f, 14.0805f, 14.25f)
                horizontalLineTo(13.75f)
                curveTo(11.519f, 14.25f, 9.5318f, 13.2063f, 8.25f, 11.5806f)
                lineTo(8.25f, 15.0805f)
                curveTo(9.8226f, 15.4239f, 11.0f, 16.8244f, 11.0f, 18.5f)
                curveTo(11.0f, 20.433f, 9.433f, 22.0f, 7.5f, 22.0f)
                curveTo(5.567f, 22.0f, 4.0f, 20.433f, 4.0f, 18.5f)
                curveTo(4.0f, 16.8244f, 5.1774f, 15.4239f, 6.75f, 15.0805f)
                lineTo(6.75f, 8.9195f)
                curveTo(5.1774f, 8.5761f, 4.0f, 7.1756f, 4.0f, 5.5f)
                close()
            }
        }
        .build()
        return _branch!!
    }

private var _branch: ImageVector? = null
