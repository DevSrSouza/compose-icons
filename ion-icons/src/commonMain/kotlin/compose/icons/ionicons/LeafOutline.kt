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

public val IonIcons.LeafOutline: ImageVector
    get() {
        if (_leafOutline != null) {
            return _leafOutline!!
        }
        _leafOutline = Builder(name = "LeafOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(321.89f, 171.42f)
                curveTo(233.0f, 114.0f, 141.0f, 155.22f, 56.0f, 65.22f)
                curveToRelative(-19.8f, -21.0f, -8.3f, 235.5f, 98.1f, 332.7f)
                curveTo(231.89f, 468.92f, 352.0f, 461.0f, 392.5f, 392.0f)
                reflectiveCurveTo(410.78f, 228.83f, 321.89f, 171.42f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(173.0f, 253.0f)
                curveToRelative(86.0f, 81.0f, 175.0f, 129.0f, 292.0f, 147.0f)
            }
        }
        .build()
        return _leafOutline!!
    }

private var _leafOutline: ImageVector? = null
