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

public val BrandsGroup.SquareYoutube: ImageVector
    get() {
        if (_squareYoutube != null) {
            return _squareYoutube!!
        }
        _squareYoutube = Builder(name = "SquareYoutube", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(282.0f, 256.2f)
                lineToRelative(-95.2f, -54.1f)
                lineTo(186.8f, 310.3f)
                lineTo(282.0f, 256.2f)
                close()
                moveTo(384.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(398.4f, 168.1f)
                curveToRelative(7.6f, 28.6f, 7.6f, 88.2f, 7.6f, 88.2f)
                reflectiveCurveToRelative(0.0f, 59.6f, -7.6f, 88.1f)
                curveToRelative(-4.2f, 15.8f, -16.5f, 27.7f, -32.2f, 31.9f)
                curveTo(337.9f, 384.0f, 224.0f, 384.0f, 224.0f, 384.0f)
                reflectiveCurveToRelative(-113.9f, 0.0f, -142.2f, -7.6f)
                curveToRelative(-15.7f, -4.2f, -28.0f, -16.1f, -32.2f, -31.9f)
                curveTo(42.0f, 315.9f, 42.0f, 256.3f, 42.0f, 256.3f)
                reflectiveCurveToRelative(0.0f, -59.7f, 7.6f, -88.2f)
                curveToRelative(4.2f, -15.8f, 16.5f, -28.2f, 32.2f, -32.4f)
                curveTo(110.1f, 128.0f, 224.0f, 128.0f, 224.0f, 128.0f)
                reflectiveCurveToRelative(113.9f, 0.0f, 142.2f, 7.7f)
                curveToRelative(15.7f, 4.2f, 28.0f, 16.6f, 32.2f, 32.4f)
                close()
            }
        }
        .build()
        return _squareYoutube!!
    }

private var _squareYoutube: ImageVector? = null
