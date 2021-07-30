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

public val SimpleIcons.Addthis: ImageVector
    get() {
        if (_addthis != null) {
            return _addthis!!
        }
        _addthis = Builder(name = "Addthis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.496f)
                horizontalLineToRelative(-4.501f)
                verticalLineToRelative(4.484f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.484f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.99f)
                horizontalLineToRelative(4.5f)
                verticalLineTo(6.021f)
                horizontalLineToRelative(3.001f)
                verticalLineToRelative(4.485f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(2.99f)
                close()
                moveTo(21.0f, 0.041f)
                horizontalLineTo(3.0f)
                curveTo(1.348f, 0.043f, 0.008f, 1.379f, 0.0f, 3.031f)
                verticalLineToRelative(17.94f)
                curveToRelative(0.008f, 1.65f, 1.348f, 2.986f, 3.0f, 2.988f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.651f, -0.002f, 2.991f, -1.338f, 3.0f, -2.988f)
                verticalLineTo(3.031f)
                curveToRelative(-0.009f, -1.652f, -1.348f, -2.987f, -3.0f, -2.99f)
                close()
            }
        }
        .build()
        return _addthis!!
    }

private var _addthis: ImageVector? = null
