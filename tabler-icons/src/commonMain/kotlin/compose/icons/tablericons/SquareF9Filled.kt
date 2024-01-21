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

public val TablerIcons.SquareF9Filled: ImageVector
    get() {
        if (_squareF9Filled != null) {
            return _squareF9Filled!!
        }
        _squareF9Filled = Builder(name = "SquareF9Filled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.333f, 2.0f)
                curveToRelative(1.96f, 0.0f, 3.56f, 1.537f, 3.662f, 3.472f)
                lineToRelative(0.005f, 0.195f)
                verticalLineToRelative(12.666f)
                curveToRelative(0.0f, 1.96f, -1.537f, 3.56f, -3.472f, 3.662f)
                lineToRelative(-0.195f, 0.005f)
                horizontalLineToRelative(-12.666f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, true, -3.662f, -3.472f)
                lineToRelative(-0.005f, -0.195f)
                verticalLineToRelative(-12.666f)
                curveToRelative(0.0f, -1.96f, 1.537f, -3.56f, 3.472f, -3.662f)
                lineToRelative(0.195f, -0.005f)
                horizontalLineToRelative(12.666f)
                close()
                moveTo(15.25f, 8.0f)
                horizontalLineToRelative(-1.5f)
                lineToRelative(-0.144f, 0.006f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.606f, 1.744f)
                verticalLineToRelative(1.5f)
                lineToRelative(0.006f, 0.144f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.744f, 1.606f)
                horizontalLineToRelative(1.25f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.033f)
                lineToRelative(-0.025f, -0.087f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.942f, 0.337f)
                curveToRelative(0.0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
                horizontalLineToRelative(1.5f)
                lineToRelative(0.144f, -0.006f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.606f, -1.744f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-0.006f, -0.144f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.744f, -1.606f)
                close()
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.883f, 0.993f)
                verticalLineToRelative(6.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, 0.883f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, -0.993f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                close()
                moveTo(15.0f, 10.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _squareF9Filled!!
    }

private var _squareF9Filled: ImageVector? = null
