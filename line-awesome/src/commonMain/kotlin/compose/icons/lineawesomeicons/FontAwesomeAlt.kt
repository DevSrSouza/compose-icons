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

public val LineAwesomeIcons.FontAwesomeAlt: ImageVector
    get() {
        if (_fontAwesomeAlt != null) {
            return _fontAwesomeAlt!!
        }
        _fontAwesomeAlt = Builder(name = "FontAwesomeAlt", defaultWidth = 32.0.dp, defaultHeight =
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
                lineTo(13.0f, 17.7441f)
                curveTo(13.7817f, 17.4557f, 14.6452f, 17.2344f, 15.4785f, 17.2344f)
                curveTo(17.0575f, 17.2344f, 17.6694f, 18.0508f, 18.9844f, 18.0508f)
                curveTo(19.9234f, 18.0508f, 20.7982f, 17.7329f, 21.6152f, 17.3809f)
                curveTo(21.8202f, 17.2929f, 21.9961f, 17.205f, 21.9961f, 17.0f)
                lineTo(22.002f, 17.0f)
                lineTo(22.002f, 11.3809f)
                curveTo(22.002f, 11.1759f, 21.7955f, 11.0f, 21.5605f, 11.0f)
                curveTo(21.2665f, 11.0f, 20.0397f, 11.7871f, 18.9297f, 11.7871f)
                curveTo(18.6997f, 11.7871f, 18.4941f, 11.7579f, 18.2891f, 11.6699f)
                curveTo(17.2961f, 11.2929f, 16.4205f, 11.0f, 15.3105f, 11.0f)
                curveTo(14.8208f, 11.0f, 14.3191f, 11.0772f, 13.8281f, 11.1953f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.5f, 9.0f)
                close()
            }
        }
        .build()
        return _fontAwesomeAlt!!
    }

private var _fontAwesomeAlt: ImageVector? = null
