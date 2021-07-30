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

public val SimpleIcons.Gradle: ImageVector
    get() {
        if (_gradle != null) {
            return _gradle!!
        }
        _gradle = Builder(name = "Gradle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.695f, 4.297f)
                arcToRelative(3.807f, 3.807f, 0.0f, false, false, -5.29f, -0.09f)
                arcToRelative(0.368f, 0.368f, 0.0f, false, false, 0.0f, 0.533f)
                lineToRelative(0.46f, 0.47f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, false, 0.474f, 0.032f)
                arcToRelative(2.182f, 2.182f, 0.0f, false, true, 2.86f, 3.291f)
                curveToRelative(-3.023f, 3.02f, -7.056f, -5.447f, -16.211f, -1.083f)
                arcToRelative(1.24f, 1.24f, 0.0f, false, false, -0.534f, 1.745f)
                lineToRelative(1.571f, 2.713f)
                arcToRelative(1.238f, 1.238f, 0.0f, false, false, 1.681f, 0.461f)
                lineToRelative(0.037f, -0.02f)
                lineToRelative(-0.029f, 0.02f)
                lineToRelative(0.688f, -0.384f)
                arcToRelative(16.083f, 16.083f, 0.0f, false, false, 2.193f, -1.635f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, true, 0.499f, -0.016f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.016f, 0.534f)
                arcToRelative(16.435f, 16.435f, 0.0f, false, true, -2.316f, 1.741f)
                lineTo(8.77f, 12.609f)
                lineToRelative(-0.696f, 0.39f)
                arcToRelative(1.958f, 1.958f, 0.0f, false, true, -0.963f, 0.25f)
                arcToRelative(1.987f, 1.987f, 0.0f, false, true, -1.726f, -0.989f)
                lineTo(3.9f, 9.696f)
                curveTo(1.06f, 11.72f, -0.686f, 15.603f, 0.26f, 20.522f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, false, 0.354f, 0.296f)
                horizontalLineToRelative(1.675f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, false, 0.37f, -0.331f)
                arcToRelative(2.478f, 2.478f, 0.0f, false, true, 4.915f, 0.0f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, 0.357f, 0.317f)
                horizontalLineToRelative(1.638f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, false, 0.357f, -0.317f)
                arcToRelative(2.478f, 2.478f, 0.0f, false, true, 4.914f, 0.0f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, false, 0.358f, 0.317f)
                horizontalLineToRelative(1.627f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, false, 0.363f, -0.357f)
                curveToRelative(0.037f, -2.294f, 0.656f, -4.93f, 2.42f, -6.25f)
                curveToRelative(6.108f, -4.57f, 4.502f, -8.486f, 3.088f, -9.9f)
                close()
                moveTo(16.466f, 11.198f)
                lineToRelative(-1.165f, -0.584f)
                arcToRelative(0.73f, 0.73f, 0.0f, true, true, 1.165f, 0.587f)
                close()
            }
        }
        .build()
        return _gradle!!
    }

private var _gradle: ImageVector? = null
