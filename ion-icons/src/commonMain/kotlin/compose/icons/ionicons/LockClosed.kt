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

public val IonIcons.LockClosed: ImageVector
    get() {
        if (_lockClosed != null) {
            return _lockClosed!!
        }
        _lockClosed = Builder(name = "LockClosed", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 192.0f)
                lineTo(352.0f, 192.0f)
                lineTo(352.0f, 112.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -192.0f, 0.0f)
                verticalLineToRelative(80.0f)
                lineTo(144.0f, 192.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, -64.0f, 64.0f)
                lineTo(80.0f, 432.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(368.0f, 496.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(432.0f, 256.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 368.0f, 192.0f)
                close()
                moveTo(320.0f, 192.0f)
                lineTo(192.0f, 192.0f)
                lineTo(192.0f, 112.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                close()
            }
        }
        .build()
        return _lockClosed!!
    }

private var _lockClosed: ImageVector? = null
