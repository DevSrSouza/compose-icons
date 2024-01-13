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

public val TablerIcons.BackspaceFilled: ImageVector
    get() {
        if (_backspaceFilled != null) {
            return _backspaceFilled!!
        }
        _backspaceFilled = Builder(name = "BackspaceFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.995f, 1.85f)
                lineToRelative(0.005f, 0.15f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, 1.995f)
                lineToRelative(-0.15f, 0.005f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.608f, -0.206f)
                lineToRelative(-0.1f, -0.087f)
                lineToRelative(-5.037f, -5.04f)
                curveToRelative(-0.809f, -0.904f, -0.847f, -2.25f, -0.083f, -3.23f)
                lineToRelative(0.12f, -0.144f)
                lineToRelative(5.0f, -5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.577f, -0.284f)
                lineToRelative(0.131f, -0.009f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(12.511f, 9.14f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.301f, 1.473f)
                lineToRelative(0.083f, 0.094f)
                lineToRelative(1.292f, 1.293f)
                lineToRelative(-1.292f, 1.293f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.403f, 1.403f)
                lineToRelative(0.094f, -0.083f)
                lineToRelative(1.293f, -1.292f)
                lineToRelative(1.293f, 1.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-1.292f, -1.293f)
                lineToRelative(1.292f, -1.293f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.403f, -1.403f)
                lineToRelative(-0.094f, 0.083f)
                lineToRelative(-1.293f, 1.292f)
                lineToRelative(-1.293f, -1.292f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-0.102f, -0.07f)
                close()
            }
        }
        .build()
        return _backspaceFilled!!
    }

private var _backspaceFilled: ImageVector? = null
