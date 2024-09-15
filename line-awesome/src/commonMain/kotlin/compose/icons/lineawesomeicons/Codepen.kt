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

public val LineAwesomeIcons.Codepen: ImageVector
    get() {
        if (_codepen != null) {
            return _codepen!!
        }
        _codepen = Builder(name = "Codepen", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.844f)
                lineTo(15.438f, 3.219f)
                lineTo(3.438f, 11.25f)
                lineTo(3.0f, 11.531f)
                lineTo(3.0f, 20.469f)
                lineTo(3.438f, 20.75f)
                lineTo(15.438f, 28.781f)
                lineTo(16.0f, 29.156f)
                lineTo(16.563f, 28.781f)
                lineTo(28.563f, 20.75f)
                lineTo(29.0f, 20.469f)
                lineTo(29.0f, 11.531f)
                lineTo(28.563f, 11.25f)
                lineTo(16.563f, 3.219f)
                close()
                moveTo(15.0f, 5.906f)
                lineTo(15.0f, 11.344f)
                lineTo(9.844f, 14.813f)
                lineTo(5.813f, 12.094f)
                close()
                moveTo(17.0f, 5.906f)
                lineTo(26.188f, 12.094f)
                lineTo(22.156f, 14.813f)
                lineTo(17.0f, 11.344f)
                close()
                moveTo(16.0f, 13.094f)
                lineTo(20.344f, 16.0f)
                lineTo(16.0f, 18.906f)
                lineTo(11.656f, 16.0f)
                close()
                moveTo(5.0f, 13.938f)
                lineTo(8.063f, 16.0f)
                lineTo(5.0f, 18.063f)
                close()
                moveTo(27.0f, 13.938f)
                lineTo(27.0f, 18.063f)
                lineTo(23.938f, 16.0f)
                close()
                moveTo(9.875f, 17.188f)
                lineTo(15.0f, 20.656f)
                lineTo(15.0f, 26.094f)
                lineTo(5.813f, 19.906f)
                close()
                moveTo(22.125f, 17.188f)
                lineTo(26.188f, 19.906f)
                lineTo(17.0f, 26.094f)
                lineTo(17.0f, 20.656f)
                close()
            }
        }
        .build()
        return _codepen!!
    }

private var _codepen: ImageVector? = null
