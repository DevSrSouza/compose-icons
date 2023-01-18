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

public val BoldGroup.ImageSquare: ImageVector
    get() {
        if (_imageSquare != null) {
            return _imageSquare!!
        }
        _imageSquare = Builder(name = "ImageSquare", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.7f, 103.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 84.0f, 92.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 88.7f, 103.3f)
                close()
                moveTo(228.0f, 48.0f)
                lineTo(228.0f, 160.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(48.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(28.0f, 176.0f)
                horizontalLineToRelative(0.0f)
                lineTo(28.0f, 48.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 48.0f, 28.0f)
                lineTo(208.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 228.0f, 48.0f)
                close()
                moveTo(204.0f, 165.0f)
                lineToRelative(-36.0f, -36.0f)
                lineToRelative(-41.9f, 41.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, 0.0f)
                lineTo(80.0f, 153.0f)
                lineTo(52.0f, 181.0f)
                verticalLineToRelative(23.0f)
                lineTo(204.0f, 204.0f)
                close()
                moveTo(204.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                verticalLineToRelative(95.0f)
                lineToRelative(13.9f, -13.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 0.0f)
                lineTo(112.0f, 151.0f)
                lineToRelative(41.9f, -41.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 28.2f, 0.0f)
                lineTo(204.0f, 131.0f)
                close()
            }
        }
        .build()
        return _imageSquare!!
    }

private var _imageSquare: ImageVector? = null
