package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Leaderboard: ImageVector
    get() {
        if (_leaderboard != null) {
            return _leaderboard!!
        }
        _leaderboard = Builder(name = "Leaderboard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(21.0f)
                close()
                moveTo(14.75f, 3.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(18.0f)
                horizontalLineToRelative(5.5f)
                verticalLineTo(3.0f)
                close()
                moveTo(22.0f, 11.0f)
                horizontalLineToRelative(-5.5f)
                verticalLineToRelative(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _leaderboard!!
    }

private var _leaderboard: ImageVector? = null
