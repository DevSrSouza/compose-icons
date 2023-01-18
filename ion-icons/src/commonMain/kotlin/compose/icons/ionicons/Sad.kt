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

public val IonIcons.Sad: ImageVector
    get() {
        if (_sad != null) {
            return _sad!!
        }
        _sad = Builder(name = "Sad", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.39f, 97.61f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 97.61f, 414.39f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 414.39f, 97.61f)
                close()
                moveTo(184.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(23.94f, 23.94f, 0.0f, false, true, 184.0f, 208.0f)
                close()
                moveTo(160.33f, 357.83f)
                curveToRelative(12.0f, -40.3f, 50.2f, -69.83f, 95.62f, -69.83f)
                reflectiveCurveToRelative(83.62f, 29.53f, 95.71f, 69.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 343.84f, 368.0f)
                horizontalLineTo(168.15f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 160.33f, 357.83f)
                close()
                moveTo(328.0f, 256.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(23.94f, 23.94f, 0.0f, false, true, 328.0f, 256.0f)
                close()
            }
        }
        .build()
        return _sad!!
    }

private var _sad: ImageVector? = null
