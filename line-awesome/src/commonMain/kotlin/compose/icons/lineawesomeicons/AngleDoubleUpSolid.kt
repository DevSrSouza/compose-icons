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
                moveTo(16.0f, 4.688f)
                lineTo(3.781f, 16.906f)
                lineTo(5.219f, 18.313f)
                lineTo(16.0f, 7.531f)
                lineTo(26.781f, 18.313f)
                lineTo(28.219f, 16.906f)
                close()
                moveTo(16.0f, 11.688f)
                lineTo(3.781f, 23.906f)
                lineTo(5.219f, 25.313f)
                lineTo(16.0f, 14.531f)
                lineTo(26.781f, 25.313f)
                lineTo(28.219f, 23.906f)
                close()
            }
        }
        .build()
        return _angleDoubleUpSolid!!
    }

private var _angleDoubleUpSolid: ImageVector? = null
