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

public val SimpleIcons.Everplaces: VectorAsset
    get() {
        if (_everplaces != null) {
            return _everplaces!!
        }
        _everplaces = VectorAssetBuilder(name = "Everplaces", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.839f, 23.972f)
                curveTo(4.76f, 23.388f, 0.0f, 18.257f, 0.0f, 12.028f)
                curveToRelative(0.0f, -6.623f, 5.377f, -12.0f, 12.0f, -12.0f)
                reflectiveCurveToRelative(12.0f, 5.377f, 12.0f, 12.0f)
                curveToRelative(0.0f, 6.23f, -4.76f, 11.359f, -10.839f, 11.943f)
                verticalLineToRelative(-7.046f)
                curveToRelative(2.22f, -0.525f, 3.87f, -2.521f, 3.87f, -4.897f)
                curveToRelative(0.0f, -2.778f, -2.253f, -5.033f, -5.031f, -5.033f)
                reflectiveCurveTo(6.968f, 9.25f, 6.968f, 12.028f)
                curveToRelative(0.0f, 2.377f, 1.653f, 4.372f, 3.87f, 4.897f)
                lineToRelative(0.001f, 7.047f)
                close()
                moveTo(10.451f, 9.317f)
                curveToRelative(0.642f, 0.0f, 1.162f, 0.521f, 1.162f, 1.162f)
                curveToRelative(0.0f, 0.641f, -0.521f, 1.162f, -1.162f, 1.162f)
                curveToRelative(-0.641f, 0.0f, -1.16f, -0.521f, -1.16f, -1.162f)
                curveToRelative(0.0f, -0.641f, 0.52f, -1.161f, 1.16f, -1.162f)
                close()
            }
        }
        .build()
        return _everplaces!!
    }

private var _everplaces: VectorAsset? = null
