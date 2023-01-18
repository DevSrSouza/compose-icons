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

public val IonIcons.LocationOutline: ImageVector
    get() {
        if (_locationOutline != null) {
            return _locationOutline!!
        }
        _locationOutline = Builder(name = "LocationOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveToRelative(-79.5f, 0.0f, -144.0f, 61.39f, -144.0f, 137.0f)
                curveToRelative(0.0f, 87.0f, 96.0f, 224.87f, 131.25f, 272.49f)
                arcToRelative(15.77f, 15.77f, 0.0f, false, false, 25.5f, 0.0f)
                curveTo(304.0f, 409.89f, 400.0f, 272.07f, 400.0f, 185.0f)
                curveTo(400.0f, 109.39f, 335.5f, 48.0f, 256.0f, 48.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 192.0f)
                moveToRelative(-48.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -96.0f, 0.0f)
            }
        }
        .build()
        return _locationOutline!!
    }

private var _locationOutline: ImageVector? = null
