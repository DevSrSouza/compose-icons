package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Icicles: ImageVector
    get() {
        if (_icicles != null) {
            return _icicles!!
        }
        _icicles = Builder(name = "Icicles", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(511.4f, 37.9f)
                curveTo(515.1f, 18.2f, 500.0f, 0.0f, 480.0f, 0.0f)
                horizontalLineTo(32.0f)
                curveTo(10.6f, 0.0f, -4.8f, 20.7f, 1.4f, 41.2f)
                lineToRelative(87.1f, 273.4f)
                curveToRelative(2.5f, 7.2f, 12.7f, 7.2f, 15.1f, 0.0f)
                lineTo(140.0f, 190.5f)
                lineToRelative(44.2f, 187.3f)
                curveToRelative(1.9f, 8.3f, 13.7f, 8.3f, 15.6f, 0.0f)
                lineToRelative(46.5f, -196.9f)
                lineToRelative(34.1f, 133.4f)
                curveToRelative(2.3f, 7.6f, 13.0f, 7.6f, 15.3f, 0.0f)
                lineToRelative(45.8f, -172.5f)
                lineToRelative(66.7f, 363.8f)
                curveToRelative(1.7f, 8.6f, 14.0f, 8.6f, 15.7f, 0.0f)
                lineToRelative(87.5f, -467.7f)
                close()
            }
        }
        .build()
        return _icicles!!
    }

private var _icicles: ImageVector? = null
