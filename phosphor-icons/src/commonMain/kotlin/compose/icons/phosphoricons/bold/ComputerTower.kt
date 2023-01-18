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

public val BoldGroup.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) {
            return _computerTower!!
        }
        _computerTower = Builder(name = "ComputerTower", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(84.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 64.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(96.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 84.0f, 76.0f)
                close()
                moveTo(96.0f, 128.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(96.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 168.0f)
                close()
                moveTo(212.0f, 40.0f)
                lineTo(212.0f, 216.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(64.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(44.0f, 40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 64.0f, 20.0f)
                lineTo(192.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 212.0f, 40.0f)
                close()
                moveTo(188.0f, 44.0f)
                lineTo(68.0f, 44.0f)
                lineTo(68.0f, 212.0f)
                lineTo(188.0f, 212.0f)
                close()
            }
        }
        .build()
        return _computerTower!!
    }

private var _computerTower: ImageVector? = null
