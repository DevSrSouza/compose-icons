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

public val LightGroup.Package: ImageVector
    get() {
        if (_package != null) {
            return _package!!
        }
        _package = Builder(name = "Package", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.3f, 71.8f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, -5.2f, -5.1f)
                lineTo(135.0f, 17.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -13.8f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -4.9f, 4.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.3f, 0.4f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -1.8f, 6.9f)
                verticalLineToRelative(98.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, 12.2f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 6.1f, 1.8f)
                lineTo(129.0f, 240.6f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 6.0f, -1.8f)
                lineToRelative(88.0f, -49.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, -12.2f)
                lineTo(230.1f, 78.7f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 228.3f, 71.8f)
                close()
                moveTo(127.1f, 27.4f)
                lineToRelative(1.0f, -0.2f)
                lineToRelative(1.0f, 0.2f)
                lineTo(211.9f, 74.0f)
                lineTo(177.2f, 93.7f)
                lineTo(92.4f, 46.9f)
                close()
                moveTo(129.0f, 121.1f)
                lineTo(44.4f, 74.0f)
                lineTo(80.1f, 53.9f)
                lineTo(165.0f, 100.7f)
                close()
                moveTo(39.1f, 179.1f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -1.0f, -1.8f)
                lineTo(38.1f, 84.2f)
                lineTo(123.0f, 131.5f)
                lineToRelative(-0.8f, 94.3f)
                close()
                moveTo(217.1f, 179.1f)
                lineTo(134.2f, 225.7f)
                lineTo(135.0f, 131.5f)
                lineTo(171.1f, 111.0f)
                verticalLineToRelative(41.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(183.1f, 104.2f)
                lineToRelative(35.0f, -19.9f)
                verticalLineToRelative(93.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 217.1f, 179.1f)
                close()
            }
        }
        .build()
        return _package!!
    }

private var _package: ImageVector? = null
