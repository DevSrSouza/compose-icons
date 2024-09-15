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

public val LineAwesomeIcons.Bimobject: ImageVector
    get() {
        if (_bimobject != null) {
            return _bimobject!!
        }
        _bimobject = Builder(name = "Bimobject", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 20.813f)
                lineTo(12.984f, 20.813f)
                lineTo(12.984f, 19.193f)
                lineTo(13.027f, 19.193f)
                curveTo(13.402f, 20.3f, 14.249f, 21.0f, 16.305f, 21.0f)
                lineTo(17.098f, 21.0f)
                curveTo(21.398f, 21.0f, 21.93f, 19.454f, 21.93f, 17.148f)
                lineTo(21.93f, 15.521f)
                curveTo(21.93f, 13.214f, 21.397f, 11.68f, 17.086f, 11.68f)
                lineTo(16.281f, 11.68f)
                curveTo(14.883f, 11.68f, 13.244f, 12.065f, 13.035f, 13.484f)
                lineTo(12.984f, 13.484f)
                lineTo(12.984f, 10.0f)
                lineTo(10.0f, 10.0f)
                close()
                moveTo(15.051f, 14.238f)
                lineTo(17.285f, 14.238f)
                curveTo(18.913f, 14.228f, 19.07f, 14.791f, 19.07f, 15.803f)
                lineTo(19.07f, 16.867f)
                curveTo(19.07f, 17.879f, 18.913f, 18.443f, 17.285f, 18.443f)
                lineTo(15.051f, 18.443f)
                curveTo(13.705f, 18.443f, 12.994f, 18.139f, 12.994f, 16.783f)
                lineTo(12.994f, 15.896f)
                curveTo(12.994f, 14.529f, 13.705f, 14.238f, 15.051f, 14.238f)
                close()
            }
        }
        .build()
        return _bimobject!!
    }

private var _bimobject: ImageVector? = null
