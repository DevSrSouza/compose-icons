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

public val BrandsGroup.WordpressSimple: ImageVector
    get() {
        if (_wordpressSimple != null) {
            return _wordpressSimple!!
        }
        _wordpressSimple = Builder(name = "WordpressSimple", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveTo(119.3f, 8.0f, 8.0f, 119.2f, 8.0f, 256.0f)
                curveToRelative(0.0f, 136.7f, 111.3f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.3f, 248.0f, -248.0f)
                curveTo(504.0f, 119.2f, 392.7f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(33.0f, 256.0f)
                curveToRelative(0.0f, -32.3f, 6.9f, -63.0f, 19.3f, -90.7f)
                lineToRelative(106.4f, 291.4f)
                curveTo(84.3f, 420.5f, 33.0f, 344.2f, 33.0f, 256.0f)
                close()
                moveTo(256.0f, 479.0f)
                curveToRelative(-21.9f, 0.0f, -43.0f, -3.2f, -63.0f, -9.1f)
                lineToRelative(66.9f, -194.4f)
                lineToRelative(68.5f, 187.8f)
                curveToRelative(0.5f, 1.1f, 1.0f, 2.1f, 1.6f, 3.1f)
                curveToRelative(-23.1f, 8.1f, -48.0f, 12.6f, -74.0f, 12.6f)
                close()
                moveTo(286.7f, 151.5f)
                curveToRelative(13.4f, -0.7f, 25.5f, -2.1f, 25.5f, -2.1f)
                curveToRelative(12.0f, -1.4f, 10.6f, -19.1f, -1.4f, -18.4f)
                curveToRelative(0.0f, 0.0f, -36.1f, 2.8f, -59.4f, 2.8f)
                curveToRelative(-21.9f, 0.0f, -58.7f, -2.8f, -58.7f, -2.8f)
                curveToRelative(-12.0f, -0.7f, -13.4f, 17.7f, -1.4f, 18.4f)
                curveToRelative(0.0f, 0.0f, 11.4f, 1.4f, 23.4f, 2.1f)
                lineToRelative(34.7f, 95.2f)
                lineTo(200.6f, 393.0f)
                lineToRelative(-81.2f, -241.5f)
                curveToRelative(13.4f, -0.7f, 25.5f, -2.1f, 25.5f, -2.1f)
                curveToRelative(12.0f, -1.4f, 10.6f, -19.1f, -1.4f, -18.4f)
                curveToRelative(0.0f, 0.0f, -36.1f, 2.8f, -59.4f, 2.8f)
                curveToRelative(-4.2f, 0.0f, -9.1f, -0.1f, -14.4f, -0.3f)
                curveTo(109.6f, 73.0f, 178.1f, 33.0f, 256.0f, 33.0f)
                curveToRelative(58.0f, 0.0f, 110.9f, 22.2f, 150.6f, 58.5f)
                curveToRelative(-1.0f, -0.1f, -1.9f, -0.2f, -2.9f, -0.2f)
                curveToRelative(-21.9f, 0.0f, -37.4f, 19.1f, -37.4f, 39.6f)
                curveToRelative(0.0f, 18.4f, 10.6f, 33.9f, 21.9f, 52.3f)
                curveToRelative(8.5f, 14.8f, 18.4f, 33.9f, 18.4f, 61.5f)
                curveToRelative(0.0f, 19.1f, -7.3f, 41.2f, -17.0f, 72.1f)
                lineToRelative(-22.2f, 74.3f)
                lineToRelative(-80.7f, -239.6f)
                close()
                moveTo(368.1f, 448.7f)
                lineToRelative(68.1f, -196.9f)
                curveToRelative(12.7f, -31.8f, 17.0f, -57.2f, 17.0f, -79.9f)
                curveToRelative(0.0f, -8.2f, -0.5f, -15.8f, -1.5f, -22.9f)
                curveToRelative(17.4f, 31.8f, 27.3f, 68.2f, 27.3f, 107.0f)
                curveToRelative(0.0f, 82.3f, -44.6f, 154.1f, -110.9f, 192.7f)
                close()
            }
        }
        .build()
        return _wordpressSimple!!
    }

private var _wordpressSimple: ImageVector? = null
