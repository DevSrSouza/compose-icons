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

public val BoldGroup.HardDrives: ImageVector
    get() {
        if (_hardDrives != null) {
            return _hardDrives!!
        }
        _hardDrives = Builder(name = "HardDrives", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 160.0f, 88.0f)
                close()
                moveTo(176.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 176.0f, 152.0f)
                close()
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 36.0f)
                lineTo(208.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(52.0f, 60.0f)
                verticalLineToRelative(56.0f)
                lineTo(204.0f, 116.0f)
                lineTo(204.0f, 60.0f)
                close()
                moveTo(204.0f, 196.0f)
                lineTo(204.0f, 140.0f)
                lineTo(52.0f, 140.0f)
                verticalLineToRelative(56.0f)
                close()
            }
        }
        .build()
        return _hardDrives!!
    }

private var _hardDrives: ImageVector? = null
