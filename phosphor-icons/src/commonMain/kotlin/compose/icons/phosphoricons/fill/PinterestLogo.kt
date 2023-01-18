package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 131.2f)
                curveToRelative(-1.7f, 54.5f, -45.8f, 98.9f, -100.3f, 100.7f)
                arcToRelative(103.7f, 103.7f, 0.0f, false, true, -28.6f, -2.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.9f, -4.9f)
                lineToRelative(8.9f, -35.4f)
                arcTo(50.5f, 50.5f, 0.0f, false, false, 136.0f, 196.0f)
                curveToRelative(37.0f, 0.0f, 66.7f, -33.5f, 63.8f, -73.4f)
                curveToRelative(-2.6f, -35.9f, -32.0f, -64.6f, -68.0f, -66.5f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 56.0f, 128.0f)
                arcToRelative(73.3f, 73.3f, 0.0f, false, false, 5.2f, 27.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.9f, -6.0f)
                arcTo(55.5f, 55.5f, 0.0f, false, true, 72.0f, 128.9f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, -0.9f)
                curveToRelative(0.0f, 28.7f, -21.5f, 52.0f, -48.0f, 52.0f)
                curveToRelative(-10.5f, 0.0f, -17.8f, -3.7f, -22.8f, -8.0f)
                lineToRelative(14.6f, -58.1f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -15.6f, -3.8f)
                lineTo(85.4f, 217.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.7f, 2.6f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 232.0f, 131.2f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
