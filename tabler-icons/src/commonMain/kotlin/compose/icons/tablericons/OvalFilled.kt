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

public val TablerIcons.OvalFilled: ImageVector
    get() {
        if (_ovalFilled != null) {
            return _ovalFilled!!
        }
        _ovalFilled = Builder(name = "OvalFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.972f, 0.0f, 7.0f, 4.542f, 7.0f, 10.0f)
                reflectiveCurveToRelative(-3.028f, 10.0f, -7.0f, 10.0f)
                curveToRelative(-3.9f, 0.0f, -6.89f, -4.379f, -6.997f, -9.703f)
                lineToRelative(-0.003f, -0.297f)
                lineToRelative(0.003f, -0.297f)
                curveToRelative(0.107f, -5.323f, 3.097f, -9.703f, 6.997f, -9.703f)
                close()
            }
        }
        .build()
        return _ovalFilled!!
    }

private var _ovalFilled: ImageVector? = null
