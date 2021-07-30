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

public val LineAwesomeIcons.MagnetSolid: ImageVector
    get() {
        if (_magnetSolid != null) {
            return _magnetSolid!!
        }
        _magnetSolid = Builder(name = "MagnetSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(9.9375f, 5.0f, 5.0f, 9.9375f, 5.0f, 16.0f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 16.0f)
                curveTo(13.0f, 14.332f, 14.332f, 13.0f, 16.0f, 13.0f)
                curveTo(17.668f, 13.0f, 19.0f, 14.332f, 19.0f, 16.0f)
                lineTo(19.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 16.0f)
                curveTo(27.0f, 9.9375f, 22.0625f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(20.9844f, 7.0f, 25.0f, 11.0156f, 25.0f, 16.0f)
                lineTo(25.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                lineTo(21.0f, 16.0f)
                curveTo(21.0f, 13.25f, 18.75f, 11.0f, 16.0f, 11.0f)
                curveTo(13.25f, 11.0f, 11.0f, 13.25f, 11.0f, 16.0f)
                lineTo(11.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                lineTo(7.0f, 16.0f)
                curveTo(7.0f, 11.0156f, 11.0156f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(7.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                lineTo(11.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(21.0f, 23.0f)
                lineTo(25.0f, 23.0f)
                lineTo(25.0f, 25.0f)
                lineTo(21.0f, 25.0f)
                close()
            }
        }
        .build()
        return _magnetSolid!!
    }

private var _magnetSolid: ImageVector? = null
