package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ExtensionPuzzleSharp: ImageVector
    get() {
        if (_extensionPuzzleSharp != null) {
            return _extensionPuzzleSharp!!
        }
        _extensionPuzzleSharp = Builder(name = "ExtensionPuzzleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.14f, 480.0f)
                horizontalLineTo(256.0f)
                verticalLineTo(434.29f)
                arcToRelative(31.3f, 31.3f, 0.0f, false, false, -9.59f, -22.65f)
                curveToRelative(-7.67f, -7.56f, -18.83f, -11.81f, -30.57f, -11.64f)
                arcToRelative(44.38f, 44.38f, 0.0f, false, false, -28.45f, 10.67f)
                curveToRelative(-5.2f, 4.6f, -11.39f, 12.56f, -11.39f, 24.42f)
                verticalLineTo(480.0f)
                horizontalLineTo(87.62f)
                arcTo(55.68f, 55.68f, 0.0f, false, true, 32.0f, 424.38f)
                verticalLineTo(336.0f)
                horizontalLineTo(77.71f)
                curveToRelative(9.16f, 0.0f, 18.07f, -3.92f, 25.09f, -11.0f)
                arcTo(42.06f, 42.06f, 0.0f, false, false, 115.0f, 295.08f)
                curveTo(114.7f, 273.89f, 97.26f, 256.0f, 76.91f, 256.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(166.66f)
                arcToRelative(53.77f, 53.77f, 0.0f, false, true, 16.53f, -39.0f)
                arcTo(55.88f, 55.88f, 0.0f, false, true, 87.62f, 112.0f)
                horizontalLineToRelative(63.24f)
                verticalLineTo(97.52f)
                arcTo(65.53f, 65.53f, 0.0f, false, true, 217.54f, 32.0f)
                curveToRelative(35.49f, 0.62f, 64.36f, 30.38f, 64.36f, 66.33f)
                verticalLineTo(112.0f)
                horizontalLineToRelative(63.24f)
                arcTo(54.28f, 54.28f, 0.0f, false, true, 400.0f, 166.86f)
                verticalLineTo(230.1f)
                horizontalLineToRelative(13.66f)
                curveToRelative(36.58f, 0.0f, 66.34f, 29.0f, 66.34f, 64.64f)
                curveToRelative(0.0f, 36.61f, -29.39f, 66.4f, -65.52f, 66.4f)
                horizontalLineTo(400.0f)
                verticalLineToRelative(63.24f)
                curveTo(400.0f, 455.05f, 375.39f, 480.0f, 345.14f, 480.0f)
                close()
            }
        }
        .build()
        return _extensionPuzzleSharp!!
    }

private var _extensionPuzzleSharp: ImageVector? = null
