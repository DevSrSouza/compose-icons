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

public val TablerIcons.OvalVerticalFilled: ImageVector
    get() {
        if (_ovalVerticalFilled != null) {
            return _ovalVerticalFilled!!
        }
        _ovalVerticalFilled = Builder(name = "OvalVerticalFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveToRelative(-5.457f, 0.0f, -10.0f, 3.028f, -10.0f, 7.0f)
                reflectiveCurveToRelative(4.543f, 7.0f, 10.0f, 7.0f)
                reflectiveCurveToRelative(10.0f, -3.028f, 10.0f, -7.0f)
                reflectiveCurveToRelative(-4.543f, -7.0f, -10.0f, -7.0f)
                close()
            }
        }
        .build()
        return _ovalVerticalFilled!!
    }

private var _ovalVerticalFilled: ImageVector? = null
