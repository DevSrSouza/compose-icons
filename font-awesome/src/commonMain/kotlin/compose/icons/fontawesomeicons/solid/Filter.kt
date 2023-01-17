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

public val SolidGroup.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9f, 54.9f)
                curveTo(10.5f, 40.9f, 24.5f, 32.0f, 40.0f, 32.0f)
                horizontalLineTo(472.0f)
                curveToRelative(15.5f, 0.0f, 29.5f, 8.9f, 36.1f, 22.9f)
                reflectiveCurveToRelative(4.6f, 30.5f, -5.2f, 42.5f)
                lineTo(320.0f, 320.9f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 12.1f, -6.8f, 23.2f, -17.7f, 28.6f)
                reflectiveCurveToRelative(-23.8f, 4.3f, -33.5f, -3.0f)
                lineToRelative(-64.0f, -48.0f)
                curveToRelative(-8.1f, -6.0f, -12.8f, -15.5f, -12.8f, -25.6f)
                verticalLineTo(320.9f)
                lineTo(9.0f, 97.3f)
                curveTo(-0.7f, 85.4f, -2.8f, 68.8f, 3.9f, 54.9f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
