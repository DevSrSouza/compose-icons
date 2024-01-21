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

public val TablerIcons.FountainFilled: ImageVector
    get() {
        if (_fountainFilled != null) {
            return _fountainFilled!!
        }
        _fountainFilled = Builder(name = "FountainFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -3.995f, -0.15f)
                lineToRelative(-0.005f, 0.15f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 6.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.993f, -0.117f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, 3.995f)
                lineToRelative(-0.2f, 0.005f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.883f, -0.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.993f, -0.117f)
                lineToRelative(-0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.995f, -0.176f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(-9.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.001f, -2.645f)
                arcToRelative(3.983f, 3.983f, 0.0f, false, true, 2.999f, -1.355f)
                close()
            }
        }
        .build()
        return _fountainFilled!!
    }

private var _fountainFilled: ImageVector? = null
