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

public val SimpleIcons.BuyMeACoffee: VectorAsset
    get() {
        if (_buyMeACoffee != null) {
            return _buyMeACoffee!!
        }
        _buyMeACoffee = VectorAssetBuilder(name = "BuyMeACoffee", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.898f, 0.0f)
                lineTo(5.682f, 2.799f)
                lineTo(3.877f, 2.799f)
                verticalLineToRelative(2.523f)
                horizontalLineToRelative(0.695f)
                lineTo(5.277f, 9.8f)
                lineTo(4.172f, 9.8f)
                lineToRelative(1.46f, 8.23f)
                lineToRelative(0.938f, -0.01f)
                lineTo(7.512f, 24.0f)
                horizontalLineToRelative(8.918f)
                lineToRelative(0.062f, -0.4f)
                lineToRelative(0.88f, -5.58f)
                lineToRelative(0.888f, 0.01f)
                lineToRelative(1.46f, -8.231f)
                horizontalLineToRelative(-1.056f)
                lineToRelative(0.705f, -4.477f)
                horizontalLineToRelative(0.756f)
                lineTo(20.125f, 2.8f)
                horizontalLineToRelative(-1.918f)
                lineTo(16.99f, 0.0f)
                lineTo(6.898f, 0.0f)
                close()
                moveTo(7.426f, 0.805f)
                horizontalLineToRelative(9.043f)
                lineToRelative(0.771f, 1.78f)
                lineTo(6.652f, 2.585f)
                lineToRelative(0.774f, -1.78f)
                close()
                moveTo(4.676f, 3.602f)
                lineTo(19.32f, 3.602f)
                verticalLineToRelative(0.92f)
                lineTo(4.676f, 4.522f)
                verticalLineToRelative(-0.92f)
                close()
                moveTo(5.129f, 10.6f)
                horizontalLineToRelative(13.635f)
                lineToRelative(-1.176f, 6.62f)
                lineToRelative(-5.649f, -0.06f)
                lineToRelative(-5.636f, 0.06f)
                lineToRelative(-1.174f, -6.62f)
                close()
            }
        }
        .build()
        return _buyMeACoffee!!
    }

private var _buyMeACoffee: VectorAsset? = null
