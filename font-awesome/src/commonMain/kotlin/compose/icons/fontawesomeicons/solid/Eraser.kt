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

public val SolidGroup.Eraser: ImageVector
    get() {
        if (_eraser != null) {
            return _eraser!!
        }
        _eraser = Builder(name = "Eraser", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(290.7f, 57.4f)
                lineTo(57.4f, 290.7f)
                curveToRelative(-25.0f, 25.0f, -25.0f, 65.5f, 0.0f, 90.5f)
                lineToRelative(80.0f, 80.0f)
                curveToRelative(12.0f, 12.0f, 28.3f, 18.7f, 45.3f, 18.7f)
                horizontalLineTo(288.0f)
                horizontalLineToRelative(9.4f)
                horizontalLineTo(512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(387.9f)
                lineTo(518.6f, 285.3f)
                curveToRelative(25.0f, -25.0f, 25.0f, -65.5f, 0.0f, -90.5f)
                lineTo(381.3f, 57.4f)
                curveToRelative(-25.0f, -25.0f, -65.5f, -25.0f, -90.5f, 0.0f)
                close()
                moveTo(297.4f, 416.0f)
                horizontalLineTo(288.0f)
                lineToRelative(-105.4f, 0.0f)
                lineToRelative(-80.0f, -80.0f)
                lineTo(227.3f, 211.3f)
                lineTo(364.7f, 348.7f)
                lineTo(297.4f, 416.0f)
                close()
            }
        }
        .build()
        return _eraser!!
    }

private var _eraser: ImageVector? = null
