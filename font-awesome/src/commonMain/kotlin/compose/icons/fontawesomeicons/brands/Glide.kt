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

public val BrandsGroup.Glide: ImageVector
    get() {
        if (_glide != null) {
            return _glide!!
        }
        _glide = Builder(name = "Glide", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.8f, 148.6f)
                curveToRelative(0.0f, 8.8f, -1.6f, 17.7f, -3.4f, 26.4f)
                curveToRelative(-5.8f, 27.8f, -11.6f, 55.8f, -17.3f, 83.6f)
                curveToRelative(-1.4f, 6.3f, -8.3f, 4.9f, -13.7f, 4.9f)
                curveToRelative(-23.8f, 0.0f, -30.5f, -26.0f, -30.5f, -45.5f)
                curveToRelative(0.0f, -29.3f, 11.2f, -68.1f, 38.5f, -83.1f)
                curveToRelative(4.3f, -2.5f, 9.2f, -4.2f, 14.1f, -4.2f)
                curveToRelative(11.4f, 0.0f, 12.3f, 8.3f, 12.3f, 17.9f)
                close()
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
                moveTo(384.0f, 267.0f)
                curveToRelative(0.0f, -5.1f, -20.8f, -37.7f, -25.5f, -39.5f)
                curveToRelative(-2.2f, -0.9f, -7.2f, -2.3f, -9.6f, -2.3f)
                curveToRelative(-23.1f, 0.0f, -38.7f, 10.5f, -58.2f, 21.5f)
                lineToRelative(-0.5f, -0.5f)
                curveToRelative(4.3f, -29.4f, 14.6f, -57.2f, 14.6f, -87.4f)
                curveToRelative(0.0f, -44.6f, -23.8f, -62.7f, -67.5f, -62.7f)
                curveToRelative(-71.7f, 0.0f, -108.0f, 70.8f, -108.0f, 123.5f)
                curveToRelative(0.0f, 54.7f, 32.0f, 85.0f, 86.3f, 85.0f)
                curveToRelative(7.5f, 0.0f, 6.9f, -0.6f, 6.9f, 2.3f)
                curveToRelative(-10.5f, 80.3f, -56.5f, 82.9f, -56.5f, 58.9f)
                curveToRelative(0.0f, -24.4f, 28.0f, -36.5f, 28.3f, -38.0f)
                curveToRelative(-0.2f, -7.6f, -29.3f, -17.2f, -36.7f, -17.2f)
                curveToRelative(-21.1f, 0.0f, -32.7f, 33.0f, -32.7f, 50.6f)
                curveToRelative(0.0f, 32.3f, 20.4f, 54.7f, 53.3f, 54.7f)
                curveToRelative(48.2f, 0.0f, 83.4f, -49.7f, 94.3f, -91.7f)
                curveToRelative(9.4f, -37.7f, 7.0f, -39.4f, 12.3f, -42.1f)
                curveToRelative(20.0f, -10.1f, 35.8f, -16.8f, 58.4f, -16.8f)
                curveToRelative(11.1f, 0.0f, 19.0f, 2.3f, 36.7f, 5.2f)
                curveToRelative(1.8f, 0.1f, 4.1f, -1.7f, 4.1f, -3.5f)
                close()
            }
        }
        .build()
        return _glide!!
    }

private var _glide: ImageVector? = null
