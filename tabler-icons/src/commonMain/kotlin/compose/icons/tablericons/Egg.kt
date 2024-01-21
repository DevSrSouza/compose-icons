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

public val TablerIcons.Egg: ImageVector
    get() {
        if (_egg != null) {
            return _egg!!
        }
        _egg = Builder(name = "Egg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 14.083f)
                curveToRelative(0.0f, 4.154f, -2.966f, 6.74f, -7.0f, 6.917f)
                curveToRelative(-4.2f, 0.0f, -7.0f, -2.763f, -7.0f, -6.917f)
                curveToRelative(0.0f, -5.538f, 3.5f, -11.09f, 7.0f, -11.083f)
                curveToRelative(3.5f, 0.007f, 7.0f, 5.545f, 7.0f, 11.083f)
                close()
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
