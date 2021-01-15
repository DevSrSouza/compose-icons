package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Round
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
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.514f, 14.639f)
                curveToRelative(0.0f, 3.513f, 2.904f, 6.361f, 6.486f, 6.361f)
                reflectiveCurveToRelative(6.486f, -2.848f, 6.486f, -6.361f)
                arcToRelative(12.574f, 12.574f, 0.0f, false, false, -3.243f, -9.012f)
                arcToRelative(4.025f, 4.025f, 0.0f, false, false, -3.243f, -1.627f)
                arcToRelative(4.025f, 4.025f, 0.0f, false, false, -3.243f, 1.627f)
                arcToRelative(12.574f, 12.574f, 0.0f, false, false, -3.243f, 9.012f)
            }
        }
        .build()
        return _egg!!
    }

private var _egg: ImageVector? = null
