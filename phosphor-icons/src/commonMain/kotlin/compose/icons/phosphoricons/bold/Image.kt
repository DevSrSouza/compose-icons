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

public val BoldGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 184.0f)
                lineTo(236.0f, 56.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 168.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 184.0f)
                close()
                moveTo(212.0f, 60.0f)
                verticalLineToRelative(95.0f)
                lineToRelative(-21.9f, -21.8f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                lineTo(144.0f, 151.0f)
                lineToRelative(-41.9f, -41.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -28.2f, 0.0f)
                lineTo(44.0f, 139.0f)
                lineTo(44.0f, 60.0f)
                close()
                moveTo(44.0f, 196.0f)
                lineTo(44.0f, 173.0f)
                lineToRelative(44.0f, -44.0f)
                lineToRelative(41.9f, 41.8f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 28.2f, 0.0f)
                lineTo(176.0f, 153.0f)
                lineToRelative(36.0f, 36.0f)
                verticalLineToRelative(7.0f)
                close()
                moveTo(144.7f, 111.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 140.0f, 100.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 144.7f, 111.3f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
