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

public val SimpleIcons.Forestry: ImageVector
    get() {
        if (_forestry != null) {
            return _forestry!!
        }
        _forestry = Builder(name = "Forestry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.564f, 0.332f)
                verticalLineToRelative(2.82f)
                lineTo(0.0f, 8.736f)
                lineToRelative(1.305f, 1.284f)
                lineToRelative(4.26f, -4.26f)
                verticalLineToRelative(2.568f)
                lineTo(0.0f, 13.912f)
                lineToRelative(1.305f, 1.283f)
                lineToRelative(4.26f, -4.26f)
                verticalLineToRelative(12.733f)
                horizontalLineToRelative(1.831f)
                verticalLineTo(10.932f)
                lineToRelative(4.284f, 4.263f)
                lineToRelative(1.304f, -1.283f)
                lineToRelative(-5.588f, -5.588f)
                verticalLineTo(5.756f)
                lineToRelative(3.989f, 3.969f)
                lineToRelative(5.195f, 5.214f)
                verticalLineToRelative(8.729f)
                horizontalLineToRelative(1.832f)
                verticalLineToRelative(-8.725f)
                lineTo(24.0f, 9.355f)
                lineToRelative(-1.305f, -1.283f)
                lineToRelative(-4.283f, 4.264f)
                verticalLineTo(9.768f)
                lineTo(24.0f, 4.18f)
                lineToRelative(-1.305f, -1.284f)
                lineToRelative(-4.283f, 4.264f)
                verticalLineTo(0.332f)
                horizontalLineTo(16.58f)
                verticalLineToRelative(6.824f)
                lineToRelative(-4.26f, -4.26f)
                lineToRelative(-1.304f, 1.284f)
                lineToRelative(5.564f, 5.584f)
                verticalLineToRelative(2.568f)
                lineToRelative(-3.596f, -3.596f)
                lineToRelative(-5.588f, -5.588f)
                verticalLineTo(0.332f)
                horizontalLineTo(5.564f)
                close()
            }
        }
        .build()
        return _forestry!!
    }

private var _forestry: ImageVector? = null
