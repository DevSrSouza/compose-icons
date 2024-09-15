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
                moveTo(9.094f, 4.781f)
                lineTo(7.688f, 6.219f)
                lineTo(17.469f, 16.0f)
                lineTo(7.688f, 25.781f)
                lineTo(9.094f, 27.219f)
                lineTo(20.313f, 16.0f)
                close()
                moveTo(16.094f, 4.781f)
                lineTo(14.688f, 6.219f)
                lineTo(24.469f, 16.0f)
                lineTo(14.688f, 25.781f)
                lineTo(16.094f, 27.219f)
                lineTo(27.313f, 16.0f)
                close()
            }
        }
        .build()
        return _angleDoubleRightSolid!!
    }

private var _angleDoubleRightSolid: ImageVector? = null
