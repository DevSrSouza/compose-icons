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

public val TablerIcons.EyeFilled: ImageVector
    get() {
        if (_eyeFilled != null) {
            return _eyeFilled!!
        }
        _eyeFilled = Builder(name = "EyeFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.29f, 0.0f, 7.863f, 2.429f, 10.665f, 7.154f)
                lineToRelative(0.22f, 0.379f)
                lineToRelative(0.045f, 0.1f)
                lineToRelative(0.03f, 0.083f)
                lineToRelative(0.014f, 0.055f)
                lineToRelative(0.014f, 0.082f)
                lineToRelative(0.011f, 0.1f)
                verticalLineToRelative(0.11f)
                lineToRelative(-0.014f, 0.111f)
                arcToRelative(0.992f, 0.992f, 0.0f, false, true, -0.026f, 0.11f)
                lineToRelative(-0.039f, 0.108f)
                lineToRelative(-0.036f, 0.075f)
                lineToRelative(-0.016f, 0.03f)
                curveToRelative(-2.764f, 4.836f, -6.3f, 7.38f, -10.555f, 7.499f)
                lineToRelative(-0.313f, 0.004f)
                curveToRelative(-4.396f, 0.0f, -8.037f, -2.549f, -10.868f, -7.504f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -0.992f)
                curveToRelative(2.831f, -4.955f, 6.472f, -7.504f, 10.868f, -7.504f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _eyeFilled!!
    }

private var _eyeFilled: ImageVector? = null
