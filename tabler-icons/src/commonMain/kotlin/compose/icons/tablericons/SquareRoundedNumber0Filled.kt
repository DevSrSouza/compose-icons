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

public val TablerIcons.SquareRoundedNumber0Filled: ImageVector
    get() {
        if (_squareRoundedNumber0Filled != null) {
            return _squareRoundedNumber0Filled!!
        }
        _squareRoundedNumber0Filled = Builder(name = "SquareRoundedNumber0Filled", defaultWidth =
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
                moveTo(12.0f, 7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _squareRoundedNumber0Filled!!
    }

private var _squareRoundedNumber0Filled: ImageVector? = null
