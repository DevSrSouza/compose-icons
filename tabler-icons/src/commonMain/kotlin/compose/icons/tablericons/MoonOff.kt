package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.MoonOff: ImageVector
    get() {
        if (_moonOff != null) {
            return _moonOff!!
        }
        _moonOff = Builder(name = "MoonOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.962f, 3.949f)
                arcToRelative(8.97f, 8.97f, 0.0f, false, true, 4.038f, -0.957f)
                verticalLineToRelative(0.008f)
                horizontalLineToRelative(0.393f)
                arcToRelative(7.478f, 7.478f, 0.0f, false, false, -2.07f, 3.308f)
                moveToRelative(-0.141f, 3.84f)
                curveToRelative(0.186f, 0.823f, 0.514f, 1.626f, 0.989f, 2.373f)
                arcToRelative(7.49f, 7.49f, 0.0f, false, false, 4.586f, 3.268f)
                moveToRelative(3.893f, -0.11f)
                curveToRelative(0.223f, -0.067f, 0.444f, -0.144f, 0.663f, -0.233f)
                arcToRelative(9.088f, 9.088f, 0.0f, false, true, -0.274f, 0.597f)
                moveToRelative(-1.695f, 2.337f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -12.71f, -12.749f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _moonOff!!
    }

private var _moonOff: ImageVector? = null
