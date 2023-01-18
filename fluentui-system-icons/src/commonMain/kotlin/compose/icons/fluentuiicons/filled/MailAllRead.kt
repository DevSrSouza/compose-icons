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

public val FilledGroup.MailAllRead: ImageVector
    get() {
        if (_mailAllRead != null) {
            return _mailAllRead!!
        }
        _mailAllRead = Builder(name = "MailAllRead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3591f, 1.8416f)
                curveTo(11.1353f, 1.7195f, 10.8647f, 1.7195f, 10.6409f, 1.8416f)
                lineTo(2.8298f, 6.1021f)
                curveTo(2.6623f, 6.1935f, 2.5156f, 6.3124f, 2.3939f, 6.4515f)
                lineTo(11.0f, 11.1457f)
                lineTo(19.6061f, 6.4515f)
                curveTo(19.4844f, 6.3124f, 19.3377f, 6.1935f, 19.1702f, 6.1021f)
                lineTo(11.3591f, 1.8416f)
                close()
                moveTo(2.0f, 15.75f)
                verticalLineTo(7.9452f)
                lineTo(10.6409f, 12.6584f)
                curveTo(10.8647f, 12.7805f, 11.1353f, 12.7805f, 11.3591f, 12.6584f)
                lineTo(20.0f, 7.9452f)
                verticalLineTo(15.75f)
                curveTo(20.0f, 17.5449f, 18.5449f, 19.0f, 16.75f, 19.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 19.0f, 2.0f, 17.5449f, 2.0f, 15.75f)
                close()
                moveTo(21.001f, 7.5112f)
                curveTo(21.9028f, 8.0888f, 22.5005f, 9.0996f, 22.5005f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(22.5005f, 19.1495f, 20.15f, 21.5f, 17.2505f, 21.5f)
                horizontalLineTo(8.2505f)
                curveTo(7.1001f, 21.5f, 6.0893f, 20.9023f, 5.5117f, 20.0005f)
                lineTo(17.2505f, 20.0f)
                curveTo(19.3215f, 20.0f, 21.0005f, 18.321f, 21.0005f, 16.25f)
                lineTo(21.001f, 7.5112f)
                close()
            }
        }
        .build()
        return _mailAllRead!!
    }

private var _mailAllRead: ImageVector? = null
