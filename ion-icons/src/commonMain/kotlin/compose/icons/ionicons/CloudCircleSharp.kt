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

public val IonIcons.CloudCircleSharp: ImageVector
    get() {
        if (_cloudCircleSharp != null) {
            return _cloudCircleSharp!!
        }
        _cloudCircleSharp = Builder(name = "CloudCircleSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                lineTo(196.0f, 328.0f)
                curveToRelative(-33.0f, 0.0f, -60.0f, -23.0f, -60.0f, -56.0f)
                curveToRelative(0.0f, -34.21f, 26.0f, -53.0f, 56.0f, -56.0f)
                curveToRelative(7.28f, -23.9f, 29.5f, -48.0f, 64.0f, -48.0f)
                curveToRelative(36.5f, 0.0f, 67.55f, 27.23f, 72.0f, 72.0f)
                curveToRelative(21.49f, 1.12f, 48.0f, 14.09f, 48.0f, 44.0f)
                curveTo(376.0f, 314.28f, 353.5f, 328.0f, 326.0f, 328.0f)
                close()
            }
        }
        .build()
        return _cloudCircleSharp!!
    }

private var _cloudCircleSharp: ImageVector? = null
