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

public val TablerIcons.SquareF0Filled: ImageVector
    get() {
        if (_squareF0Filled != null) {
            return _squareF0Filled!!
        }
        _squareF0Filled = Builder(name = "SquareF0Filled", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(14.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.495f, 2.336f)
                lineToRelative(-0.005f, 0.164f)
                verticalLineToRelative(3.0f)
                lineToRelative(0.005f, 0.164f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 4.99f, 0.0f)
                lineToRelative(0.005f, -0.164f)
                verticalLineToRelative(-3.0f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.495f, -2.336f)
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
                moveTo(14.5f, 10.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.492f, 0.41f)
                lineToRelative(0.008f, 0.09f)
                verticalLineToRelative(3.0f)
                lineToRelative(-0.008f, 0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.984f, 0.0f)
                lineToRelative(-0.008f, -0.09f)
                verticalLineToRelative(-3.0f)
                lineToRelative(0.008f, -0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.492f, -0.41f)
                close()
            }
        }
        .build()
        return _squareF0Filled!!
    }

private var _squareF0Filled: ImageVector? = null
