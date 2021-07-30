package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.PlaneDeparture: ImageVector
    get() {
        if (_planeDeparture != null) {
            return _planeDeparture!!
        }
        _planeDeparture = Builder(name = "PlaneDeparture", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.639f, 10.2576f)
                lineToRelative(4.8296f, -1.2941f)
                arcToRelative(2.0f, 2.0f, 111.5762f, false, true, 1.0353f, 3.8637f)
                lineToRelative(-14.4889f, 3.8823f)
                lineToRelative(-4.4507f, -5.0191f)
                lineToRelative(2.8978f, -0.7765f)
                lineToRelative(2.4495f, 1.4142f)
                lineToRelative(2.8978f, -0.7765f)
                lineToRelative(-3.7436f, -6.2438f)
                lineToRelative(2.8978f, -0.7765f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 21.0f)
                lineTo(21.0f, 21.0f)
            }
        }
        .build()
        return _planeDeparture!!
    }

private var _planeDeparture: ImageVector? = null
