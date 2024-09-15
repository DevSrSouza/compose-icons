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

public val LineAwesomeIcons.ConciergeBellSolid: ImageVector
    get() {
        if (_conciergeBellSolid != null) {
            return _conciergeBellSolid!!
        }
        _conciergeBellSolid = Builder(name = "ConciergeBellSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 6.0f)
                lineTo(13.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 6.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(9.703f, 9.0f, 4.574f, 13.84f, 4.063f, 20.0f)
                lineTo(2.0f, 20.0f)
                lineTo(2.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 20.0f)
                lineTo(27.938f, 20.0f)
                curveTo(27.426f, 13.84f, 22.297f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(21.227f, 11.0f, 25.445f, 14.914f, 25.938f, 20.0f)
                lineTo(6.063f, 20.0f)
                curveTo(6.555f, 14.914f, 10.773f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(4.0f, 22.0f)
                lineTo(28.0f, 22.0f)
                lineTo(28.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                close()
            }
        }
        .build()
        return _conciergeBellSolid!!
    }

private var _conciergeBellSolid: ImageVector? = null
