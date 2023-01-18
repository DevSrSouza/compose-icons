package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) {
            return _warningOctagon!!
        }
        _warningOctagon = Builder(name = "WarningOctagon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 136.0f)
                lineTo(120.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(232.0f, 91.5f)
                verticalLineToRelative(72.9f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, true, -4.7f, 11.4f)
                lineToRelative(-51.5f, 51.5f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -11.3f, 4.7f)
                horizontalLineToRelative(-73.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -11.3f, -4.7f)
                lineTo(28.7f, 175.8f)
                arcTo(16.3f, 16.3f, 0.0f, false, true, 24.0f, 164.4f)
                lineTo(24.0f, 91.5f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 4.7f, -11.3f)
                lineTo(80.2f, 28.7f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 91.5f, 24.0f)
                horizontalLineToRelative(73.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 11.3f, 4.7f)
                lineToRelative(51.5f, 51.5f)
                arcTo(16.2f, 16.2f, 0.0f, false, true, 232.0f, 91.5f)
                close()
                moveTo(216.0f, 91.5f)
                lineTo(164.5f, 40.0f)
                horizontalLineToRelative(-73.0f)
                lineTo(40.0f, 91.5f)
                verticalLineToRelative(72.9f)
                lineTo(91.5f, 216.0f)
                horizontalLineToRelative(73.0f)
                lineTo(216.0f, 164.4f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
