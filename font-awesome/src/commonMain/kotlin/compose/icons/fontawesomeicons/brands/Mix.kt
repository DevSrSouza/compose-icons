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

public val BrandsGroup.Mix: ImageVector
    get() {
        if (_mix != null) {
            return _mix!!
        }
        _mix = Builder(name = "Mix", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                verticalLineToRelative(348.9f)
                curveToRelative(0.0f, 56.2f, 88.0f, 58.1f, 88.0f, 0.0f)
                verticalLineTo(174.3f)
                curveToRelative(7.9f, -52.9f, 88.0f, -50.4f, 88.0f, 6.5f)
                verticalLineToRelative(175.3f)
                curveToRelative(0.0f, 57.9f, 96.0f, 58.0f, 96.0f, 0.0f)
                verticalLineTo(240.0f)
                curveToRelative(5.3f, -54.7f, 88.0f, -52.5f, 88.0f, 4.3f)
                verticalLineToRelative(23.8f)
                curveToRelative(0.0f, 59.9f, 88.0f, 56.6f, 88.0f, 0.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _mix!!
    }

private var _mix: ImageVector? = null
