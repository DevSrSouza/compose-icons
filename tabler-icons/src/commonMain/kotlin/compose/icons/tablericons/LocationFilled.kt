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

public val TablerIcons.LocationFilled: ImageVector
    get() {
        if (_locationFilled != null) {
            return _locationFilled!!
        }
        _locationFilled = Builder(name = "LocationFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.891f, 2.006f)
                lineToRelative(0.106f, -0.006f)
                lineToRelative(0.13f, 0.008f)
                lineToRelative(0.09f, 0.016f)
                lineToRelative(0.123f, 0.035f)
                lineToRelative(0.107f, 0.046f)
                lineToRelative(0.1f, 0.057f)
                lineToRelative(0.09f, 0.067f)
                lineToRelative(0.082f, 0.075f)
                lineToRelative(0.052f, 0.059f)
                lineToRelative(0.082f, 0.116f)
                lineToRelative(0.052f, 0.096f)
                curveToRelative(0.047f, 0.1f, 0.077f, 0.206f, 0.09f, 0.316f)
                lineToRelative(0.005f, 0.106f)
                curveToRelative(0.0f, 0.075f, -0.008f, 0.149f, -0.024f, 0.22f)
                lineToRelative(-0.035f, 0.123f)
                lineToRelative(-6.532f, 18.077f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -1.409f, 0.903f)
                arcToRelative(1.547f, 1.547f, 0.0f, false, true, -1.329f, -0.747f)
                lineToRelative(-0.065f, -0.127f)
                lineToRelative(-3.352f, -6.702f)
                lineToRelative(-6.67f, -3.336f)
                arcToRelative(1.55f, 1.55f, 0.0f, false, true, -0.898f, -1.259f)
                lineToRelative(-0.006f, -0.149f)
                curveToRelative(0.0f, -0.56f, 0.301f, -1.072f, 0.841f, -1.37f)
                lineToRelative(0.14f, -0.07f)
                lineToRelative(18.017f, -6.506f)
                lineToRelative(0.106f, -0.03f)
                lineToRelative(0.108f, -0.018f)
                close()
            }
        }
        .build()
        return _locationFilled!!
    }

private var _locationFilled: ImageVector? = null
