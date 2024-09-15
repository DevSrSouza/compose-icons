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
                moveTo(5.219f, 6.688f)
                lineTo(3.781f, 8.094f)
                lineTo(16.0f, 20.313f)
                lineTo(28.219f, 8.094f)
                lineTo(26.781f, 6.688f)
                lineTo(16.0f, 17.469f)
                close()
                moveTo(5.219f, 13.688f)
                lineTo(3.781f, 15.094f)
                lineTo(16.0f, 27.313f)
                lineTo(28.219f, 15.094f)
                lineTo(26.781f, 13.688f)
                lineTo(16.0f, 24.469f)
                close()
            }
        }
        .build()
        return _angleDoubleDownSolid!!
    }

private var _angleDoubleDownSolid: ImageVector? = null
