package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Trash16: ImageVector
    get() {
        if (_trash16 != null) {
            return _trash16!!
        }
        _trash16 = Builder(name = "Trash16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 1.75f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(2.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineTo(5.0f)
                verticalLineTo(1.75f)
                curveTo(5.0f, 0.784f, 5.784f, 0.0f, 6.75f, 0.0f)
                horizontalLineToRelative(2.5f)
                curveTo(10.216f, 0.0f, 11.0f, 0.784f, 11.0f, 1.75f)
                close()
                moveTo(4.496f, 6.675f)
                lineToRelative(0.66f, 6.6f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.249f, 0.225f)
                horizontalLineToRelative(5.19f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.249f, -0.225f)
                lineToRelative(0.66f, -6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.492f, 0.149f)
                lineToRelative(-0.66f, 6.6f)
                arcTo(1.748f, 1.748f, 0.0f, false, true, 10.595f, 15.0f)
                horizontalLineToRelative(-5.19f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -1.741f, -1.575f)
                lineToRelative(-0.66f, -6.6f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.492f, -0.15f)
                close()
                moveTo(6.5f, 1.75f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(1.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                close()
            }
        }
        .build()
        return _trash16!!
    }

private var _trash16: ImageVector? = null
