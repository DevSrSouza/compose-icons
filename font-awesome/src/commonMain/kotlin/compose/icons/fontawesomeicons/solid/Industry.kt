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

public val SolidGroup.Industry: ImageVector
    get() {
        if (_industry != null) {
            return _industry!!
        }
        _industry = Builder(name = "Industry", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(475.11f, 163.78f)
                lineTo(336.0f, 252.31f)
                verticalLineToRelative(-68.28f)
                curveToRelative(0.0f, -18.92f, -20.93f, -30.4f, -36.88f, -20.25f)
                lineTo(160.0f, 252.31f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -13.26f, -10.74f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(24.0f)
                curveTo(10.74f, 32.0f, 0.0f, 42.74f, 0.0f, 56.0f)
                verticalLineToRelative(400.0f)
                curveToRelative(0.0f, 13.26f, 10.74f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(464.0f)
                curveToRelative(13.26f, 0.0f, 24.0f, -10.74f, 24.0f, -24.0f)
                verticalLineTo(184.03f)
                curveToRelative(0.0f, -18.92f, -20.93f, -30.4f, -36.88f, -20.25f)
                close()
            }
        }
        .build()
        return _industry!!
    }

private var _industry: ImageVector? = null
