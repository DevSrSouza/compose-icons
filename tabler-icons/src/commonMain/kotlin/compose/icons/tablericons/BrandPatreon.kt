package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandPatreon: ImageVector
    get() {
        if (_brandPatreon != null) {
            return _brandPatreon!!
        }
        _brandPatreon = Builder(name = "BrandPatreon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 8.408f)
                curveToRelative(-0.003f, -2.299f, -1.746f, -4.182f, -3.79f, -4.862f)
                curveToRelative(-2.54f, -0.844f, -5.888f, -0.722f, -8.312f, 0.453f)
                curveToRelative(-2.939f, 1.425f, -3.862f, 4.545f, -3.896f, 7.656f)
                curveToRelative(-0.028f, 2.559f, 0.22f, 9.297f, 3.92f, 9.345f)
                curveToRelative(2.75f, 0.036f, 3.159f, -3.603f, 4.43f, -5.356f)
                curveToRelative(0.906f, -1.247f, 2.071f, -1.599f, 3.506f, -1.963f)
                curveToRelative(2.465f, -0.627f, 4.146f, -2.626f, 4.142f, -5.273f)
                close()
            }
        }
        .build()
        return _brandPatreon!!
    }

private var _brandPatreon: ImageVector? = null
