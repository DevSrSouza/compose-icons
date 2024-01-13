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

public val TablerIcons.WindmillFilled: ImageVector
    get() {
        if (_windmillFilled != null) {
            return _windmillFilled!!
        }
        _windmillFilled = Builder(name = "WindmillFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.292f, 0.0f, 6.0f, 2.435f, 6.0f, 5.5f)
                curveToRelative(0.0f, 1.337f, -0.515f, 2.554f, -1.369f, 3.5f)
                horizontalLineToRelative(4.369f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                curveToRelative(0.0f, 3.292f, -2.435f, 6.0f, -5.5f, 6.0f)
                curveToRelative(-1.336f, 0.0f, -2.553f, -0.515f, -3.5f, -1.368f)
                verticalLineToRelative(4.368f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                curveToRelative(-3.292f, 0.0f, -6.0f, -2.435f, -6.0f, -5.5f)
                curveToRelative(0.0f, -1.336f, 0.515f, -2.553f, 1.368f, -3.5f)
                horizontalLineToRelative(-4.368f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                curveToRelative(0.0f, -3.292f, 2.435f, -6.0f, 5.5f, -6.0f)
                curveToRelative(1.337f, 0.0f, 2.554f, 0.515f, 3.5f, 1.369f)
                verticalLineToRelative(-4.369f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _windmillFilled!!
    }

private var _windmillFilled: ImageVector? = null
