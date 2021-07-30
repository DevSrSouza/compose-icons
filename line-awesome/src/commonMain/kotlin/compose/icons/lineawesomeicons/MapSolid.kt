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

public val LineAwesomeIcons.MapSolid: ImageVector
    get() {
        if (_mapSolid != null) {
            return _mapSolid!!
        }
        _mapSolid = Builder(name = "MapSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 4.4688f)
                lineTo(26.5938f, 5.0938f)
                lineTo(19.9688f, 7.9375f)
                lineTo(12.3438f, 5.0625f)
                lineTo(11.9688f, 4.9375f)
                lineTo(11.5938f, 5.0938f)
                lineTo(4.5938f, 8.0938f)
                lineTo(4.0f, 8.3438f)
                lineTo(4.0f, 27.5313f)
                lineTo(5.4063f, 26.9063f)
                lineTo(12.0313f, 24.0625f)
                lineTo(19.6563f, 26.9375f)
                lineTo(20.0313f, 27.0625f)
                lineTo(20.4063f, 26.9063f)
                lineTo(27.4063f, 23.9063f)
                lineTo(28.0f, 23.6563f)
                close()
                moveTo(13.0f, 7.4375f)
                lineTo(19.0f, 9.6875f)
                lineTo(19.0f, 24.5625f)
                lineTo(13.0f, 22.3125f)
                close()
                moveTo(11.0f, 7.5f)
                lineTo(11.0f, 22.3438f)
                lineTo(6.0f, 24.5f)
                lineTo(6.0f, 9.6563f)
                close()
                moveTo(26.0f, 7.5f)
                lineTo(26.0f, 22.3438f)
                lineTo(21.0f, 24.5f)
                lineTo(21.0f, 9.6563f)
                close()
            }
        }
        .build()
        return _mapSolid!!
    }

private var _mapSolid: ImageVector? = null
