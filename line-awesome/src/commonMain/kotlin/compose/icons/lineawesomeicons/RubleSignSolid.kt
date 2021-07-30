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

public val LineAwesomeIcons.RubleSignSolid: ImageVector
    get() {
        if (_rubleSignSolid != null) {
            return _rubleSignSolid!!
        }
        _rubleSignSolid = Builder(name = "RubleSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                lineTo(11.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                lineTo(9.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                lineTo(11.0f, 26.0f)
                lineTo(13.0f, 26.0f)
                lineTo(13.0f, 22.0f)
                lineTo(18.0f, 22.0f)
                lineTo(18.0f, 20.0f)
                lineTo(13.0f, 20.0f)
                lineTo(13.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                curveTo(22.3008f, 18.0f, 25.0f, 15.3008f, 25.0f, 12.0f)
                curveTo(25.0f, 8.6992f, 22.3008f, 6.0f, 19.0f, 6.0f)
                close()
                moveTo(13.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                curveTo(21.2188f, 8.0f, 23.0f, 9.7813f, 23.0f, 12.0f)
                curveTo(23.0f, 14.2188f, 21.2188f, 16.0f, 19.0f, 16.0f)
                lineTo(13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _rubleSignSolid!!
    }

private var _rubleSignSolid: ImageVector? = null
