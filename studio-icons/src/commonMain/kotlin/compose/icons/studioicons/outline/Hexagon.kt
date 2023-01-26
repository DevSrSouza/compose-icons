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

public val OutlineGroup.Hexagon: ImageVector
    get() {
        if (_hexagon != null) {
            return _hexagon!!
        }
        _hexagon = Builder(name = "Hexagon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.2f, 3.0f)
                horizontalLineTo(6.8f)
                lineToRelative(-5.2f, 9.0f)
                lineToRelative(5.2f, 9.0f)
                horizontalLineToRelative(10.4f)
                lineToRelative(5.2f, -9.0f)
                lineTo(17.2f, 3.0f)
                close()
                moveTo(16.05f, 19.0f)
                horizontalLineTo(7.95f)
                lineToRelative(-4.04f, -7.0f)
                lineToRelative(4.04f, -7.0f)
                horizontalLineToRelative(8.09f)
                lineToRelative(4.04f, 7.0f)
                lineTo(16.05f, 19.0f)
                close()
            }
        }
        .build()
        return _hexagon!!
    }

private var _hexagon: ImageVector? = null