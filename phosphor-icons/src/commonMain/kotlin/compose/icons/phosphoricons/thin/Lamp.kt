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

public val ThinGroup.Lamp: ImageVector
    get() {
        if (_lamp != null) {
            return _lamp!!
        }
        _lamp = Builder(name = "Lamp", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.9f, 139.3f)
                lineToRelative(-41.1f, -96.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 186.7f, 36.0f)
                lineTo(69.3f, 36.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -11.1f, 7.3f)
                lineToRelative(-41.1f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, 16.7f)
                lineTo(124.0f, 156.0f)
                verticalLineToRelative(56.0f)
                lineTo(96.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(132.0f, 212.0f)
                lineTo(132.0f, 156.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(204.0f, 156.0f)
                horizontalLineToRelative(23.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.0f, -16.7f)
                close()
                moveTo(231.2f, 146.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, 1.8f)
                lineTo(28.1f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.3f, -1.8f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, true, -0.3f, -3.8f)
                lineToRelative(41.1f, -96.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 69.3f, 44.0f)
                lineTo(186.7f, 44.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 3.7f, 2.4f)
                lineToRelative(41.1f, 96.0f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 231.2f, 146.2f)
                close()
            }
        }
        .build()
        return _lamp!!
    }

private var _lamp: ImageVector? = null
