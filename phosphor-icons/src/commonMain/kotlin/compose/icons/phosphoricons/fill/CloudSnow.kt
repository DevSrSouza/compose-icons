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

public val FillGroup.CloudSnow: ImageVector
    get() {
        if (_cloudSnow != null) {
            return _cloudSnow!!
        }
        _cloudSnow = Builder(name = "CloudSnow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 196.0f)
                close()
                moveTo(76.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 184.0f)
                close()
                moveTo(116.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 200.0f)
                close()
                moveTo(68.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 224.0f)
                close()
                moveTo(156.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 224.0f)
                close()
                moveTo(159.3f, 16.1f)
                arcTo(76.1f, 76.1f, 0.0f, false, false, 85.0f, 64.8f)
                horizontalLineToRelative(0.0f)
                arcToRelative(74.8f, 74.8f, 0.0f, false, false, -5.0f, 26.9f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -7.4f, 8.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 64.0f, 92.0f)
                arcToRelative(91.6f, 91.6f, 0.0f, false, true, 2.4f, -21.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -4.9f, -4.8f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 24.0f, 116.3f)
                curveTo(24.2f, 145.0f, 48.1f, 168.0f, 76.8f, 168.0f)
                lineTo(156.0f, 168.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 3.3f, -151.9f)
                close()
            }
        }
        .build()
        return _cloudSnow!!
    }

private var _cloudSnow: ImageVector? = null
