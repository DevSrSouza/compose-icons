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

public val TablerIcons.MoodKidFilled: ImageVector
    get() {
        if (_moodKidFilled != null) {
            return _moodKidFilled!!
        }
        _moodKidFilled = Builder(name = "MoodKidFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -14.995f, 8.984f)
                lineToRelative(-0.005f, -0.324f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 7.046f, -9.232f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 2.949f, 3.556f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                lineToRelative(-0.117f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, -1.993f)
                curveToRelative(1.726f, 0.0f, 3.453f, 0.447f, 5.0f, 1.34f)
                close()
                moveTo(15.2f, 14.286f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.414f, 0.014f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -3.572f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.428f, 1.4f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 6.428f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.014f, -1.414f)
                close()
                moveTo(9.01f, 9.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                close()
                moveTo(15.01f, 9.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.117f, 1.993f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.117f, -1.993f)
                close()
            }
        }
        .build()
        return _moodKidFilled!!
    }

private var _moodKidFilled: ImageVector? = null
