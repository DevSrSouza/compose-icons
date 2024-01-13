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

public val TablerIcons.LockSquareRoundedFilled: ImageVector
    get() {
        if (_lockSquareRoundedFilled != null) {
            return _lockSquareRoundedFilled!!
        }
        _lockSquareRoundedFilled = Builder(name = "LockSquareRoundedFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-0.218f, 0.0f, -0.432f, 0.002f, -0.642f, 0.005f)
                lineToRelative(-0.616f, 0.017f)
                lineToRelative(-0.299f, 0.013f)
                lineToRelative(-0.579f, 0.034f)
                lineToRelative(-0.553f, 0.046f)
                curveToRelative(-4.785f, 0.464f, -6.732f, 2.411f, -7.196f, 7.196f)
                lineToRelative(-0.046f, 0.553f)
                lineToRelative(-0.034f, 0.579f)
                curveToRelative(-0.005f, 0.098f, -0.01f, 0.198f, -0.013f, 0.299f)
                lineToRelative(-0.017f, 0.616f)
                lineToRelative(-0.004f, 0.318f)
                lineToRelative(-0.001f, 0.324f)
                curveToRelative(0.0f, 0.218f, 0.002f, 0.432f, 0.005f, 0.642f)
                lineToRelative(0.017f, 0.616f)
                lineToRelative(0.013f, 0.299f)
                lineToRelative(0.034f, 0.579f)
                lineToRelative(0.046f, 0.553f)
                curveToRelative(0.464f, 4.785f, 2.411f, 6.732f, 7.196f, 7.196f)
                lineToRelative(0.553f, 0.046f)
                lineToRelative(0.579f, 0.034f)
                curveToRelative(0.098f, 0.005f, 0.198f, 0.01f, 0.299f, 0.013f)
                lineToRelative(0.616f, 0.017f)
                lineToRelative(0.642f, 0.005f)
                lineToRelative(0.642f, -0.005f)
                lineToRelative(0.616f, -0.017f)
                lineToRelative(0.299f, -0.013f)
                lineToRelative(0.579f, -0.034f)
                lineToRelative(0.553f, -0.046f)
                curveToRelative(4.785f, -0.464f, 6.732f, -2.411f, 7.196f, -7.196f)
                lineToRelative(0.046f, -0.553f)
                lineToRelative(0.034f, -0.579f)
                curveToRelative(0.005f, -0.098f, 0.01f, -0.198f, 0.013f, -0.299f)
                lineToRelative(0.017f, -0.616f)
                lineToRelative(0.005f, -0.642f)
                lineToRelative(-0.005f, -0.642f)
                lineToRelative(-0.017f, -0.616f)
                lineToRelative(-0.013f, -0.299f)
                lineToRelative(-0.034f, -0.579f)
                lineToRelative(-0.046f, -0.553f)
                curveToRelative(-0.464f, -4.785f, -2.411f, -6.732f, -7.196f, -7.196f)
                lineToRelative(-0.553f, -0.046f)
                lineToRelative(-0.579f, -0.034f)
                arcToRelative(28.058f, 28.058f, 0.0f, false, false, -0.299f, -0.013f)
                lineToRelative(-0.616f, -0.017f)
                lineToRelative(-0.318f, -0.004f)
                lineToRelative(-0.324f, -0.001f)
                close()
                moveTo(12.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, 2.824f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                verticalLineToRelative(-1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(15.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(12.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, 0.883f)
                lineToRelative(-0.007f, 0.117f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _lockSquareRoundedFilled!!
    }

private var _lockSquareRoundedFilled: ImageVector? = null
