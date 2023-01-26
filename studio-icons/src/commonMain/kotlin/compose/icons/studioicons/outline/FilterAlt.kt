package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FilterAlt: ImageVector
    get() {
        if (_filterAlt != null) {
            return _filterAlt!!
        }
        _filterAlt = Builder(name = "FilterAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(-5.01f, 6.3f)
                lineTo(7.0f, 6.0f)
                close()
                moveTo(4.25f, 5.61f)
                curveTo(6.27f, 8.2f, 10.0f, 13.0f, 10.0f, 13.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, 0.0f, 3.72f, -4.8f, 5.74f, -7.39f)
                curveTo(20.25f, 4.95f, 19.78f, 4.0f, 18.95f, 4.0f)
                horizontalLineTo(5.04f)
                curveTo(4.21f, 4.0f, 3.74f, 4.95f, 4.25f, 5.61f)
                close()
            }
        }
        .build()
        return _filterAlt!!
    }

private var _filterAlt: ImageVector? = null
