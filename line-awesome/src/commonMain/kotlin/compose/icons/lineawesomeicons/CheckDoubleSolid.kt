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

public val LineAwesomeIcons.CheckDoubleSolid: ImageVector
    get() {
        if (_checkDoubleSolid != null) {
            return _checkDoubleSolid!!
        }
        _checkDoubleSolid = Builder(name = "CheckDoubleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.281f, 7.281f)
                lineTo(11.5f, 19.063f)
                lineTo(8.719f, 16.281f)
                lineTo(7.281f, 17.719f)
                lineTo(10.063f, 20.5f)
                lineTo(8.0f, 22.563f)
                lineTo(1.719f, 16.281f)
                lineTo(0.281f, 17.719f)
                lineTo(7.281f, 24.719f)
                lineTo(8.0f, 25.406f)
                lineTo(8.719f, 24.719f)
                lineTo(11.5f, 21.938f)
                lineTo(14.281f, 24.719f)
                lineTo(15.0f, 25.406f)
                lineTo(15.719f, 24.719f)
                lineTo(31.625f, 8.719f)
                lineTo(30.188f, 7.281f)
                lineTo(15.0f, 22.563f)
                lineTo(12.938f, 20.5f)
                lineTo(24.719f, 8.719f)
                close()
            }
        }
        .build()
        return _checkDoubleSolid!!
    }

private var _checkDoubleSolid: ImageVector? = null
