package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Patreon: ImageVector
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = Builder(name = "Patreon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 194.8f)
                curveToRelative(0.0f, 101.3f, -82.4f, 183.8f, -183.8f, 183.8f)
                curveToRelative(-101.7f, 0.0f, -184.4f, -82.4f, -184.4f, -183.8f)
                curveToRelative(0.0f, -101.6f, 82.7f, -184.3f, 184.4f, -184.3f)
                curveTo(429.6f, 10.5f, 512.0f, 93.2f, 512.0f, 194.8f)
                close()
                moveTo(0.0f, 501.5f)
                horizontalLineToRelative(90.0f)
                verticalLineToRelative(-491.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(491.0f)
                close()
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: ImageVector? = null
