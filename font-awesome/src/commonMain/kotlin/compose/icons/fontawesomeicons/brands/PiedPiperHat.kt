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

public val BrandsGroup.PiedPiperHat: ImageVector
    get() {
        if (_piedPiperHat != null) {
            return _piedPiperHat!!
        }
        _piedPiperHat = Builder(name = "PiedPiperHat", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 24.9f)
                curveToRelative(-80.8f, 53.6f, -89.4f, 92.5f, -96.4f, 104.4f)
                curveToRelative(-6.7f, 12.2f, -11.7f, 60.3f, -23.3f, 83.6f)
                curveToRelative(-11.7f, 23.6f, -54.2f, 42.2f, -66.1f, 50.0f)
                curveToRelative(-11.7f, 7.8f, -28.3f, 38.1f, -41.9f, 64.2f)
                curveToRelative(-108.1f, -4.4f, -167.4f, 38.8f, -259.2f, 93.6f)
                curveToRelative(29.4f, -9.7f, 43.3f, -16.7f, 43.3f, -16.7f)
                curveToRelative(94.2f, -36.0f, 139.3f, -68.3f, 281.1f, -49.2f)
                curveToRelative(1.1f, 0.0f, 1.9f, 0.6f, 2.8f, 0.8f)
                curveToRelative(3.9f, 2.2f, 5.3f, 6.9f, 3.1f, 10.8f)
                lineToRelative(-53.9f, 95.8f)
                curveToRelative(-2.5f, 4.7f, -7.8f, 7.2f, -13.1f, 6.1f)
                curveToRelative(-126.8f, -23.8f, -226.9f, 17.3f, -318.9f, 18.6f)
                curveTo(24.1f, 488.0f, 0.0f, 453.4f, 0.0f, 451.8f)
                curveToRelative(0.0f, -1.1f, 0.6f, -1.7f, 1.7f, -1.7f)
                curveToRelative(0.0f, 0.0f, 38.3f, 0.0f, 103.1f, -15.3f)
                curveTo(178.4f, 294.5f, 244.0f, 245.4f, 315.4f, 245.4f)
                curveToRelative(0.0f, 0.0f, 71.7f, 0.0f, 90.6f, 61.9f)
                curveToRelative(22.8f, -39.7f, 28.3f, -49.2f, 28.3f, -49.2f)
                curveToRelative(5.3f, -9.4f, 35.0f, -77.2f, 86.4f, -141.4f)
                curveToRelative(51.5f, -64.0f, 90.4f, -79.9f, 119.3f, -91.8f)
                close()
            }
        }
        .build()
        return _piedPiperHat!!
    }

private var _piedPiperHat: ImageVector? = null
