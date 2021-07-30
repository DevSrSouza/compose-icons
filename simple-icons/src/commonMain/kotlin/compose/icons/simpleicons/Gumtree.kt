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

public val SimpleIcons.Gumtree: ImageVector
    get() {
        if (_gumtree != null) {
            return _gumtree!!
        }
        _gumtree = Builder(name = "Gumtree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.846f, 6.582f)
                arcToRelative(0.698f, 0.698f, 0.0f, false, true, -0.333f, -0.599f)
                curveTo(18.181f, 2.66f, 15.39f, 0.0f, 12.0f, 0.0f)
                curveTo(8.609f, 0.0f, 5.75f, 2.593f, 5.485f, 5.983f)
                arcToRelative(0.796f, 0.796f, 0.0f, false, true, -0.332f, 0.599f)
                curveTo(3.49f, 7.778f, 2.36f, 9.707f, 2.36f, 11.9f)
                curveToRelative(0.0f, 2.991f, 2.061f, 5.584f, 4.853f, 6.316f)
                curveToRelative(0.465f, 0.133f, 0.998f, 0.2f, 1.13f, 0.066f)
                curveToRelative(0.333f, -0.2f, 0.798f, -1.862f, 0.599f, -2.194f)
                curveToRelative(-0.134f, -0.2f, -0.533f, -0.399f, -1.064f, -0.532f)
                curveToRelative(-1.662f, -0.465f, -2.86f, -1.928f, -2.86f, -3.723f)
                curveToRelative(0.0f, -0.997f, 0.4f, -1.861f, 0.998f, -2.592f)
                arcToRelative(2.927f, 2.927f, 0.0f, false, true, 0.998f, -0.798f)
                curveToRelative(0.73f, -0.4f, 1.13f, -1.13f, 1.13f, -1.928f)
                curveToRelative(0.0f, -0.4f, 0.066f, -0.798f, 0.2f, -1.196f)
                curveToRelative(0.531f, -1.53f, 1.927f, -2.66f, 3.656f, -2.66f)
                curveToRelative(1.728f, 0.0f, 3.125f, 1.13f, 3.656f, 2.66f)
                curveToRelative(0.132f, 0.399f, 0.2f, 0.798f, 0.2f, 1.196f)
                curveToRelative(0.0f, 0.798f, 0.397f, 1.529f, 1.13f, 1.928f)
                curveToRelative(0.398f, 0.2f, 0.664f, 0.465f, 0.997f, 0.798f)
                arcToRelative(3.918f, 3.918f, 0.0f, false, true, 0.997f, 2.592f)
                arcToRelative(3.859f, 3.859f, 0.0f, false, true, -3.855f, 3.856f)
                curveToRelative(-2.46f, 0.0f, -4.388f, 1.995f, -4.388f, 4.455f)
                verticalLineToRelative(2.526f)
                curveToRelative(0.0f, 0.465f, 0.066f, 0.997f, 0.2f, 1.13f)
                curveToRelative(0.266f, 0.267f, 1.995f, 0.267f, 2.26f, 0.0f)
                curveToRelative(0.133f, -0.133f, 0.2f, -0.665f, 0.2f, -1.13f)
                verticalLineToRelative(-2.593f)
                curveToRelative(0.0f, -0.93f, 0.797f, -1.728f, 1.728f, -1.728f)
                curveToRelative(3.59f, 0.0f, 6.515f, -2.925f, 6.515f, -6.515f)
                curveToRelative(-0.002f, -2.128f, -1.133f, -4.056f, -2.794f, -5.252f)
                close()
            }
        }
        .build()
        return _gumtree!!
    }

private var _gumtree: ImageVector? = null
