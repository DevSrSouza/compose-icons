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

public val TablerIcons.SquareF3Filled: ImageVector
    get() {
        if (_squareF3Filled != null) {
            return _squareF3Filled!!
        }
        _squareF3Filled = Builder(name = "SquareF3Filled", defaultWidth = 24.0.dp, defaultHeight =
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
                horizontalLineToRelative(-1.0f)
                lineToRelative(-0.144f, 0.007f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -1.356f, 1.493f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.727f, -0.457f)
                lineToRelative(0.02f, -0.036f)
                horizontalLineToRelative(0.636f)
                lineToRelative(0.09f, 0.008f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.984f)
                lineToRelative(-0.09f, 0.008f)
                horizontalLineToRelative(-0.5f)
                lineToRelative(-0.133f, 0.007f)
                curveToRelative(-1.156f, 0.124f, -1.156f, 1.862f, 0.0f, 1.986f)
                lineToRelative(0.133f, 0.007f)
                horizontalLineToRelative(0.5f)
                lineToRelative(0.09f, 0.008f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.41f, 0.492f)
                lineToRelative(-0.008f, 0.09f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.492f, 0.41f)
                horizontalLineToRelative(-0.635f)
                lineToRelative(-0.02f, -0.036f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.845f, 0.536f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(1.0f)
                lineToRelative(0.164f, -0.005f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 2.336f, -2.495f)
                lineToRelative(-0.005f, -0.164f)
                arcToRelative(2.487f, 2.487f, 0.0f, false, false, -0.477f, -1.312f)
                lineToRelative(-0.019f, -0.024f)
                lineToRelative(0.126f, -0.183f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, -2.125f, -3.817f)
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
            }
        }
        .build()
        return _squareF3Filled!!
    }

private var _squareF3Filled: ImageVector? = null
