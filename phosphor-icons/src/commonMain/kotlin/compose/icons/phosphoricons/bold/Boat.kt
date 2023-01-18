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

public val BoldGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.3f, 106.8f)
                lineTo(212.0f, 103.4f)
                lineTo(212.0f, 56.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(140.0f, 36.0f)
                lineTo(140.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                lineTo(116.0f, 36.0f)
                lineTo(64.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 44.0f, 56.0f)
                verticalLineToRelative(47.4f)
                lineToRelative(-10.3f, 3.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -13.7f, 19.0f)
                lineTo(20.0f, 160.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 0.5f, 3.3f)
                curveToRelative(16.3f, 57.2f, 88.6f, 76.7f, 103.0f, 80.0f)
                arcToRelative(20.5f, 20.5f, 0.0f, false, false, 9.0f, 0.0f)
                curveToRelative(14.4f, -3.3f, 86.7f, -22.8f, 103.0f, -80.0f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 0.5f, -3.3f)
                lineTo(236.0f, 125.8f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 222.3f, 106.8f)
                close()
                moveTo(68.0f, 60.0f)
                lineTo(188.0f, 60.0f)
                lineTo(188.0f, 95.4f)
                lineTo(134.3f, 77.5f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -5.7f, -1.0f)
                horizontalLineToRelative(-1.2f)
                arcToRelative(15.6f, 15.6f, 0.0f, false, false, -5.7f, 1.0f)
                lineTo(68.0f, 95.4f)
                close()
                moveTo(212.0f, 158.2f)
                curveToRelative(-13.5f, 42.6f, -73.5f, 58.9f, -84.0f, 61.5f)
                curveToRelative(-10.5f, -2.6f, -70.5f, -18.9f, -84.0f, -61.5f)
                lineTo(44.0f, 128.6f)
                lineToRelative(15.6f, -5.1f)
                horizontalLineToRelative(0.0f)
                lineTo(116.0f, 104.6f)
                lineTo(116.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 104.6f)
                lineToRelative(56.4f, 18.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(15.6f, 5.1f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
