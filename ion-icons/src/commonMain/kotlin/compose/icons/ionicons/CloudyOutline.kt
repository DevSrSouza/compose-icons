package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.CloudyOutline: ImageVector
    get() {
        if (_cloudyOutline != null) {
            return _cloudyOutline!!
        }
        _cloudyOutline = Builder(name = "CloudyOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(100.18f, 241.19f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, false, 13.37f, -13.25f)
                curveTo(126.6f, 145.59f, 186.34f, 96.0f, 256.0f, 96.0f)
                curveToRelative(64.69f, 0.0f, 107.79f, 42.36f, 124.92f, 87.0f)
                arcToRelative(16.11f, 16.11f, 0.0f, false, false, 12.53f, 10.18f)
                curveTo(449.36f, 202.06f, 496.0f, 239.21f, 496.0f, 304.0f)
                curveToRelative(0.0f, 66.0f, -54.0f, 112.0f, -120.0f, 112.0f)
                horizontalLineTo(116.0f)
                curveToRelative(-55.0f, 0.0f, -100.0f, -27.44f, -100.0f, -88.0f)
                curveTo(16.0f, 273.57f, 59.89f, 247.19f, 100.18f, 241.19f)
                close()
            }
        }
        .build()
        return _cloudyOutline!!
    }

private var _cloudyOutline: ImageVector? = null
