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

public val SimpleIcons.Eyeem: VectorAsset
    get() {
        if (_eyeem != null) {
            return _eyeem!!
        }
        _eyeem = VectorAssetBuilder(name = "Eyeem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.673f, 9.181f)
                verticalLineToRelative(-1.04f)
                lineTo(0.0f, 8.141f)
                verticalLineToRelative(5.723f)
                horizontalLineToRelative(3.68f)
                verticalLineToRelative(-1.048f)
                lineTo(1.186f, 12.816f)
                verticalLineToRelative(-1.378f)
                horizontalLineToRelative(2.158f)
                verticalLineToRelative(-1.017f)
                lineTo(1.186f, 10.421f)
                lineTo(1.186f, 9.18f)
                close()
                moveTo(5.835f, 15.815f)
                lineToRelative(2.532f, -5.907f)
                horizontalLineToRelative(-1.24f)
                lineToRelative(-0.902f, 2.357f)
                lineToRelative(-0.91f, -2.357f)
                lineTo(4.081f, 9.908f)
                lineToRelative(1.546f, 3.604f)
                lineToRelative(-1.01f, 2.303f)
                close()
                moveTo(12.46f, 12.242f)
                verticalLineToRelative(-0.444f)
                curveToRelative(0.0f, -1.232f, -0.75f, -1.966f, -1.89f, -1.966f)
                curveToRelative(-1.179f, 0.0f, -2.013f, 0.78f, -2.013f, 2.058f)
                curveToRelative(0.0f, 1.27f, 0.834f, 2.058f, 2.043f, 2.058f)
                curveToRelative(0.926f, 0.0f, 1.684f, -0.536f, 1.821f, -1.285f)
                lineToRelative(-1.124f, -0.054f)
                curveToRelative(-0.085f, 0.275f, -0.337f, 0.436f, -0.727f, 0.436f)
                curveToRelative(-0.505f, 0.0f, -0.804f, -0.314f, -0.827f, -0.803f)
                close()
                moveTo(10.562f, 10.704f)
                curveToRelative(0.505f, 0.0f, 0.75f, 0.314f, 0.773f, 0.796f)
                lineTo(9.743f, 11.5f)
                curveToRelative(0.031f, -0.505f, 0.345f, -0.796f, 0.82f, -0.796f)
                close()
                moveTo(17.04f, 9.18f)
                verticalLineToRelative(-1.04f)
                horizontalLineToRelative(-3.672f)
                verticalLineToRelative(5.723f)
                horizontalLineToRelative(3.68f)
                verticalLineToRelative(-1.048f)
                horizontalLineToRelative(-2.495f)
                verticalLineToRelative(-1.378f)
                horizontalLineToRelative(2.158f)
                verticalLineToRelative(-1.017f)
                horizontalLineToRelative(-2.158f)
                lineTo(14.553f, 9.18f)
                close()
                moveTo(22.5f, 9.83f)
                curveToRelative(-0.597f, 0.0f, -0.987f, 0.268f, -1.216f, 0.628f)
                curveToRelative(-0.26f, -0.406f, -0.697f, -0.627f, -1.24f, -0.627f)
                reflectiveCurveToRelative(-0.864f, 0.206f, -1.04f, 0.482f)
                verticalLineToRelative(-0.406f)
                horizontalLineToRelative(-1.056f)
                verticalLineToRelative(3.956f)
                horizontalLineToRelative(1.117f)
                verticalLineToRelative(-2.196f)
                curveToRelative(0.0f, -0.474f, 0.268f, -0.796f, 0.711f, -0.796f)
                curveToRelative(0.406f, 0.0f, 0.643f, 0.283f, 0.643f, 0.788f)
                verticalLineToRelative(2.204f)
                horizontalLineToRelative(1.117f)
                lineTo(21.536f, 11.53f)
                curveToRelative(0.046f, -0.398f, 0.291f, -0.658f, 0.689f, -0.658f)
                curveToRelative(0.428f, 0.0f, 0.658f, 0.283f, 0.658f, 0.788f)
                verticalLineToRelative(2.204f)
                lineTo(24.0f, 13.864f)
                verticalLineToRelative(-2.426f)
                curveToRelative(0.0f, -1.002f, -0.597f, -1.606f, -1.5f, -1.606f)
                close()
            }
        }
        .build()
        return _eyeem!!
    }

private var _eyeem: VectorAsset? = null
