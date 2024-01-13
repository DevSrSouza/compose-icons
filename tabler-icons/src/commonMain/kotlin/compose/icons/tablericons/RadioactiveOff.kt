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

public val TablerIcons.RadioactiveOff: ImageVector
    get() {
        if (_radioactiveOff != null) {
            return _radioactiveOff!!
        }
        _radioactiveOff = Builder(name = "RadioactiveOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.118f, 14.127f)
                curveToRelative(-0.182f, 0.181f, -0.39f, 0.341f, -0.618f, 0.473f)
                lineToRelative(3.0f, 5.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.856f, -1.423f)
                moveToRelative(1.68f, -2.32f)
                arcToRelative(8.993f, 8.993f, 0.0f, false, false, 0.964f, -4.047f)
                horizontalLineToRelative(-5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.5f, 9.4f)
                lineToRelative(3.0f, -5.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -8.536f, -0.25f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.5f, 14.6f)
                lineToRelative(-3.0f, 5.19f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -4.5f, -7.79f)
                horizontalLineToRelative(6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 1.5f, 2.6f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _radioactiveOff!!
    }

private var _radioactiveOff: ImageVector? = null
