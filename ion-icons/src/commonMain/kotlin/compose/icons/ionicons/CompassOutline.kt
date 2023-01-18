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

public val IonIcons.CompassOutline: ImageVector
    get() {
        if (_compassOutline != null) {
            return _compassOutline!!
        }
        _compassOutline = Builder(name = "CompassOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(448.0f, 256.0f)
                curveToRelative(0.0f, -106.0f, -86.0f, -192.0f, -192.0f, -192.0f)
                reflectiveCurveTo(64.0f, 150.0f, 64.0f, 256.0f)
                reflectiveCurveToRelative(86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveTo(448.0f, 362.0f, 448.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(350.67f, 150.93f)
                lineToRelative(-117.2f, 46.88f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -35.66f, 35.66f)
                lineToRelative(-46.88f, 117.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.4f, 10.4f)
                lineToRelative(117.2f, -46.88f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 35.66f, -35.66f)
                lineToRelative(46.88f, -117.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 350.67f, 150.93f)
                close()
                moveTo(256.0f, 280.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 256.0f, 280.0f)
                close()
            }
        }
        .build()
        return _compassOutline!!
    }

private var _compassOutline: ImageVector? = null
