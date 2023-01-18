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

public val IonIcons.ExtensionPuzzle: ImageVector
    get() {
        if (_extensionPuzzle != null) {
            return _extensionPuzzle!!
        }
        _extensionPuzzle = Builder(name = "ExtensionPuzzle", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.14f, 480.0f)
                horizontalLineTo(274.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f)
                verticalLineTo(434.29f)
                arcToRelative(31.32f, 31.32f, 0.0f, false, false, -9.71f, -22.77f)
                curveToRelative(-7.78f, -7.59f, -19.08f, -11.8f, -30.89f, -11.51f)
                curveToRelative(-21.36f, 0.5f, -39.4f, 19.3f, -39.4f, 41.06f)
                verticalLineTo(462.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, 18.0f)
                horizontalLineTo(87.62f)
                arcTo(55.62f, 55.62f, 0.0f, false, true, 32.0f, 424.38f)
                verticalLineTo(354.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, -18.0f)
                horizontalLineTo(77.71f)
                curveToRelative(9.16f, 0.0f, 18.07f, -3.92f, 25.09f, -11.0f)
                arcTo(42.06f, 42.06f, 0.0f, false, false, 115.0f, 295.08f)
                curveTo(114.7f, 273.89f, 97.26f, 256.0f, 76.91f, 256.0f)
                horizontalLineTo(50.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, -18.0f)
                verticalLineTo(167.62f)
                arcTo(55.62f, 55.62f, 0.0f, false, true, 87.62f, 112.0f)
                horizontalLineToRelative(55.24f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                verticalLineTo(97.52f)
                arcTo(65.53f, 65.53f, 0.0f, false, true, 217.54f, 32.0f)
                curveToRelative(35.49f, 0.62f, 64.36f, 30.38f, 64.36f, 66.33f)
                verticalLineTo(104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(55.24f)
                arcTo(54.86f, 54.86f, 0.0f, false, true, 400.0f, 166.86f)
                verticalLineTo(222.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(5.66f)
                curveToRelative(36.58f, 0.0f, 66.34f, 29.0f, 66.34f, 64.64f)
                curveToRelative(0.0f, 36.61f, -29.39f, 66.4f, -65.52f, 66.4f)
                horizontalLineTo(408.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                arcTo(54.86f, 54.86f, 0.0f, false, true, 345.14f, 480.0f)
                close()
            }
        }
        .build()
        return _extensionPuzzle!!
    }

private var _extensionPuzzle: ImageVector? = null
