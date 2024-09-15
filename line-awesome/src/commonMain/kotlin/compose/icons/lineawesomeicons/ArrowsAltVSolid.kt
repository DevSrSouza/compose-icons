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

public val LineAwesomeIcons.ArrowsAltVSolid: ImageVector
    get() {
        if (_arrowsAltVSolid != null) {
            return _arrowsAltVSolid!!
        }
        _arrowsAltVSolid = Builder(name = "ArrowsAltVSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.094f)
                lineTo(15.281f, 2.781f)
                lineTo(7.281f, 10.781f)
                lineTo(8.719f, 12.219f)
                lineTo(15.0f, 5.938f)
                lineTo(15.0f, 26.063f)
                lineTo(8.719f, 19.781f)
                lineTo(7.281f, 21.219f)
                lineTo(15.281f, 29.219f)
                lineTo(16.0f, 29.906f)
                lineTo(16.719f, 29.219f)
                lineTo(24.719f, 21.219f)
                lineTo(23.281f, 19.781f)
                lineTo(17.0f, 26.063f)
                lineTo(17.0f, 5.938f)
                lineTo(23.281f, 12.219f)
                lineTo(24.719f, 10.781f)
                lineTo(16.719f, 2.781f)
                close()
            }
        }
        .build()
        return _arrowsAltVSolid!!
    }

private var _arrowsAltVSolid: ImageVector? = null
