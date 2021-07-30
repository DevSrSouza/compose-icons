package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Dolby: ImageVector
    get() {
        if (_dolby != null) {
            return _dolby!!
        }
        _dolby = Builder(name = "Dolby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 20.352f)
                verticalLineTo(3.648f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(16.704f)
                horizontalLineTo(24.0f)
                close()
                moveTo(18.433f, 5.806f)
                horizontalLineToRelative(2.736f)
                verticalLineToRelative(12.387f)
                horizontalLineToRelative(-2.736f)
                curveToRelative(-2.839f, 0.0f, -5.214f, -2.767f, -5.214f, -6.194f)
                reflectiveCurveTo(15.594f, 5.806f, 18.433f, 5.806f)
                close()
                moveTo(2.831f, 5.806f)
                horizontalLineToRelative(2.736f)
                curveToRelative(2.839f, 0.0f, 5.214f, 2.767f, 5.214f, 6.194f)
                reflectiveCurveToRelative(-2.374f, 6.194f, -5.214f, 6.194f)
                horizontalLineTo(2.831f)
                verticalLineTo(5.806f)
                close()
            }
        }
        .build()
        return _dolby!!
    }

private var _dolby: ImageVector? = null
