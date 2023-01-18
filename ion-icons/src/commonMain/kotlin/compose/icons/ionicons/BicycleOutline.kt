package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.BicycleOutline: ImageVector
    get() {
        if (_bicycleOutline != null) {
            return _bicycleOutline!!
        }
        _bicycleOutline = Builder(name = "BicycleOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(388.0f, 288.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 76.0f, 76.0f)
                arcToRelative(76.24f, 76.24f, 0.0f, false, false, -76.0f, -76.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(124.0f, 288.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, false, 76.0f, 76.0f)
                arcToRelative(76.24f, 76.24f, 0.0f, false, false, -76.0f, -76.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 360.0f)
                lineToRelative(0.0f, -86.0f)
                lineToRelative(-64.0f, -42.0f)
                lineToRelative(80.0f, -88.0f)
                lineToRelative(40.0f, 72.0f)
                lineToRelative(56.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 136.0f)
                arcToRelative(31.89f, 31.89f, 0.0f, false, false, 32.0f, -32.1f)
                arcTo(31.55f, 31.55f, 0.0f, false, false, 320.2f, 72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -0.2f, 64.0f)
                close()
            }
        }
        .build()
        return _bicycleOutline!!
    }

private var _bicycleOutline: ImageVector? = null
