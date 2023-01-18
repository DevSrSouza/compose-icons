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

public val IonIcons.LogoYoutube: ImageVector
    get() {
        if (_logoYoutube != null) {
            return _logoYoutube!!
        }
        _logoYoutube = Builder(name = "LogoYoutube", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(508.64f, 148.79f)
                curveToRelative(0.0f, -45.0f, -33.1f, -81.2f, -74.0f, -81.2f)
                curveTo(379.24f, 65.0f, 322.74f, 64.0f, 265.0f, 64.0f)
                horizontalLineTo(247.0f)
                curveToRelative(-57.6f, 0.0f, -114.2f, 1.0f, -169.6f, 3.6f)
                curveToRelative(-40.8f, 0.0f, -73.9f, 36.4f, -73.9f, 81.4f)
                curveTo(1.0f, 184.59f, -0.06f, 220.19f, 0.0f, 255.79f)
                quadToRelative(-0.15f, 53.4f, 3.4f, 106.9f)
                curveToRelative(0.0f, 45.0f, 33.1f, 81.5f, 73.9f, 81.5f)
                curveToRelative(58.2f, 2.7f, 117.9f, 3.9f, 178.6f, 3.8f)
                quadToRelative(91.2f, 0.3f, 178.6f, -3.8f)
                curveToRelative(40.9f, 0.0f, 74.0f, -36.5f, 74.0f, -81.5f)
                curveToRelative(2.4f, -35.7f, 3.5f, -71.3f, 3.4f, -107.0f)
                quadTo(512.24f, 202.29f, 508.64f, 148.79f)
                close()
                moveTo(207.0f, 353.89f)
                verticalLineTo(157.39f)
                lineToRelative(145.0f, 98.2f)
                close()
            }
        }
        .build()
        return _logoYoutube!!
    }

private var _logoYoutube: ImageVector? = null
