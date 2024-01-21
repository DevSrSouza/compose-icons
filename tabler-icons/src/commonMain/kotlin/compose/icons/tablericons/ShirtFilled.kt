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

public val TablerIcons.ShirtFilled: ImageVector
    get() {
        if (_shirtFilled != null) {
            return _shirtFilled!!
        }
        _shirtFilled = Builder(name = "ShirtFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.883f, 3.007f)
                lineToRelative(0.095f, -0.007f)
                lineToRelative(0.112f, 0.004f)
                lineToRelative(0.113f, 0.017f)
                lineToRelative(0.113f, 0.03f)
                lineToRelative(6.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.677f, 0.833f)
                lineToRelative(0.007f, 0.116f)
                verticalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.883f, 0.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.576f, -0.906f)
                lineToRelative(0.108f, -0.043f)
                lineToRelative(6.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.316f, 0.949f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 3.995f, 0.15f)
                lineToRelative(0.009f, -0.24f)
                lineToRelative(0.017f, -0.113f)
                lineToRelative(0.037f, -0.134f)
                lineToRelative(0.044f, -0.103f)
                lineToRelative(0.05f, -0.092f)
                lineToRelative(0.068f, -0.093f)
                lineToRelative(0.069f, -0.08f)
                curveToRelative(0.056f, -0.054f, 0.113f, -0.1f, 0.175f, -0.14f)
                lineToRelative(0.096f, -0.053f)
                lineToRelative(0.103f, -0.044f)
                lineToRelative(0.108f, -0.032f)
                lineToRelative(0.112f, -0.02f)
                close()
            }
        }
        .build()
        return _shirtFilled!!
    }

private var _shirtFilled: ImageVector? = null
