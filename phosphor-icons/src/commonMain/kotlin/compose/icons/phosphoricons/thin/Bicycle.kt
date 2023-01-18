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

public val ThinGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 116.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, -18.6f, 4.1f)
                lineTo(159.0f, 68.0f)
                horizontalLineToRelative(33.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(152.0f, 60.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.5f, 2.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.0f, 4.0f)
                lineToRelative(15.2f, 26.0f)
                lineTo(97.0f, 92.0f)
                lineTo(79.5f, 62.0f)
                arcTo(4.3f, 4.3f, 0.0f, false, false, 76.0f, 60.0f)
                lineTo(48.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(73.7f, 68.0f)
                lineTo(89.9f, 95.8f)
                lineTo(70.6f, 122.3f)
                arcTo(44.3f, 44.3f, 0.0f, true, false, 77.0f, 127.0f)
                lineToRelative(17.3f, -23.7f)
                lineTo(128.5f, 162.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, 2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.0f, -0.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.5f, -5.5f)
                lineToRelative(-33.9f, -58.0f)
                horizontalLineToRelative(66.8f)
                lineToRelative(14.1f, 24.2f)
                arcTo(43.9f, 43.9f, 0.0f, true, false, 208.0f, 116.0f)
                close()
                moveTo(84.0f, 160.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -36.0f, -36.0f)
                arcToRelative(35.5f, 35.5f, 0.0f, false, true, 17.8f, 4.7f)
                lineToRelative(-21.0f, 28.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.8f, 5.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.4f, 0.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.2f, -1.6f)
                lineToRelative(21.1f, -28.9f)
                arcTo(35.8f, 35.8f, 0.0f, false, true, 84.0f, 160.0f)
                close()
                moveTo(208.0f, 196.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -21.5f, -64.9f)
                lineToRelative(18.0f, 30.9f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.5f, 2.0f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.0f, -0.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.5f, -5.5f)
                lineToRelative(-18.1f, -30.9f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 208.0f, 196.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
