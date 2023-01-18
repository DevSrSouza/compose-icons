package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Sword: ImageVector
    get() {
        if (_sword != null) {
            return _sword!!
        }
        _sword = Builder(name = "Sword", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.2f, 35.8f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 216.0f, 34.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-63.8f, 0.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -4.6f, 2.2f)
                lineTo(75.8f, 123.3f)
                lineToRelative(-9.9f, -9.9f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(33.4f, 126.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.8f)
                lineToRelative(20.9f, 20.9f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 2.8f)
                lineToRelative(-29.9f, 30.0f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 0.0f, 19.8f)
                lineToRelative(12.2f, 12.2f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 9.9f, 4.1f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, false, 9.9f, -4.1f)
                lineToRelative(30.0f, -29.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(20.9f, 20.9f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(12.7f, -12.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -19.8f)
                lineToRelative(-9.9f, -9.9f)
                lineToRelative(86.9f, -71.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.2f, -4.6f)
                lineTo(222.0f, 40.0f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 220.2f, 35.8f)
                close()
                moveTo(134.1f, 198.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 2.8f)
                lineToRelative(-12.7f, 12.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.8f, 0.0f)
                lineTo(97.7f, 193.2f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(48.0f, 223.2f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.5f, 0.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.4f, -0.5f)
                lineTo(32.8f, 210.9f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, 0.0f, -2.9f)
                lineToRelative(30.0f, -29.9f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 0.0f, -19.8f)
                lineTo(41.9f, 137.4f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, -2.8f)
                lineToRelative(12.7f, -12.7f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(14.5f, 14.5f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(209.8f, 101.0f)
                lineToRelative(-85.6f, 70.7f)
                lineTo(108.5f, 156.0f)
                lineToRelative(55.7f, -55.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineTo(100.0f, 147.5f)
                lineTo(84.3f, 131.8f)
                lineTo(155.0f, 46.2f)
                lineToRelative(55.0f, -0.2f)
                close()
            }
        }
        .build()
        return _sword!!
    }

private var _sword: ImageVector? = null
