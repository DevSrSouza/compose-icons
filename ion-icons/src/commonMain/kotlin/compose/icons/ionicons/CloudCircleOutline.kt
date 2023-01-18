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

public val IonIcons.CloudCircleOutline: ImageVector
    get() {
        if (_cloudCircleOutline != null) {
            return _cloudCircleOutline!!
        }
        _cloudCircleOutline = Builder(name = "CloudCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.88f, 240.59f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.66f, -6.66f)
                curveTo(320.68f, 192.78f, 290.82f, 168.0f, 256.0f, 168.0f)
                curveToRelative(-32.37f, 0.0f, -53.93f, 21.22f, -62.48f, 43.58f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, true, -6.16f, 5.0f)
                curveToRelative(-27.67f, 4.35f, -50.82f, 22.56f, -51.35f, 54.3f)
                curveToRelative(-0.52f, 31.53f, 25.51f, 57.11f, 57.0f, 57.11f)
                horizontalLineTo(326.0f)
                curveToRelative(27.5f, 0.0f, 50.0f, -13.72f, 50.0f, -44.0f)
                curveTo(376.0f, 256.77f, 354.0f, 243.58f, 333.88f, 240.59f)
                close()
            }
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
        }
        .build()
        return _cloudCircleOutline!!
    }

private var _cloudCircleOutline: ImageVector? = null
