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

public val TablerIcons.CactusFilled: ImageVector
    get() {
        if (_cactusFilled != null) {
            return _cactusFilled!!
        }
        _cactusFilled = Builder(name = "CactusFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.995f, -3.8f)
                lineToRelative(-0.005f, -0.2f)
                verticalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.85f, 1.995f)
                lineToRelative(0.15f, 0.005f)
                verticalLineToRelative(-7.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 5.995f, -0.176f)
                lineToRelative(0.005f, 0.176f)
                verticalLineToRelative(10.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.995f, -1.85f)
                lineToRelative(0.005f, -0.15f)
                verticalLineToRelative(-5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, 3.995f)
                lineToRelative(-0.2f, 0.005f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-10.0f)
                close()
            }
        }
        .build()
        return _cactusFilled!!
    }

private var _cactusFilled: ImageVector? = null
