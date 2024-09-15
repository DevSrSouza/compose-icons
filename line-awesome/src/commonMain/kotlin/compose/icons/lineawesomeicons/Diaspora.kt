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

public val LineAwesomeIcons.Diaspora: ImageVector
    get() {
        if (_diaspora != null) {
            return _diaspora!!
        }
        _diaspora = Builder(name = "Diaspora", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.006f, 5.0f)
                lineTo(12.006f, 11.143f)
                lineTo(6.369f, 9.264f)
                lineTo(4.154f, 15.904f)
                lineTo(9.816f, 17.793f)
                lineTo(6.1f, 22.801f)
                lineTo(11.721f, 26.973f)
                lineTo(15.391f, 22.027f)
                lineTo(18.861f, 27.1f)
                lineTo(24.637f, 23.146f)
                lineTo(21.039f, 17.891f)
                lineTo(26.816f, 16.023f)
                lineTo(24.664f, 9.361f)
                lineTo(20.0f, 11.191f)
                lineTo(19.0f, 5.0f)
                lineTo(12.006f, 5.0f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(17.006f, 7.0f)
                lineTo(17.006f, 13.939f)
                lineTo(23.377f, 11.881f)
                lineTo(24.299f, 14.734f)
                lineTo(17.877f, 16.811f)
                lineTo(21.857f, 22.625f)
                lineTo(19.381f, 24.318f)
                lineTo(15.455f, 18.582f)
                lineTo(11.307f, 24.176f)
                lineTo(8.896f, 22.387f)
                lineTo(13.066f, 16.768f)
                lineTo(6.686f, 14.641f)
                lineTo(7.633f, 11.795f)
                lineTo(14.0f, 14.0f)
                lineTo(14.0f, 7.0f)
                close()
            }
        }
        .build()
        return _diaspora!!
    }

private var _diaspora: ImageVector? = null
