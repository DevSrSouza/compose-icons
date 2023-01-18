package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.EggOutline: ImageVector
    get() {
        if (_eggOutline != null) {
            return _eggOutline!!
        }
        _eggOutline = Builder(name = "EggOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 48.0f)
                curveTo(192.0f, 48.0f, 96.0f, 171.69f, 96.0f, 286.55f)
                reflectiveCurveTo(160.0f, 464.0f, 256.0f, 464.0f)
                reflectiveCurveToRelative(160.0f, -62.59f, 160.0f, -177.45f)
                reflectiveCurveTo(320.0f, 48.0f, 256.0f, 48.0f)
                close()
            }
        }
        .build()
        return _eggOutline!!
    }

private var _eggOutline: ImageVector? = null
