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

public val LineAwesomeIcons.ArrowRightSolid: ImageVector
    get() {
        if (_arrowRightSolid != null) {
            return _arrowRightSolid!!
        }
        _arrowRightSolid = Builder(name = "ArrowRightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.719f, 6.781f)
                lineTo(17.281f, 8.219f)
                lineTo(24.063f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(24.063f, 17.0f)
                lineTo(17.281f, 23.781f)
                lineTo(18.719f, 25.219f)
                lineTo(27.219f, 16.719f)
                lineTo(27.906f, 16.0f)
                lineTo(27.219f, 15.281f)
                close()
            }
        }
        .build()
        return _arrowRightSolid!!
    }

private var _arrowRightSolid: ImageVector? = null
