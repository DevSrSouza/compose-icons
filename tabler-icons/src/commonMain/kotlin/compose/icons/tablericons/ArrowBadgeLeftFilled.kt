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

public val TablerIcons.ArrowBadgeLeftFilled: ImageVector
    get() {
        if (_arrowBadgeLeftFilled != null) {
            return _arrowBadgeLeftFilled!!
        }
        _arrowBadgeLeftFilled = Builder(name = "ArrowBadgeLeftFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 6.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.78f, 0.375f)
                lineToRelative(-4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.25f)
                lineToRelative(4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.78f, 0.375f)
                horizontalLineToRelative(6.0f)
                lineToRelative(0.112f, -0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.669f, -1.619f)
                lineToRelative(-3.501f, -4.375f)
                lineToRelative(3.5f, -4.375f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.78f, -1.625f)
                close()
            }
        }
        .build()
        return _arrowBadgeLeftFilled!!
    }

private var _arrowBadgeLeftFilled: ImageVector? = null
