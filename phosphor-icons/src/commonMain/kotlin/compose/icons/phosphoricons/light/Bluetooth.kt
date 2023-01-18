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

public val LightGroup.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(187.6f, 171.2f)
                lineTo(130.0f, 128.0f)
                lineToRelative(57.6f, -43.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.6f)
                lineToRelative(-64.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.3f, -0.6f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 114.0f, 32.0f)
                verticalLineToRelative(84.0f)
                lineTo(59.6f, 75.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.2f, 9.6f)
                lineTo(110.0f, 128.0f)
                lineTo(52.4f, 171.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.2f, 8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.4f, 1.2f)
                lineTo(114.0f, 140.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.3f, 5.4f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 2.7f, 0.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.6f, -1.2f)
                lineToRelative(64.0f, -48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -9.6f)
                close()
                moveTo(126.0f, 44.0f)
                lineToRelative(48.0f, 36.0f)
                lineToRelative(-48.0f, 36.0f)
                close()
                moveTo(126.0f, 212.0f)
                lineTo(126.0f, 140.0f)
                lineToRelative(48.0f, 36.0f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
