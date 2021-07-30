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
                moveTo(12.9688f, 4.2813f)
                lineTo(11.5313f, 5.7188f)
                lineTo(21.8125f, 16.0f)
                lineTo(11.5313f, 26.2813f)
                lineTo(12.9688f, 27.7188f)
                lineTo(23.9688f, 16.7188f)
                lineTo(24.6563f, 16.0f)
                lineTo(23.9688f, 15.2813f)
                close()
            }
        }
        .build()
        return _angleRightSolid!!
    }

private var _angleRightSolid: ImageVector? = null
