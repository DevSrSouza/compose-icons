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

public val IonIcons.FitnessOutline: ImageVector
    get() {
        if (_fitnessOutline != null) {
            return _fitnessOutline!!
        }
        _fitnessOutline = Builder(name = "FitnessOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(352.92f, 80.0f)
                curveTo(288.0f, 80.0f, 256.0f, 144.0f, 256.0f, 144.0f)
                reflectiveCurveToRelative(-32.0f, -64.0f, -96.92f, -64.0f)
                curveTo(106.32f, 80.0f, 64.54f, 124.14f, 64.0f, 176.81f)
                curveToRelative(-1.1f, 109.33f, 86.73f, 187.08f, 183.0f, 252.42f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.0f, 0.0f)
                curveToRelative(96.26f, -65.34f, 184.09f, -143.09f, 183.0f, -252.42f)
                curveTo(447.46f, 124.14f, 405.68f, 80.0f, 352.92f, 80.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(48.0f, 256.0f)
                lineToRelative(112.0f, 0.0f)
                lineToRelative(48.0f, -96.0f)
                lineToRelative(48.0f, 160.0f)
                lineToRelative(48.0f, -96.0f)
                lineToRelative(32.0f, 64.0f)
                lineToRelative(128.0f, 0.0f)
            }
        }
        .build()
        return _fitnessOutline!!
    }

private var _fitnessOutline: ImageVector? = null
