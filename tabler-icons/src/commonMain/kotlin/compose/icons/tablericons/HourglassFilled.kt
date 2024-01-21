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

public val TablerIcons.HourglassFilled: ImageVector
    get() {
        if (_hourglassFilled != null) {
            return _hourglassFilled!!
        }
        _hourglassFilled = Builder(name = "HourglassFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.996f, 6.996f, 0.0f, false, true, -3.393f, 6.0f)
                arcToRelative(6.994f, 6.994f, 0.0f, false, true, 3.388f, 5.728f)
                lineToRelative(0.005f, 0.272f)
                verticalLineToRelative(2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-2.0f)
                arcToRelative(6.996f, 6.996f, 0.0f, false, true, 3.393f, -6.0f)
                arcToRelative(6.994f, 6.994f, 0.0f, false, true, -3.388f, -5.728f)
                lineToRelative(-0.005f, -0.272f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _hourglassFilled!!
    }

private var _hourglassFilled: ImageVector? = null
