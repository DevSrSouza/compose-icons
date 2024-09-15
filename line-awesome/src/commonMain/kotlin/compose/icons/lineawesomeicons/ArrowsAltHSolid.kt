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

public val LineAwesomeIcons.ArrowsAltHSolid: ImageVector
    get() {
        if (_arrowsAltHSolid != null) {
            return _arrowsAltHSolid!!
        }
        _arrowsAltHSolid = Builder(name = "ArrowsAltHSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.281f, 6.781f)
                lineTo(0.781f, 15.281f)
                lineTo(0.094f, 16.0f)
                lineTo(0.781f, 16.719f)
                lineTo(9.281f, 25.219f)
                lineTo(10.719f, 23.781f)
                lineTo(3.938f, 17.0f)
                lineTo(28.063f, 17.0f)
                lineTo(21.281f, 23.781f)
                lineTo(22.719f, 25.219f)
                lineTo(31.219f, 16.719f)
                lineTo(31.906f, 16.0f)
                lineTo(31.219f, 15.281f)
                lineTo(22.719f, 6.781f)
                lineTo(21.281f, 8.219f)
                lineTo(28.063f, 15.0f)
                lineTo(3.938f, 15.0f)
                lineTo(10.719f, 8.219f)
                close()
            }
        }
        .build()
        return _arrowsAltHSolid!!
    }

private var _arrowsAltHSolid: ImageVector? = null
