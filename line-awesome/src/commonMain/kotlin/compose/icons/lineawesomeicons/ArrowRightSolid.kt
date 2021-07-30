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
                moveTo(18.7188f, 6.7813f)
                lineTo(17.2813f, 8.2188f)
                lineTo(24.0625f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(24.0625f, 17.0f)
                lineTo(17.2813f, 23.7813f)
                lineTo(18.7188f, 25.2188f)
                lineTo(27.2188f, 16.7188f)
                lineTo(27.9063f, 16.0f)
                lineTo(27.2188f, 15.2813f)
                close()
            }
        }
        .build()
        return _arrowRightSolid!!
    }

private var _arrowRightSolid: ImageVector? = null
