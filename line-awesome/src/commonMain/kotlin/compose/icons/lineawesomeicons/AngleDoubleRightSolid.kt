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

public val LineAwesomeIcons.AngleDoubleRightSolid: ImageVector
    get() {
        if (_angleDoubleRightSolid != null) {
            return _angleDoubleRightSolid!!
        }
        _angleDoubleRightSolid = Builder(name = "AngleDoubleRightSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0938f, 4.7813f)
                lineTo(7.6875f, 6.2188f)
                lineTo(17.4688f, 16.0f)
                lineTo(7.6875f, 25.7813f)
                lineTo(9.0938f, 27.2188f)
                lineTo(20.3125f, 16.0f)
                close()
                moveTo(16.0938f, 4.7813f)
                lineTo(14.6875f, 6.2188f)
                lineTo(24.4688f, 16.0f)
                lineTo(14.6875f, 25.7813f)
                lineTo(16.0938f, 27.2188f)
                lineTo(27.3125f, 16.0f)
                close()
            }
        }
        .build()
        return _angleDoubleRightSolid!!
    }

private var _angleDoubleRightSolid: ImageVector? = null
