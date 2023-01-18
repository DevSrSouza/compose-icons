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

public val FillGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.1f, 110.6f)
                lineTo(208.0f, 106.2f)
                lineTo(208.0f, 56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(136.0f, 40.0f)
                lineTo(136.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 40.0f)
                lineTo(64.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 48.0f, 56.0f)
                verticalLineToRelative(50.2f)
                lineToRelative(-13.1f, 4.4f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 125.8f)
                lineTo(24.0f, 160.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 0.3f, 2.2f)
                curveToRelative(15.7f, 55.0f, 86.1f, 74.0f, 100.1f, 77.2f)
                arcToRelative(16.4f, 16.4f, 0.0f, false, false, 7.2f, 0.0f)
                curveToRelative(14.0f, -3.2f, 84.4f, -22.2f, 100.1f, -77.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, 0.3f, -2.2f)
                lineTo(232.0f, 125.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 221.1f, 110.6f)
                close()
                moveTo(136.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(120.0f, 112.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(192.0f, 100.9f)
                lineTo(133.1f, 81.3f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, -10.2f, 0.0f)
                lineTo(64.0f, 100.9f)
                lineTo(64.0f, 56.0f)
                lineTo(192.0f, 56.0f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
