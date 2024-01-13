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

public val BrandsGroup.SquarePinterest: ImageVector
    get() {
        if (_squarePinterest != null) {
            return _squarePinterest!!
        }
        _squarePinterest = Builder(name = "SquarePinterest", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                verticalLineTo(416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                horizontalLineToRelative(72.6f)
                lineToRelative(-2.2f, -0.8f)
                curveToRelative(-5.4f, -48.1f, -3.1f, -57.5f, 15.7f, -134.7f)
                curveToRelative(3.9f, -16.0f, 8.5f, -35.0f, 13.9f, -57.9f)
                curveToRelative(0.0f, 0.0f, -7.3f, -14.8f, -7.3f, -36.5f)
                curveToRelative(0.0f, -70.7f, 75.5f, -78.0f, 75.5f, -25.0f)
                curveToRelative(0.0f, 13.5f, -5.4f, 31.1f, -11.2f, 49.8f)
                curveToRelative(-3.3f, 10.6f, -6.6f, 21.5f, -9.1f, 32.0f)
                curveToRelative(-5.7f, 24.5f, 12.3f, 44.4f, 36.4f, 44.4f)
                curveToRelative(43.7f, 0.0f, 77.2f, -46.0f, 77.2f, -112.4f)
                curveToRelative(0.0f, -58.8f, -42.3f, -99.9f, -102.6f, -99.9f)
                curveTo(153.0f, 139.0f, 112.0f, 191.4f, 112.0f, 245.6f)
                curveToRelative(0.0f, 21.1f, 8.2f, 43.7f, 18.3f, 56.0f)
                curveToRelative(2.0f, 2.4f, 2.3f, 4.5f, 1.7f, 7.0f)
                curveToRelative(-1.1f, 4.7f, -3.1f, 12.9f, -4.7f, 19.2f)
                curveToRelative(-1.0f, 4.0f, -1.8f, 7.3f, -2.1f, 8.6f)
                curveToRelative(-1.1f, 4.5f, -3.5f, 5.5f, -8.2f, 3.3f)
                curveToRelative(-30.6f, -14.3f, -49.8f, -59.1f, -49.8f, -95.1f)
                curveTo(67.2f, 167.1f, 123.4f, 96.0f, 229.4f, 96.0f)
                curveToRelative(85.2f, 0.0f, 151.4f, 60.7f, 151.4f, 141.8f)
                curveToRelative(0.0f, 84.6f, -53.3f, 152.7f, -127.4f, 152.7f)
                curveToRelative(-24.9f, 0.0f, -48.3f, -12.9f, -56.3f, -28.2f)
                curveToRelative(0.0f, 0.0f, -12.3f, 46.9f, -15.3f, 58.4f)
                curveToRelative(-5.0f, 19.3f, -17.6f, 42.9f, -27.4f, 59.3f)
                horizontalLineTo(384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                verticalLineTo(96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _squarePinterest!!
    }

private var _squarePinterest: ImageVector? = null
