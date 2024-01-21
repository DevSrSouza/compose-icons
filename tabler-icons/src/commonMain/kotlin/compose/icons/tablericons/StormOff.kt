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

public val TablerIcons.StormOff: ImageVector
    get() {
        if (_stormOff != null) {
            return _stormOff!!
        }
        _stormOff = Builder(name = "StormOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.884f, 9.874f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 4.24f, 4.246f)
                moveToRelative(0.57f, -3.441f)
                arcToRelative(3.012f, 3.012f, 0.0f, false, false, -1.41f, -1.39f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.037f, 7.063f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, 9.907f, 9.892f)
                moveToRelative(1.585f, -2.426f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -9.058f, -9.059f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.369f, 14.236f)
                curveToRelative(-1.605f, -3.428f, -1.597f, -6.673f, -1.0f, -9.849f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.63f, 9.76f)
                arcToRelative(14.323f, 14.323f, 0.0f, false, true, 1.368f, 6.251f)
                moveToRelative(-0.37f, 3.608f)
                curveToRelative(-0.087f, 0.46f, -0.187f, 0.92f, -0.295f, 1.377f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _stormOff!!
    }

private var _stormOff: ImageVector? = null
