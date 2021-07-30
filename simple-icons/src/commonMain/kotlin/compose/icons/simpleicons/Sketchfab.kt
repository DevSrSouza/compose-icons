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

public val SimpleIcons.Sketchfab: ImageVector
    get() {
        if (_sketchfab != null) {
            return _sketchfab!!
        }
        _sketchfab = Builder(name = "Sketchfab", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3f, 0.0f)
                arcTo(11.983f, 11.983f, 0.0f, false, false, 0.037f, 11.0f)
                arcToRelative(13.656f, 13.656f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(11.983f, 11.983f, 0.0f, false, false, 11.29f, 11.0f)
                horizontalLineToRelative(1.346f)
                arcToRelative(12.045f, 12.045f, 0.0f, false, false, 11.3f, -11.36f)
                arcToRelative(13.836f, 13.836f, 0.0f, false, false, 0.0f, -1.7f)
                arcTo(12.049f, 12.049f, 0.0f, false, false, 12.674f, 0.0f)
                close()
                moveTo(15.0f, 6.51f)
                lineToRelative(2.99f, 1.74f)
                reflectiveCurveToRelative(-6.064f, 3.24f, -6.084f, 3.24f)
                reflectiveCurveTo(5.812f, 8.27f, 5.8f, 8.26f)
                lineToRelative(2.994f, -1.77f)
                lineToRelative(2.992f, -1.76f)
                close()
                moveTo(8.524f, 11.636f)
                lineTo(11.0f, 13.0f)
                verticalLineToRelative(5.92f)
                lineToRelative(-2.527f, -1.4f)
                lineToRelative(-2.46f, -1.43f)
                verticalLineToRelative(-5.76f)
                close()
                moveTo(17.985f, 13.208f)
                verticalLineToRelative(2.924f)
                lineTo(15.5f, 17.574f)
                lineTo(13.0f, 19.017f)
                verticalLineToRelative(-6.024f)
                lineToRelative(2.489f, -1.345f)
                lineToRelative(2.5f, -1.355f)
                close()
            }
        }
        .build()
        return _sketchfab!!
    }

private var _sketchfab: ImageVector? = null
