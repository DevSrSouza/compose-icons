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

public val TablerIcons.SquareRoundedNumber7Filled: ImageVector
    get() {
        if (_squareRoundedNumber7Filled != null) {
            return _squareRoundedNumber7Filled!!
        }
        _squareRoundedNumber7Filled = Builder(name = "SquareRoundedNumber7Filled", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineToRelative(0.642f, 0.005f)
                lineToRelative(0.616f, 0.017f)
                lineToRelative(0.299f, 0.013f)
                lineToRelative(0.579f, 0.034f)
                lineToRelative(0.553f, 0.046f)
                curveToRelative(4.687f, 0.455f, 6.65f, 2.333f, 7.166f, 6.906f)
                lineToRelative(0.03f, 0.29f)
                lineToRelative(0.046f, 0.553f)
                lineToRelative(0.041f, 0.727f)
                lineToRelative(0.006f, 0.15f)
                lineToRelative(0.017f, 0.617f)
                lineToRelative(0.005f, 0.642f)
                lineToRelative(-0.005f, 0.642f)
                lineToRelative(-0.017f, 0.616f)
                lineToRelative(-0.013f, 0.299f)
                lineToRelative(-0.034f, 0.579f)
                lineToRelative(-0.046f, 0.553f)
                curveToRelative(-0.455f, 4.687f, -2.333f, 6.65f, -6.906f, 7.166f)
                lineToRelative(-0.29f, 0.03f)
                lineToRelative(-0.553f, 0.046f)
                lineToRelative(-0.727f, 0.041f)
                lineToRelative(-0.15f, 0.006f)
                lineToRelative(-0.617f, 0.017f)
                lineToRelative(-0.642f, 0.005f)
                lineToRelative(-0.642f, -0.005f)
                lineToRelative(-0.616f, -0.017f)
                lineToRelative(-0.299f, -0.013f)
                lineToRelative(-0.579f, -0.034f)
                lineToRelative(-0.553f, -0.046f)
                curveToRelative(-4.687f, -0.455f, -6.65f, -2.333f, -7.166f, -6.906f)
                lineToRelative(-0.03f, -0.29f)
                lineToRelative(-0.046f, -0.553f)
                lineToRelative(-0.041f, -0.727f)
                lineToRelative(-0.006f, -0.15f)
                lineToRelative(-0.017f, -0.617f)
                lineToRelative(-0.004f, -0.318f)
                verticalLineToRelative(-0.648f)
                lineToRelative(0.004f, -0.318f)
                lineToRelative(0.017f, -0.616f)
                lineToRelative(0.013f, -0.299f)
                lineToRelative(0.034f, -0.579f)
                lineToRelative(0.046f, -0.553f)
                curveToRelative(0.455f, -4.687f, 2.333f, -6.65f, 6.906f, -7.166f)
                lineToRelative(0.29f, -0.03f)
                lineToRelative(0.553f, -0.046f)
                lineToRelative(0.727f, -0.041f)
                lineToRelative(0.15f, -0.006f)
                lineToRelative(0.617f, -0.017f)
                curveToRelative(0.21f, -0.003f, 0.424f, -0.005f, 0.642f, -0.005f)
                close()
                moveTo(14.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.876f, 0.876f)
                lineToRelative(-0.007f, 0.117f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.876f, 0.876f)
                lineToRelative(0.117f, 0.007f)
                horizontalLineToRelative(2.718f)
                lineToRelative(-1.688f, 6.757f)
                lineToRelative(-0.022f, 0.115f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.927f, 0.482f)
                lineToRelative(0.035f, -0.111f)
                lineToRelative(2.0f, -8.0f)
                lineToRelative(0.021f, -0.112f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.878f, -1.125f)
                lineToRelative(-0.113f, -0.006f)
                close()
            }
        }
        .build()
        return _squareRoundedNumber7Filled!!
    }

private var _squareRoundedNumber7Filled: ImageVector? = null
