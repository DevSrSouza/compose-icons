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

public val FilledGroup.MyLocation: ImageVector
    get() {
        if (_myLocation != null) {
            return _myLocation!!
        }
        _myLocation = Builder(name = "MyLocation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(12.5128f, 2.0f, 12.9355f, 2.386f, 12.9933f, 2.8834f)
                lineTo(13.0f, 3.0f)
                lineTo(13.0003f, 4.314f)
                curveTo(16.4809f, 4.7625f, 19.2381f, 7.52f, 19.6862f, 11.0007f)
                lineTo(21.0f, 11.0f)
                curveTo(21.5523f, 11.0f, 22.0f, 11.4477f, 22.0f, 12.0f)
                curveTo(22.0f, 12.5128f, 21.614f, 12.9355f, 21.1166f, 12.9933f)
                lineTo(21.0f, 13.0f)
                lineTo(19.686f, 13.0003f)
                curveTo(19.2375f, 16.4805f, 16.4805f, 19.2375f, 13.0003f, 19.686f)
                lineTo(13.0f, 21.0f)
                curveTo(13.0f, 21.5523f, 12.5523f, 22.0f, 12.0f, 22.0f)
                curveTo(11.4872f, 22.0f, 11.0645f, 21.614f, 11.0067f, 21.1166f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0007f, 19.6862f)
                curveTo(7.52f, 19.2381f, 4.7625f, 16.4809f, 4.314f, 13.0003f)
                lineTo(3.0f, 13.0f)
                curveTo(2.4477f, 13.0f, 2.0f, 12.5523f, 2.0f, 12.0f)
                curveTo(2.0f, 11.4872f, 2.386f, 11.0645f, 2.8834f, 11.0067f)
                lineTo(3.0f, 11.0f)
                lineTo(4.3138f, 11.0007f)
                curveTo(4.762f, 7.5196f, 7.5196f, 4.762f, 11.0007f, 4.3138f)
                lineTo(11.0f, 3.0f)
                curveTo(11.0f, 2.4477f, 11.4477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 6.25f)
                curveTo(8.8244f, 6.25f, 6.25f, 8.8244f, 6.25f, 12.0f)
                curveTo(6.25f, 15.1756f, 8.8244f, 17.75f, 12.0f, 17.75f)
                curveTo(15.1756f, 17.75f, 17.75f, 15.1756f, 17.75f, 12.0f)
                curveTo(17.75f, 8.8244f, 15.1756f, 6.25f, 12.0f, 6.25f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(14.2091f, 8.0f, 16.0f, 9.7909f, 16.0f, 12.0f)
                curveTo(16.0f, 14.2091f, 14.2091f, 16.0f, 12.0f, 16.0f)
                curveTo(9.7909f, 16.0f, 8.0f, 14.2091f, 8.0f, 12.0f)
                curveTo(8.0f, 9.7909f, 9.7909f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _myLocation!!
    }

private var _myLocation: ImageVector? = null
