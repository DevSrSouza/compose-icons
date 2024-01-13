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

public val TablerIcons.AlarmFilled: ImageVector
    get() {
        if (_alarmFilled != null) {
            return _alarmFilled!!
        }
        _alarmFilled = Builder(name = "AlarmFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 6.072f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.995f, 7.213f)
                lineToRelative(-0.005f, -0.285f)
                lineToRelative(0.005f, -0.285f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.995f, -6.643f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.993f, 0.883f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.883f, -0.993f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.993f, -0.883f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.412f, 3.191f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.273f, 1.539f)
                lineToRelative(-0.097f, 0.08f)
                lineToRelative(-2.75f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.273f, -1.54f)
                lineToRelative(0.097f, -0.08f)
                lineToRelative(2.75f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.191f, 3.412f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.291f, -0.288f)
                lineToRelative(0.106f, 0.067f)
                lineToRelative(2.75f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.07f, 1.685f)
                lineToRelative(-0.106f, -0.067f)
                lineToRelative(-2.75f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.22f, -1.397f)
                close()
            }
        }
        .build()
        return _alarmFilled!!
    }

private var _alarmFilled: ImageVector? = null
