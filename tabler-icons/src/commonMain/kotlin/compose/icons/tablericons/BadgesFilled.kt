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

public val TablerIcons.BadgesFilled: ImageVector
    get() {
        if (_badgesFilled != null) {
            return _badgesFilled!!
        }
        _badgesFilled = Builder(name = "BadgesFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.486f, 12.143f)
                lineToRelative(-4.486f, 2.69f)
                lineToRelative(-4.486f, -2.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.514f, 0.857f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.486f, 0.857f)
                lineToRelative(5.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.028f, 0.0f)
                lineToRelative(5.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.486f, -0.857f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.514f, -0.857f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.486f, 3.143f)
                lineToRelative(-4.486f, 2.69f)
                lineToRelative(-4.486f, -2.69f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.514f, 0.857f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.486f, 0.857f)
                lineToRelative(5.0f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.028f, 0.0f)
                lineToRelative(5.0f, -3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.486f, -0.857f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.514f, -0.857f)
                close()
            }
        }
        .build()
        return _badgesFilled!!
    }

private var _badgesFilled: ImageVector? = null
