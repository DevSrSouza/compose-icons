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

public val LineAwesomeIcons.Mdb: ImageVector
    get() {
        if (_mdb != null) {
            return _mdb!!
        }
        _mdb = Builder(name = "Mdb", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.0801f, 9.0f)
                lineTo(0.0801f, 21.0f)
                lineTo(2.0879f, 21.0f)
                lineTo(2.6445f, 14.3047f)
                lineTo(5.3223f, 21.0f)
                lineTo(6.6777f, 21.0f)
                lineTo(9.3555f, 14.3047f)
                lineTo(9.9121f, 21.0f)
                lineTo(11.9199f, 21.0f)
                lineTo(10.9199f, 9.0f)
                lineTo(9.3223f, 9.0f)
                lineTo(6.0f, 17.3086f)
                lineTo(2.6777f, 9.0f)
                lineTo(1.0801f, 9.0f)
                close()
                moveTo(14.0f, 9.0f)
                lineTo(14.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                curveTo(19.3016f, 21.0f, 22.0f, 18.3016f, 22.0f, 15.0f)
                curveTo(22.0f, 11.6984f, 19.3016f, 9.0f, 16.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(24.0f, 9.0f)
                lineTo(24.0f, 14.0f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 21.0117f)
                lineTo(28.4941f, 21.0117f)
                curveTo(30.4186f, 21.0117f, 32.0f, 19.4303f, 32.0f, 17.5059f)
                curveTo(32.0f, 16.236f, 31.2772f, 15.1642f, 30.2559f, 14.5488f)
                curveTo(30.6921f, 13.965f, 31.0f, 13.2785f, 31.0f, 12.5f)
                curveTo(31.0f, 10.5788f, 29.4212f, 9.0f, 27.5f, 9.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(18.2204f, 11.0f, 20.0f, 12.7796f, 20.0f, 15.0f)
                curveTo(20.0f, 17.2204f, 18.2204f, 19.0f, 16.0f, 19.0f)
                lineTo(16.0f, 11.0f)
                close()
                moveTo(26.0f, 11.0f)
                lineTo(27.5f, 11.0f)
                curveTo(28.3408f, 11.0f, 29.0f, 11.6592f, 29.0f, 12.5f)
                curveTo(29.0f, 13.3408f, 28.3408f, 14.0f, 27.5f, 14.0f)
                lineTo(26.0f, 14.0f)
                lineTo(26.0f, 11.0f)
                close()
                moveTo(26.0f, 16.0f)
                lineTo(27.5f, 16.0f)
                lineTo(28.4941f, 16.0f)
                curveTo(29.3377f, 16.0f, 30.0f, 16.6623f, 30.0f, 17.5059f)
                curveTo(30.0f, 18.3494f, 29.3377f, 19.0117f, 28.4941f, 19.0117f)
                lineTo(26.0f, 19.0117f)
                lineTo(26.0f, 16.0f)
                close()
            }
        }
        .build()
        return _mdb!!
    }

private var _mdb: ImageVector? = null
