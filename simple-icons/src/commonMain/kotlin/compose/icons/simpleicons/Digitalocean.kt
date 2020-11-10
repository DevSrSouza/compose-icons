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

public val SimpleIcons.Digitalocean: VectorAsset
    get() {
        if (_digitalocean != null) {
            return _digitalocean!!
        }
        _digitalocean = VectorAssetBuilder(name = "Digitalocean", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.836f, 19.365f)
                horizontalLineTo(0.832f)
                verticalLineTo(16.38f)
                horizontalLineToRelative(2.985f)
                verticalLineToRelative(2.985f)
                horizontalLineTo(7.38f)
                verticalLineTo(14.73f)
                horizontalLineToRelative(4.635f)
                verticalLineToRelative(4.62f)
                curveToRelative(4.927f, -0.006f, 8.73f, -4.883f, 6.852f, -10.066f)
                curveToRelative(-0.698f, -1.92f, -2.23f, -3.45f, -4.15f, -4.146f)
                curveTo(9.527f, 3.255f, 4.647f, 7.068f, 4.647f, 12.0f)
                horizontalLineTo(0.0f)
                curveTo(0.0f, 4.144f, 7.59f, -1.976f, 15.824f, 0.595f)
                curveToRelative(3.6f, 1.125f, 6.456f, 3.982f, 7.58f, 7.58f)
                curveTo(25.974f, 16.41f, 19.858f, 24.0f, 12.0f, 24.0f)
                verticalLineToRelative(-4.635f)
                horizontalLineTo(7.377f)
                verticalLineToRelative(3.56f)
                horizontalLineToRelative(-3.56f)
                verticalLineToRelative(-3.56f)
                horizontalLineTo(0.833f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _digitalocean!!
    }

private var _digitalocean: VectorAsset? = null
