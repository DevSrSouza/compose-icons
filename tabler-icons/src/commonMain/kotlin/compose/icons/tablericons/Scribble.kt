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

public val TablerIcons.Scribble: ImageVector
    get() {
        if (_scribble != null) {
            return _scribble!!
        }
        _scribble = Builder(name = "Scribble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 15.0f)
                curveToRelative(2.0f, 3.0f, 4.0f, 4.0f, 7.0f, 4.0f)
                reflectiveCurveToRelative(7.0f, -3.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(-3.0f, -7.0f, -6.0f, -7.0f)
                reflectiveCurveToRelative(-5.0f, 1.5f, -5.0f, 4.0f)
                reflectiveCurveToRelative(2.0f, 5.0f, 6.0f, 5.0f)
                reflectiveCurveToRelative(8.408f, -2.453f, 10.0f, -5.0f)
            }
        }
        .build()
        return _scribble!!
    }

private var _scribble: ImageVector? = null
