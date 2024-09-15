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

public val LineAwesomeIcons.PaperPlaneSolid: ImageVector
    get() {
        if (_paperPlaneSolid != null) {
            return _paperPlaneSolid!!
        }
        _paperPlaneSolid = Builder(name = "PaperPlaneSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.594f, 5.344f)
                lineTo(4.031f, 7.219f)
                lineTo(5.969f, 16.0f)
                lineTo(4.031f, 24.781f)
                lineTo(3.594f, 26.656f)
                lineTo(5.375f, 25.938f)
                lineTo(27.375f, 16.938f)
                lineTo(29.656f, 16.0f)
                lineTo(27.375f, 15.063f)
                lineTo(5.375f, 6.063f)
                close()
                moveTo(6.375f, 8.656f)
                lineTo(21.906f, 15.0f)
                lineTo(7.781f, 15.0f)
                close()
                moveTo(7.781f, 17.0f)
                lineTo(21.906f, 17.0f)
                lineTo(6.375f, 23.344f)
                close()
            }
        }
        .build()
        return _paperPlaneSolid!!
    }

private var _paperPlaneSolid: ImageVector? = null
