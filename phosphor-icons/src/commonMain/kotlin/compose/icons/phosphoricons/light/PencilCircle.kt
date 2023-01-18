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

public val LightGroup.PencilCircle: ImageVector
    get() {
        if (_pencilCircle != null) {
            return _pencilCircle!!
        }
        _pencilCircle = Builder(name = "PencilCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 55.9f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 55.9f, 200.1f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 200.1f, 55.9f)
                close()
                moveTo(106.0f, 134.0f)
                horizontalLineToRelative(44.0f)
                lineToRelative(14.1f, 30.6f)
                arcTo(28.9f, 28.9f, 0.0f, false, false, 152.0f, 162.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -24.0f, 12.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -24.0f, -12.0f)
                arcToRelative(28.9f, 28.9f, 0.0f, false, false, -12.1f, 2.6f)
                close()
                moveTo(111.5f, 122.0f)
                lineTo(128.0f, 86.3f)
                lineTo(144.5f, 122.0f)
                close()
                moveTo(134.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(15.6f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, -36.0f, 10.2f)
                close()
                moveTo(86.0f, 192.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(25.8f)
                arcToRelative(89.9f, 89.9f, 0.0f, false, true, -36.0f, -10.2f)
                close()
                moveTo(191.6f, 191.6f)
                arcTo(76.0f, 76.0f, 0.0f, false, true, 182.0f, 200.0f)
                lineTo(182.0f, 176.0f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, false, -0.6f, -2.5f)
                lineToRelative(-48.0f, -104.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -10.8f, 0.0f)
                lineToRelative(-48.0f, 104.0f)
                arcTo(5.4f, 5.4f, 0.0f, false, false, 74.0f, 176.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -9.6f, -8.4f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 127.2f, 0.0f)
                close()
            }
        }
        .build()
        return _pencilCircle!!
    }

private var _pencilCircle: ImageVector? = null
