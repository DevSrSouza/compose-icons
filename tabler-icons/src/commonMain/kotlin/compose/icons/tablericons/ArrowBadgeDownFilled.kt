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

public val TablerIcons.ArrowBadgeDownFilled: ImageVector
    get() {
        if (_arrowBadgeDownFilled != null) {
            return _arrowBadgeDownFilled!!
        }
        _arrowBadgeDownFilled = Builder(name = "ArrowBadgeDownFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.375f, 6.22f)
                lineToRelative(-4.375f, 3.498f)
                lineToRelative(-4.375f, -3.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.625f, 0.782f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.375f, 0.78f)
                lineToRelative(5.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.25f, 0.0f)
                lineToRelative(5.0f, -4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.375f, -0.78f)
                verticalLineToRelative(-6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.625f, -0.78f)
                close()
            }
        }
        .build()
        return _arrowBadgeDownFilled!!
    }

private var _arrowBadgeDownFilled: ImageVector? = null
