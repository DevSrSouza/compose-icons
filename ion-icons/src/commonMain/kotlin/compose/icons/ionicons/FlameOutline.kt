package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlameOutline: ImageVector
    get() {
        if (_flameOutline != null) {
            return _flameOutline!!
        }
        _flameOutline = Builder(name = "FlameOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(112.0f, 320.0f)
                curveToRelative(0.0f, -93.0f, 124.0f, -165.0f, 96.0f, -272.0f)
                curveToRelative(66.0f, 0.0f, 192.0f, 96.0f, 192.0f, 272.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, false, true, -288.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(320.0f, 368.0f)
                curveToRelative(0.0f, 57.71f, -32.0f, 80.0f, -64.0f, 80.0f)
                reflectiveCurveToRelative(-64.0f, -22.29f, -64.0f, -80.0f)
                reflectiveCurveToRelative(40.0f, -86.0f, 32.0f, -128.0f)
                curveTo(266.0f, 240.0f, 320.0f, 310.29f, 320.0f, 368.0f)
                close()
            }
        }
        .build()
        return _flameOutline!!
    }

private var _flameOutline: ImageVector? = null
