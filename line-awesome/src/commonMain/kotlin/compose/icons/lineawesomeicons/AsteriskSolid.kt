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

public val LineAwesomeIcons.AsteriskSolid: ImageVector
    get() {
        if (_asteriskSolid != null) {
            return _asteriskSolid!!
        }
        _asteriskSolid = Builder(name = "AsteriskSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6992f, 17.0f)
                lineTo(23.8984f, 25.3984f)
                lineTo(21.5f, 27.0f)
                lineTo(16.0f, 18.3008f)
                lineTo(10.5f, 27.0f)
                lineTo(8.1992f, 25.3984f)
                lineTo(14.3984f, 17.0f)
                lineTo(5.1016f, 14.6016f)
                lineTo(6.0f, 12.0f)
                lineTo(15.1016f, 15.1992f)
                lineTo(14.5f, 5.0f)
                lineTo(17.5f, 5.0f)
                lineTo(17.0f, 15.1992f)
                lineTo(26.0f, 12.0f)
                lineTo(26.8008f, 14.6992f)
                close()
            }
        }
        .build()
        return _asteriskSolid!!
    }

private var _asteriskSolid: ImageVector? = null
