package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.UserStarFill: ImageVector
    get() {
        if (_userStarFill != null) {
            return _userStarFill!!
        }
        _userStarFill = Builder(name = "UserStarFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineToRelative(8.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                close()
                moveTo(18.0f, 21.5f)
                lineToRelative(-2.939f, 1.545f)
                lineToRelative(0.561f, -3.272f)
                lineToRelative(-2.377f, -2.318f)
                lineToRelative(3.286f, -0.478f)
                lineTo(18.0f, 14.0f)
                lineToRelative(1.47f, 2.977f)
                lineToRelative(3.285f, 0.478f)
                lineToRelative(-2.377f, 2.318f)
                lineToRelative(0.56f, 3.272f)
                lineTo(18.0f, 21.5f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _userStarFill!!
    }

private var _userStarFill: ImageVector? = null
