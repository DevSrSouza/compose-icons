package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Splotch: ImageVector
    get() {
        if (_splotch != null) {
            return _splotch!!
        }
        _splotch = Builder(name = "Splotch", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.5f, 62.3f)
                lineToRelative(28.1f, -36.9f)
                curveTo(248.8f, 9.4f, 267.8f, 0.0f, 288.0f, 0.0f)
                curveToRelative(28.5f, 0.0f, 53.6f, 18.7f, 61.8f, 46.0f)
                lineToRelative(17.8f, 59.4f)
                curveToRelative(10.3f, 34.4f, 36.1f, 62.0f, 69.8f, 74.6f)
                lineToRelative(39.8f, 14.9f)
                curveToRelative(20.9f, 7.9f, 34.8f, 27.9f, 34.8f, 50.2f)
                curveToRelative(0.0f, 16.9f, -7.9f, 32.8f, -21.5f, 42.9f)
                lineToRelative(-67.3f, 50.5f)
                curveToRelative(-24.3f, 18.2f, -37.2f, 47.9f, -33.8f, 78.1f)
                lineToRelative(2.5f, 22.7f)
                curveToRelative(4.3f, 38.7f, -26.0f, 72.6f, -65.0f, 72.6f)
                curveToRelative(-14.8f, 0.0f, -29.3f, -5.1f, -40.8f, -14.3f)
                lineToRelative(-55.4f, -44.3f)
                curveToRelative(-4.5f, -3.6f, -9.3f, -6.7f, -14.5f, -9.2f)
                curveToRelative(-15.8f, -7.9f, -33.7f, -10.4f, -51.0f, -7.3f)
                lineTo(82.4f, 451.9f)
                curveTo(47.8f, 458.2f, 16.0f, 431.6f, 16.0f, 396.5f)
                curveToRelative(0.0f, -13.2f, 4.7f, -26.0f, 13.1f, -36.2f)
                lineToRelative(11.2f, -13.4f)
                curveToRelative(14.6f, -17.4f, 22.6f, -39.4f, 22.6f, -62.1f)
                curveToRelative(0.0f, -18.8f, -5.5f, -37.2f, -15.8f, -53.0f)
                lineTo(8.8f, 173.5f)
                curveTo(3.1f, 164.7f, 0.0f, 154.4f, 0.0f, 143.9f)
                curveToRelative(0.0f, -33.4f, 30.1f, -58.8f, 63.0f, -53.2f)
                lineToRelative(51.3f, 8.7f)
                curveToRelative(35.9f, 6.1f, 72.2f, -8.2f, 94.2f, -37.1f)
                close()
            }
        }
        .build()
        return _splotch!!
    }

private var _splotch: ImageVector? = null
