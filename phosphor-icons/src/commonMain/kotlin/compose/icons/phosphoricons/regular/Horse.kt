package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 136.0f, 100.0f)
                close()
                moveTo(232.0f, 129.5f)
                arcTo(104.4f, 104.4f, 0.0f, false, true, 130.1f, 232.0f)
                lineTo(128.0f, 232.0f)
                arcToRelative(103.5f, 103.5f, 0.0f, false, true, -69.3f, -26.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.7f, -11.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.3f, -0.6f)
                arcTo(91.1f, 91.1f, 0.0f, false, false, 90.0f, 207.4f)
                lineToRelative(26.2f, -36.6f)
                curveToRelative(-23.0f, -10.4f, -47.9f, -8.5f, -61.6f, -6.2f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, true, -31.3f, -12.8f)
                lineTo(9.5f, 132.7f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -1.3f, -6.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 3.6f, -5.2f)
                lineTo(112.0f, 59.5f)
                lineTo(112.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(8.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 129.5f)
                close()
                moveTo(216.0f, 129.3f)
                arcTo(87.9f, 87.9f, 0.0f, false, false, 128.0f, 40.0f)
                lineTo(128.0f, 64.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -3.8f, 6.8f)
                lineTo(27.5f, 130.3f)
                lineToRelative(8.8f, 12.1f)
                arcTo(15.8f, 15.8f, 0.0f, false, false, 52.0f, 148.8f)
                curveToRelative(16.9f, -2.8f, 49.3f, -5.1f, 78.0f, 11.1f)
                arcTo(39.9f, 39.9f, 0.0f, false, false, 168.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, -51.8f, 55.8f)
                lineToRelative(-26.6f, 37.3f)
                arcToRelative(88.7f, 88.7f, 0.0f, false, false, 24.2f, 2.9f)
                arcTo(88.3f, 88.3f, 0.0f, false, false, 216.0f, 129.3f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
