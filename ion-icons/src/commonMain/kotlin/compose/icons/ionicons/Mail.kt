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

public val IonIcons.Mail: ImageVector
    get() {
        if (_mail != null) {
            return _mail!!
        }
        _mail = Builder(name = "Mail", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.0f, 80.0f)
                lineTo(88.0f, 80.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, -56.0f, 56.0f)
                lineTo(32.0f, 376.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, 56.0f)
                lineTo(424.0f, 432.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, false, 56.0f, -56.0f)
                lineTo(480.0f, 136.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, false, 424.0f, 80.0f)
                close()
                moveTo(409.82f, 172.63f)
                lineTo(265.82f, 284.63f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -19.64f, 0.0f)
                lineToRelative(-144.0f, -112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 19.64f, -25.26f)
                lineTo(256.0f, 251.73f)
                lineTo(390.18f, 147.37f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 19.64f, 25.26f)
                close()
            }
        }
        .build()
        return _mail!!
    }

private var _mail: ImageVector? = null
