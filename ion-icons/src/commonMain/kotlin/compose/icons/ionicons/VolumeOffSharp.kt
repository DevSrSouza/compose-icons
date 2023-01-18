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

public val IonIcons.VolumeOffSharp: ImageVector
    get() {
        if (_volumeOffSharp != null) {
            return _volumeOffSharp!!
        }
        _volumeOffSharp = Builder(name = "VolumeOffSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.65f, 176.1f)
                lineToRelative(-93.65f, 0.0f)
                lineToRelative(0.0f, 159.8f)
                lineToRelative(93.65f, 0.0f)
                lineToRelative(130.35f, 104.1f)
                lineToRelative(0.0f, -368.0f)
                lineToRelative(-130.35f, 104.1f)
                close()
            }
        }
        .build()
        return _volumeOffSharp!!
    }

private var _volumeOffSharp: ImageVector? = null
