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

public val LineAwesomeIcons.AngleDoubleDownSolid: ImageVector
    get() {
        if (_angleDoubleDownSolid != null) {
            return _angleDoubleDownSolid!!
        }
        _angleDoubleDownSolid = Builder(name = "AngleDoubleDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2188f, 6.6875f)
                lineTo(3.7813f, 8.0938f)
                lineTo(16.0f, 20.3125f)
                lineTo(28.2188f, 8.0938f)
                lineTo(26.7813f, 6.6875f)
                lineTo(16.0f, 17.4688f)
                close()
                moveTo(5.2188f, 13.6875f)
                lineTo(3.7813f, 15.0938f)
                lineTo(16.0f, 27.3125f)
                lineTo(28.2188f, 15.0938f)
                lineTo(26.7813f, 13.6875f)
                lineTo(16.0f, 24.4688f)
                close()
            }
        }
        .build()
        return _angleDoubleDownSolid!!
    }

private var _angleDoubleDownSolid: ImageVector? = null
