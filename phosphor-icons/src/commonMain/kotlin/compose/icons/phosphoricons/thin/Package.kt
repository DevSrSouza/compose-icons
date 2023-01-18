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

public val ThinGroup.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.5f, 72.7f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, -4.5f, -4.4f)
                lineTo(134.0f, 18.7f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, -11.8f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, false, -4.5f, 4.4f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.5f, 12.5f, 0.0f, false, false, -1.6f, 6.0f)
                verticalLineToRelative(98.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 6.1f, 10.5f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 5.6f, 1.5f)
                horizontalLineToRelative(0.6f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 5.6f, -1.5f)
                lineToRelative(88.0f, -49.5f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.1f, -10.5f)
                lineTo(228.1f, 78.7f)
                arcTo(12.5f, 12.5f, 0.0f, false, false, 226.5f, 72.7f)
                close()
                moveTo(126.2f, 25.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 1.9f, -0.5f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, true, 2.0f, 0.5f)
                lineTo(216.0f, 74.0f)
                lineTo(177.3f, 96.0f)
                lineToRelative(-89.0f, -49.0f)
                close()
                moveTo(129.0f, 123.4f)
                lineTo(40.3f, 74.0f)
                lineTo(80.1f, 51.6f)
                lineToRelative(89.0f, 49.1f)
                close()
                moveTo(38.2f, 180.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.1f, -3.5f)
                lineTo(36.1f, 80.8f)
                lineTo(125.0f, 130.3f)
                lineToRelative(-0.8f, 98.9f)
                close()
                moveTo(218.1f, 180.8f)
                lineTo(132.2f, 229.1f)
                lineTo(133.0f, 130.3f)
                lineTo(173.1f, 107.6f)
                verticalLineToRelative(44.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(181.1f, 103.0f)
                lineToRelative(39.0f, -22.1f)
                verticalLineToRelative(96.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 218.1f, 180.8f)
                close()
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
