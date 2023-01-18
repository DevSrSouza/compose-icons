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

public val RemixIcons.UserSearchLine: ImageVector
    get() {
        if (_userSearchLine != null) {
            return _userSearchLine!!
        }
        _userSearchLine = Builder(name = "UserSearchLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(4.0f, 22.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
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
                moveTo(21.446f, 20.032f)
                lineToRelative(1.504f, 1.504f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-1.504f, -1.504f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.414f, -1.414f)
                close()
                moveTo(18.0f, 20.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _userSearchLine!!
    }

private var _userSearchLine: ImageVector? = null
