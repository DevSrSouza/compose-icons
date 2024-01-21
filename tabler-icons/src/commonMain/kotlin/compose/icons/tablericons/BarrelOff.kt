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

public val TablerIcons.BarrelOff: ImageVector
    get() {
        if (_barrelOff != null) {
            return _barrelOff!!
        }
        _barrelOff = Builder(name = "BarrelOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                horizontalLineToRelative(8.722f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.841f, 1.22f)
                curveToRelative(0.958f, 2.26f, 1.437f, 4.52f, 1.437f, 6.78f)
                arcToRelative(16.35f, 16.35f, 0.0f, false, true, -0.407f, 3.609f)
                moveToRelative(-0.964f, 3.013f)
                lineToRelative(-0.066f, 0.158f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.841f, 1.22f)
                horizontalLineToRelative(-9.444f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.841f, -1.22f)
                curveToRelative(-0.958f, -2.26f, -1.437f, -4.52f, -1.437f, -6.78f)
                curveToRelative(0.0f, -2.21f, 0.458f, -4.42f, 1.374f, -6.63f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveToRelative(0.585f, 2.337f, 0.913f, 4.674f, 0.985f, 7.01f)
                moveToRelative(-0.114f, 3.86f)
                arcToRelative(33.415f, 33.415f, 0.0f, false, true, -0.871f, 5.13f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                arcToRelative(34.42f, 34.42f, 0.0f, false, false, -0.366f, 1.632f)
                moveToRelative(-0.506f, 3.501f)
                arcToRelative(32.126f, 32.126f, 0.0f, false, false, -0.128f, 2.867f)
                curveToRelative(0.0f, 2.667f, 0.333f, 5.333f, 1.0f, 8.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.5f, 16.0f)
                horizontalLineToRelative(11.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.5f, 8.0f)
                horizontalLineToRelative(-7.5f)
                moveToRelative(-4.0f, 0.0f)
                horizontalLineToRelative(-3.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _barrelOff!!
    }

private var _barrelOff: ImageVector? = null
