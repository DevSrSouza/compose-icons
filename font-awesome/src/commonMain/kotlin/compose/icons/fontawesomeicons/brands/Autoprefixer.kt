package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Autoprefixer: ImageVector
    get() {
        if (_autoprefixer != null) {
            return _autoprefixer!!
        }
        _autoprefixer = Builder(name = "Autoprefixer", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.4f, 16.0f)
                lineToRelative(-161.0f, 480.0f)
                horizontalLineToRelative(77.5f)
                lineToRelative(25.4f, -81.4f)
                horizontalLineToRelative(119.5f)
                lineTo(405.0f, 496.0f)
                horizontalLineToRelative(77.5f)
                lineTo(318.4f, 16.0f)
                close()
                moveTo(278.1f, 357.9f)
                lineToRelative(41.2f, -130.4f)
                horizontalLineToRelative(1.5f)
                lineToRelative(40.9f, 130.4f)
                horizontalLineToRelative(-83.6f)
                close()
                moveTo(640.0f, 405.0f)
                lineToRelative(-10.0f, -31.4f)
                lineTo(462.1f, 358.0f)
                lineToRelative(19.4f, 56.5f)
                lineTo(640.0f, 405.0f)
                close()
                moveTo(177.9f, 358.0f)
                lineTo(10.0f, 373.7f)
                lineTo(0.0f, 405.0f)
                lineToRelative(158.5f, 9.4f)
                lineToRelative(19.4f, -56.4f)
                close()
            }
        }
        .build()
        return _autoprefixer!!
    }

private var _autoprefixer: ImageVector? = null
