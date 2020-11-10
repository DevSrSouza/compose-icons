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

public val SimpleIcons.GoogleCardboard: VectorAsset
    get() {
        if (_googleCardboard != null) {
            return _googleCardboard!!
        }
        _googleCardboard = VectorAssetBuilder(name = "GoogleCardboard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.234f, 4.932f)
                arcToRelative(2.959f, 2.959f, 0.0f, false, false, -2.18f, -0.977f)
                lineTo(3.083f, 3.955f)
                curveToRelative(-0.827f, 0.0f, -1.58f, 0.375f, -2.18f, 0.977f)
                curveTo(0.3f, 5.534f, 0.0f, 6.361f, 0.0f, 7.188f)
                verticalLineToRelative(9.624f)
                curveToRelative(0.0f, 0.827f, 0.3f, 1.654f, 0.902f, 2.256f)
                arcToRelative(2.814f, 2.814f, 0.0f, false, false, 2.18f, 0.977f)
                lineTo(7.37f, 20.045f)
                arcToRelative(3.22f, 3.22f, 0.0f, false, false, 1.654f, -0.45f)
                curveToRelative(0.451f, -0.301f, 0.902f, -0.753f, 1.128f, -1.279f)
                lineToRelative(1.203f, -2.33f)
                curveToRelative(0.15f, -0.302f, 0.376f, -0.452f, 0.677f, -0.452f)
                curveToRelative(0.3f, 0.0f, 0.601f, 0.15f, 0.676f, 0.451f)
                lineToRelative(1.203f, 2.331f)
                curveToRelative(0.226f, 0.526f, 0.677f, 0.902f, 1.128f, 1.203f)
                curveToRelative(0.451f, 0.3f, 1.053f, 0.451f, 1.58f, 0.451f)
                horizontalLineToRelative(4.285f)
                curveToRelative(0.827f, 0.0f, 1.58f, -0.376f, 2.18f, -0.977f)
                curveToRelative(0.602f, -0.602f, 0.903f, -1.429f, 0.903f, -2.256f)
                verticalLineToRelative(-9.55f)
                curveToRelative(0.075f, -0.826f, -0.15f, -1.653f, -0.752f, -2.255f)
                close()
                moveTo(6.617f, 14.482f)
                curveToRelative(-1.354f, 0.0f, -2.406f, -1.129f, -2.406f, -2.482f)
                curveToRelative(0.0f, -1.353f, 1.128f, -2.406f, 2.481f, -2.406f)
                reflectiveCurveToRelative(2.406f, 1.128f, 2.406f, 2.481f)
                curveToRelative(-0.075f, 1.278f, -1.128f, 2.406f, -2.481f, 2.406f)
                close()
                moveTo(17.595f, 14.482f)
                curveToRelative(-1.354f, 0.0f, -2.482f, -1.053f, -2.482f, -2.407f)
                curveToRelative(0.0f, -1.353f, 1.053f, -2.481f, 2.407f, -2.481f)
                curveTo(18.873f, 9.594f, 20.0f, 10.647f, 20.0f, 12.0f)
                curveToRelative(0.0f, 1.353f, -1.052f, 2.481f, -2.405f, 2.481f)
                close()
            }
        }
        .build()
        return _googleCardboard!!
    }

private var _googleCardboard: VectorAsset? = null
