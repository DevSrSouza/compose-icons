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

public val TablerIcons.ChartDotsFilled: ImageVector
    get() {
        if (_chartDotsFilled != null) {
            return _chartDotsFilled!!
        }
        _chartDotsFilled = Builder(name = "ChartDotsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(17.0f)
                horizontalLineToRelative(17.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -0.651f, 5.93f)
                lineToRelative(-2.002f, 3.202f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -4.927f, 0.337f)
                lineToRelative(-1.378f, -1.655f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 1.538f, -1.282f)
                lineToRelative(1.378f, 1.654f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, true, 1.693f, -0.115f)
                lineToRelative(2.002f, -3.203f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.347f, -4.868f)
                close()
            }
        }
        .build()
        return _chartDotsFilled!!
    }

private var _chartDotsFilled: ImageVector? = null
