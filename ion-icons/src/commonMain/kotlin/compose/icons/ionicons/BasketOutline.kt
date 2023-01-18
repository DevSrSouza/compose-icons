package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BasketOutline: ImageVector
    get() {
        if (_basketOutline != null) {
            return _basketOutline!!
        }
        _basketOutline = Builder(name = "BasketOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(68.4f, 192.0f)
                arcTo(20.38f, 20.38f, 0.0f, false, false, 48.0f, 212.2f)
                arcToRelative(17.87f, 17.87f, 0.0f, false, false, 0.8f, 5.5f)
                lineTo(100.5f, 400.0f)
                arcToRelative(40.46f, 40.46f, 0.0f, false, false, 39.1f, 29.5f)
                horizontalLineTo(372.4f)
                arcTo(40.88f, 40.88f, 0.0f, false, false, 411.7f, 400.0f)
                lineToRelative(51.7f, -182.3f)
                lineToRelative(0.6f, -5.5f)
                arcTo(20.38f, 20.38f, 0.0f, false, false, 443.6f, 192.0f)
                horizontalLineTo(68.4f)
                close()
                moveTo(261.72f, 352.07f)
                arcTo(42.07f, 42.07f, 0.0f, true, true, 304.0f, 310.0f)
                arcTo(42.27f, 42.27f, 0.0f, false, true, 261.72f, 352.07f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(160.0f, 192.0f)
                lineToRelative(96.0f, -128.0f)
                lineToRelative(96.0f, 128.0f)
            }
        }
        .build()
        return _basketOutline!!
    }

private var _basketOutline: ImageVector? = null
