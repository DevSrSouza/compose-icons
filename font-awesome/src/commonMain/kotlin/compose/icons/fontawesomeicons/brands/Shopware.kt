package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Shopware: ImageVector
    get() {
        if (_shopware != null) {
            return _shopware!!
        }
        _shopware = Builder(name = "Shopware", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(403.5f, 455.41f)
                arcTo(246.17f, 246.17f, 0.0f, false, true, 256.0f, 504.0f)
                curveTo(118.81f, 504.0f, 8.0f, 393.0f, 8.0f, 256.0f)
                curveTo(8.0f, 118.81f, 119.0f, 8.0f, 256.0f, 8.0f)
                arcToRelative(247.39f, 247.39f, 0.0f, false, true, 165.7f, 63.5f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, true, -2.86f, 6.18f)
                arcTo(418.62f, 418.62f, 0.0f, false, false, 362.13f, 74.0f)
                curveToRelative(-129.36f, 0.0f, -222.4f, 53.47f, -222.4f, 155.35f)
                curveToRelative(0.0f, 109.0f, 92.13f, 145.88f, 176.83f, 178.73f)
                curveToRelative(33.64f, 13.0f, 65.4f, 25.36f, 87.0f, 41.59f)
                arcToRelative(3.58f, 3.58f, 0.0f, false, true, 0.0f, 5.72f)
                close()
                moveTo(503.0f, 233.09f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, false, -1.27f, -2.44f)
                curveToRelative(-51.76f, -43.0f, -93.62f, -60.48f, -144.48f, -60.48f)
                curveToRelative(-84.13f, 0.0f, -80.25f, 52.17f, -80.25f, 53.63f)
                curveToRelative(0.0f, 42.6f, 52.06f, 62.0f, 112.34f, 84.49f)
                curveToRelative(31.07f, 11.59f, 63.19f, 23.57f, 92.68f, 39.93f)
                arcToRelative(3.57f, 3.57f, 0.0f, false, false, 5.0f, -1.82f)
                arcTo(249.0f, 249.0f, 0.0f, false, false, 503.0f, 233.09f)
                close()
            }
        }
        .build()
        return _shopware!!
    }

private var _shopware: ImageVector? = null
