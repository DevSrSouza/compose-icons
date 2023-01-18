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

public val BoldGroup.Radio: ImageVector
    get() {
        if (_radio != null) {
            return _radio!!
        }
        _radio = Builder(name = "Radio", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 68.0f)
                lineTo(113.8f, 68.0f)
                lineToRelative(81.6f, -24.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -6.8f, -23.0f)
                lineToRelative(-160.0f, 48.0f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-1.0f, 0.4f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.8f, 0.4f)
                horizontalLineToRelative(-0.3f)
                lineToRelative(-0.3f, 0.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -3.2f, 2.7f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-0.4f, 0.5f)
                lineToRelative(-0.3f, 0.4f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -1.5f, 3.5f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.3f, -0.2f, 0.5f)
                verticalLineToRelative(0.2f)
                curveToRelative(0.0f, 0.3f, -0.1f, 0.6f, -0.1f, 1.0f)
                horizontalLineToRelative(0.0f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 20.0f, 80.0f)
                horizontalLineToRelative(0.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 88.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 216.0f, 68.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                close()
                moveTo(160.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 160.0f, 180.0f)
                close()
                moveTo(160.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 132.0f)
                close()
                moveTo(60.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(96.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(72.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 124.0f)
                close()
                moveTo(60.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(96.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(72.0f, 176.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 60.0f, 164.0f)
                close()
            }
        }
        .build()
        return _radio!!
    }

private var _radio: ImageVector? = null
