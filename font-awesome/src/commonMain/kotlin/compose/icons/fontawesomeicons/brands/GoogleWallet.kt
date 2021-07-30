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

public val BrandsGroup.GoogleWallet: ImageVector
    get() {
        if (_googleWallet != null) {
            return _googleWallet!!
        }
        _googleWallet = Builder(name = "GoogleWallet", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.8f, 126.8f)
                curveToRelative(37.6f, 60.6f, 64.2f, 113.1f, 84.3f, 162.5f)
                curveToRelative(-8.3f, 33.8f, -18.8f, 66.5f, -31.3f, 98.3f)
                curveToRelative(-13.2f, -52.3f, -26.5f, -101.3f, -56.0f, -148.5f)
                curveToRelative(6.5f, -36.4f, 2.3f, -73.6f, 3.0f, -112.3f)
                close()
                moveTo(109.3f, 200.0f)
                lineTo(16.1f, 200.0f)
                curveToRelative(-6.5f, 0.0f, -10.5f, 7.5f, -6.5f, 12.7f)
                curveTo(51.8f, 267.0f, 81.3f, 330.5f, 101.3f, 400.0f)
                horizontalLineToRelative(103.5f)
                curveToRelative(-16.2f, -69.7f, -38.7f, -133.7f, -82.5f, -193.5f)
                curveToRelative(-3.0f, -4.0f, -8.0f, -6.5f, -13.0f, -6.5f)
                close()
                moveTo(157.1f, 112.0f)
                curveToRelative(68.5f, 108.0f, 130.0f, 234.5f, 138.2f, 368.0f)
                lineTo(409.0f, 480.0f)
                curveToRelative(-12.0f, -138.0f, -68.4f, -265.0f, -143.2f, -368.0f)
                lineTo(157.1f, 112.0f)
                close()
                moveTo(408.9f, 43.5f)
                curveToRelative(-1.8f, -6.8f, -8.2f, -11.5f, -15.2f, -11.5f)
                horizontalLineToRelative(-88.3f)
                curveToRelative(-5.3f, 0.0f, -9.0f, 5.0f, -7.8f, 10.3f)
                curveToRelative(13.2f, 46.5f, 22.3f, 95.5f, 26.5f, 146.0f)
                curveToRelative(48.2f, 86.2f, 79.7f, 178.3f, 90.6f, 270.8f)
                curveToRelative(15.8f, -60.5f, 25.3f, -133.5f, 25.3f, -203.0f)
                curveToRelative(0.0f, -73.6f, -12.1f, -145.1f, -31.1f, -212.6f)
                close()
            }
        }
        .build()
        return _googleWallet!!
    }

private var _googleWallet: ImageVector? = null
