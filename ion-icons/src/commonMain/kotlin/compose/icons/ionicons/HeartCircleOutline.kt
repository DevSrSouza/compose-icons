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

public val IonIcons.HeartCircleOutline: ImageVector
    get() {
        if (_heartCircleOutline != null) {
            return _heartCircleOutline!!
        }
        _heartCircleOutline = Builder(name = "HeartCircleOutline", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
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
                moveTo(256.0f, 360.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -9.0f, -2.78f)
                curveToRelative(-39.3f, -26.68f, -56.32f, -45.0f, -65.7f, -56.41f)
                curveToRelative(-20.0f, -24.37f, -29.58f, -49.4f, -29.3f, -76.5f)
                curveToRelative(0.31f, -31.06f, 25.22f, -56.33f, 55.53f, -56.33f)
                curveToRelative(20.4f, 0.0f, 35.0f, 10.63f, 44.1f, 20.41f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.72f, 0.0f)
                curveToRelative(9.11f, -9.78f, 23.7f, -20.41f, 44.1f, -20.41f)
                curveToRelative(30.31f, 0.0f, 55.22f, 25.27f, 55.53f, 56.33f)
                curveToRelative(0.28f, 27.1f, -9.31f, 52.13f, -29.3f, 76.5f)
                curveToRelative(-9.38f, 11.44f, -26.4f, 29.73f, -65.7f, 56.41f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 256.0f, 360.0f)
                close()
            }
        }
        .build()
        return _heartCircleOutline!!
    }

private var _heartCircleOutline: ImageVector? = null
