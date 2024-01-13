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

public val TablerIcons.Cone: ImageVector
    get() {
        if (_cone != null) {
            return _cone!!
        }
        _cone = Builder(name = "Cone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 17.998f)
                verticalLineToRelative(-0.5f)
                lineToRelative(-8.13f, -14.99f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.74f, 0.0f)
                lineToRelative(-8.13f, 14.989f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 1.659f, 4.03f, 3.003f, 9.0f, 3.003f)
                reflectiveCurveToRelative(9.0f, -1.344f, 9.0f, -3.002f)
            }
        }
        .build()
        return _cone!!
    }

private var _cone: ImageVector? = null
