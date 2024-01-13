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

public val TablerIcons.CandyOff: ImageVector
    get() {
        if (_candyOff != null) {
            return _candyOff!!
        }
        _candyOff = Builder(name = "CandyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.174f, 7.17f)
                lineToRelative(0.119f, -0.12f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.828f, 0.0f)
                lineToRelative(2.829f, 2.83f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 2.828f)
                lineToRelative(-0.124f, 0.124f)
                moveToRelative(-2.0f, 2.0f)
                lineToRelative(-2.123f, 2.123f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.828f, 0.0f)
                lineToRelative(-2.829f, -2.831f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(2.113f, -2.112f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.243f, 9.172f)
                lineToRelative(3.086f, -0.772f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.697f, -2.516f)
                lineToRelative(-2.216f, -2.217f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, -2.44f, 0.47f)
                lineToRelative(-1.248f, 2.913f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.172f, 16.243f)
                lineToRelative(-0.772f, 3.086f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.516f, 0.697f)
                lineToRelative(-2.217f, -2.216f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.47f, -2.44f)
                lineToRelative(2.913f, -1.248f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _candyOff!!
    }

private var _candyOff: ImageVector? = null
