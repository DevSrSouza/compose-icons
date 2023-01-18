package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.TrashSharp: ImageVector
    get() {
        if (_trashSharp != null) {
            return _trashSharp!!
        }
        _trashSharp = Builder(name = "TrashSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(447.55f, 96.0f)
                lineTo(336.0f, 96.0f)
                lineTo(336.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(192.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                lineTo(176.0f, 96.0f)
                lineTo(64.45f, 96.0f)
                lineTo(64.0f, 136.0f)
                lineTo(97.0f, 136.0f)
                lineToRelative(20.09f, 314.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 149.0f, 480.0f)
                lineTo(363.0f, 480.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 31.93f, -29.95f)
                lineTo(415.0f, 136.0f)
                horizontalLineToRelative(33.0f)
                close()
                moveTo(176.0f, 416.0f)
                lineToRelative(-9.0f, -256.0f)
                horizontalLineToRelative(33.0f)
                lineToRelative(9.0f, 256.0f)
                close()
                moveTo(272.0f, 416.0f)
                lineTo(240.0f, 416.0f)
                lineTo(240.0f, 160.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(296.0f, 96.0f)
                lineTo(216.0f, 96.0f)
                lineTo(216.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(336.0f, 416.0f)
                lineTo(303.0f, 416.0f)
                lineToRelative(9.0f, -256.0f)
                horizontalLineToRelative(33.0f)
                close()
            }
        }
        .build()
        return _trashSharp!!
    }

private var _trashSharp: ImageVector? = null
