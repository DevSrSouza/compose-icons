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

public val Octicons.ArrowSwitch24: ImageVector
    get() {
        if (_arrowSwitch24 != null) {
            return _arrowSwitch24!!
        }
        _arrowSwitch24 = Builder(name = "ArrowSwitch24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.72f, 21.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, -1.06f)
                lineTo(5.56f, 17.5f)
                horizontalLineToRelative(14.69f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(5.56f, 16.0f)
                lineToRelative(3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.06f)
                lineToRelative(-4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.06f)
                lineToRelative(4.5f, 4.5f)
                close()
                moveTo(16.28f, 12.28f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.06f)
                lineTo(18.44f, 8.0f)
                lineTo(3.75f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(14.69f)
                lineToRelative(-3.22f, -3.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, -1.06f)
                lineToRelative(4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.06f)
                lineToRelative(-4.5f, 4.5f)
                close()
            }
        }
        .build()
        return _arrowSwitch24!!
    }

private var _arrowSwitch24: ImageVector? = null
