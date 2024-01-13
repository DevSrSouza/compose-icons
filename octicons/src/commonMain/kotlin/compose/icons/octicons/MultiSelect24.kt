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

public val Octicons.MultiSelect24: ImageVector
    get() {
        if (_multiSelect24 != null) {
            return _multiSelect24!!
        }
        _multiSelect24 = Builder(name = "MultiSelect24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.75f, 11.5f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(8.75f, 13.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(8.75f, 17.5f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(8.75f, 19.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(3.75f, 5.5f)
                horizontalLineToRelative(10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                horizontalLineToRelative(-10.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(5.0f, 12.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(4.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
                moveTo(19.309f, 7.918f)
                lineToRelative(-2.245f, -2.501f)
                arcTo(0.25f, 0.25f, 0.0f, false, true, 17.25f, 5.0f)
                horizontalLineToRelative(4.49f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.185f, 0.417f)
                lineToRelative(-2.244f, 2.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.372f, 0.0f)
                close()
            }
        }
        .build()
        return _multiSelect24!!
    }

private var _multiSelect24: ImageVector? = null
