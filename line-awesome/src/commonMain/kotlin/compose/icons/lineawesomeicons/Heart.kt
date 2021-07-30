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

public val LineAwesomeIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                curveTo(5.3633f, 5.0f, 2.0f, 8.4023f, 2.0f, 12.5f)
                curveTo(2.0f, 13.9297f, 2.6484f, 15.168f, 3.25f, 16.0625f)
                curveTo(3.8516f, 16.957f, 4.4688f, 17.5313f, 4.4688f, 17.5313f)
                lineTo(15.2813f, 28.375f)
                lineTo(16.0f, 29.0938f)
                lineTo(16.7188f, 28.375f)
                lineTo(27.5313f, 17.5313f)
                curveTo(27.5313f, 17.5313f, 30.0f, 15.3555f, 30.0f, 12.5f)
                curveTo(30.0f, 8.4023f, 26.6367f, 5.0f, 22.5f, 5.0f)
                curveTo(19.0664f, 5.0f, 16.8555f, 7.0664f, 16.0f, 7.9375f)
                curveTo(15.1445f, 7.0664f, 12.9336f, 5.0f, 9.5f, 5.0f)
                close()
                moveTo(9.5f, 7.0f)
                curveTo(12.4883f, 7.0f, 15.25f, 9.9063f, 15.25f, 9.9063f)
                lineTo(16.0f, 10.75f)
                lineTo(16.75f, 9.9063f)
                curveTo(16.75f, 9.9063f, 19.5117f, 7.0f, 22.5f, 7.0f)
                curveTo(25.543f, 7.0f, 28.0f, 9.4961f, 28.0f, 12.5f)
                curveTo(28.0f, 14.043f, 26.125f, 16.125f, 26.125f, 16.125f)
                lineTo(16.0f, 26.25f)
                lineTo(5.875f, 16.125f)
                curveTo(5.875f, 16.125f, 5.3906f, 15.6602f, 4.9063f, 14.9375f)
                curveTo(4.4219f, 14.2148f, 4.0f, 13.2734f, 4.0f, 12.5f)
                curveTo(4.0f, 9.4961f, 6.457f, 7.0f, 9.5f, 7.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
