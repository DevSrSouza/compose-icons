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

public val LineAwesomeIcons.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3844f, 4.0f, 4.0f, 9.3844f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6156f, 9.3844f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6156f, 28.0f, 28.0f, 22.6156f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3844f, 22.6156f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5347f, 6.0f, 26.0f, 10.4653f, 26.0f, 16.0f)
                curveTo(26.0f, 21.0274f, 22.3117f, 25.1613f, 17.4883f, 25.8789f)
                lineTo(17.4883f, 18.916f)
                lineTo(20.3359f, 18.916f)
                lineTo(20.7832f, 16.0234f)
                lineTo(17.4883f, 16.0234f)
                lineTo(17.4883f, 14.4434f)
                curveTo(17.4883f, 13.2424f, 17.8829f, 12.1758f, 19.0059f, 12.1758f)
                lineTo(20.8105f, 12.1758f)
                lineTo(20.8105f, 9.6523f)
                curveTo(20.4935f, 9.6093f, 19.8227f, 9.5156f, 18.5547f, 9.5156f)
                curveTo(15.9067f, 9.5156f, 14.3555f, 10.9136f, 14.3555f, 14.0996f)
                lineTo(14.3555f, 16.0234f)
                lineTo(11.6328f, 16.0234f)
                lineTo(11.6328f, 18.916f)
                lineTo(14.3555f, 18.916f)
                lineTo(14.3555f, 25.8535f)
                curveTo(9.6089f, 25.0706f, 6.0f, 20.973f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4653f, 10.4653f, 6.0f, 16.0f, 6.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
