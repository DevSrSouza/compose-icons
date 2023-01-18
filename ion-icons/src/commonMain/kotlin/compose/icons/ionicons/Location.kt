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

public val IonIcons.Location: ImageVector
    get() {
        if (_location != null) {
            return _location!!
        }
        _location = Builder(name = "Location", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 192.0f)
                moveToRelative(-32.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(167.78f, 32.0f, 96.0f, 100.65f, 96.0f, 185.0f)
                curveToRelative(0.0f, 40.17f, 18.31f, 93.59f, 54.42f, 158.78f)
                curveToRelative(29.0f, 52.34f, 62.55f, 99.67f, 80.0f, 123.22f)
                arcToRelative(31.75f, 31.75f, 0.0f, false, false, 51.22f, 0.0f)
                curveToRelative(17.42f, -23.55f, 51.0f, -70.88f, 80.0f, -123.22f)
                curveTo(397.69f, 278.61f, 416.0f, 225.19f, 416.0f, 185.0f)
                curveTo(416.0f, 100.65f, 344.22f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(256.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 256.0f, 256.0f)
                close()
            }
        }
        .build()
        return _location!!
    }

private var _location: ImageVector? = null
