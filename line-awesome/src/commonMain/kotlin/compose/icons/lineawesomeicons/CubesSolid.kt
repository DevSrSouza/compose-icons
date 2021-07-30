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

public val LineAwesomeIcons.CubesSolid: ImageVector
    get() {
        if (_cubesSolid != null) {
            return _cubesSolid!!
        }
        _cubesSolid = Builder(name = "CubesSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(15.625f, 4.1563f)
                lineTo(9.625f, 6.5625f)
                lineTo(9.0f, 6.8125f)
                lineTo(9.0f, 13.5313f)
                lineTo(3.5938f, 15.875f)
                lineTo(3.0f, 16.1563f)
                lineTo(3.0f, 24.2188f)
                lineTo(3.5f, 24.5313f)
                lineTo(9.5f, 27.875f)
                lineTo(9.9688f, 28.125f)
                lineTo(10.4375f, 27.9063f)
                lineTo(16.0f, 25.125f)
                lineTo(21.5625f, 27.9063f)
                lineTo(22.0313f, 28.125f)
                lineTo(22.5f, 27.875f)
                lineTo(28.5f, 24.5313f)
                lineTo(29.0f, 24.2188f)
                lineTo(29.0f, 16.1563f)
                lineTo(28.4063f, 15.875f)
                lineTo(23.0f, 13.5313f)
                lineTo(23.0f, 6.8125f)
                lineTo(22.375f, 6.5625f)
                lineTo(16.375f, 4.1563f)
                close()
                moveTo(16.0f, 6.1875f)
                lineTo(19.2813f, 7.4688f)
                lineTo(16.0f, 8.75f)
                lineTo(12.7188f, 7.4688f)
                close()
                moveTo(11.0f, 8.9375f)
                lineTo(15.0f, 10.4688f)
                lineTo(15.0f, 15.3438f)
                lineTo(11.0f, 13.5625f)
                close()
                moveTo(21.0f, 8.9375f)
                lineTo(21.0f, 13.5625f)
                lineTo(17.0f, 15.3438f)
                lineTo(17.0f, 10.4688f)
                close()
                moveTo(10.0f, 15.3125f)
                lineTo(13.625f, 16.9063f)
                lineTo(10.0f, 18.6875f)
                lineTo(6.375f, 16.875f)
                close()
                moveTo(22.0f, 15.3125f)
                lineTo(25.625f, 16.875f)
                lineTo(22.0f, 18.6875f)
                lineTo(18.375f, 16.9063f)
                lineTo(19.5f, 16.4063f)
                close()
                moveTo(5.0f, 18.4063f)
                lineTo(9.0f, 20.4063f)
                lineTo(9.0f, 25.3125f)
                lineTo(5.0f, 23.0625f)
                close()
                moveTo(27.0f, 18.4063f)
                lineTo(27.0f, 23.0625f)
                lineTo(23.0f, 25.3125f)
                lineTo(23.0f, 20.4063f)
                close()
                moveTo(15.0f, 18.4688f)
                lineTo(15.0f, 23.375f)
                lineTo(11.0f, 25.375f)
                lineTo(11.0f, 20.4063f)
                close()
                moveTo(17.0f, 18.4688f)
                lineTo(21.0f, 20.4063f)
                lineTo(21.0f, 25.375f)
                lineTo(17.0f, 23.375f)
                close()
            }
        }
        .build()
        return _cubesSolid!!
    }

private var _cubesSolid: ImageVector? = null
