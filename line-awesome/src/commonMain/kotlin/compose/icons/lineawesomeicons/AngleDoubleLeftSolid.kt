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

public val LineAwesomeIcons.AngleDoubleLeftSolid: ImageVector
    get() {
        if (_angleDoubleLeftSolid != null) {
            return _angleDoubleLeftSolid!!
        }
        _angleDoubleLeftSolid = Builder(name = "AngleDoubleLeftSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9063f, 4.7813f)
                lineTo(4.6875f, 16.0f)
                lineTo(15.9063f, 27.2188f)
                lineTo(17.3125f, 25.7813f)
                lineTo(7.5313f, 16.0f)
                lineTo(17.3125f, 6.2188f)
                close()
                moveTo(22.9063f, 4.7813f)
                lineTo(11.6875f, 16.0f)
                lineTo(22.9063f, 27.2188f)
                lineTo(24.3125f, 25.7813f)
                lineTo(14.5313f, 16.0f)
                lineTo(24.3125f, 6.2188f)
                close()
            }
        }
        .build()
        return _angleDoubleLeftSolid!!
    }

private var _angleDoubleLeftSolid: ImageVector? = null
