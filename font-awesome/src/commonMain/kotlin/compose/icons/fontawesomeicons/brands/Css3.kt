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

public val BrandsGroup.Css3: ImageVector
    get() {
        if (_css3 != null) {
            return _css3!!
        }
        _css3 = Builder(name = "Css3", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 32.0f)
                lineToRelative(-64.0f, 368.0f)
                lineToRelative(-223.3f, 80.0f)
                lineTo(0.0f, 400.0f)
                lineToRelative(19.6f, -94.8f)
                horizontalLineToRelative(82.0f)
                lineToRelative(-8.0f, 40.6f)
                lineTo(210.0f, 390.2f)
                lineToRelative(134.1f, -44.4f)
                lineToRelative(18.8f, -97.1f)
                horizontalLineTo(29.5f)
                lineToRelative(16.0f, -82.0f)
                horizontalLineToRelative(333.7f)
                lineToRelative(10.5f, -52.7f)
                horizontalLineTo(56.3f)
                lineToRelative(16.3f, -82.0f)
                horizontalLineTo(480.0f)
                close()
            }
        }
        .build()
        return _css3!!
    }

private var _css3: ImageVector? = null
