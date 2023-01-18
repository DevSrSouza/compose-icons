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

public val IonIcons.CloudCircle: ImageVector
    get() {
        if (_cloudCircle != null) {
            return _cloudCircle!!
        }
        _cloudCircle = Builder(name = "CloudCircle", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(141.13f, 48.0f, 48.0f, 141.13f, 48.0f, 256.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                reflectiveCurveTo(370.87f, 48.0f, 256.0f, 48.0f)
                close()
                moveTo(326.0f, 328.0f)
                lineTo(193.05f, 328.0f)
                curveToRelative(-31.53f, 0.0f, -57.56f, -25.58f, -57.0f, -57.11f)
                curveToRelative(0.53f, -31.74f, 23.68f, -49.95f, 51.35f, -54.3f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 6.16f, -5.0f)
                curveTo(202.07f, 189.22f, 223.63f, 168.0f, 256.0f, 168.0f)
                curveToRelative(33.17f, 0.0f, 61.85f, 22.49f, 70.14f, 60.21f)
                arcToRelative(17.75f, 17.75f, 0.0f, false, false, 13.18f, 13.43f)
                curveTo(357.79f, 246.05f, 376.0f, 259.21f, 376.0f, 284.0f)
                curveTo(376.0f, 314.28f, 353.5f, 328.0f, 326.0f, 328.0f)
                close()
            }
        }
        .build()
        return _cloudCircle!!
    }

private var _cloudCircle: ImageVector? = null
