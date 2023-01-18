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

public val IonIcons.HappySharp: ImageVector
    get() {
        if (_happySharp != null) {
            return _happySharp!!
        }
        _happySharp = Builder(name = "HappySharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(414.39f, 97.61f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 97.61f, 414.39f)
                arcTo(224.0f, 224.0f, 0.0f, true, false, 414.39f, 97.61f)
                close()
                moveTo(328.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(23.94f, 23.94f, 0.0f, false, true, 328.0f, 208.0f)
                close()
                moveTo(184.0f, 208.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -24.0f, 24.0f)
                arcTo(23.94f, 23.94f, 0.0f, false, true, 184.0f, 208.0f)
                close()
                moveTo(256.05f, 384.0f)
                curveToRelative(-45.42f, 0.0f, -83.75f, -29.49f, -95.72f, -69.83f)
                curveTo(159.29f, 310.65f, 158.0f, 304.0f, 158.0f, 304.0f)
                lineTo(354.0f, 304.0f)
                reflectiveCurveToRelative(-1.31f, 6.69f, -2.33f, 10.17f)
                curveTo(339.89f, 354.53f, 301.47f, 384.0f, 256.05f, 384.0f)
                close()
            }
        }
        .build()
        return _happySharp!!
    }

private var _happySharp: ImageVector? = null
