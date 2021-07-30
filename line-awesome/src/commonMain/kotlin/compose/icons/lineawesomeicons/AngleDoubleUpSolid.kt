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

public val LineAwesomeIcons.AngleDoubleUpSolid: ImageVector
    get() {
        if (_angleDoubleUpSolid != null) {
            return _angleDoubleUpSolid!!
        }
        _angleDoubleUpSolid = Builder(name = "AngleDoubleUpSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.6875f)
                lineTo(3.7813f, 16.9063f)
                lineTo(5.2188f, 18.3125f)
                lineTo(16.0f, 7.5313f)
                lineTo(26.7813f, 18.3125f)
                lineTo(28.2188f, 16.9063f)
                close()
                moveTo(16.0f, 11.6875f)
                lineTo(3.7813f, 23.9063f)
                lineTo(5.2188f, 25.3125f)
                lineTo(16.0f, 14.5313f)
                lineTo(26.7813f, 25.3125f)
                lineTo(28.2188f, 23.9063f)
                close()
            }
        }
        .build()
        return _angleDoubleUpSolid!!
    }

private var _angleDoubleUpSolid: ImageVector? = null
