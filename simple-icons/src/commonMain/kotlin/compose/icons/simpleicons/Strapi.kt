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

public val SimpleIcons.Strapi: ImageVector
    get() {
        if (_strapi != null) {
            return _strapi!!
        }
        _strapi = Builder(name = "Strapi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.32f, 0.0f)
                curveToRelative(-3.922f, 0.0f, -5.882f, 0.0f, -7.1f, 1.219f)
                curveTo(0.0f, 2.438f, 0.0f, 4.399f, 0.0f, 8.32f)
                verticalLineToRelative(7.36f)
                curveToRelative(0.0f, 3.922f, 0.0f, 5.882f, 1.219f, 7.101f)
                curveTo(2.438f, 24.0f, 4.399f, 24.0f, 8.32f, 24.0f)
                horizontalLineToRelative(7.36f)
                curveToRelative(3.922f, 0.0f, 5.882f, 0.0f, 7.101f, -1.219f)
                curveTo(24.0f, 21.562f, 24.0f, 19.601f, 24.0f, 15.68f)
                lineTo(24.0f, 8.32f)
                curveToRelative(0.0f, -3.922f, 0.0f, -5.882f, -1.219f, -7.101f)
                curveTo(21.562f, 0.0f, 19.601f, 0.0f, 15.68f, 0.0f)
                lineTo(8.32f, 0.0f)
                close()
                moveTo(8.73f, 7.28f)
                horizontalLineToRelative(7.83f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, 0.16f, 0.16f)
                verticalLineToRelative(7.83f)
                horizontalLineToRelative(-3.87f)
                verticalLineToRelative(-3.71f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.313f, -0.398f)
                lineToRelative(-0.086f, -0.012f)
                horizontalLineToRelative(-3.72f)
                lineTo(8.731f, 7.28f)
                close()
                moveTo(8.23f, 7.53f)
                verticalLineToRelative(3.87f)
                lineTo(4.553f, 11.4f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, -0.057f, -0.136f)
                lineTo(8.23f, 7.529f)
                close()
                moveTo(8.48f, 11.65f)
                horizontalLineToRelative(3.87f)
                verticalLineToRelative(3.87f)
                lineTo(8.64f, 15.52f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, -0.16f, -0.16f)
                verticalLineToRelative(-3.71f)
                close()
                moveTo(12.6f, 15.77f)
                horizontalLineToRelative(3.87f)
                lineToRelative(-3.734f, 3.734f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, true, -0.136f, -0.057f)
                lineTo(12.6f, 15.77f)
                close()
            }
        }
        .build()
        return _strapi!!
    }

private var _strapi: ImageVector? = null
