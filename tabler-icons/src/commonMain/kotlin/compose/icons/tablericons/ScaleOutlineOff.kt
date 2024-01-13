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

public val TablerIcons.ScaleOutlineOff: ImageVector
    get() {
        if (_scaleOutlineOff != null) {
            return _scaleOutlineOff!!
        }
        _scaleOutlineOff = Builder(name = "ScaleOutlineOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(10.0f)
                moveToRelative(-1.173f, 2.83f)
                arcToRelative(3.987f, 3.987f, 0.0f, false, true, -2.827f, 1.17f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineToRelative(-10.0f)
                curveToRelative(0.0f, -1.104f, 0.447f, -2.103f, 1.17f, -2.827f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.062f, 7.062f)
                curveToRelative(0.31f, -0.041f, 0.622f, -0.062f, 0.938f, -0.062f)
                curveToRelative(1.956f, 0.0f, 3.724f, 0.802f, 5.0f, 2.095f)
                arcToRelative(142.85f, 142.85f, 0.0f, false, false, -2.0f, 1.905f)
                moveToRelative(-3.723f, 0.288f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -1.315f, 0.71f)
                lineToRelative(-2.956f, -2.903f)
                arcToRelative(6.977f, 6.977f, 0.0f, false, true, 1.142f, -0.942f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _scaleOutlineOff!!
    }

private var _scaleOutlineOff: ImageVector? = null
