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

public val LineAwesomeIcons.AngleRightSolid: ImageVector
    get() {
        if (_angleRightSolid != null) {
            return _angleRightSolid!!
        }
        _angleRightSolid = Builder(name = "AngleRightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.969f, 4.281f)
                lineTo(11.531f, 5.719f)
                lineTo(21.813f, 16.0f)
                lineTo(11.531f, 26.281f)
                lineTo(12.969f, 27.719f)
                lineTo(23.969f, 16.719f)
                lineTo(24.656f, 16.0f)
                lineTo(23.969f, 15.281f)
                close()
            }
        }
        .build()
        return _angleRightSolid!!
    }

private var _angleRightSolid: ImageVector? = null
