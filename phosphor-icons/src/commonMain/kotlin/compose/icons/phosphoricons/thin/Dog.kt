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

public val ThinGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 140.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 100.0f, 140.0f)
                close()
                moveTo(164.0f, 148.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 164.0f, 148.0f)
                close()
                moveTo(231.1f, 140.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -14.4f, -3.5f)
                lineToRelative(-4.7f, -6.0f)
                lineTo(212.0f, 184.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(44.0f, 130.8f)
                lineToRelative(-4.7f, 6.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -14.4f, 3.5f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, true, -6.8f, -13.1f)
                lineTo(34.5f, 39.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 14.7f, -9.4f)
                lineTo(104.5f, 44.0f)
                horizontalLineToRelative(47.0f)
                lineToRelative(55.3f, -13.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 14.7f, 9.4f)
                lineToRelative(16.4f, 87.6f)
                arcTo(11.7f, 11.7f, 0.0f, false, true, 231.1f, 140.3f)
                close()
                moveTo(97.0f, 50.4f)
                lineTo(47.3f, 37.9f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -2.2f, 0.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.7f, 2.6f)
                lineTo(25.9f, 128.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.1f, 3.3f)
                close()
                moveTo(204.0f, 120.7f)
                lineTo(150.1f, 52.0f)
                lineTo(105.9f, 52.0f)
                lineTo(52.0f, 120.7f)
                lineTo(52.0f, 184.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, 28.0f)
                horizontalLineToRelative(44.0f)
                lineTo(124.0f, 193.7f)
                lineToRelative(-14.8f, -14.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(128.0f, 186.3f)
                lineToRelative(13.2f, -13.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, 5.6f)
                lineTo(132.0f, 193.7f)
                lineTo(132.0f, 212.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, 28.0f, -28.0f)
                close()
                moveTo(230.1f, 128.6f)
                lineTo(213.6f, 41.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.7f, -2.6f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -3.2f, -0.6f)
                lineTo(159.0f, 50.4f)
                lineToRelative(64.0f, 81.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.1f, -3.3f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
