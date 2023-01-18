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

public val IonIcons.ScaleOutline: ImageVector
    get() {
        if (_scaleOutline != null) {
            return _scaleOutline!!
        }
        _scaleOutline = Builder(name = "ScaleOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(144.0f, 48.0f)
                lineTo(368.0f, 48.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 464.0f, 144.0f)
                lineTo(464.0f, 368.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 368.0f, 464.0f)
                lineTo(144.0f, 464.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 48.0f, 368.0f)
                lineTo(48.0f, 144.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 144.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(388.94f, 151.56f)
                curveToRelative(-24.46f, -22.28f, -68.72f, -51.4f, -132.94f, -51.4f)
                reflectiveCurveToRelative(-108.48f, 29.12f, -132.94f, 51.4f)
                arcTo(34.66f, 34.66f, 0.0f, false, false, 120.0f, 199.64f)
                lineToRelative(33.32f, 39.21f)
                arcToRelative(26.07f, 26.07f, 0.0f, false, false, 33.6f, 5.21f)
                curveToRelative(15.92f, -9.83f, 40.91f, -21.64f, 69.1f, -21.64f)
                reflectiveCurveToRelative(53.18f, 11.81f, 69.1f, 21.64f)
                arcToRelative(26.07f, 26.07f, 0.0f, false, false, 33.6f, -5.21f)
                lineTo(392.0f, 199.64f)
                arcTo(34.66f, 34.66f, 0.0f, false, false, 388.94f, 151.56f)
                close()
            }
        }
        .build()
        return _scaleOutline!!
    }

private var _scaleOutline: ImageVector? = null
