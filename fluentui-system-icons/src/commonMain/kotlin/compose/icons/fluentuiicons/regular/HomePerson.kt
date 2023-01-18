package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.HomePerson: ImageVector
    get() {
        if (_homePerson != null) {
            return _homePerson!!
        }
        _homePerson = Builder(name = "HomePerson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5495f, 2.5321f)
                curveTo(11.3874f, 1.8255f, 12.6126f, 1.8255f, 13.4505f, 2.5321f)
                lineTo(20.2005f, 8.2242f)
                curveTo(20.7074f, 8.6518f, 21.0f, 9.2811f, 21.0f, 9.9443f)
                verticalLineTo(12.0505f)
                curveTo(20.5901f, 11.6322f, 20.0762f, 11.3164f, 19.5f, 11.1449f)
                verticalLineTo(9.9443f)
                curveTo(19.5f, 9.7233f, 19.4025f, 9.5135f, 19.2335f, 9.3709f)
                lineTo(12.4835f, 3.6788f)
                curveTo(12.2042f, 3.4433f, 11.7958f, 3.4433f, 11.5165f, 3.6788f)
                lineTo(4.7665f, 9.3709f)
                curveTo(4.5975f, 9.5135f, 4.5f, 9.7233f, 4.5f, 9.9443f)
                verticalLineTo(19.7471f)
                curveTo(4.5f, 19.8851f, 4.6119f, 19.9971f, 4.75f, 19.9971f)
                horizontalLineTo(8.25f)
                curveTo(8.3881f, 19.9971f, 8.5f, 19.8851f, 8.5f, 19.7471f)
                verticalLineTo(14.2471f)
                curveTo(8.5f, 13.2806f, 9.2835f, 12.4971f, 10.25f, 12.4971f)
                horizontalLineTo(13.75f)
                curveTo(13.7842f, 12.4971f, 13.8182f, 12.4981f, 13.852f, 12.5f)
                horizontalLineTo(15.6273f)
                curveTo(15.3222f, 12.9375f, 15.1144f, 13.448f, 15.0354f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.9971f)
                horizontalLineTo(10.25f)
                curveTo(10.1119f, 13.9971f, 10.0f, 14.109f, 10.0f, 14.2471f)
                verticalLineTo(19.7471f)
                curveTo(10.0f, 20.7136f, 9.2165f, 21.4971f, 8.25f, 21.4971f)
                horizontalLineTo(4.75f)
                curveTo(3.7835f, 21.4971f, 3.0f, 20.7136f, 3.0f, 19.7471f)
                verticalLineTo(9.9443f)
                curveTo(3.0f, 9.2811f, 3.2926f, 8.6518f, 3.7995f, 8.2242f)
                lineTo(10.5495f, 2.5321f)
                close()
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _homePerson!!
    }

private var _homePerson: ImageVector? = null
