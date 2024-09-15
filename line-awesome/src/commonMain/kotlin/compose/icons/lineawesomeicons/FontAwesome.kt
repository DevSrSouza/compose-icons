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

public val LineAwesomeIcons.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(12.5f, 9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.002f, 10.5f)
                curveTo(11.002f, 10.5f, 11.0f, 10.5f, 11.0f, 10.5f)
                lineTo(11.0f, 22.0f)
                curveTo(11.0f, 22.552f, 11.448f, 23.0f, 12.0f, 23.0f)
                curveTo(12.552f, 23.0f, 13.0f, 22.552f, 13.0f, 22.0f)
                lineTo(13.0f, 17.744f)
                curveTo(13.782f, 17.456f, 14.645f, 17.234f, 15.479f, 17.234f)
                curveTo(17.058f, 17.234f, 17.669f, 18.051f, 18.984f, 18.051f)
                curveTo(19.923f, 18.051f, 20.798f, 17.733f, 21.615f, 17.381f)
                curveTo(21.82f, 17.293f, 21.996f, 17.205f, 21.996f, 17.0f)
                lineTo(22.002f, 17.0f)
                lineTo(22.002f, 11.381f)
                curveTo(22.002f, 11.176f, 21.796f, 11.0f, 21.561f, 11.0f)
                curveTo(21.267f, 11.0f, 20.04f, 11.787f, 18.93f, 11.787f)
                curveTo(18.7f, 11.787f, 18.494f, 11.758f, 18.289f, 11.67f)
                curveTo(17.296f, 11.293f, 16.421f, 11.0f, 15.311f, 11.0f)
                curveTo(14.821f, 11.0f, 14.319f, 11.077f, 13.828f, 11.195f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 9.0f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
