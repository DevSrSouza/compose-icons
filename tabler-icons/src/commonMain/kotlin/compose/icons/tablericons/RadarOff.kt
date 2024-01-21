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

public val TablerIcons.RadarOff: ImageVector
    get() {
        if (_radarOff != null) {
            return _radarOff!!
        }
        _radarOff = Builder(name = "RadarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.291f, 11.295f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.709f, 1.705f)
                verticalLineToRelative(8.0f)
                curveToRelative(2.488f, 0.0f, 4.74f, -1.01f, 6.37f, -2.642f)
                moveToRelative(1.675f, -2.319f)
                arcToRelative(8.962f, 8.962f, 0.0f, false, false, 0.955f, -4.039f)
                horizontalLineToRelative(-5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -5.063f, -1.88f)
                moveToRelative(-2.466f, 1.347f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.53f, 7.535f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.486f, 9.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -12.525f, -5.032f)
                moveToRelative(-2.317f, 1.675f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 3.36f, 14.852f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _radarOff!!
    }

private var _radarOff: ImageVector? = null
