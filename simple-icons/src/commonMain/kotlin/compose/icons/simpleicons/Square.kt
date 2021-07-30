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

public val SimpleIcons.Square: ImageVector
    get() {
        if (_square != null) {
            return _square!!
        }
        _square = Builder(name = "Square", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.01f, 0.0f)
                arcTo(4.01f, 4.01f, 0.0f, false, false, 0.0f, 4.01f)
                verticalLineToRelative(15.98f)
                curveToRelative(0.0f, 2.21f, 1.8f, 4.0f, 4.01f, 4.01f)
                horizontalLineToRelative(15.98f)
                curveTo(22.2f, 24.0f, 24.0f, 22.2f, 24.0f, 19.99f)
                lineTo(24.0f, 4.0f)
                arcTo(4.01f, 4.01f, 0.0f, false, false, 19.99f, 0.0f)
                lineTo(4.0f, 0.0f)
                close()
                moveTo(5.63f, 4.36f)
                horizontalLineToRelative(12.74f)
                curveToRelative(0.7f, 0.0f, 1.26f, 0.57f, 1.26f, 1.27f)
                verticalLineToRelative(12.74f)
                curveToRelative(0.0f, 0.7f, -0.56f, 1.27f, -1.26f, 1.27f)
                lineTo(5.63f, 19.64f)
                curveToRelative(-0.7f, 0.0f, -1.26f, -0.57f, -1.26f, -1.27f)
                lineTo(4.37f, 5.63f)
                arcToRelative(1.27f, 1.27f, 0.0f, false, true, 1.26f, -1.27f)
                close()
                moveTo(9.46f, 8.71f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, -0.73f, 0.73f)
                verticalLineToRelative(5.09f)
                curveToRelative(0.0f, 0.4f, 0.32f, 0.72f, 0.72f, 0.72f)
                horizontalLineToRelative(5.1f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, 0.73f, -0.72f)
                lineTo(15.28f, 9.44f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, -0.73f, -0.73f)
                horizontalLineToRelative(-5.1f)
                close()
            }
        }
        .build()
        return _square!!
    }

private var _square: ImageVector? = null
