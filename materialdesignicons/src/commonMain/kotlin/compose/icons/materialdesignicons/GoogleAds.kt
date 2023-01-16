package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.GoogleAds: ImageVector
    get() {
        if (_googleAds != null) {
            return _googleAds!!
        }
        _googleAds = Builder(name = "GoogleAds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.25f, 1.47f)
                curveTo(11.55f, 1.42f, 10.82f, 1.58f, 10.17f, 1.96f)
                curveTo(8.41f, 2.97f, 7.81f, 5.21f, 8.82f, 6.96f)
                lineTo(16.16f, 19.66f)
                curveTo(17.17f, 21.42f, 19.41f, 22.0f, 21.17f, 21.0f)
                curveTo(22.92f, 20.0f, 23.5f, 17.75f, 22.5f, 16.0f)
                lineTo(15.18f, 3.3f)
                curveTo(14.54f, 2.2f, 13.43f, 1.56f, 12.25f, 1.47f)
                moveTo(6.82f, 6.76f)
                lineTo(1.5f, 16.0f)
                arcTo(3.67f, 3.67f, 0.0f, false, false, 1.0f, 17.83f)
                arcTo(3.67f, 3.67f, 0.0f, false, false, 4.67f, 21.5f)
                arcTo(3.67f, 3.67f, 0.0f, false, false, 7.84f, 19.66f)
                verticalLineTo(19.67f)
                lineTo(11.0f, 14.19f)
                curveTo(9.65f, 11.89f, 8.27f, 9.6f, 7.03f, 7.23f)
                curveTo(6.95f, 7.08f, 6.88f, 6.92f, 6.83f, 6.76f)
                close()
                lineTo(16.4f, 5.0f)
                close()
            }
        }
        .build()
        return _googleAds!!
    }

private var _googleAds: ImageVector? = null
