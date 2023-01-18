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

public val RemixIcons.UserUnfollowLine: ImageVector
    get() {
        if (_userUnfollowLine != null) {
            return _userUnfollowLine!!
        }
        _userUnfollowLine = Builder(name = "UserUnfollowLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.252f)
                verticalLineToRelative(2.09f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 6.0f, 22.0f)
                lineToRelative(-2.0f, -0.001f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, -7.748f)
                close()
                moveTo(12.0f, 13.0f)
                curveToRelative(-3.315f, 0.0f, -6.0f, -2.685f, -6.0f, -6.0f)
                reflectiveCurveToRelative(2.685f, -6.0f, 6.0f, -6.0f)
                reflectiveCurveToRelative(6.0f, 2.685f, 6.0f, 6.0f)
                reflectiveCurveToRelative(-2.685f, 6.0f, -6.0f, 6.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveToRelative(-1.79f, -4.0f, -4.0f, -4.0f)
                reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                close()
                moveTo(19.0f, 17.586f)
                lineToRelative(2.121f, -2.122f)
                lineToRelative(1.415f, 1.415f)
                lineTo(20.414f, 19.0f)
                lineToRelative(2.122f, 2.121f)
                lineToRelative(-1.415f, 1.415f)
                lineTo(19.0f, 20.414f)
                lineToRelative(-2.121f, 2.122f)
                lineToRelative(-1.415f, -1.415f)
                lineTo(17.586f, 19.0f)
                lineToRelative(-2.122f, -2.121f)
                lineToRelative(1.415f, -1.415f)
                lineTo(19.0f, 17.586f)
                close()
            }
        }
        .build()
        return _userUnfollowLine!!
    }

private var _userUnfollowLine: ImageVector? = null
