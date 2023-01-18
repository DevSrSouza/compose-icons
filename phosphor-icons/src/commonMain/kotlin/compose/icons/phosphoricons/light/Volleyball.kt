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

public val LightGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.1f, 167.2f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 7.9f, -38.6f)
                verticalLineToRelative(-1.0f)
                arcTo(102.1f, 102.1f, 0.0f, false, false, 216.3f, 77.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 39.7f, 179.0f)
                arcToRelative(97.3f, 97.3f, 0.0f, false, false, 6.6f, 10.1f)
                lineToRelative(0.2f, 0.2f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, false, 132.5f, 27.0f)
                arcTo(101.3f, 101.3f, 0.0f, false, false, 221.4f, 169.0f)
                arcTo(13.4f, 13.4f, 0.0f, false, false, 222.1f, 167.2f)
                close()
                moveTo(88.3f, 47.2f)
                arcToRelative(88.4f, 88.4f, 0.0f, false, true, 27.4f, -8.3f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, true, 39.6f, 36.4f)
                arcToRelative(88.3f, 88.3f, 0.0f, false, true, 12.0f, 46.7f)
                lineTo(131.5f, 122.0f)
                close()
                moveTo(131.5f, 134.0f)
                horizontalLineToRelative(86.3f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, -6.5f, 27.9f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -97.8f, 3.2f)
                close()
                moveTo(205.9f, 83.0f)
                arcToRelative(88.9f, 88.9f, 0.0f, false, true, 11.9f, 39.0f)
                lineTo(179.3f, 122.0f)
                arcToRelative(100.7f, 100.7f, 0.0f, false, false, -13.6f, -52.7f)
                arcToRelative(102.2f, 102.2f, 0.0f, false, false, -27.1f, -30.6f)
                arcTo(89.6f, 89.6f, 0.0f, false, true, 205.9f, 83.0f)
                close()
                moveTo(77.9f, 53.2f)
                lineTo(97.1f, 86.5f)
                arcToRelative(102.4f, 102.4f, 0.0f, false, false, -51.8f, 77.1f)
                arcTo(90.3f, 90.3f, 0.0f, false, true, 77.9f, 53.2f)
                close()
                moveTo(57.0f, 183.3f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, 11.7f, -52.6f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 34.4f, -33.8f)
                lineToRelative(18.0f, 31.1f)
                lineTo(77.9f, 202.8f)
                arcTo(91.9f, 91.9f, 0.0f, false, true, 57.0f, 183.3f)
                close()
                moveTo(173.0f, 205.9f)
                arcToRelative(89.7f, 89.7f, 0.0f, false, true, -84.7f, 2.8f)
                lineToRelative(19.2f, -33.2f)
                arcToRelative(102.2f, 102.2f, 0.0f, false, false, 92.6f, 6.3f)
                arcTo(88.9f, 88.9f, 0.0f, false, true, 173.0f, 205.9f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
