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

public val TablerIcons.Alpha: ImageVector
    get() {
        if (_alpha != null) {
            return _alpha!!
        }
        _alpha = Builder(name = "Alpha", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.1f, 6.0f)
                curveToRelative(-1.1f, 2.913f, -1.9f, 4.913f, -2.4f, 6.0f)
                curveToRelative(-1.879f, 4.088f, -3.713f, 6.0f, -6.0f, 6.0f)
                curveToRelative(-2.4f, 0.0f, -4.8f, -2.4f, -4.8f, -6.0f)
                reflectiveCurveToRelative(2.4f, -6.0f, 4.8f, -6.0f)
                curveToRelative(2.267f, 0.0f, 4.135f, 1.986f, 6.0f, 6.0f)
                curveToRelative(0.512f, 1.102f, 1.312f, 3.102f, 2.4f, 6.0f)
            }
        }
        .build()
        return _alpha!!
    }

private var _alpha: ImageVector? = null
