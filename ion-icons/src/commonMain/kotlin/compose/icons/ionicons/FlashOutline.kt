package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlashOutline: ImageVector
    get() {
        if (_flashOutline != null) {
            return _flashOutline!!
        }
        _flashOutline = Builder(name = "FlashOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(315.27f, 33.0f)
                lineTo(96.0f, 304.0f)
                horizontalLineTo(224.0f)
                lineTo(192.49f, 477.23f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 2.33f, 2.77f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.36f, 2.36f, 0.0f, false, false, 1.89f, -0.95f)
                lineTo(416.0f, 208.0f)
                horizontalLineTo(288.0f)
                lineTo(319.66f, 34.75f)
                arcTo(2.45f, 2.45f, 0.0f, false, false, 317.22f, 32.0f)
                horizontalLineToRelative(0.0f)
                arcTo(2.42f, 2.42f, 0.0f, false, false, 315.27f, 33.0f)
                close()
            }
        }
        .build()
        return _flashOutline!!
    }

private var _flashOutline: ImageVector? = null
