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

public val BrandsGroup.SquareXing: ImageVector
    get() {
        if (_squareXing != null) {
            return _squareXing!!
        }
        _squareXing = Builder(name = "SquareXing", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                close()
                moveTo(93.8f, 320.2f)
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
                lineTo(93.8f, 320.2f)
                close()
                moveTo(257.3f, 286.8f)
                verticalLineToRelative(0.2f)
                lineToRelative(65.5f, 119.0f)
                curveToRelative(2.8f, 5.1f, 0.1f, 10.1f, -6.0f, 10.1f)
                lineTo(270.2f, 416.1f)
                curveToRelative(-5.5f, 0.0f, -9.7f, -2.9f, -12.9f, -8.7f)
                lineToRelative(-66.0f, -120.3f)
                curveToRelative(1.8f, -3.2f, 22.9f, -40.4f, 63.3f, -111.6f)
                curveToRelative(11.7f, -20.7f, 25.1f, -44.3f, 40.1f, -70.8f)
                curveToRelative(3.3f, -5.8f, 7.4f, -8.7f, 12.5f, -8.7f)
                horizontalLineToRelative(46.9f)
                curveToRelative(5.7f, -0.1f, 8.8f, 4.7f, 6.0f, 10.0f)
                lineTo(257.3f, 286.8f)
                close()
            }
        }
        .build()
        return _squareXing!!
    }

private var _squareXing: ImageVector? = null
