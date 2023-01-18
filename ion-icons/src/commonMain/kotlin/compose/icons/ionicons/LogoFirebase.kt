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

public val IonIcons.LogoFirebase: ImageVector
    get() {
        if (_logoFirebase != null) {
            return _logoFirebase!!
        }
        _logoFirebase = Builder(name = "LogoFirebase", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.19f, 329.38f)
                lineTo(140.64f, 25.31f)
                curveToRelative(1.64f, -10.37f, 15.55f, -12.82f, 20.46f, -3.55f)
                lineToRelative(51.0f, 95.45f)
                close()
                moveTo(432.0f, 400.0f)
                lineTo(385.26f, 123.21f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, -18.54f, -6.0f)
                lineTo(80.0f, 400.0f)
                lineToRelative(159.36f, 91.91f)
                arcToRelative(33.18f, 33.18f, 0.0f, false, false, 31.91f, 0.0f)
                close()
                moveTo(302.36f, 158.93f)
                lineTo(265.82f, 89.39f)
                arcToRelative(10.86f, 10.86f, 0.0f, false, false, -19.36f, 0.0f)
                lineTo(85.83f, 375.74f)
                close()
            }
        }
        .build()
        return _logoFirebase!!
    }

private var _logoFirebase: ImageVector? = null
