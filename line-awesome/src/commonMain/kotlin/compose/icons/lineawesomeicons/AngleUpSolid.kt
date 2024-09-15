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

public val LineAwesomeIcons.AngleUpSolid: ImageVector
    get() {
        if (_angleUpSolid != null) {
            return _angleUpSolid!!
        }
        _angleUpSolid = Builder(name = "AngleUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.594f)
                lineTo(15.281f, 7.281f)
                lineTo(2.781f, 19.781f)
                lineTo(4.219f, 21.219f)
                lineTo(16.0f, 9.438f)
                lineTo(27.781f, 21.219f)
                lineTo(29.219f, 19.781f)
                lineTo(16.719f, 7.281f)
                close()
            }
        }
        .build()
        return _angleUpSolid!!
    }

private var _angleUpSolid: ImageVector? = null
