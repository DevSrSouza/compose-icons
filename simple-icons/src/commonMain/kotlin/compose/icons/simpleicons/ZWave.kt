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

public val SimpleIcons.ZWave: VectorAsset
    get() {
        if (_zWave != null) {
            return _zWave!!
        }
        _zWave = VectorAssetBuilder(name = "ZWave", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.156f, 0.014f)
                curveTo(7.69f, 0.014f, 0.0f, 7.704f, 0.0f, 17.17f)
                horizontalLineToRelative(2.3f)
                curveTo(2.33f, 8.956f, 8.973f, 2.316f, 17.157f, 2.316f)
                lineTo(17.157f, 0.014f)
                close()
                moveTo(17.156f, 4.588f)
                curveToRelative(-6.932f, 0.0f, -12.584f, 5.65f, -12.584f, 12.582f)
                horizontalLineToRelative(2.301f)
                curveToRelative(0.03f, -5.68f, 4.633f, -10.281f, 10.283f, -10.281f)
                lineTo(17.156f, 4.588f)
                close()
                moveTo(17.156f, 10.297f)
                arcToRelative(6.837f, 6.837f, 0.0f, false, false, -6.845f, 6.844f)
                arcToRelative(6.839f, 6.839f, 0.0f, false, false, 6.845f, 6.845f)
                arcTo(6.837f, 6.837f, 0.0f, false, false, 24.0f, 17.141f)
                arcToRelative(6.835f, 6.835f, 0.0f, false, false, -6.844f, -6.844f)
                close()
                moveTo(14.883f, 13.471f)
                horizontalLineToRelative(5.738f)
                lineToRelative(-3.058f, 4.863f)
                horizontalLineToRelative(3.058f)
                lineToRelative(-1.398f, 2.156f)
                horizontalLineToRelative(-5.795f)
                lineToRelative(3.144f, -4.922f)
                horizontalLineToRelative(-3.0f)
                lineToRelative(1.31f, -2.097f)
                close()
            }
        }
        .build()
        return _zWave!!
    }

private var _zWave: VectorAsset? = null
