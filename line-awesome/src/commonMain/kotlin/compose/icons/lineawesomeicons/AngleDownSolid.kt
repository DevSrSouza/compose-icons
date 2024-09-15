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

public val LineAwesomeIcons.AngleDownSolid: ImageVector
    get() {
        if (_angleDownSolid != null) {
            return _angleDownSolid!!
        }
        _angleDownSolid = Builder(name = "AngleDownSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.219f, 10.781f)
                lineTo(2.781f, 12.219f)
                lineTo(15.281f, 24.719f)
                lineTo(16.0f, 25.406f)
                lineTo(16.719f, 24.719f)
                lineTo(29.219f, 12.219f)
                lineTo(27.781f, 10.781f)
                lineTo(16.0f, 22.563f)
                close()
            }
        }
        .build()
        return _angleDownSolid!!
    }

private var _angleDownSolid: ImageVector? = null
