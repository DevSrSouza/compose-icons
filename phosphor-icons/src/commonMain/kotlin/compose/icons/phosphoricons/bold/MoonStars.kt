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

public val BoldGroup.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(228.0f, 100.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 100.0f)
                lineTo(192.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(12.0f)
                lineTo(204.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(228.0f, 76.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 88.0f)
                close()
                moveTo(152.0f, 52.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(180.0f, 52.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(180.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(228.0f, 148.9f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, 0.2f, 7.1f)
                arcTo(104.0f, 104.0f, 0.0f, true, true, 99.9f, 27.8f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, 7.9f, 0.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 115.3f, 40.0f)
                arcToRelative(13.5f, 13.5f, 0.0f, false, true, -0.4f, 2.8f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, false, 98.3f, 98.4f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, true, 3.2f, -0.5f)
                arcTo(11.6f, 11.6f, 0.0f, false, true, 228.0f, 148.9f)
                close()
                moveTo(197.4f, 167.9f)
                arcTo(104.2f, 104.2f, 0.0f, false, true, 88.1f, 58.6f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 197.4f, 167.9f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
