package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.WaterOutline: ImageVector
    get() {
        if (_waterOutline != null) {
            return _waterOutline!!
        }
        _waterOutline = Builder(name = "WaterOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(400.0f, 320.0f)
                curveToRelative(0.0f, 88.37f, -55.63f, 144.0f, -144.0f, 144.0f)
                reflectiveCurveTo(112.0f, 408.37f, 112.0f, 320.0f)
                curveToRelative(0.0f, -94.83f, 103.23f, -222.85f, 134.89f, -259.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.23f, 0.0f)
                curveTo(296.77f, 97.15f, 400.0f, 225.17f, 400.0f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(344.0f, 328.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, 72.0f)
            }
        }
        .build()
        return _waterOutline!!
    }

private var _waterOutline: ImageVector? = null
