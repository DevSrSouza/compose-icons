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

public val LineAwesomeIcons.GlassMartiniSolid: ImageVector
    get() {
        if (_glassMartiniSolid != null) {
            return _glassMartiniSolid!!
        }
        _glassMartiniSolid = Builder(name = "GlassMartiniSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 6.3398f)
                lineTo(15.0f, 19.3398f)
                lineTo(15.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 19.3398f)
                lineTo(27.0f, 6.3398f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(8.0313f, 7.0f)
                lineTo(23.9688f, 7.0f)
                lineTo(22.4297f, 9.0f)
                lineTo(11.9199f, 9.0f)
                lineTo(13.459f, 11.0f)
                lineTo(20.8926f, 11.0f)
                lineTo(16.0f, 17.3594f)
                lineTo(8.0313f, 7.0f)
                close()
            }
        }
        .build()
        return _glassMartiniSolid!!
    }

private var _glassMartiniSolid: ImageVector? = null
