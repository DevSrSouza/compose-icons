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

public val BrandsGroup.GoodreadsG: ImageVector
    get() {
        if (_goodreadsG != null) {
            return _goodreadsG!!
        }
        _goodreadsG = Builder(name = "GoodreadsG", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.6f, 403.3f)
                horizontalLineToRelative(2.8f)
                curveToRelative(12.7f, 0.0f, 25.5f, 0.0f, 38.2f, 0.1f)
                curveToRelative(1.6f, 0.0f, 3.1f, -0.4f, 3.6f, 2.1f)
                curveToRelative(7.1f, 34.9f, 30.0f, 54.6f, 62.9f, 63.9f)
                curveToRelative(26.9f, 7.6f, 54.1f, 7.8f, 81.3f, 1.8f)
                curveToRelative(33.8f, -7.4f, 56.0f, -28.3f, 68.0f, -60.4f)
                curveToRelative(8.0f, -21.5f, 10.7f, -43.8f, 11.0f, -66.5f)
                curveToRelative(0.1f, -5.8f, 0.3f, -47.0f, -0.2f, -52.8f)
                lineToRelative(-0.9f, -0.3f)
                curveToRelative(-0.8f, 1.5f, -1.7f, 2.9f, -2.5f, 4.4f)
                curveToRelative(-22.1f, 43.1f, -61.3f, 67.4f, -105.4f, 69.1f)
                curveToRelative(-103.0f, 4.0f, -169.4f, -57.0f, -172.0f, -176.2f)
                curveToRelative(-0.5f, -23.7f, 1.8f, -46.9f, 8.3f, -69.7f)
                curveTo(58.3f, 47.7f, 112.3f, 0.6f, 191.6f, 0.0f)
                curveToRelative(61.3f, -0.4f, 101.5f, 38.7f, 116.2f, 70.3f)
                curveToRelative(0.5f, 1.1f, 1.3f, 2.3f, 2.4f, 1.9f)
                verticalLineTo(10.6f)
                horizontalLineToRelative(44.3f)
                curveToRelative(0.0f, 280.3f, 0.1f, 332.2f, 0.1f, 332.2f)
                curveToRelative(-0.1f, 78.5f, -26.7f, 143.7f, -103.0f, 162.2f)
                curveToRelative(-69.5f, 16.9f, -159.0f, 4.8f, -196.0f, -57.2f)
                curveToRelative(-8.0f, -13.5f, -11.8f, -28.3f, -13.0f, -44.5f)
                close()
                moveTo(188.9f, 36.5f)
                curveToRelative(-52.5f, -0.5f, -108.5f, 40.7f, -115.0f, 133.8f)
                curveToRelative(-4.1f, 59.0f, 14.8f, 122.2f, 71.5f, 148.6f)
                curveToRelative(27.6f, 12.9f, 74.3f, 15.0f, 108.3f, -8.7f)
                curveToRelative(47.6f, -33.2f, 62.7f, -97.0f, 54.8f, -154.0f)
                curveToRelative(-9.7f, -71.1f, -47.8f, -120.0f, -119.6f, -119.7f)
                close()
            }
        }
        .build()
        return _goodreadsG!!
    }

private var _goodreadsG: ImageVector? = null
