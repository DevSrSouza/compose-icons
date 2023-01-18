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

public val LightGroup.CircleDashed: ImageVector
    get() {
        if (_circleDashed != null) {
            return _circleDashed!!
        }
        _circleDashed = Builder(name = "CircleDashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.4f, 55.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                arcToRelative(89.3f, 89.3f, 0.0f, false, false, -23.3f, 40.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -5.8f, 4.5f)
                lineToRelative(-1.6f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -7.4f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 55.9f, 55.9f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 64.4f, 55.9f)
                close()
                moveTo(41.1f, 151.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.4f, -4.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.2f, 7.3f)
                arcToRelative(100.9f, 100.9f, 0.0f, false, false, 26.4f, 45.7f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, 1.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.3f, -1.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -0.1f, -8.4f)
                arcTo(90.7f, 90.7f, 0.0f, false, true, 41.1f, 151.3f)
                close()
                moveTo(151.3f, 215.0f)
                arcToRelative(90.9f, 90.9f, 0.0f, false, true, -46.6f, -0.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.3f, 4.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 4.2f, 7.3f)
                arcToRelative(99.5f, 99.5f, 0.0f, false, false, 26.5f, 3.5f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, 26.3f, -3.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -3.1f, -11.5f)
                close()
                moveTo(222.3f, 147.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.4f, 4.2f)
                arcToRelative(88.7f, 88.7f, 0.0f, false, true, -23.3f, 40.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.3f, 1.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, -1.8f)
                arcToRelative(101.4f, 101.4f, 0.0f, false, false, 26.4f, -45.7f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 222.3f, 147.1f)
                close()
                moveTo(214.9f, 104.7f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 5.8f, 4.5f)
                lineToRelative(1.6f, -0.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.2f, -7.4f)
                arcToRelative(100.9f, 100.9f, 0.0f, false, false, -26.4f, -45.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.5f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.1f, 8.5f)
                arcTo(89.8f, 89.8f, 0.0f, false, true, 214.9f, 104.7f)
                close()
                moveTo(104.7f, 41.1f)
                arcToRelative(89.8f, 89.8f, 0.0f, false, true, 46.6f, 0.0f)
                lineToRelative(1.6f, 0.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 5.7f, -4.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.2f, -7.3f)
                arcToRelative(100.6f, 100.6f, 0.0f, false, false, -52.8f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -4.2f, 7.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 104.7f, 41.1f)
                close()
            }
        }
        .build()
        return _circleDashed!!
    }

private var _circleDashed: ImageVector? = null
