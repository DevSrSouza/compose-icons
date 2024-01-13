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

public val TablerIcons.TrophyFilled: ImageVector
    get() {
        if (_trophyFilled != null) {
            return _trophyFilled!!
        }
        _trophyFilled = Builder(name = "TrophyFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(2.17f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, 5.659f)
                verticalLineToRelative(0.171f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, true, -5.0f, 5.917f)
                verticalLineToRelative(2.083f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.083f)
                arcToRelative(6.002f, 6.002f, 0.0f, false, true, -4.996f, -5.692f)
                lineToRelative(-0.004f, -0.225f)
                verticalLineToRelative(-0.171f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.996f, -2.653f)
                lineToRelative(-0.003f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.995f, -2.654f)
                lineToRelative(-0.001f, -2.17f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(5.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
                moveTo(19.0f, 8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
        }
        .build()
        return _trophyFilled!!
    }

private var _trophyFilled: ImageVector? = null
