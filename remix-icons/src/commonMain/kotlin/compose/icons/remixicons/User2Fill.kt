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

public val RemixIcons.User2Fill: ImageVector
    get() {
        if (_user2Fill != null) {
            return _user2Fill!!
        }
        _user2Fill = Builder(name = "User2Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 14.062f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.938f)
                curveToRelative(3.946f, 0.492f, 7.0f, 3.858f, 7.0f, 7.938f)
                horizontalLineTo(4.0f)
                arcToRelative(8.001f, 8.001f, 0.0f, false, true, 7.0f, -7.938f)
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
        return _user2Fill!!
    }

private var _user2Fill: ImageVector? = null
