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

public val SimpleIcons.Farfetch: ImageVector
    get() {
        if (_farfetch != null) {
            return _farfetch!!
        }
        _farfetch = Builder(name = "Farfetch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 10.248f)
                verticalLineTo(6.749f)
                horizontalLineTo(13.586f)
                curveToRelative(-3.062f, 0.0f, -4.737f, 1.837f, -4.737f, 4.488f)
                verticalLineToRelative(2.231f)
                horizontalLineTo(4.321f)
                verticalLineTo(8.599f)
                curveToRelative(0.0f, -3.425f, 0.332f, -5.074f, 4.212f, -5.074f)
                horizontalLineTo(24.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(6.259f)
                curveTo(2.336f, 0.0f, 0.0f, 2.589f, 0.0f, 6.386f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(4.321f)
                verticalLineToRelative(-7.033f)
                horizontalLineToRelative(4.527f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(4.339f)
                verticalLineToRelative(-7.033f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(-3.499f)
                horizontalLineTo(13.188f)
                verticalLineToRelative(-1.155f)
                curveToRelative(0.0f, -1.461f, 0.232f, -2.064f, 2.257f, -2.064f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _farfetch!!
    }

private var _farfetch: ImageVector? = null
