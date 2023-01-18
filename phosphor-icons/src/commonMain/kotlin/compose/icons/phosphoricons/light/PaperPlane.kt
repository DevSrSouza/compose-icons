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

public val LightGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 202.4f)
                lineTo(140.2f, 33.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -24.4f, 0.0f)
                lineTo(21.2f, 202.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 16.9f, 20.1f)
                lineToRelative(89.2f, -31.9f)
                horizontalLineToRelative(1.4f)
                lineToRelative(89.2f, 31.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 4.7f, 0.8f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 10.7f, -5.0f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 234.8f, 202.4f)
                close()
                moveTo(224.1f, 210.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -2.2f, 0.6f)
                lineTo(134.0f, 179.8f)
                lineTo(134.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(59.8f)
                lineTo(34.1f, 211.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -2.2f, -0.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -0.2f, -2.3f)
                lineTo(126.3f, 39.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 3.4f, 0.0f)
                lineToRelative(94.6f, 168.9f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 224.1f, 210.6f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
