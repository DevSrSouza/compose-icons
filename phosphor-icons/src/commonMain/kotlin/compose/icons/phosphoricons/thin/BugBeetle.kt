package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.BugBeetle: ImageVector
    get() {
        if (_bugBeetle != null) {
            return _bugBeetle!!
        }
        _bugBeetle = Builder(name = "BugBeetle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 140.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(204.0f, 132.0f)
                lineTo(204.0f, 108.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(203.9f, 100.0f)
                arcTo(75.7f, 75.7f, 0.0f, false, false, 182.0f, 50.6f)
                lineToRelative(20.7f, -19.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.5f, -5.8f)
                lineTo(176.1f, 45.2f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, false, -96.2f, 0.0f)
                lineTo(58.7f, 25.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.5f, 5.8f)
                lineTo(73.9f, 50.7f)
                arcTo(75.8f, 75.8f, 0.0f, false, false, 52.1f, 100.0f)
                lineTo(32.0f, 100.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 108.0f)
                verticalLineToRelative(24.0f)
                lineTo(32.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(52.0f, 140.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, false, 1.0f, 12.0f)
                lineTo(32.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(54.7f, 172.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 146.6f, 0.0f)
                lineTo(224.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(203.0f, 164.0f)
                arcToRelative(67.8f, 67.8f, 0.0f, false, false, 1.0f, -12.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, 67.9f, 64.0f)
                lineTo(60.1f, 100.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(132.0f, 219.9f)
                lineTo(132.0f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(83.9f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 60.0f, 152.0f)
                lineTo(60.0f, 108.0f)
                lineTo(196.0f, 108.0f)
                verticalLineToRelative(44.0f)
                arcTo(68.1f, 68.1f, 0.0f, false, true, 132.0f, 219.9f)
                close()
            }
        }
        .build()
        return _bugBeetle!!
    }

private var _bugBeetle: ImageVector? = null
