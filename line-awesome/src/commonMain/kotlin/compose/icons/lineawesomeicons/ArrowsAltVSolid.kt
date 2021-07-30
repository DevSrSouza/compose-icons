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
                moveTo(16.0f, 2.0938f)
                lineTo(15.2813f, 2.7813f)
                lineTo(7.2813f, 10.7813f)
                lineTo(8.7188f, 12.2188f)
                lineTo(15.0f, 5.9375f)
                lineTo(15.0f, 26.0625f)
                lineTo(8.7188f, 19.7813f)
                lineTo(7.2813f, 21.2188f)
                lineTo(15.2813f, 29.2188f)
                lineTo(16.0f, 29.9063f)
                lineTo(16.7188f, 29.2188f)
                lineTo(24.7188f, 21.2188f)
                lineTo(23.2813f, 19.7813f)
                lineTo(17.0f, 26.0625f)
                lineTo(17.0f, 5.9375f)
                lineTo(23.2813f, 12.2188f)
                lineTo(24.7188f, 10.7813f)
                lineTo(16.7188f, 2.7813f)
                close()
            }
        }
        .build()
        return _arrowsAltVSolid!!
    }

private var _arrowsAltVSolid: ImageVector? = null
