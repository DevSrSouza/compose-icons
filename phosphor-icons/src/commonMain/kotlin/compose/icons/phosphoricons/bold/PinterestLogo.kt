package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.PinterestLogo: ImageVector
    get() {
        if (_pinterestLogo != null) {
            return _pinterestLogo!!
        }
        _pinterestLogo = Builder(name = "PinterestLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 112.0f)
                curveToRelative(0.0f, 23.6f, -8.3f, 45.2f, -23.4f, 60.9f)
                reflectiveCurveTo(163.3f, 196.0f, 144.0f, 196.0f)
                curveToRelative(-15.5f, 0.0f, -26.8f, -4.2f, -34.9f, -9.3f)
                lineToRelative(-9.4f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 236.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, true, -2.7f, -0.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.0f, -14.4f)
                lineToRelative(32.0f, -136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.4f, 5.4f)
                lineToRelative(-16.5f, 70.0f)
                curveToRelative(3.5f, 4.2f, 12.0f, 11.3f, 28.8f, 11.3f)
                curveToRelative(25.6f, 0.0f, 52.0f, -22.4f, 52.0f, -60.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 71.5f, 149.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -19.9f, 13.3f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 220.0f, 112.0f)
                close()
            }
        }
        .build()
        return _pinterestLogo!!
    }

private var _pinterestLogo: ImageVector? = null
