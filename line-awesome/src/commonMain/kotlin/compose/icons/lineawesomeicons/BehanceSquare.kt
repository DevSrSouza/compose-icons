package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BehanceSquare: ImageVector
    get() {
        if (_behanceSquare != null) {
            return _behanceSquare!!
        }
        _behanceSquare = Builder(name = "BehanceSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(9.0f, 11.3691f)
                lineTo(9.0f, 19.9805f)
                lineTo(13.1797f, 19.9805f)
                curveTo(14.7397f, 19.9705f, 16.2109f, 19.2207f, 16.2109f, 17.4707f)
                curveTo(16.2109f, 16.3807f, 15.6906f, 15.4602f, 14.6406f, 15.1602f)
                curveTo(15.4106f, 14.7802f, 15.8105f, 14.36f, 15.8105f, 13.5f)
                curveTo(15.8105f, 11.78f, 14.5405f, 11.3691f, 13.0605f, 11.3691f)
                lineTo(9.0f, 11.3691f)
                close()
                moveTo(18.1406f, 12.0f)
                lineTo(18.1406f, 12.8496f)
                lineTo(21.6191f, 12.8496f)
                lineTo(21.6191f, 12.0f)
                lineTo(18.1406f, 12.0f)
                close()
                moveTo(10.9004f, 12.6895f)
                lineTo(12.6797f, 12.6895f)
                curveTo(13.3497f, 12.6895f, 13.9707f, 12.8799f, 13.9707f, 13.6699f)
                curveTo(13.9707f, 14.3999f, 13.4905f, 14.6992f, 12.8105f, 14.6992f)
                lineTo(10.9004f, 14.6992f)
                lineTo(10.9004f, 12.6895f)
                close()
                moveTo(19.9609f, 13.4297f)
                curveTo(18.0709f, 13.4297f, 16.7793f, 14.8407f, 16.7793f, 16.7207f)
                curveTo(16.7793f, 18.6607f, 17.9909f, 20.0f, 19.9609f, 20.0f)
                curveTo(21.4509f, 20.0f, 22.4209f, 19.3304f, 22.8809f, 17.9004f)
                lineTo(21.3691f, 17.9004f)
                curveTo(21.1991f, 18.4304f, 20.5395f, 18.7109f, 20.0195f, 18.7109f)
                curveTo(19.0095f, 18.7109f, 18.4902f, 18.1209f, 18.4902f, 17.1309f)
                lineTo(22.9805f, 17.1309f)
                curveTo(22.9905f, 17.0309f, 23.0f, 16.9108f, 23.0f, 16.8008f)
                curveTo(23.0f, 14.9608f, 21.9109f, 13.4297f, 19.9609f, 13.4297f)
                close()
                moveTo(19.9004f, 14.7109f)
                curveTo(20.7704f, 14.7109f, 21.1995f, 15.2208f, 21.2695f, 16.0508f)
                lineTo(18.4902f, 16.0508f)
                curveTo(18.5402f, 15.2308f, 19.0804f, 14.7109f, 19.9004f, 14.7109f)
                close()
                moveTo(10.8906f, 16.1309f)
                lineTo(12.9609f, 16.1309f)
                curveTo(13.7909f, 16.1309f, 14.3203f, 16.4791f, 14.3203f, 17.3691f)
                curveTo(14.3203f, 18.2291f, 13.6899f, 18.5f, 12.9199f, 18.5f)
                lineTo(10.8906f, 18.5f)
                lineTo(10.8906f, 16.1309f)
                close()
            }
        }
        .build()
        return _behanceSquare!!
    }

private var _behanceSquare: ImageVector? = null
