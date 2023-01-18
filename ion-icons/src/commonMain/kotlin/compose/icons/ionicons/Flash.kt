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

public val IonIcons.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = Builder(name = "Flash", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.82f, 496.0f)
                arcToRelative(18.36f, 18.36f, 0.0f, false, true, -18.1f, -21.53f)
                lineToRelative(0.0f, -0.11f)
                lineTo(204.83f, 320.0f)
                horizontalLineTo(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -12.44f, -26.06f)
                lineTo(302.73f, 23.0f)
                arcToRelative(18.45f, 18.45f, 0.0f, false, true, 32.8f, 13.71f)
                curveToRelative(0.0f, 0.3f, -0.08f, 0.59f, -0.13f, 0.89f)
                lineTo(307.19f, 192.0f)
                horizontalLineTo(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 12.44f, 26.06f)
                lineTo(209.24f, 489.0f)
                arcTo(18.45f, 18.45f, 0.0f, false, true, 194.82f, 496.0f)
                close()
            }
        }
        .build()
        return _flash!!
    }

private var _flash: ImageVector? = null
