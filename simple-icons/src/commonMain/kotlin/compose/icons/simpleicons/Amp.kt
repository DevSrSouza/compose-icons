package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Amp: ImageVector
    get() {
        if (_amp != null) {
            return _amp!!
        }
        _amp = Builder(name = "Amp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveToRelative(6.628f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                reflectiveCurveToRelative(-5.372f, 12.0f, -12.0f, 12.0f)
                curveTo(5.373f, 24.0f, 0.0f, 18.627f, 0.0f, 12.0f)
                reflectiveCurveTo(5.373f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.08f, 19.278f)
                lineToRelative(5.034f, -8.377f)
                arcToRelative(0.444f, 0.444f, 0.0f, false, false, 0.097f, -0.268f)
                arcToRelative(0.455f, 0.455f, 0.0f, false, false, -0.455f, -0.455f)
                lineToRelative(-2.851f, 0.004f)
                lineToRelative(0.924f, -5.468f)
                lineToRelative(-0.927f, -0.003f)
                lineToRelative(-5.018f, 8.367f)
                reflectiveCurveToRelative(-0.1f, 0.183f, -0.1f, 0.291f)
                curveToRelative(0.0f, 0.251f, 0.204f, 0.455f, 0.455f, 0.455f)
                lineToRelative(2.831f, -0.004f)
                lineToRelative(-0.901f, 5.458f)
                close()
            }
        }
        .build()
        return _amp!!
    }

private var _amp: ImageVector? = null
