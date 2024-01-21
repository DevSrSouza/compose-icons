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

public val SolidGroup.Trash: ImageVector
    get() {
        if (_trash != null) {
            return _trash!!
        }
        _trash = Builder(name = "Trash", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(135.2f, 17.7f)
                lineTo(128.0f, 32.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 32.0f, 0.0f, 46.3f, 0.0f, 64.0f)
                reflectiveCurveTo(14.3f, 96.0f, 32.0f, 96.0f)
                horizontalLineTo(416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(320.0f)
                lineToRelative(-7.2f, -14.3f)
                curveTo(307.4f, 6.8f, 296.3f, 0.0f, 284.2f, 0.0f)
                horizontalLineTo(163.8f)
                curveToRelative(-12.1f, 0.0f, -23.2f, 6.8f, -28.6f, 17.7f)
                close()
                moveTo(416.0f, 128.0f)
                horizontalLineTo(32.0f)
                lineTo(53.2f, 467.0f)
                curveToRelative(1.6f, 25.3f, 22.6f, 45.0f, 47.9f, 45.0f)
                horizontalLineTo(346.9f)
                curveToRelative(25.3f, 0.0f, 46.3f, -19.7f, 47.9f, -45.0f)
                lineTo(416.0f, 128.0f)
                close()
            }
        }
        .build()
        return _trash!!
    }

private var _trash: ImageVector? = null
