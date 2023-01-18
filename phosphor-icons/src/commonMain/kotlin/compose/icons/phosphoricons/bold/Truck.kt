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

public val BoldGroup.Truck: ImageVector
    get() {
        if (_truck != null) {
            return _truck!!
        }
        _truck = Builder(name = "Truck", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.1f, 119.9f)
                verticalLineToRelative(-0.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.1f, -1.0f)
                verticalLineToRelative(-0.4f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, -0.2f, -0.9f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.1f, -0.4f)
                curveToRelative(-0.1f, -0.4f, -0.3f, -0.7f, -0.4f, -1.1f)
                verticalLineToRelative(-0.2f)
                horizontalLineToRelative(-0.1f)
                lineTo(237.3f, 80.6f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 218.7f, 68.0f)
                lineTo(188.1f, 68.0f)
                lineTo(188.1f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(24.1f, 52.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                lineTo(4.1f, 184.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(42.2f, 204.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 67.8f, 0.0f)
                horizontalLineToRelative(36.2f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 67.8f, 0.0f)
                horizontalLineToRelative(18.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(252.1f, 120.0f)
                close()
                moveTo(216.0f, 92.0f)
                lineToRelative(6.4f, 16.0f)
                lineTo(188.1f, 108.0f)
                lineTo(188.1f, 92.0f)
                close()
                moveTo(164.1f, 76.0f)
                verticalLineToRelative(56.0f)
                lineTo(28.1f, 132.0f)
                lineTo(28.1f, 76.0f)
                close()
                moveTo(28.1f, 156.0f)
                horizontalLineToRelative(136.0f)
                verticalLineToRelative(3.8f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 146.2f, 180.0f)
                lineTo(110.0f, 180.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, -67.8f, 0.0f)
                lineTo(28.1f, 180.0f)
                close()
                moveTo(76.1f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 76.1f, 204.0f)
                close()
                moveTo(180.1f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.1f, 204.0f)
                close()
                moveTo(228.1f, 180.0f)
                lineTo(214.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -25.9f, -23.1f)
                lineTo(188.1f, 132.0f)
                horizontalLineToRelative(40.0f)
                close()
            }
        }
        .build()
        return _truck!!
    }

private var _truck: ImageVector? = null
