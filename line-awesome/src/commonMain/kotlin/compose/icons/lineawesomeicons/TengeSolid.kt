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
                moveTo(6.633f, 5.0f)
                curveTo(6.285f, 5.0f, 6.0f, 5.274f, 6.0f, 5.621f)
                lineTo(6.0f, 8.367f)
                curveTo(6.0f, 8.715f, 6.285f, 9.0f, 6.633f, 9.0f)
                lineTo(25.379f, 9.0f)
                curveTo(25.726f, 9.0f, 26.0f, 8.715f, 26.0f, 8.367f)
                lineTo(26.0f, 5.621f)
                curveTo(26.0f, 5.274f, 25.726f, 5.0f, 25.379f, 5.0f)
                lineTo(6.633f, 5.0f)
                close()
                moveTo(6.633f, 12.0f)
                curveTo(6.285f, 12.0f, 6.0f, 12.284f, 6.0f, 12.621f)
                lineTo(6.0f, 15.367f)
                curveTo(6.0f, 15.715f, 6.285f, 16.0f, 6.633f, 16.0f)
                lineTo(14.0f, 16.0f)
                lineTo(14.0f, 27.379f)
                curveTo(14.0f, 27.726f, 14.274f, 28.0f, 14.621f, 28.0f)
                lineTo(17.379f, 28.0f)
                curveTo(17.726f, 28.0f, 18.0f, 27.726f, 18.0f, 27.379f)
                lineTo(18.0f, 16.0f)
                lineTo(25.379f, 16.0f)
                curveTo(25.726f, 16.0f, 26.0f, 15.715f, 26.0f, 15.367f)
                lineTo(26.0f, 12.621f)
                curveTo(26.0f, 12.284f, 25.726f, 12.0f, 25.379f, 12.0f)
                lineTo(6.633f, 12.0f)
                close()
            }
        }
        .build()
        return _tengeSolid!!
    }

private var _tengeSolid: ImageVector? = null
