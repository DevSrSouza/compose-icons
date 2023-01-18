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

public val IonIcons.PowerOutline: ImageVector
    get() {
        if (_powerOutline != null) {
            return _powerOutline!!
        }
        _powerOutline = Builder(name = "PowerOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(378.0f, 108.0f)
                arcToRelative(191.41f, 191.41f, 0.0f, false, true, 70.0f, 148.0f)
                curveToRelative(0.0f, 106.0f, -86.0f, 192.0f, -192.0f, 192.0f)
                reflectiveCurveTo(64.0f, 362.0f, 64.0f, 256.0f)
                arcToRelative(192.0f, 192.0f, 0.0f, false, true, 69.0f, -148.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                lineTo(256.0f, 256.0f)
            }
        }
        .build()
        return _powerOutline!!
    }

private var _powerOutline: ImageVector? = null
