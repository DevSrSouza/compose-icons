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

public val LightGroup.MoonStars: ImageVector
    get() {
        if (_moonStars != null) {
            return _moonStars!!
        }
        _moonStars = Builder(name = "MoonStars", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(222.0f, 94.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 94.0f)
                lineTo(192.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(18.0f)
                lineTo(210.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(222.0f, 82.0f)
                horizontalLineToRelative(18.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 88.0f)
                close()
                moveTo(152.0f, 46.0f)
                horizontalLineToRelative(10.0f)
                lineTo(162.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(174.0f, 46.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(174.0f, 34.0f)
                lineTo(174.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                lineTo(162.0f, 34.0f)
                lineTo(152.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(222.4f, 150.7f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, 0.0f, 3.6f)
                arcTo(98.0f, 98.0f, 0.0f, true, true, 101.6f, 33.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 4.0f, 0.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 3.7f, 5.9f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, -0.2f, 1.4f)
                arcTo(86.0f, 86.0f, 0.0f, false, false, 214.9f, 146.9f)
                lineToRelative(1.6f, -0.3f)
                arcTo(6.3f, 6.3f, 0.0f, false, true, 222.4f, 150.7f)
                close()
                moveTo(207.5f, 160.8f)
                arcTo(98.1f, 98.1f, 0.0f, false, true, 95.2f, 48.5f)
                arcTo(86.0f, 86.0f, 0.0f, true, false, 207.5f, 160.8f)
                close()
            }
        }
        .build()
        return _moonStars!!
    }

private var _moonStars: ImageVector? = null
