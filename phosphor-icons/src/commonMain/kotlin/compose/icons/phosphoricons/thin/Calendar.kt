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

public val ThinGroup.Calendar: ImageVector
    get() {
        if (_calendar != null) {
            return _calendar!!
        }
        _calendar = Builder(name = "Calendar", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(180.0f, 36.0f)
                lineTo(180.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(172.0f, 36.0f)
                lineTo(84.0f, 36.0f)
                lineTo(84.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(76.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(208.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(48.0f, 44.0f)
                lineTo(76.0f, 44.0f)
                lineTo(76.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                lineTo(172.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(180.0f, 44.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(212.0f, 84.0f)
                lineTo(44.0f, 84.0f)
                lineTo(44.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 48.0f, 44.0f)
                close()
                moveTo(208.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 92.0f)
                lineTo(212.0f, 92.0f)
                lineTo(212.0f, 208.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 208.0f, 212.0f)
                close()
                moveTo(124.0f, 164.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -14.1f, -5.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 104.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.6f, -2.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 0.5f, -4.2f)
                lineTo(111.7f, 132.0f)
                lineTo(92.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.6f, 2.3f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -0.5f, 4.2f)
                lineToRelative(-11.9f, 14.9f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 124.0f, 164.0f)
                close()
                moveTo(164.0f, 128.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(156.0f, 136.0f)
                lineToRelative(-9.6f, 7.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.8f, -6.4f)
                lineToRelative(16.0f, -12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.2f, -0.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 164.0f, 128.0f)
                close()
            }
        }
        .build()
        return _calendar!!
    }

private var _calendar: ImageVector? = null
