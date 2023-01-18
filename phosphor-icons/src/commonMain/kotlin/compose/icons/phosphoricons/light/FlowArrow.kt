package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FlowArrow: ImageVector
    get() {
        if (_flowArrow != null) {
            return _flowArrow!!
        }
        _flowArrow = Builder(name = "FlowArrow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.2f, 75.8f)
                lineToRelative(-40.0f, -40.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, 8.4f)
                lineTo(225.5f, 74.0f)
                horizontalLineTo(176.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, -54.0f, 54.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, -42.0f, 42.0f)
                horizontalLineTo(77.5f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineTo(80.0f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 54.0f, -54.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 42.0f, -42.0f)
                horizontalLineToRelative(49.5f)
                lineToRelative(-29.7f, 29.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineToRelative(40.0f, -40.0f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 244.2f, 75.8f)
                close()
                moveTo(44.0f, 198.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 44.0f, 198.0f)
                close()
            }
        }
        .build()
        return _flowArrow!!
    }

private var _flowArrow: ImageVector? = null
