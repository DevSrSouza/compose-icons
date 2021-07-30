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

public val LineAwesomeIcons.BoxesSolid: ImageVector
    get() {
        if (_boxesSolid != null) {
            return _boxesSolid!!
        }
        _boxesSolid = Builder(name = "BoxesSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                lineTo(10.0f, 15.0f)
                lineTo(22.0f, 15.0f)
                lineTo(22.0f, 4.0f)
                lineTo(10.0f, 4.0f)
                close()
                moveTo(12.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 10.0f)
                lineTo(16.0f, 8.0f)
                lineTo(18.0f, 10.0f)
                lineTo(18.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 13.0f)
                lineTo(12.0f, 13.0f)
                lineTo(12.0f, 6.0f)
                close()
                moveTo(3.0f, 17.0f)
                lineTo(3.0f, 28.0f)
                lineTo(15.0f, 28.0f)
                lineTo(15.0f, 17.0f)
                lineTo(3.0f, 17.0f)
                close()
                moveTo(17.0f, 17.0f)
                lineTo(17.0f, 28.0f)
                lineTo(29.0f, 28.0f)
                lineTo(29.0f, 17.0f)
                lineTo(17.0f, 17.0f)
                close()
                moveTo(5.0f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 23.0f)
                lineTo(9.0f, 21.0f)
                lineTo(11.0f, 23.0f)
                lineTo(11.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 26.0f)
                lineTo(5.0f, 26.0f)
                lineTo(5.0f, 19.0f)
                close()
                moveTo(19.0f, 19.0f)
                lineTo(21.0f, 19.0f)
                lineTo(21.0f, 23.0f)
                lineTo(23.0f, 21.0f)
                lineTo(25.0f, 23.0f)
                lineTo(25.0f, 19.0f)
                lineTo(27.0f, 19.0f)
                lineTo(27.0f, 26.0f)
                lineTo(19.0f, 26.0f)
                lineTo(19.0f, 19.0f)
                close()
            }
        }
        .build()
        return _boxesSolid!!
    }

private var _boxesSolid: ImageVector? = null
