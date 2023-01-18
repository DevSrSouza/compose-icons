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

public val RegularGroup.PersonPill: ImageVector
    get() {
        if (_personPill != null) {
            return _personPill!!
        }
        _personPill = Builder(name = "PersonPill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1581f, 20.4754f)
                curveTo(11.2234f, 21.0058f, 11.3983f, 21.5253f, 11.6829f, 21.9972f)
                curveTo(8.6936f, 21.9379f, 6.4154f, 21.033f, 4.9022f, 19.2609f)
                curveTo(4.3224f, 18.582f, 4.0039f, 17.7185f, 4.0039f, 16.8257f)
                verticalLineTo(16.2481f)
                curveTo(4.0039f, 15.006f, 5.0108f, 13.9992f, 6.2528f, 13.9992f)
                horizontalLineTo(15.5259f)
                lineTo(14.0259f, 15.4992f)
                horizontalLineTo(6.2528f)
                curveTo(5.8392f, 15.4992f, 5.5039f, 15.8345f, 5.5039f, 16.2481f)
                verticalLineTo(16.8257f)
                curveTo(5.5039f, 17.3614f, 5.695f, 17.8795f, 6.0429f, 18.2869f)
                curveTo(7.1637f, 19.5994f, 8.8545f, 20.3346f, 11.1581f, 20.4754f)
                close()
                moveTo(12.0003f, 2.0039f)
                curveTo(14.7617f, 2.0039f, 17.0003f, 4.2425f, 17.0003f, 7.0039f)
                curveTo(17.0003f, 9.7653f, 14.7617f, 12.0039f, 12.0003f, 12.0039f)
                curveTo(9.2389f, 12.0039f, 7.0004f, 9.7653f, 7.0004f, 7.0039f)
                curveTo(7.0004f, 4.2425f, 9.2389f, 2.0039f, 12.0003f, 2.0039f)
                close()
                moveTo(12.0003f, 3.5039f)
                curveTo(10.0673f, 3.5039f, 8.5004f, 5.0709f, 8.5004f, 7.0039f)
                curveTo(8.5004f, 8.9369f, 10.0673f, 10.5039f, 12.0003f, 10.5039f)
                curveTo(13.9333f, 10.5039f, 15.5003f, 8.9369f, 15.5003f, 7.0039f)
                curveTo(15.5003f, 5.0709f, 13.9333f, 3.5039f, 12.0003f, 3.5039f)
                close()
                moveTo(22.0306f, 12.9694f)
                curveTo(20.9092f, 11.8481f, 19.0912f, 11.8481f, 17.9699f, 12.9694f)
                lineTo(12.9699f, 17.9694f)
                curveTo(11.8486f, 19.0907f, 11.8486f, 20.9087f, 12.9699f, 22.0301f)
                curveTo(14.0912f, 23.1514f, 15.9092f, 23.1514f, 17.0306f, 22.0301f)
                lineTo(22.0306f, 17.0301f)
                curveTo(23.1519f, 15.9087f, 23.1519f, 14.0907f, 22.0306f, 12.9694f)
                close()
                moveTo(19.0306f, 14.0301f)
                curveTo(19.5661f, 13.4945f, 20.4344f, 13.4945f, 20.9699f, 14.0301f)
                curveTo(21.5054f, 14.5656f, 21.5054f, 15.4339f, 20.9699f, 15.9694f)
                lineTo(19.0002f, 17.9391f)
                lineTo(17.0609f, 15.9997f)
                lineTo(19.0306f, 14.0301f)
                close()
                moveTo(17.0306f, 18.9692f)
                curveTo(17.3235f, 19.2621f, 17.3235f, 19.7369f, 17.0306f, 20.0298f)
                lineTo(16.0306f, 21.0298f)
                curveTo(15.7377f, 21.3227f, 15.2628f, 21.3227f, 14.9699f, 21.0298f)
                curveTo(14.677f, 20.7369f, 14.677f, 20.2621f, 14.9699f, 19.9692f)
                lineTo(15.9699f, 18.9692f)
                curveTo(16.2628f, 18.6763f, 16.7377f, 18.6763f, 17.0306f, 18.9692f)
                close()
            }
        }
        .build()
        return _personPill!!
    }

private var _personPill: ImageVector? = null
