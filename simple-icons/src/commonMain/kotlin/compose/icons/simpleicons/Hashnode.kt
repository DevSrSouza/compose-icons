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

public val SimpleIcons.Hashnode: VectorAsset
    get() {
        if (_hashnode != null) {
            return _hashnode!!
        }
        _hashnode = VectorAssetBuilder(name = "Hashnode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.84f, 0.0f)
                horizontalLineToRelative(16.32f)
                arcTo(3.84f, 3.84f, 0.0f, false, true, 24.0f, 3.84f)
                verticalLineToRelative(16.32f)
                arcTo(3.84f, 3.84f, 0.0f, false, true, 20.16f, 24.0f)
                lineTo(3.84f, 24.0f)
                arcTo(3.84f, 3.84f, 0.0f, false, true, 0.0f, 20.16f)
                lineTo(0.0f, 3.84f)
                arcTo(3.84f, 3.84f, 0.0f, false, true, 3.84f, 0.0f)
                close()
                moveTo(18.015f, 21.638f)
                lineToRelative(-0.004f, -0.001f)
                arcToRelative(2.577f, 2.577f, 0.0f, false, false, 0.209f, -5.139f)
                lineToRelative(-4.917f, -8.682f)
                curveToRelative(-0.719f, -1.292f, -2.108f, -1.236f, -2.609f, 0.598f)
                curveToRelative(-0.43f, 1.736f, -0.319f, 3.372f, -0.444f, 5.348f)
                curveToRelative(-0.001f, 0.013f, -0.01f, 0.024f, -0.023f, 0.027f)
                reflectiveCurveToRelative(-0.026f, -0.002f, -0.033f, -0.013f)
                lineToRelative(-4.39f, -8.751f)
                curveToRelative(0.358f, -0.281f, 0.568f, -0.711f, 0.569f, -1.167f)
                arcToRelative(1.459f, 1.459f, 0.0f, true, false, -1.459f, 1.459f)
                curveToRelative(0.069f, 0.0f, 0.125f, -0.014f, 0.18f, -0.014f)
                curveToRelative(1.848f, 4.75f, 3.904f, 10.293f, 4.64f, 11.571f)
                curveToRelative(0.5f, 1.222f, 2.209f, 0.833f, 2.251f, -0.486f)
                lineToRelative(0.18f, -6.932f)
                curveToRelative(0.0f, -0.042f, 0.055f, -0.042f, 0.07f, -0.014f)
                lineToRelative(3.526f, 8.389f)
                arcToRelative(2.573f, 2.573f, 0.0f, false, false, 2.254f, 3.806f)
                close()
            }
        }
        .build()
        return _hashnode!!
    }

private var _hashnode: VectorAsset? = null
