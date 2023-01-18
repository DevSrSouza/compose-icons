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

public val ThinGroup.Binoculars: ImageVector
    get() {
        if (_binoculars != null) {
            return _binoculars!!
        }
        _binoculars = Builder(name = "Binoculars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.2f, 148.1f)
                lineTo(189.6f, 53.4f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -0.8f, -1.2f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.6f, 0.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 148.0f, 55.0f)
                lineTo(148.0f, 88.0f)
                lineTo(108.0f, 88.0f)
                lineTo(108.0f, 55.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.2f, -2.8f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -39.6f, 0.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, false, -0.8f, 1.2f)
                lineTo(24.8f, 148.1f)
                arcTo(43.0f, 43.0f, 0.0f, false, false, 20.0f, 168.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                lineTo(108.0f, 96.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 88.0f, 0.0f)
                arcTo(43.0f, 43.0f, 0.0f, false, false, 231.2f, 148.1f)
                close()
                moveTo(64.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                arcToRelative(37.6f, 37.6f, 0.0f, false, true, 2.1f, -12.2f)
                lineToRelative(1.9f, -4.3f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 64.0f, 204.0f)
                close()
                moveTo(64.0f, 124.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -22.7f, 6.3f)
                lineTo(73.4f, 57.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 26.6f, -0.6f)
                verticalLineToRelative(85.9f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 64.0f, 124.0f)
                close()
                moveTo(156.0f, 56.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 26.6f, 0.6f)
                lineToRelative(32.1f, 72.9f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 156.0f, 142.7f)
                close()
                moveTo(192.0f, 204.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 32.0f, -52.5f)
                lineToRelative(1.9f, 4.3f)
                arcTo(37.6f, 37.6f, 0.0f, false, true, 228.0f, 168.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 192.0f, 204.0f)
                close()
            }
        }
        .build()
        return _binoculars!!
    }

private var _binoculars: ImageVector? = null
