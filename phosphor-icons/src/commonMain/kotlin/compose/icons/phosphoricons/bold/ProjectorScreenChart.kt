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

public val BoldGroup.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) {
            return _projectorScreenChart!!
        }
        _projectorScreenChart = Builder(name = "ProjectorScreenChart", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(104.0f, 128.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(128.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(140.0f, 124.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 112.0f)
                close()
                moveTo(164.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(176.0f, 120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 108.0f)
                close()
                moveTo(220.0f, 91.6f)
                lineTo(220.0f, 164.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(140.0f, 188.0f)
                verticalLineToRelative(23.2f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 0.0f)
                lineTo(116.0f, 188.0f)
                lineTo(32.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(36.0f, 91.6f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 20.0f, 72.0f)
                lineTo(20.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 28.0f)
                lineTo(216.0f, 28.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                lineTo(236.0f, 72.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 220.0f, 91.6f)
                close()
                moveTo(44.0f, 68.0f)
                lineTo(212.0f, 68.0f)
                lineTo(212.0f, 52.0f)
                lineTo(44.0f, 52.0f)
                close()
                moveTo(196.0f, 164.0f)
                lineTo(196.0f, 92.0f)
                lineTo(60.0f, 92.0f)
                verticalLineToRelative(72.0f)
                close()
            }
        }
        .build()
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
