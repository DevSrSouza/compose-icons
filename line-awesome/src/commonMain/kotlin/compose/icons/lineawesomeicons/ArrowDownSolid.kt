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

public val LineAwesomeIcons.ArrowDownSolid: ImageVector
    get() {
        if (_arrowDownSolid != null) {
            return _arrowDownSolid!!
        }
        _arrowDownSolid = Builder(name = "ArrowDownSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 24.063f)
                lineTo(8.219f, 17.281f)
                lineTo(6.781f, 18.719f)
                lineTo(15.281f, 27.219f)
                lineTo(16.0f, 27.906f)
                lineTo(16.719f, 27.219f)
                lineTo(25.219f, 18.719f)
                lineTo(23.781f, 17.281f)
                lineTo(17.0f, 24.063f)
                lineTo(17.0f, 4.0f)
                close()
            }
        }
        .build()
        return _arrowDownSolid!!
    }

private var _arrowDownSolid: ImageVector? = null
