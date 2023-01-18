package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.ColorFillOutline: ImageVector
    get() {
        if (_colorFillOutline != null) {
            return _colorFillOutline!!
        }
        _colorFillOutline = Builder(name = "ColorFillOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(419.1f, 337.45f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, -6.1f, 0.0f)
                curveToRelative(-10.5f, 12.4f, -45.0f, 46.55f, -45.0f, 77.66f)
                curveToRelative(0.0f, 27.0f, 21.5f, 48.89f, 48.0f, 48.89f)
                horizontalLineToRelative(0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -22.0f, 48.0f, -48.89f)
                curveTo(464.0f, 384.0f, 429.7f, 349.85f, 419.1f, 337.45f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(387.0f, 287.9f)
                lineTo(155.61f, 58.36f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -51.0f, 0.0f)
                lineToRelative(-5.15f, 5.15f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 51.0f)
                lineToRelative(52.89f, 52.89f)
                lineToRelative(57.0f, -57.0f)
                lineTo(56.33f, 263.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.3f, 40.0f)
                lineToRelative(131.2f, 126.0f)
                arcToRelative(28.05f, 28.05f, 0.0f, false, false, 38.9f, -0.1f)
                curveToRelative(37.8f, -36.6f, 118.3f, -114.5f, 126.7f, -122.9f)
                curveToRelative(5.8f, -5.8f, 18.2f, -7.1f, 28.7f, -7.1f)
                horizontalLineToRelative(0.3f)
                arcTo(6.53f, 6.53f, 0.0f, false, false, 387.0f, 287.9f)
                close()
            }
        }
        .build()
        return _colorFillOutline!!
    }

private var _colorFillOutline: ImageVector? = null
