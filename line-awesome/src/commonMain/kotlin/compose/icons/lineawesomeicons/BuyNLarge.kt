package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BuyNLarge: ImageVector
    get() {
        if (_buyNLarge != null) {
            return _buyNLarge!!
        }
        _buyNLarge = Builder(name = "BuyNLarge", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.211f)
                curveTo(7.72f, 4.211f, 1.0f, 9.49f, 1.0f, 16.0f)
                curveTo(1.0f, 22.51f, 7.72f, 27.789f, 16.0f, 27.789f)
                curveTo(24.28f, 27.789f, 31.0f, 22.51f, 31.0f, 16.0f)
                curveTo(31.0f, 9.49f, 24.28f, 4.211f, 16.0f, 4.211f)
                close()
                moveTo(8.84f, 8.0f)
                lineTo(15.35f, 8.0f)
                curveTo(18.5f, 8.0f, 19.59f, 9.48f, 19.24f, 11.76f)
                curveTo(19.23f, 11.84f, 19.181f, 12.02f, 19.141f, 12.18f)
                curveTo(18.791f, 12.07f, 18.419f, 12.0f, 18.029f, 12.0f)
                curveTo(15.819f, 12.0f, 14.029f, 13.79f, 14.029f, 16.0f)
                curveTo(14.029f, 18.03f, 15.55f, 19.689f, 17.51f, 19.949f)
                curveTo(17.5f, 19.949f, 17.5f, 19.961f, 17.5f, 19.971f)
                curveTo(16.56f, 21.761f, 14.7f, 22.97f, 11.75f, 23.0f)
                curveTo(11.75f, 23.0f, 5.01f, 23.01f, 5.0f, 23.0f)
                lineTo(8.84f, 8.0f)
                close()
                moveTo(21.35f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(23.211f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(27.0f, 23.0f)
                lineTo(17.609f, 23.0f)
                lineTo(18.359f, 19.971f)
                curveTo(20.419f, 19.801f, 22.029f, 18.1f, 22.029f, 16.0f)
                curveTo(22.029f, 14.59f, 21.299f, 13.351f, 20.189f, 12.641f)
                lineTo(21.35f, 8.0f)
                close()
                moveTo(11.99f, 11.0f)
                lineTo(11.34f, 13.76f)
                lineTo(12.529f, 13.76f)
                curveTo(13.539f, 13.76f, 14.511f, 12.97f, 14.711f, 12.07f)
                curveTo(14.931f, 11.08f, 14.24f, 11.0f, 13.18f, 11.0f)
                lineTo(11.99f, 11.0f)
                close()
                moveTo(16.43f, 13.42f)
                lineTo(18.07f, 13.42f)
                lineTo(18.85f, 15.41f)
                lineTo(19.35f, 13.42f)
                lineTo(21.029f, 13.42f)
                lineTo(19.869f, 18.32f)
                lineTo(18.01f, 18.32f)
                lineTo(17.43f, 16.381f)
                lineTo(17.02f, 18.32f)
                lineTo(15.029f, 18.32f)
                lineTo(16.43f, 13.42f)
                close()
                moveTo(10.609f, 16.74f)
                lineTo(9.84f, 20.0f)
                lineTo(11.221f, 20.0f)
                curveTo(12.121f, 20.0f, 13.01f, 19.821f, 13.34f, 18.461f)
                curveTo(13.65f, 17.171f, 12.89f, 16.74f, 11.99f, 16.74f)
                lineTo(10.609f, 16.74f)
                close()
            }
        }
        .build()
        return _buyNLarge!!
    }

private var _buyNLarge: ImageVector? = null
