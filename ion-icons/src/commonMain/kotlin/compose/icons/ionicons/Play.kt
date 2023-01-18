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

public val IonIcons.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.0f, 440.0f)
                arcToRelative(35.37f, 35.37f, 0.0f, false, true, -17.5f, -4.67f)
                curveToRelative(-12.0f, -6.8f, -19.46f, -20.0f, -19.46f, -34.33f)
                verticalLineTo(111.0f)
                curveToRelative(0.0f, -14.37f, 7.46f, -27.53f, 19.46f, -34.33f)
                arcToRelative(35.13f, 35.13f, 0.0f, false, true, 35.77f, 0.45f)
                lineTo(399.12f, 225.48f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 61.0f)
                lineTo(151.23f, 434.88f)
                arcTo(35.5f, 35.5f, 0.0f, false, true, 133.0f, 440.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
