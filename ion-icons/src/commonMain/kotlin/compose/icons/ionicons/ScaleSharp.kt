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

public val IonIcons.ScaleSharp: ImageVector
    get() {
        if (_scaleSharp != null) {
            return _scaleSharp!!
        }
        _scaleSharp = Builder(name = "ScaleSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 32.0f)
                horizontalLineTo(80.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 32.0f, 80.0f)
                verticalLineTo(432.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, 48.0f)
                horizontalLineTo(432.0f)
                arcToRelative(48.05f, 48.05f, 0.0f, false, false, 48.0f, -48.0f)
                verticalLineTo(80.0f)
                arcTo(48.05f, 48.05f, 0.0f, false, false, 432.0f, 32.0f)
                close()
                moveTo(415.29f, 197.0f)
                lineToRelative(-52.46f, 61.73f)
                arcToRelative(27.83f, 27.83f, 0.0f, false, true, -37.65f, 4.62f)
                curveToRelative(-13.0f, -9.29f, -39.27f, -24.89f, -69.18f, -24.89f)
                reflectiveCurveToRelative(-56.18f, 15.6f, -69.18f, 24.89f)
                arcToRelative(27.84f, 27.84f, 0.0f, false, true, -37.65f, -4.62f)
                lineTo(96.71f, 197.0f)
                arcTo(32.12f, 32.12f, 0.0f, false, true, 97.13f, 155.0f)
                curveToRelative(18.93f, -21.31f, 72.3f, -70.87f, 158.87f, -70.87f)
                reflectiveCurveTo(395.94f, 133.72f, 414.87f, 155.0f)
                horizontalLineToRelative(0.0f)
                arcTo(32.12f, 32.12f, 0.0f, false, true, 415.29f, 197.0f)
                close()
            }
        }
        .build()
        return _scaleSharp!!
    }

private var _scaleSharp: ImageVector? = null
