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

public val BoldGroup.AlignCenterVertical: ImageVector
    get() {
        if (_alignCenterVertical != null) {
            return _alignCenterVertical!!
        }
        _alignCenterVertical = Builder(name = "AlignCenterVertical", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 116.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(216.0f, 72.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(156.0f, 52.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(44.0f)
                lineTo(120.0f, 116.0f)
                lineTo(120.0f, 48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(60.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 40.0f, 48.0f)
                verticalLineToRelative(68.0f)
                lineTo(32.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(120.0f, 140.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(216.0f, 140.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(96.0f, 204.0f)
                lineTo(64.0f, 204.0f)
                lineTo(64.0f, 128.1f)
                horizontalLineToRelative(0.0f)
                lineTo(64.0f, 52.0f)
                lineTo(96.0f, 52.0f)
                close()
                moveTo(192.0f, 180.0f)
                lineTo(160.0f, 180.0f)
                lineTo(160.0f, 128.1f)
                horizontalLineToRelative(0.0f)
                lineTo(160.0f, 76.0f)
                horizontalLineToRelative(32.0f)
                close()
            }
        }
        .build()
        return _alignCenterVertical!!
    }

private var _alignCenterVertical: ImageVector? = null
