package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.DollarSign: ImageVector
    get() {
        if (_dollarSign != null) {
            return _dollarSign!!
        }
        _dollarSign = Builder(name = "DollarSign", defaultWidth = 288.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 288.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.2f, 233.4f)
                lineToRelative(-108.0f, -31.6f)
                curveTo(88.7f, 198.2f, 80.0f, 186.5f, 80.0f, 173.5f)
                curveToRelative(0.0f, -16.3f, 13.2f, -29.5f, 29.5f, -29.5f)
                horizontalLineToRelative(66.3f)
                curveToRelative(12.2f, 0.0f, 24.2f, 3.7f, 34.2f, 10.5f)
                curveToRelative(6.1f, 4.1f, 14.3f, 3.1f, 19.5f, -2.0f)
                lineToRelative(34.8f, -34.0f)
                curveToRelative(7.1f, -6.9f, 6.1f, -18.4f, -1.8f, -24.5f)
                curveTo(238.0f, 74.8f, 207.4f, 64.1f, 176.0f, 64.0f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                horizontalLineToRelative(-32.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(-2.5f)
                curveTo(45.8f, 64.0f, -5.4f, 118.7f, 0.5f, 183.6f)
                curveToRelative(4.2f, 46.1f, 39.4f, 83.6f, 83.8f, 96.6f)
                lineToRelative(102.5f, 30.0f)
                curveToRelative(12.5f, 3.7f, 21.2f, 15.3f, 21.2f, 28.3f)
                curveToRelative(0.0f, 16.3f, -13.2f, 29.5f, -29.5f, 29.5f)
                horizontalLineToRelative(-66.3f)
                curveTo(100.0f, 368.0f, 88.0f, 364.3f, 78.0f, 357.5f)
                curveToRelative(-6.1f, -4.1f, -14.3f, -3.1f, -19.5f, 2.0f)
                lineToRelative(-34.8f, 34.0f)
                curveToRelative(-7.1f, 6.9f, -6.1f, 18.4f, 1.8f, 24.5f)
                curveToRelative(24.5f, 19.2f, 55.1f, 29.9f, 86.5f, 30.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                verticalLineToRelative(-48.2f)
                curveToRelative(46.6f, -0.9f, 90.3f, -28.6f, 105.7f, -72.7f)
                curveToRelative(21.5f, -61.6f, -14.6f, -124.8f, -72.5f, -141.7f)
                close()
            }
        }
        .build()
        return _dollarSign!!
    }

private var _dollarSign: ImageVector? = null
