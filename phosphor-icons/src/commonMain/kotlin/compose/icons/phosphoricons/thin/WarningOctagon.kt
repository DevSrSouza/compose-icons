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

public val ThinGroup.WarningOctagon: ImageVector
    get() {
        if (_warningOctagon != null) {
            return _warningOctagon!!
        }
        _warningOctagon = Builder(name = "WarningOctagon", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 136.0f)
                lineTo(124.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(228.0f, 91.5f)
                verticalLineToRelative(72.9f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, -3.5f, 8.5f)
                lineToRelative(-51.6f, 51.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.4f, 3.5f)
                horizontalLineToRelative(-73.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.4f, -3.5f)
                lineTo(31.5f, 172.9f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, -3.5f, -8.5f)
                lineTo(28.0f, 91.5f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, 3.5f, -8.4f)
                lineTo(83.1f, 31.5f)
                arcTo(11.5f, 11.5f, 0.0f, false, true, 91.5f, 28.0f)
                horizontalLineToRelative(73.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, 8.4f, 3.5f)
                lineToRelative(51.6f, 51.6f)
                arcTo(11.5f, 11.5f, 0.0f, false, true, 228.0f, 91.5f)
                close()
                moveTo(220.0f, 91.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.2f, -2.8f)
                lineTo(167.3f, 37.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.8f, -1.2f)
                horizontalLineToRelative(-73.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.8f, 1.2f)
                lineTo(37.2f, 88.7f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 36.0f, 91.5f)
                verticalLineToRelative(72.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.2f, 2.9f)
                lineToRelative(51.5f, 51.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                horizontalLineToRelative(73.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, -1.2f)
                lineToRelative(51.5f, -51.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.2f, -2.9f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 164.0f)
                close()
            }
        }
        .build()
        return _warningOctagon!!
    }

private var _warningOctagon: ImageVector? = null
