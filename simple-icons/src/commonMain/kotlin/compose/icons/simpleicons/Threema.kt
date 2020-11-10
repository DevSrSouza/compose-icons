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

public val SimpleIcons.Threema: VectorAsset
    get() {
        if (_threema != null) {
            return _threema!!
        }
        _threema = VectorAssetBuilder(name = "Threema", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.755f, 22.243f)
                arcToRelative(1.756f, 1.756f, 0.0f, true, true, -3.512f, 0.002f)
                arcToRelative(1.756f, 1.756f, 0.0f, false, true, 3.512f, -0.002f)
                close()
                moveTo(7.42f, 22.243f)
                arcToRelative(1.756f, 1.756f, 0.0f, true, true, -3.513f, 0.002f)
                arcToRelative(1.756f, 1.756f, 0.0f, false, true, 3.513f, -0.002f)
                close()
                moveTo(20.091f, 22.243f)
                arcToRelative(1.756f, 1.756f, 0.0f, true, true, -3.512f, 0.002f)
                arcToRelative(1.756f, 1.756f, 0.0f, false, true, 3.512f, -0.002f)
                close()
                moveTo(7.477f, 17.248f)
                lineToRelative(-5.171f, 1.293f)
                lineToRelative(1.105f, -4.42f)
                curveToRelative(-1.094f, -1.442f, -1.733f, -3.175f, -1.733f, -5.039f)
                curveTo(1.678f, 4.066f, 6.3f, 0.0f, 12.0f, 0.0f)
                curveToRelative(5.7f, 0.0f, 10.322f, 4.066f, 10.322f, 9.082f)
                curveToRelative(0.0f, 5.016f, -4.622f, 9.083f, -10.322f, 9.083f)
                arcToRelative(11.45f, 11.45f, 0.0f, false, true, -4.523f, -0.917f)
                close()
                moveTo(9.072f, 8.328f)
                horizontalLineToRelative(-0.115f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.47f, 0.471f)
                verticalLineToRelative(4.126f)
                curveToRelative(0.0f, 0.26f, 0.21f, 0.471f, 0.47f, 0.471f)
                horizontalLineToRelative(6.086f)
                curveToRelative(0.26f, 0.0f, 0.47f, -0.21f, 0.47f, -0.47f)
                lineTo(15.513f, 8.798f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, -0.47f, -0.47f)
                horizontalLineToRelative(-0.115f)
                verticalLineToRelative(-1.17f)
                arcToRelative(2.927f, 2.927f, 0.0f, false, false, -2.93f, -2.924f)
                arcTo(2.926f, 2.926f, 0.0f, false, false, 9.073f, 7.16f)
                close()
                moveTo(13.757f, 8.328f)
                horizontalLineToRelative(-3.514f)
                lineTo(10.243f, 7.16f)
                arcToRelative(1.756f, 1.756f, 0.0f, false, true, 3.514f, 0.0f)
                verticalLineToRelative(1.17f)
                close()
            }
        }
        .build()
        return _threema!!
    }

private var _threema: VectorAsset? = null
