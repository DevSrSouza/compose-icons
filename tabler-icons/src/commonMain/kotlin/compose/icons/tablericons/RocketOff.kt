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

public val TablerIcons.RocketOff: ImageVector
    get() {
        if (_rocketOff != null) {
            return _rocketOff!!
        }
        _rocketOff = Builder(name = "RocketOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.29f, 9.275f)
                arcToRelative(9.03f, 9.03f, 0.0f, false, false, -0.29f, 0.725f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.0f, 3.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.0f, 7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -5.0f)
                curveToRelative(0.241f, -0.085f, 0.478f, -0.18f, 0.708f, -0.283f)
                moveToRelative(2.428f, -1.61f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 2.864f, -6.107f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, -3.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -6.107f, 2.864f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.0f, 6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _rocketOff!!
    }

private var _rocketOff: ImageVector? = null
