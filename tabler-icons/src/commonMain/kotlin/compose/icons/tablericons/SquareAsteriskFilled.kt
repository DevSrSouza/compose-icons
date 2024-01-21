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

public val TablerIcons.SquareAsteriskFilled: ImageVector
    get() {
        if (_squareAsteriskFilled != null) {
            return _squareAsteriskFilled!!
        }
        _squareAsteriskFilled = Builder(name = "SquareAsteriskFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, 3.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.0f, -3.0f)
                close()
                moveTo(12.0f, 7.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(1.631f)
                lineToRelative(-1.445f, -0.963f)
                lineToRelative(-0.101f, -0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.009f, 1.724f)
                lineToRelative(1.75f, 1.168f)
                lineToRelative(-1.75f, 1.169f)
                lineToRelative(-0.093f, 0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.203f, 1.594f)
                lineToRelative(1.445f, -0.965f)
                verticalLineToRelative(1.632f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.993f, -0.117f)
                verticalLineToRelative(-1.631f)
                lineToRelative(1.445f, 0.963f)
                lineToRelative(0.101f, 0.06f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.009f, -1.724f)
                lineToRelative(-1.752f, -1.169f)
                lineToRelative(1.752f, -1.167f)
                lineToRelative(0.093f, -0.07f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.203f, -1.594f)
                lineToRelative(-1.445f, 0.962f)
                verticalLineToRelative(-1.63f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
        }
        .build()
        return _squareAsteriskFilled!!
    }

private var _squareAsteriskFilled: ImageVector? = null
