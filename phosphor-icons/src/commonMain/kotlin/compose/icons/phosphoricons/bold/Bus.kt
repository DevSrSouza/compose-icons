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

public val BoldGroup.Bus: ImageVector
    get() {
        if (_bus != null) {
            return _bus!!
        }
        _bus = Builder(name = "Bus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.0f, 28.0f)
                lineTo(66.0f, 28.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 30.0f, 64.0f)
                lineTo(30.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(74.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(94.0f, 196.0f)
                horizontalLineToRelative(68.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(226.0f, 64.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 190.0f, 28.0f)
                close()
                moveTo(54.0f, 172.0f)
                lineTo(54.0f, 144.0f)
                lineTo(202.0f, 144.0f)
                verticalLineToRelative(28.0f)
                close()
                moveTo(54.0f, 92.0f)
                lineTo(202.0f, 92.0f)
                verticalLineToRelative(28.0f)
                lineTo(54.0f, 120.0f)
                close()
                moveTo(66.0f, 52.0f)
                lineTo(190.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(4.0f)
                lineTo(54.0f, 68.0f)
                lineTo(54.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 66.0f, 52.0f)
                close()
                moveTo(70.0f, 212.0f)
                lineTo(54.0f, 212.0f)
                lineTo(54.0f, 196.0f)
                lineTo(70.0f, 196.0f)
                close()
                moveTo(186.0f, 212.0f)
                lineTo(186.0f, 196.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _bus!!
    }

private var _bus: ImageVector? = null
