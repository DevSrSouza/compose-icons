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

public val RemixIcons.UserReceivedFill: ImageVector
    get() {
        if (_userReceivedFill != null) {
            return _userReceivedFill!!
        }
        _userReceivedFill = Builder(name = "UserReceivedFill", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(19.418f, 17.0f)
                horizontalLineToRelative(3.586f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.586f)
                lineToRelative(1.829f, 1.828f)
                lineToRelative(-1.414f, 1.415f)
                lineTo(15.59f, 18.0f)
                lineToRelative(4.243f, -4.243f)
                lineToRelative(1.414f, 1.415f)
                lineTo(19.418f, 17.0f)
                close()
            }
        }
        .build()
        return _userReceivedFill!!
    }

private var _userReceivedFill: ImageVector? = null
