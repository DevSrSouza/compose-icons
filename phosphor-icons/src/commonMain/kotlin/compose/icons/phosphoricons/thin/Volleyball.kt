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

public val ThinGroup.Volleyball: ImageVector
    get() {
        if (_volleyball != null) {
            return _volleyball!!
        }
        _volleyball = Builder(name = "Volleyball", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.2f, 166.7f)
                arcToRelative(102.9f, 102.9f, 0.0f, false, false, 7.8f, -38.4f)
                verticalLineToRelative(-0.5f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 41.4f, 178.0f)
                arcToRelative(99.0f, 99.0f, 0.0f, false, false, 6.3f, 9.6f)
                lineToRelative(0.5f, 0.7f)
                arcToRelative(99.4f, 99.4f, 0.0f, false, false, 53.9f, 36.3f)
                arcToRelative(101.1f, 101.1f, 0.0f, false, false, 26.1f, 3.4f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, 91.4f, -60.0f)
                arcTo(5.2f, 5.2f, 0.0f, false, false, 220.2f, 166.7f)
                close()
                moveTo(85.5f, 46.4f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, 30.4f, -9.6f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 169.3f, 124.0f)
                horizontalLineToRelative(-39.0f)
                close()
                moveTo(130.3f, 132.0f)
                horizontalLineToRelative(89.6f)
                arcToRelative(93.1f, 93.1f, 0.0f, false, true, -7.0f, 31.2f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -102.1f, 2.6f)
                close()
                moveTo(207.7f, 82.0f)
                arcToRelative(92.4f, 92.4f, 0.0f, false, true, 12.2f, 42.0f)
                lineTo(177.3f, 124.0f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, -46.1f, -88.0f)
                arcToRelative(96.8f, 96.8f, 0.0f, false, true, 20.6f, 3.1f)
                arcTo(91.7f, 91.7f, 0.0f, false, true, 207.7f, 82.0f)
                close()
                moveTo(78.6f, 50.4f)
                lineTo(99.9f, 87.3f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -53.2f, 83.8f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 78.6f, 50.4f)
                close()
                moveTo(55.0f, 184.0f)
                arcToRelative(92.3f, 92.3f, 0.0f, false, true, 48.9f, -89.8f)
                lineTo(123.4f, 128.0f)
                lineTo(78.6f, 205.6f)
                arcTo(89.9f, 89.9f, 0.0f, false, true, 55.0f, 184.0f)
                close()
                moveTo(174.0f, 207.7f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -88.5f, 1.9f)
                lineToRelative(21.3f, -36.9f)
                arcTo(99.5f, 99.5f, 0.0f, false, false, 160.0f, 188.0f)
                arcToRelative(98.2f, 98.2f, 0.0f, false, false, 45.9f, -11.2f)
                arcTo(90.9f, 90.9f, 0.0f, false, true, 174.0f, 207.7f)
                close()
            }
        }
        .build()
        return _volleyball!!
    }

private var _volleyball: ImageVector? = null
