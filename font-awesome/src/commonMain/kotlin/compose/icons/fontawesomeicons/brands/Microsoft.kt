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

public val BrandsGroup.Microsoft: ImageVector
    get() {
        if (_microsoft != null) {
            return _microsoft!!
        }
        _microsoft = Builder(name = "Microsoft", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                horizontalLineToRelative(214.6f)
                verticalLineToRelative(214.6f)
                lineTo(0.0f, 246.6f)
                lineTo(0.0f, 32.0f)
                close()
                moveTo(233.4f, 32.0f)
                lineTo(448.0f, 32.0f)
                verticalLineToRelative(214.6f)
                lineTo(233.4f, 246.6f)
                lineTo(233.4f, 32.0f)
                close()
                moveTo(0.0f, 265.4f)
                horizontalLineToRelative(214.6f)
                lineTo(214.6f, 480.0f)
                lineTo(0.0f, 480.0f)
                lineTo(0.0f, 265.4f)
                close()
                moveTo(233.4f, 265.4f)
                lineTo(448.0f, 265.4f)
                lineTo(448.0f, 480.0f)
                lineTo(233.4f, 480.0f)
                lineTo(233.4f, 265.4f)
                close()
            }
        }
        .build()
        return _microsoft!!
    }

private var _microsoft: ImageVector? = null
