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

public val LineAwesomeIcons.TengeSolid: ImageVector
    get() {
        if (_tengeSolid != null) {
            return _tengeSolid!!
        }
        _tengeSolid = Builder(name = "TengeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6328f, 5.0f)
                curveTo(6.2848f, 5.0f, 6.0f, 5.2741f, 6.0f, 5.6211f)
                lineTo(6.0f, 8.3672f)
                curveTo(6.0f, 8.7152f, 6.2848f, 9.0f, 6.6328f, 9.0f)
                lineTo(25.3789f, 9.0f)
                curveTo(25.7259f, 9.0f, 26.0f, 8.7152f, 26.0f, 8.3672f)
                lineTo(26.0f, 5.6211f)
                curveTo(26.0f, 5.2741f, 25.7259f, 5.0f, 25.3789f, 5.0f)
                lineTo(6.6328f, 5.0f)
                close()
                moveTo(6.6328f, 12.0f)
                curveTo(6.2848f, 12.0f, 6.0f, 12.2841f, 6.0f, 12.6211f)
                lineTo(6.0f, 15.3672f)
                curveTo(6.0f, 15.7152f, 6.2848f, 16.0f, 6.6328f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 27.3789f)
                curveTo(14.0f, 27.7259f, 14.2741f, 28.0f, 14.6211f, 28.0f)
                lineTo(17.3789f, 28.0f)
                curveTo(17.7259f, 28.0f, 18.0f, 27.7259f, 18.0f, 27.3789f)
                lineTo(18.0f, 16.0f)
                lineTo(25.3789f, 16.0f)
                curveTo(25.7259f, 16.0f, 26.0f, 15.7152f, 26.0f, 15.3672f)
                lineTo(26.0f, 12.6211f)
                curveTo(26.0f, 12.2841f, 25.7259f, 12.0f, 25.3789f, 12.0f)
                lineTo(6.6328f, 12.0f)
                close()
            }
        }
        .build()
        return _tengeSolid!!
    }

private var _tengeSolid: ImageVector? = null
