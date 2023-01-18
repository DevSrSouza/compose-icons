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

public val IonIcons.Scale: ImageVector
    get() {
        if (_scale != null) {
            return _scale!!
        }
        _scale = Builder(name = "Scale", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 32.0f)
                lineTo(144.0f, 32.0f)
                arcTo(112.12f, 112.12f, 0.0f, false, false, 32.0f, 144.0f)
                lineTo(32.0f, 368.0f)
                arcTo(112.12f, 112.12f, 0.0f, false, false, 144.0f, 480.0f)
                lineTo(368.0f, 480.0f)
                arcTo(112.12f, 112.12f, 0.0f, false, false, 480.0f, 368.0f)
                lineTo(480.0f, 144.0f)
                arcTo(112.12f, 112.12f, 0.0f, false, false, 368.0f, 32.0f)
                close()
                moveTo(404.21f, 210.0f)
                lineTo(370.89f, 249.21f)
                arcTo(41.76f, 41.76f, 0.0f, false, true, 339.0f, 264.05f)
                arcToRelative(42.32f, 42.32f, 0.0f, false, true, -22.29f, -6.38f)
                curveToRelative(-14.22f, -8.78f, -36.3f, -19.25f, -60.69f, -19.25f)
                reflectiveCurveToRelative(-46.47f, 10.47f, -60.69f, 19.25f)
                arcToRelative(41.86f, 41.86f, 0.0f, false, true, -54.2f, -8.46f)
                lineTo(107.79f, 210.0f)
                arcToRelative(50.48f, 50.48f, 0.0f, false, true, 4.49f, -70.27f)
                curveTo(140.12f, 114.38f, 187.65f, 84.16f, 256.0f, 84.16f)
                reflectiveCurveToRelative(115.88f, 30.22f, 143.72f, 55.57f)
                arcTo(50.48f, 50.48f, 0.0f, false, true, 404.21f, 210.0f)
                close()
            }
        }
        .build()
        return _scale!!
    }

private var _scale: ImageVector? = null
