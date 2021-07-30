package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Signature: ImageVector
    get() {
        if (_signature != null) {
            return _signature!!
        }
        _signature = Builder(name = "Signature", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 17.0f)
                curveToRelative(3.333f, -3.333f, 5.0f, -6.0f, 5.0f, -8.0f)
                curveToRelative(0.0f, -3.0f, -1.0f, -3.0f, -2.0f, -3.0f)
                reflectiveCurveToRelative(-2.032f, 1.085f, -2.0f, 3.0f)
                curveToRelative(0.034f, 2.048f, 1.658f, 4.877f, 2.5f, 6.0f)
                curveToRelative(1.5f, 2.0f, 2.5f, 2.5f, 3.5f, 1.0f)
                lineToRelative(2.0f, -3.0f)
                curveToRelative(0.333f, 2.667f, 1.333f, 4.0f, 3.0f, 4.0f)
                curveToRelative(0.53f, 0.0f, 2.639f, -2.0f, 3.0f, -2.0f)
                curveToRelative(0.517f, 0.0f, 1.517f, 0.667f, 3.0f, 2.0f)
            }
        }
        .build()
        return _signature!!
    }

private var _signature: ImageVector? = null
