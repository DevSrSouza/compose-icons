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

public val IonIcons.PlanetOutline: ImageVector
    get() {
        if (_planetOutline != null) {
            return _planetOutline!!
        }
        _planetOutline = Builder(name = "PlanetOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(413.48f, 284.46f)
                curveToRelative(58.87f, 47.24f, 91.61f, 89.0f, 80.31f, 108.55f)
                curveToRelative(-17.85f, 30.85f, -138.78f, -5.48f, -270.1f, -81.15f)
                reflectiveCurveTo(0.37f, 149.84f, 18.21f, 119.0f)
                curveToRelative(11.16f, -19.28f, 62.58f, -12.32f, 131.64f, 14.09f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                moveToRelative(-160.0f, 0.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, 320.0f, 0.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, true, true, -320.0f, 0.0f)
            }
        }
        .build()
        return _planetOutline!!
    }

private var _planetOutline: ImageVector? = null
