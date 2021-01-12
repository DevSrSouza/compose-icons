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

public val SimpleIcons.Autodesk: VectorAsset
    get() {
        if (_autodesk != null) {
            return _autodesk!!
        }
        _autodesk = VectorAssetBuilder(name = "Autodesk", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.898f, 0.437f)
                reflectiveCurveTo(7.87f, 0.534f, 8.26f, 1.505f)
                curveToRelative(0.0f, 0.0f, 1.069f, 2.526f, 2.04f, 4.955f)
                curveToRelative(1.42f, 3.33f, 3.22f, 7.615f, 4.67f, 11.078f)
                lineTo(1.167f, 17.538f)
                curveToRelative(-0.778f, 0.0f, -1.166f, -0.486f, -1.166f, -0.486f)
                curveToRelative(0.777f, 1.36f, 3.012f, 5.636f, 3.012f, 5.636f)
                curveToRelative(0.388f, 0.486f, 0.777f, 0.776f, 1.36f, 0.776f)
                curveToRelative(1.264f, 0.0f, 3.208f, -1.262f, 3.208f, -1.262f)
                lineToRelative(7.409f, -4.619f)
                curveToRelative(1.412f, 3.372f, 2.5f, 5.98f, 2.5f, 5.98f)
                lineTo(24.0f, 23.563f)
                curveToRelative(0.097f, -0.097f, -9.327f, -22.446f, -9.424f, -22.544f)
                curveToRelative(-0.097f, -0.097f, -0.292f, -0.582f, -0.972f, -0.582f)
                close()
                moveTo(6.608f, 1.312f)
                curveToRelative(-0.583f, 0.0f, -0.778f, 0.485f, -0.875f, 0.582f)
                lineTo(0.39f, 14.526f)
                curveToRelative(-0.291f, 0.874f, -0.097f, 1.943f, 1.458f, 1.943f)
                horizontalLineToRelative(4.177f)
                lineToRelative(3.693f, -8.841f)
                arcTo(453.32f, 453.32f, 0.0f, false, false, 7.58f, 2.38f)
                curveToRelative(-0.097f, -0.291f, -0.389f, -1.068f, -0.972f, -1.068f)
                close()
            }
        }
        .build()
        return _autodesk!!
    }

private var _autodesk: VectorAsset? = null
