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

public val LineAwesomeIcons.IglooSolid: ImageVector
    get() {
        if (_iglooSolid != null) {
            return _iglooSolid!!
        }
        _iglooSolid = Builder(name = "IglooSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(8.832f, 6.0f, 3.0f, 11.832f, 3.0f, 19.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 19.0f)
                curveTo(29.0f, 11.832f, 23.168f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(16.338f, 8.0f, 16.67f, 8.021f, 17.0f, 8.051f)
                lineTo(17.0f, 12.0f)
                lineTo(7.523f, 12.0f)
                curveTo(9.543f, 9.559f, 12.592f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(19.0f, 8.428f)
                curveTo(21.172f, 9.045f, 23.074f, 10.305f, 24.477f, 12.0f)
                lineTo(19.0f, 12.0f)
                lineTo(19.0f, 8.428f)
                close()
                moveTo(6.215f, 14.0f)
                lineTo(8.0f, 14.0f)
                lineTo(8.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                curveTo(5.0f, 17.199f, 5.444f, 15.502f, 6.215f, 14.0f)
                close()
                moveTo(10.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 19.0f)
                lineTo(20.578f, 19.0f)
                curveTo(19.805f, 17.237f, 18.046f, 16.0f, 16.0f, 16.0f)
                curveTo(13.954f, 16.0f, 12.195f, 17.237f, 11.422f, 19.0f)
                lineTo(10.0f, 19.0f)
                lineTo(10.0f, 14.0f)
                close()
                moveTo(24.0f, 14.0f)
                lineTo(25.785f, 14.0f)
                curveTo(26.556f, 15.502f, 27.0f, 17.199f, 27.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 14.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(17.654f, 18.0f, 19.0f, 19.346f, 19.0f, 21.0f)
                lineTo(19.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 21.0f)
                curveTo(13.0f, 19.346f, 14.346f, 18.0f, 16.0f, 18.0f)
                close()
                moveTo(5.0f, 21.0f)
                lineTo(11.0f, 21.0f)
                lineTo(11.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 21.0f)
                close()
                moveTo(21.0f, 21.0f)
                lineTo(27.0f, 21.0f)
                lineTo(27.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                lineTo(21.0f, 21.0f)
                close()
            }
        }
        .build()
        return _iglooSolid!!
    }

private var _iglooSolid: ImageVector? = null
