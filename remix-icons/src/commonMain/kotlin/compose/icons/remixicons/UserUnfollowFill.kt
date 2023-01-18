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

public val RemixIcons.UserUnfollowFill: ImageVector
    get() {
        if (_userUnfollowFill != null) {
            return _userUnfollowFill!!
        }
        _userUnfollowFill = Builder(name = "UserUnfollowFill", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.252f)
                lineTo(14.0f, 22.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, -7.748f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(19.0f, 16.586f)
                lineToRelative(2.121f, -2.122f)
                lineToRelative(1.415f, 1.415f)
                lineTo(20.414f, 18.0f)
                lineToRelative(2.122f, 2.121f)
                lineToRelative(-1.415f, 1.415f)
                lineTo(19.0f, 19.414f)
                lineToRelative(-2.121f, 2.122f)
                lineToRelative(-1.415f, -1.415f)
                lineTo(17.586f, 18.0f)
                lineToRelative(-2.122f, -2.121f)
                lineToRelative(1.415f, -1.415f)
                lineTo(19.0f, 16.586f)
                close()
            }
        }
        .build()
        return _userUnfollowFill!!
    }

private var _userUnfollowFill: ImageVector? = null
