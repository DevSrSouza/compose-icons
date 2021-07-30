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

public val LineAwesomeIcons.HistorySolid: ImageVector
    get() {
        if (_historySolid != null) {
            return _historySolid!!
        }
        _historySolid = Builder(name = "HistorySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(11.832f, 4.0f, 8.1523f, 6.1133f, 6.0f, 9.3438f)
                lineTo(6.0f, 6.0f)
                lineTo(4.0f, 6.0f)
                lineTo(4.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 11.0f)
                lineTo(7.375f, 11.0f)
                curveTo(9.1016f, 8.0195f, 12.2969f, 6.0f, 16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(15.0f, 17.0f)
                lineTo(22.0f, 17.0f)
                lineTo(22.0f, 15.0f)
                lineTo(17.0f, 15.0f)
                lineTo(17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _historySolid!!
    }

private var _historySolid: ImageVector? = null
