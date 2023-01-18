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

public val RegularGroup.Ribbon: ImageVector
    get() {
        if (_ribbon != null) {
            return _ribbon!!
        }
        _ribbon = Builder(name = "Ribbon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                curveTo(19.0f, 10.907f, 18.2374f, 12.6359f, 17.0006f, 13.8983f)
                lineTo(16.9992f, 21.2502f)
                curveTo(16.9992f, 21.8221f, 16.3926f, 22.1706f, 15.907f, 21.918f)
                lineTo(15.8175f, 21.8635f)
                lineTo(11.9991f, 19.1757f)
                lineTo(8.1826f, 21.8634f)
                curveTo(7.715f, 22.1927f, 7.0807f, 21.8973f, 7.0077f, 21.3547f)
                lineTo(7.0008f, 21.2502f)
                lineTo(6.9994f, 13.8983f)
                curveTo(5.7626f, 12.6359f, 5.0f, 10.907f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(15.4992f, 19.8051f)
                lineTo(15.4994f, 15.0639f)
                curveTo(14.4699f, 15.6592f, 13.2748f, 16.0f, 12.0f, 16.0f)
                curveTo(10.7252f, 16.0f, 9.5301f, 15.6592f, 8.5006f, 15.0639f)
                lineTo(8.5008f, 19.8047f)
                lineTo(11.5671f, 17.6453f)
                curveTo(11.7937f, 17.4857f, 12.0866f, 17.4657f, 12.3298f, 17.5853f)
                lineTo(12.4306f, 17.6452f)
                lineTo(15.4992f, 19.8051f)
                lineTo(15.4994f, 15.0639f)
                lineTo(15.4992f, 19.8051f)
                close()
                moveTo(12.0f, 3.5f)
                curveTo(8.9624f, 3.5f, 6.5f, 5.9624f, 6.5f, 9.0f)
                curveTo(6.5f, 12.0376f, 8.9624f, 14.5f, 12.0f, 14.5f)
                curveTo(15.0376f, 14.5f, 17.5f, 12.0376f, 17.5f, 9.0f)
                curveTo(17.5f, 5.9624f, 15.0376f, 3.5f, 12.0f, 3.5f)
                close()
            }
        }
        .build()
        return _ribbon!!
    }

private var _ribbon: ImageVector? = null
