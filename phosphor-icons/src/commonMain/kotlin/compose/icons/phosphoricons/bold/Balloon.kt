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

public val BoldGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(name = "Balloon", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 12.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, -92.0f, 92.0f)
                curveToRelative(0.0f, 24.5f, 9.5f, 50.1f, 26.2f, 70.2f)
                curveTo(72.0f, 186.0f, 83.4f, 195.0f, 95.6f, 200.7f)
                lineTo(84.9f, 227.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 244.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.1f, -16.5f)
                lineToRelative(-10.7f, -26.8f)
                curveToRelative(12.2f, -5.7f, 23.6f, -14.7f, 33.4f, -26.5f)
                curveTo(210.5f, 154.1f, 220.0f, 128.5f, 220.0f, 104.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 128.0f, 12.0f)
                close()
                moveTo(142.3f, 220.0f)
                lineTo(113.7f, 220.0f)
                lineToRelative(5.1f, -12.6f)
                arcToRelative(70.8f, 70.8f, 0.0f, false, false, 18.4f, 0.0f)
                close()
                moveTo(175.3f, 158.9f)
                curveTo(161.9f, 175.1f, 145.1f, 184.0f, 128.0f, 184.0f)
                reflectiveCurveToRelative(-33.9f, -8.9f, -47.3f, -25.1f)
                reflectiveCurveTo(60.0f, 122.8f, 60.0f, 104.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveTo(196.0f, 122.8f, 188.3f, 143.3f, 175.3f, 158.9f)
                close()
                moveTo(173.3f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.3f, 15.3f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, true, -4.0f, 0.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -11.4f, -8.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 136.0f, 81.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 8.0f, -22.7f)
                arcTo(48.3f, 48.3f, 0.0f, false, true, 173.3f, 88.0f)
                close()
            }
        }
        .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
