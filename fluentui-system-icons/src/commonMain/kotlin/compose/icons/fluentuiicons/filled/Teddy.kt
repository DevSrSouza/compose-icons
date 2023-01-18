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

public val FilledGroup.Teddy: ImageVector
    get() {
        if (_teddy != null) {
            return _teddy!!
        }
        _teddy = Builder(name = "Teddy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.207f, 10.2714f)
                curveTo(2.7612f, 9.6262f, 2.5f, 8.8436f, 2.5f, 8.0f)
                curveTo(2.5f, 5.7909f, 4.2909f, 4.0f, 6.5f, 4.0f)
                curveTo(7.6723f, 4.0f, 8.7268f, 4.5043f, 9.4584f, 5.3078f)
                curveTo(6.6252f, 6.0097f, 4.3139f, 7.857f, 3.207f, 10.2714f)
                close()
                moveTo(14.5416f, 5.3078f)
                curveTo(15.2732f, 4.5043f, 16.3277f, 4.0f, 17.5f, 4.0f)
                curveTo(19.7091f, 4.0f, 21.5f, 5.7909f, 21.5f, 8.0f)
                curveTo(21.5f, 8.8436f, 21.2388f, 9.6262f, 20.793f, 10.2714f)
                curveTo(19.6861f, 7.857f, 17.3748f, 6.0097f, 14.5416f, 5.3078f)
                close()
                moveTo(6.6284f, 19.3129f)
                curveTo(4.7191f, 17.9376f, 3.5f, 15.8444f, 3.5f, 13.5f)
                curveTo(3.5f, 9.3579f, 7.3056f, 6.0f, 12.0f, 6.0f)
                curveTo(16.6944f, 6.0f, 20.5f, 9.3579f, 20.5f, 13.5f)
                curveTo(20.5f, 15.8444f, 19.2809f, 17.9376f, 17.3716f, 19.3129f)
                curveTo(17.1194f, 18.1667f, 16.5097f, 17.1545f, 15.6654f, 16.3993f)
                curveTo(14.6925f, 15.5291f, 13.408f, 15.0f, 12.0f, 15.0f)
                curveTo(9.37f, 15.0f, 7.1712f, 16.8459f, 6.6284f, 19.3129f)
                close()
                moveTo(14.9987f, 17.1447f)
                curveTo(14.5469f, 16.7406f, 14.0233f, 16.4342f, 13.4563f, 16.2406f)
                curveTo(13.2948f, 16.6767f, 12.704f, 17.0f, 12.0f, 17.0f)
                curveTo(11.2961f, 17.0f, 10.7055f, 16.6768f, 10.5438f, 16.2408f)
                curveTo(8.9596f, 16.7823f, 7.7737f, 18.1828f, 7.5415f, 19.8866f)
                curveTo(8.8376f, 20.5926f, 10.3649f, 21.0f, 12.0f, 21.0f)
                curveTo(13.6351f, 21.0f, 15.1623f, 20.5926f, 16.4585f, 19.8867f)
                curveTo(16.3139f, 18.8253f, 15.7967f, 17.8585f, 14.9987f, 17.1447f)
                close()
            }
        }
        .build()
        return _teddy!!
    }

private var _teddy: ImageVector? = null
