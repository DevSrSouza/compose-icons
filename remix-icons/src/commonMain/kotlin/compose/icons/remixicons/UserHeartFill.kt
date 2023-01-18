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

public val RemixIcons.UserHeartFill: ImageVector
    get() {
        if (_userHeartFill != null) {
            return _userHeartFill!!
        }
        _userHeartFill = Builder(name = "UserHeartFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.841f, 15.659f)
                lineToRelative(0.176f, 0.177f)
                lineToRelative(0.178f, -0.177f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.182f, 3.182f)
                lineToRelative(-3.36f, 3.359f)
                lineToRelative(-3.358f, -3.359f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, 3.182f, -3.182f)
                close()
                moveTo(12.0f, 14.0f)
                verticalLineToRelative(8.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.75f, -7.996f)
                lineTo(12.0f, 14.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveToRelative(3.315f, 0.0f, 6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                reflectiveCurveToRelative(-6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                close()
            }
        }
        .build()
        return _userHeartFill!!
    }

private var _userHeartFill: ImageVector? = null
