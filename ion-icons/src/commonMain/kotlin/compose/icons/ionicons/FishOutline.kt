package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FishOutline: ImageVector
    get() {
        if (_fishOutline != null) {
            return _fishOutline!!
        }
        _fishOutline = Builder(name = "FishOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(240.0f, 152.0f)
                curveToRelative(-50.71f, 12.21f, -94.15f, 52.31f, -120.3f, 73.43f)
                arcToRelative(261.14f, 261.14f, 0.0f, false, false, -23.81f, -19.58f)
                curveTo(59.53f, 179.29f, 16.0f, 176.0f, 16.0f, 176.0f)
                reflectiveCurveToRelative(11.37f, 51.53f, 41.36f, 79.83f)
                curveTo(27.37f, 284.14f, 16.0f, 335.67f, 16.0f, 335.67f)
                reflectiveCurveToRelative(43.53f, -3.29f, 79.89f, -29.85f)
                arcToRelative(259.18f, 259.18f, 0.0f, false, false, 23.61f, -19.41f)
                curveTo(145.6f, 307.55f, 189.24f, 347.75f, 240.0f, 360.0f)
                lineToRelative(-16.0f, 56.0f)
                curveToRelative(39.43f, -6.67f, 78.86f, -35.51f, 94.72f, -48.25f)
                curveTo(448.0f, 362.0f, 496.0f, 279.0f, 496.0f, 256.0f)
                curveToRelative(0.0f, -22.0f, -48.0f, -106.0f, -176.89f, -111.73f)
                curveTo(303.52f, 131.78f, 263.76f, 102.72f, 224.0f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 239.99f)
                moveToRelative(-16.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCap.Companion.Round,
                    strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(378.37f, 356.0f)
                arcToRelative(199.22f, 199.22f, 0.0f, false, true, 0.0f, -200.0f)
            }
        }
        .build()
        return _fishOutline!!
    }

private var _fishOutline: ImageVector? = null
