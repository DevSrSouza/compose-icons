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

public val TablerIcons.BombFilled: ImageVector
    get() {
        if (_bombFilled != null) {
            return _bombFilled!!
        }
        _bombFilled = Builder(name = "BombFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.499f, 3.996f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.556f, 0.645f)
                lineToRelative(3.302f, 3.301f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 0.0f, 3.113f)
                lineToRelative(-0.567f, 0.567f)
                lineToRelative(0.043f, 0.192f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.732f, 8.83f)
                lineToRelative(-0.23f, 0.144f)
                arcToRelative(8.5f, 8.5f, 0.0f, true, true, -2.687f, -15.623f)
                lineToRelative(0.192f, 0.042f)
                lineToRelative(0.567f, -0.566f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.362f, -0.636f)
                close()
                moveTo(10.0f, 9.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-1.0f)
                curveToRelative(0.0f, 0.83f, -0.302f, 1.629f, -0.846f, 2.25f)
                lineToRelative(-0.154f, 0.163f)
                lineToRelative(-1.293f, 1.293f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(1.293f, -1.292f)
                curveToRelative(0.232f, -0.232f, 0.375f, -0.537f, 0.407f, -0.86f)
                lineToRelative(0.007f, -0.14f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.85f, -1.995f)
                lineToRelative(0.15f, -0.005f)
                horizontalLineToRelative(1.0f)
                close()
            }
        }
        .build()
        return _bombFilled!!
    }

private var _bombFilled: ImageVector? = null
