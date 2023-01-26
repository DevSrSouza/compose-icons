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

public val OutlineGroup.Terrain: ImageVector
    get() {
        if (_terrain != null) {
            return _terrain!!
        }
        _terrain = Builder(name = "Terrain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 6.0f)
                lineToRelative(-4.22f, 5.63f)
                lineToRelative(1.25f, 1.67f)
                lineTo(14.0f, 9.33f)
                lineTo(19.0f, 16.0f)
                horizontalLineToRelative(-8.46f)
                lineToRelative(-4.01f, -5.37f)
                lineTo(1.0f, 18.0f)
                horizontalLineToRelative(22.0f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(5.0f, 16.0f)
                lineToRelative(1.52f, -2.03f)
                lineTo(8.04f, 16.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _terrain!!
    }

private var _terrain: ImageVector? = null
