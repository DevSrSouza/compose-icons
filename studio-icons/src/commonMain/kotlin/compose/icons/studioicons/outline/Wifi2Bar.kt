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

public val OutlineGroup.Wifi2Bar: ImageVector
    get() {
        if (_wifi2Bar != null) {
            return _wifi2Bar!!
        }
        _wifi2Bar = Builder(name = "Wifi2Bar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(3.03f, 0.0f, 5.78f, 1.23f, 7.76f, 3.22f)
                lineToRelative(-2.12f, 2.12f)
                curveTo(16.2f, 13.9f, 14.2f, 13.0f, 12.0f, 13.0f)
                curveToRelative(-2.2f, 0.0f, -4.2f, 0.9f, -5.64f, 2.35f)
                lineToRelative(-2.12f, -2.12f)
                curveTo(6.22f, 11.23f, 8.97f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.53f, 1.46f)
                lineTo(12.0f, 21.0f)
                lineToRelative(3.53f, -3.54f)
                curveTo(14.63f, 16.56f, 13.38f, 16.0f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _wifi2Bar!!
    }

private var _wifi2Bar: ImageVector? = null
