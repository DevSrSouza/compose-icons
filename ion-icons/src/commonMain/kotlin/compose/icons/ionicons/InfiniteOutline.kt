package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.InfiniteOutline: ImageVector
    get() {
        if (_infiniteOutline != null) {
            return _infiniteOutline!!
        }
        _infiniteOutline = Builder(name = "InfiniteOutline", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                reflectiveCurveToRelative(-48.0f, -96.0f, -126.0f, -96.0f)
                curveToRelative(-54.12f, 0.0f, -98.0f, 43.0f, -98.0f, 96.0f)
                reflectiveCurveToRelative(43.88f, 96.0f, 98.0f, 96.0f)
                curveToRelative(37.51f, 0.0f, 71.0f, -22.41f, 94.0f, -48.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(256.0f, 256.0f)
                reflectiveCurveToRelative(48.0f, 96.0f, 126.0f, 96.0f)
                curveToRelative(54.12f, 0.0f, 98.0f, -43.0f, 98.0f, -96.0f)
                reflectiveCurveToRelative(-43.88f, -96.0f, -98.0f, -96.0f)
                curveToRelative(-37.51f, 0.0f, -71.0f, 22.41f, -94.0f, 48.0f)
            }
        }
        .build()
        return _infiniteOutline!!
    }

private var _infiniteOutline: ImageVector? = null
