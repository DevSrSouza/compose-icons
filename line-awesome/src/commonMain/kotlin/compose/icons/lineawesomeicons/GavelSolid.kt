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

public val LineAwesomeIcons.GavelSolid: ImageVector
    get() {
        if (_gavelSolid != null) {
            return _gavelSolid!!
        }
        _gavelSolid = Builder(name = "GavelSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9688f, 1.5938f)
                lineTo(15.25f, 2.2813f)
                lineTo(8.25f, 9.3125f)
                lineTo(7.5313f, 10.0f)
                lineTo(11.9688f, 14.4375f)
                lineTo(12.6563f, 13.7188f)
                lineTo(13.0f, 13.375f)
                lineTo(15.0938f, 15.4688f)
                lineTo(3.2813f, 27.2813f)
                lineTo(4.7188f, 28.7188f)
                lineTo(16.5313f, 16.9063f)
                lineTo(18.5938f, 18.9688f)
                lineTo(18.25f, 19.3125f)
                lineTo(17.5313f, 20.0f)
                lineTo(21.9688f, 24.4375f)
                lineTo(22.6563f, 23.7188f)
                lineTo(30.375f, 16.0f)
                lineTo(29.6563f, 15.3125f)
                lineTo(26.6563f, 12.2813f)
                lineTo(25.9688f, 11.5938f)
                lineTo(25.25f, 12.2813f)
                lineTo(24.9688f, 12.5625f)
                lineTo(19.375f, 7.0f)
                lineTo(20.375f, 6.0f)
                lineTo(19.6563f, 5.3125f)
                lineTo(16.6563f, 2.2813f)
                close()
                moveTo(15.9688f, 4.4063f)
                lineTo(17.5625f, 6.0f)
                lineTo(11.9688f, 11.5938f)
                lineTo(10.375f, 10.0f)
                close()
                moveTo(18.0f, 8.4375f)
                lineTo(23.5625f, 14.0f)
                lineTo(20.0f, 17.5625f)
                lineTo(14.4375f, 12.0f)
                close()
                moveTo(25.9688f, 14.4063f)
                lineTo(27.5625f, 16.0f)
                lineTo(21.9688f, 21.5938f)
                lineTo(20.375f, 20.0f)
                close()
            }
        }
        .build()
        return _gavelSolid!!
    }

private var _gavelSolid: ImageVector? = null
