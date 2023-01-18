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

public val BoldGroup.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.6f, 77.6f)
                arcTo(48.2f, 48.2f, 0.0f, false, false, 180.0f, 36.0f)
                arcToRelative(47.5f, 47.5f, 0.0f, false, false, -9.9f, 1.0f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, false, -84.2f, 0.0f)
                arcTo(47.5f, 47.5f, 0.0f, false, false, 76.0f, 36.0f)
                arcTo(48.2f, 48.2f, 0.0f, false, false, 28.4f, 77.6f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -5.0f, 18.4f)
                horizontalLineToRelative(0.0f)
                lineTo(50.9f, 212.6f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 70.3f, 228.0f)
                lineTo(185.7f, 228.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 19.4f, -15.4f)
                lineTo(232.6f, 96.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 227.6f, 77.6f)
                close()
                moveTo(76.0f, 60.0f)
                arcToRelative(23.0f, 23.0f, 0.0f, false, true, 11.2f, 2.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.4f, -8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 46.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.4f, 8.0f)
                arcTo(23.0f, 23.0f, 0.0f, false, true, 180.0f, 60.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, true, 21.8f, 13.9f)
                lineToRelative(-33.2f, 9.4f)
                lineTo(135.4f, 70.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -14.8f, 0.0f)
                lineTo(87.4f, 83.3f)
                lineTo(54.2f, 73.9f)
                arcTo(24.2f, 24.2f, 0.0f, false, true, 76.0f, 60.0f)
                close()
                moveTo(101.1f, 103.7f)
                lineTo(128.0f, 92.9f)
                lineToRelative(26.9f, 10.8f)
                lineTo(141.5f, 204.0f)
                horizontalLineToRelative(-27.0f)
                close()
                moveTo(48.4f, 97.2f)
                lineToRelative(28.7f, 8.2f)
                lineTo(90.3f, 204.0f)
                lineTo(73.5f, 204.0f)
                close()
                moveTo(182.5f, 204.0f)
                lineTo(165.7f, 204.0f)
                lineToRelative(13.2f, -98.6f)
                lineToRelative(28.7f, -8.2f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
