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

public val FilledGroup.DocumentSearch: ImageVector
    get() {
        if (_documentSearch != null) {
            return _documentSearch!!
        }
        _documentSearch = Builder(name = "DocumentSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                curveTo(5.8954f, 2.0f, 5.0f, 2.8954f, 5.0f, 4.0f)
                verticalLineTo(9.3027f)
                curveTo(5.8825f, 8.7922f, 6.9071f, 8.5f, 8.0f, 8.5f)
                curveTo(11.3137f, 8.5f, 14.0f, 11.1863f, 14.0f, 14.5f)
                curveTo(14.0f, 15.5847f, 13.7114f, 16.6036f, 13.2072f, 17.4824f)
                lineTo(16.7374f, 21.0126f)
                curveTo(17.0154f, 21.2905f, 17.1803f, 21.6387f, 17.2322f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1046f, 22.0f, 21.0f, 21.1046f, 21.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                curveTo(13.8954f, 10.0f, 13.0f, 9.1046f, 13.0f, 8.0f)
                close()
                moveTo(14.9697f, 22.7803f)
                curveTo(15.2626f, 23.0732f, 15.7374f, 23.0732f, 16.0303f, 22.7803f)
                curveTo(16.2414f, 22.5693f, 16.3003f, 22.2638f, 16.2073f, 22.0f)
                curveTo(16.1712f, 21.8976f, 16.1122f, 21.8015f, 16.0303f, 21.7197f)
                lineTo(11.9177f, 17.607f)
                curveTo(12.5953f, 16.7538f, 13.0f, 15.6742f, 13.0f, 14.5f)
                curveTo(13.0f, 13.1373f, 12.4548f, 11.9019f, 11.5707f, 11.0f)
                curveTo(10.6633f, 10.0743f, 9.3987f, 9.5f, 8.0f, 9.5f)
                curveTo(6.8744f, 9.5f, 5.8357f, 9.8719f, 5.0f, 10.4996f)
                curveTo(3.7856f, 11.4118f, 3.0f, 12.8642f, 3.0f, 14.5f)
                curveTo(3.0f, 17.2614f, 5.2386f, 19.5f, 8.0f, 19.5f)
                curveTo(9.0458f, 19.5f, 10.0166f, 19.1789f, 10.8193f, 18.6299f)
                lineTo(14.9697f, 22.7803f)
                close()
                moveTo(8.0f, 11.0f)
                curveTo(9.933f, 11.0f, 11.5f, 12.567f, 11.5f, 14.5f)
                curveTo(11.5f, 16.433f, 9.933f, 18.0f, 8.0f, 18.0f)
                curveTo(6.067f, 18.0f, 4.5f, 16.433f, 4.5f, 14.5f)
                curveTo(4.5f, 12.567f, 6.067f, 11.0f, 8.0f, 11.0f)
                close()
                moveTo(14.5f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(20.5f, 8.5f)
                horizontalLineTo(15.0f)
                curveTo(14.7239f, 8.5f, 14.5f, 8.2761f, 14.5f, 8.0f)
                close()
            }
        }
        .build()
        return _documentSearch!!
    }

private var _documentSearch: ImageVector? = null
