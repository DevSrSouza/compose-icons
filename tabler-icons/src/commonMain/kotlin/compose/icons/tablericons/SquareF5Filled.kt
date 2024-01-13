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

public val TablerIcons.SquareF5Filled: ImageVector
    get() {
        if (_squareF5Filled != null) {
            return _squareF5Filled!!
        }
        _squareF5Filled = Builder(name = "SquareF5Filled", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(16.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.857f, 0.764f)
                lineToRelative(-0.02f, 0.112f)
                lineToRelative(-0.006f, 0.117f)
                verticalLineToRelative(3.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.764f, 0.857f)
                lineToRelative(0.112f, 0.02f)
                lineToRelative(0.117f, 0.006f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-1.033f)
                lineToRelative(-0.025f, -0.087f)
                lineToRelative(-0.049f, -0.113f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.893f, 0.45f)
                curveToRelative(0.0f, 0.867f, 0.63f, 1.587f, 1.458f, 1.726f)
                lineToRelative(0.148f, 0.018f)
                lineToRelative(0.144f, 0.006f)
                horizontalLineToRelative(1.25f)
                lineToRelative(0.157f, -0.006f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.819f, -1.683f)
                lineToRelative(0.019f, -0.162f)
                lineToRelative(0.005f, -0.149f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-0.006f, -0.157f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.683f, -1.819f)
                lineToRelative(-0.162f, -0.019f)
                lineToRelative(-0.149f, -0.005f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.857f, -0.764f)
                lineToRelative(0.02f, -0.112f)
                lineToRelative(0.006f, -0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.764f, -0.857f)
                lineToRelative(-0.112f, -0.02f)
                lineToRelative(-0.117f, -0.006f)
                close()
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.876f, 0.876f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(6.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.876f, -0.876f)
                lineToRelative(0.007f, -0.117f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }
        .build()
        return _squareF5Filled!!
    }

private var _squareF5Filled: ImageVector? = null
