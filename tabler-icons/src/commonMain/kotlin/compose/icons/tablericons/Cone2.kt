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

public val TablerIcons.Cone2: ImageVector
    get() {
        if (_cone2 != null) {
            return _cone2!!
        }
        _cone2 = Builder(name = "Cone2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 5.002f)
                verticalLineToRelative(0.5f)
                lineToRelative(-8.13f, 14.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.74f, 0.0f)
                lineToRelative(-8.13f, -14.989f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -1.659f, 4.03f, -3.003f, 9.0f, -3.003f)
                reflectiveCurveToRelative(9.0f, 1.344f, 9.0f, 3.002f)
            }
        }
        .build()
        return _cone2!!
    }

private var _cone2: ImageVector? = null
