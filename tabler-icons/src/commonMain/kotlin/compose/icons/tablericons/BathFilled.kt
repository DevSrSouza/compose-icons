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

public val TablerIcons.BathFilled: ImageVector
    get() {
        if (_bathFilled != null) {
            return _bathFilled!!
        }
        _bathFilled = Builder(name = "BathFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.25f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-1.25f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.475f, -0.638f, 2.8f, -1.654f, 3.715f)
                lineToRelative(0.486f, 0.73f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.594f, 1.203f)
                lineToRelative(-0.07f, -0.093f)
                lineToRelative(-0.55f, -0.823f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, true, -1.337f, 0.26f)
                lineToRelative(-0.281f, 0.008f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(4.994f, 4.994f, 0.0f, false, true, -1.619f, -0.268f)
                lineToRelative(-0.549f, 0.823f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.723f, -1.009f)
                lineToRelative(0.059f, -0.1f)
                lineToRelative(0.486f, -0.73f)
                arcToRelative(4.987f, 4.987f, 0.0f, false, true, -1.647f, -3.457f)
                lineToRelative(-0.007f, -0.259f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.824f, -2.995f)
                lineToRelative(0.176f, -0.005f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _bathFilled!!
    }

private var _bathFilled: ImageVector? = null
