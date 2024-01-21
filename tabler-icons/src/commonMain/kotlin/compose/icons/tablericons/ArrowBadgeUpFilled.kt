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

public val TablerIcons.ArrowBadgeUpFilled: ImageVector
    get() {
        if (_arrowBadgeUpFilled != null) {
            return _arrowBadgeUpFilled!!
        }
        _arrowBadgeUpFilled = Builder(name = "ArrowBadgeUpFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.375f, 6.22f)
                lineToRelative(-5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.375f, 0.78f)
                verticalLineToRelative(6.0f)
                lineToRelative(0.006f, 0.112f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.619f, 0.669f)
                lineToRelative(4.375f, -3.501f)
                lineToRelative(4.375f, 3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.625f, -0.78f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.375f, -0.78f)
                lineToRelative(-5.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.25f, 0.0f)
                close()
            }
        }
        .build()
        return _arrowBadgeUpFilled!!
    }

private var _arrowBadgeUpFilled: ImageVector? = null
