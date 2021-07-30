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

public val BrandsGroup.XingSquare: ImageVector
    get() {
        if (_xingSquare != null) {
            return _xingSquare!!
        }
        _xingSquare = Builder(name = "XingSquare", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.5f, 32.0f, 0.0f, 53.5f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(448.0f, 80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(140.4f, 320.2f)
                lineTo(93.8f, 320.2f)
                curveToRelative(-5.5f, 0.0f, -8.7f, -5.3f, -6.0f, -10.3f)
                lineToRelative(49.3f, -86.7f)
                curveToRelative(0.1f, 0.0f, 0.1f, -0.1f, 0.0f, -0.2f)
                lineToRelative(-31.4f, -54.0f)
                curveToRelative(-3.0f, -5.6f, 0.2f, -10.1f, 6.0f, -10.1f)
                horizontalLineToRelative(46.6f)
                curveToRelative(5.2f, 0.0f, 9.5f, 2.9f, 12.9f, 8.7f)
                lineToRelative(31.9f, 55.3f)
                curveToRelative(-1.3f, 2.3f, -18.0f, 31.7f, -50.1f, 88.2f)
                curveToRelative(-3.5f, 6.2f, -7.7f, 9.1f, -12.6f, 9.1f)
                close()
                moveTo(360.1f, 106.1f)
                lineTo(257.3f, 286.8f)
                verticalLineToRelative(0.2f)
                lineToRelative(65.5f, 119.0f)
                curveToRelative(2.8f, 5.1f, 0.1f, 10.1f, -6.0f, 10.1f)
                horizontalLineToRelative(-46.6f)
                curveToRelative(-5.5f, 0.0f, -9.7f, -2.9f, -12.9f, -8.7f)
                lineToRelative(-66.0f, -120.3f)
                curveToRelative(2.3f, -4.1f, 36.8f, -64.9f, 103.4f, -182.3f)
                curveToRelative(3.3f, -5.8f, 7.4f, -8.7f, 12.5f, -8.7f)
                horizontalLineToRelative(46.9f)
                curveToRelative(5.7f, -0.1f, 8.8f, 4.7f, 6.0f, 10.0f)
                close()
            }
        }
        .build()
        return _xingSquare!!
    }

private var _xingSquare: ImageVector? = null
