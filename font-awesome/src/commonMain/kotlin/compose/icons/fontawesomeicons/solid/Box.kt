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

public val SolidGroup.Box: ImageVector
    get() {
        if (_box != null) {
            return _box!!
        }
        _box = Builder(name = "Box", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(509.5f, 184.6f)
                lineTo(458.9f, 32.8f)
                curveTo(452.4f, 13.2f, 434.1f, 0.0f, 413.4f, 0.0f)
                horizontalLineTo(272.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(238.7f)
                curveToRelative(-0.4f, -2.5f, -0.4f, -5.0f, -1.2f, -7.4f)
                close()
                moveTo(240.0f, 0.0f)
                horizontalLineTo(98.6f)
                curveToRelative(-20.7f, 0.0f, -39.0f, 13.2f, -45.5f, 32.8f)
                lineTo(2.5f, 184.6f)
                curveToRelative(-0.8f, 2.4f, -0.8f, 4.9f, -1.2f, 7.4f)
                horizontalLineTo(240.0f)
                verticalLineTo(0.0f)
                close()
                moveTo(0.0f, 224.0f)
                verticalLineToRelative(240.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                verticalLineTo(224.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _box!!
    }

private var _box: ImageVector? = null
