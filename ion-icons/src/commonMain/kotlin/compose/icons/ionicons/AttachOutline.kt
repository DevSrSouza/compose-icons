package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.AttachOutline: ImageVector
    get() {
        if (_attachOutline != null) {
            return _attachOutline!!
        }
        _attachOutline = Builder(name = "AttachOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.08f, 192.0f)
                verticalLineTo(335.85f)
                arcToRelative(40.08f, 40.08f, 0.0f, false, false, 80.15f, 0.0f)
                lineToRelative(0.13f, -188.55f)
                arcToRelative(67.94f, 67.94f, 0.0f, true, false, -135.87f, 0.0f)
                verticalLineTo(337.12f)
                arcToRelative(95.51f, 95.51f, 0.0f, true, false, 191.0f, 0.0f)
                verticalLineTo(159.74f)
            }
        }
        .build()
        return _attachOutline!!
    }

private var _attachOutline: ImageVector? = null
