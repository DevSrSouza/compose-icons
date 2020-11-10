package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Netflix: VectorAsset
    get() {
        if (_netflix != null) {
            return _netflix!!
        }
        _netflix = VectorAssetBuilder(name = "Netflix", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.388f, 0.004f)
                lineToRelative(4.75f, 13.462f)
                verticalLineToRelative(-0.007f)
                lineToRelative(0.377f, 1.06f)
                curveToRelative(2.088f, 5.91f, 3.21f, 9.077f, 3.216f, 9.084f)
                curveToRelative(0.004f, 0.0f, 0.32f, 0.02f, 0.702f, 0.04f)
                curveToRelative(1.156f, 0.05f, 2.59f, 0.18f, 3.676f, 0.31f)
                curveToRelative(0.25f, 0.03f, 0.466f, 0.04f, 0.48f, 0.03f)
                lineTo(13.88f, 10.62f)
                lineToRelative(-0.436f, -1.23f)
                lineToRelative(-2.423f, -6.852f)
                curveToRelative(-0.46f, -1.3f, -0.85f, -2.408f, -0.87f, -2.45f)
                lineTo(10.117f, 0.0f)
                lineTo(5.393f, 0.0f)
                close()
                moveTo(13.897f, 0.012f)
                lineToRelative(-0.01f, 5.307f)
                lineToRelative(-0.008f, 5.307f)
                lineToRelative(-0.437f, -1.232f)
                verticalLineToRelative(-0.002f)
                lineToRelative(-0.565f, 11.811f)
                curveToRelative(0.555f, 1.568f, 0.852f, 2.404f, 0.855f, 2.408f)
                curveToRelative(0.004f, 0.004f, 0.32f, 0.024f, 0.702f, 0.042f)
                curveToRelative(1.157f, 0.05f, 2.59f, 0.18f, 3.68f, 0.31f)
                curveToRelative(0.25f, 0.03f, 0.467f, 0.04f, 0.48f, 0.03f)
                curveToRelative(0.013f, -0.01f, 0.02f, -5.42f, 0.017f, -12.012f)
                lineTo(18.603f, 0.01f)
                horizontalLineToRelative(-4.706f)
                close()
                moveTo(5.388f, 0.002f)
                verticalLineToRelative(11.992f)
                curveToRelative(0.0f, 6.595f, 0.007f, 11.997f, 0.015f, 12.005f)
                curveToRelative(0.008f, 0.008f, 0.416f, -0.03f, 0.907f, -0.086f)
                curveToRelative(0.49f, -0.06f, 1.17f, -0.13f, 1.51f, -0.16f)
                curveToRelative(0.518f, -0.05f, 2.068f, -0.15f, 2.248f, -0.15f)
                curveToRelative(0.052f, 0.0f, 0.056f, -0.27f, 0.063f, -5.081f)
                lineToRelative(0.008f, -5.08f)
                lineToRelative(0.38f, 1.06f)
                lineToRelative(0.13f, 0.375f)
                lineToRelative(0.57f, -11.801f)
                lineToRelative(-0.19f, -0.547f)
                lineToRelative(-0.88f, -2.44f)
                lineToRelative(-0.03f, -0.087f)
                close()
            }
        }
        .build()
        return _netflix!!
    }

private var _netflix: VectorAsset? = null
