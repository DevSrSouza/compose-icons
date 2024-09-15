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

public val BrandsGroup.Btc: ImageVector
    get() {
        if (_btc != null) {
            return _btc!!
        }
        _btc = Builder(name = "Btc", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(310.2f, 242.64f)
                curveToRelative(27.73f, -14.18f, 45.38f, -39.39f, 41.28f, -81.3f)
                curveToRelative(-5.36f, -57.35f, -52.46f, -76.57f, -114.85f, -81.93f)
                lineTo(236.63f, 0.0f)
                horizontalLineToRelative(-48.53f)
                verticalLineToRelative(77.2f)
                curveToRelative(-12.6f, 0.0f, -25.52f, 0.31f, -38.44f, 0.63f)
                lineTo(149.66f, 0.0f)
                horizontalLineToRelative(-48.53f)
                verticalLineToRelative(79.41f)
                curveToRelative(-17.84f, 0.54f, -38.62f, 0.28f, -97.37f, 0.0f)
                verticalLineToRelative(51.68f)
                curveToRelative(38.31f, -0.68f, 58.42f, -3.14f, 63.02f, 21.43f)
                verticalLineToRelative(217.43f)
                curveToRelative(-2.92f, 19.49f, -18.52f, 16.68f, -53.26f, 16.07f)
                lineTo(3.77f, 443.68f)
                curveToRelative(88.48f, 0.0f, 97.37f, 0.31f, 97.37f, 0.31f)
                lineTo(101.14f, 512.0f)
                horizontalLineToRelative(48.53f)
                verticalLineToRelative(-67.06f)
                curveToRelative(13.23f, 0.31f, 26.15f, 0.31f, 38.44f, 0.31f)
                lineTo(188.11f, 512.0f)
                horizontalLineToRelative(48.53f)
                verticalLineToRelative(-68.0f)
                curveToRelative(81.3f, -4.41f, 135.65f, -24.89f, 142.9f, -101.47f)
                curveToRelative(5.67f, -61.45f, -23.32f, -88.86f, -69.33f, -99.89f)
                close()
                moveTo(150.61f, 134.55f)
                curveToRelative(27.42f, 0.0f, 113.13f, -8.51f, 113.13f, 48.53f)
                curveToRelative(0.0f, 54.51f, -85.71f, 48.21f, -113.13f, 48.21f)
                verticalLineToRelative(-96.74f)
                close()
                moveTo(150.61f, 386.33f)
                lineTo(150.61f, 279.82f)
                curveToRelative(32.77f, 0.0f, 133.13f, -9.14f, 133.13f, 53.26f)
                curveToRelative(-0.0f, 60.19f, -100.36f, 53.25f, -133.13f, 53.25f)
                close()
            }
        }
        .build()
        return _btc!!
    }

private var _btc: ImageVector? = null
