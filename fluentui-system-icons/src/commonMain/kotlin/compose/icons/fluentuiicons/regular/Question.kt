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

public val RegularGroup.Question: ImageVector
    get() {
        if (_question != null) {
            return _question!!
        }
        _question = Builder(name = "Question", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(9.2358f, 4.0f, 7.0f, 6.2358f, 7.0f, 9.0f)
                curveTo(7.0f, 9.4142f, 7.3358f, 9.75f, 7.75f, 9.75f)
                curveTo(8.1642f, 9.75f, 8.5f, 9.4142f, 8.5f, 9.0f)
                curveTo(8.5f, 7.0642f, 10.0642f, 5.5f, 12.0f, 5.5f)
                curveTo(13.9358f, 5.5f, 15.5f, 7.0642f, 15.5f, 9.0f)
                curveTo(15.5f, 9.8518f, 15.2785f, 10.4195f, 14.9711f, 10.8595f)
                curveTo(14.6472f, 11.3232f, 14.2043f, 11.6827f, 13.6694f, 12.0917f)
                curveTo(13.624f, 12.1264f, 13.578f, 12.1615f, 13.5313f, 12.1969f)
                curveTo(12.5209f, 12.9651f, 11.25f, 13.9312f, 11.25f, 16.0f)
                verticalLineTo(16.25f)
                curveTo(11.25f, 16.6642f, 11.5858f, 17.0f, 12.0f, 17.0f)
                curveTo(12.4142f, 17.0f, 12.75f, 16.6642f, 12.75f, 16.25f)
                verticalLineTo(16.0f)
                curveTo(12.75f, 14.6827f, 13.464f, 14.1369f, 14.5353f, 13.3179f)
                lineTo(14.5806f, 13.2833f)
                curveTo(15.1082f, 12.8798f, 15.7278f, 12.3955f, 16.2008f, 11.7186f)
                curveTo(16.6902f, 11.018f, 17.0f, 10.1482f, 17.0f, 9.0f)
                curveTo(17.0f, 6.2358f, 14.7642f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(12.5523f, 21.0f, 13.0f, 20.5523f, 13.0f, 20.0f)
                curveTo(13.0f, 19.4477f, 12.5523f, 19.0f, 12.0f, 19.0f)
                curveTo(11.4477f, 19.0f, 11.0f, 19.4477f, 11.0f, 20.0f)
                curveTo(11.0f, 20.5523f, 11.4477f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _question!!
    }

private var _question: ImageVector? = null
