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

public val LineAwesomeIcons.DogSolid: ImageVector
    get() {
        if (_dogSolid != null) {
            return _dogSolid!!
        }
        _dogSolid = Builder(name = "DogSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3125f, 3.0f)
                lineTo(20.0625f, 3.6563f)
                lineTo(17.3125f, 11.0f)
                lineTo(9.625f, 11.0f)
                curveTo(8.7109f, 11.0f, 7.8438f, 11.2578f, 7.125f, 11.7188f)
                lineTo(4.7188f, 9.2813f)
                lineTo(3.2813f, 10.7188f)
                lineTo(5.7188f, 13.125f)
                curveTo(5.2578f, 13.8438f, 5.0f, 14.7109f, 5.0f, 15.625f)
                curveTo(5.0f, 16.1289f, 5.0859f, 16.6445f, 5.25f, 17.125f)
                lineTo(5.9688f, 19.2188f)
                lineTo(5.0313f, 22.75f)
                lineTo(5.0f, 22.875f)
                lineTo(5.0f, 28.0f)
                lineTo(7.0f, 28.0f)
                lineTo(7.0f, 23.125f)
                lineTo(7.9688f, 19.4688f)
                lineTo(8.0313f, 19.1563f)
                lineTo(7.9375f, 18.875f)
                lineTo(7.125f, 16.4688f)
                curveTo(7.0352f, 16.1992f, 7.0f, 15.9102f, 7.0f, 15.625f)
                curveTo(7.0f, 14.1563f, 8.1563f, 13.0f, 9.625f, 13.0f)
                lineTo(17.6563f, 13.0f)
                lineTo(21.0f, 16.2813f)
                lineTo(21.0f, 13.4688f)
                lineTo(19.1875f, 11.6875f)
                lineTo(21.25f, 6.1563f)
                lineTo(21.5f, 6.5313f)
                lineTo(21.7813f, 7.0f)
                lineTo(23.6563f, 7.0f)
                lineTo(26.7188f, 9.3125f)
                lineTo(25.875f, 11.0f)
                lineTo(22.0f, 11.0f)
                lineTo(22.0f, 16.875f)
                lineTo(21.0625f, 19.6875f)
                lineTo(21.0f, 19.8438f)
                lineTo(21.0f, 23.125f)
                lineTo(22.0f, 27.125f)
                lineTo(22.0f, 28.0f)
                lineTo(24.0f, 28.0f)
                lineTo(24.0f, 26.875f)
                lineTo(23.0f, 22.875f)
                lineTo(23.0f, 20.125f)
                lineTo(23.9375f, 17.3125f)
                lineTo(24.0f, 17.1563f)
                lineTo(24.0f, 13.0f)
                lineTo(27.125f, 13.0f)
                lineTo(29.2813f, 8.6875f)
                lineTo(28.5938f, 8.1875f)
                lineTo(24.3438f, 5.0f)
                lineTo(22.9063f, 5.0f)
                lineTo(21.9375f, 3.4688f)
                lineTo(21.6563f, 3.0f)
                close()
                moveTo(10.2188f, 18.0f)
                lineTo(9.0f, 22.875f)
                lineTo(9.0f, 28.0f)
                lineTo(11.0f, 28.0f)
                lineTo(11.0f, 23.125f)
                lineTo(11.7813f, 20.0f)
                lineTo(12.7188f, 20.0f)
                curveTo(13.0703f, 20.2344f, 14.3125f, 21.0f, 16.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 23.125f)
                lineTo(18.0f, 27.125f)
                lineTo(18.0f, 28.0f)
                lineTo(20.0f, 28.0f)
                lineTo(20.0f, 26.875f)
                lineTo(19.0f, 22.875f)
                lineTo(19.0f, 19.0f)
                lineTo(16.0f, 19.0f)
                curveTo(14.9375f, 19.0f, 13.5625f, 18.1563f, 13.5625f, 18.1563f)
                lineTo(13.3125f, 18.0f)
                close()
            }
        }
        .build()
        return _dogSolid!!
    }

private var _dogSolid: ImageVector? = null
