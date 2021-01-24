package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Flask: ImageVector
    get() {
        if (_flask != null) {
            return _flask!!
        }
        _flask = Builder(name = "Flask", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(437.2f, 403.5f)
                lineTo(320.0f, 215.0f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                horizontalLineTo(120.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(151.0f)
                lineTo(10.8f, 403.5f)
                curveTo(-18.5f, 450.6f, 15.3f, 512.0f, 70.9f, 512.0f)
                horizontalLineToRelative(306.2f)
                curveToRelative(55.7f, 0.0f, 89.4f, -61.5f, 60.1f, -108.5f)
                close()
                moveTo(137.9f, 320.0f)
                lineToRelative(48.2f, -77.6f)
                curveToRelative(3.7f, -5.2f, 5.8f, -11.6f, 5.8f, -18.4f)
                verticalLineTo(64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(160.0f)
                curveToRelative(0.0f, 6.9f, 2.2f, 13.2f, 5.8f, 18.4f)
                lineToRelative(48.2f, 77.6f)
                horizontalLineToRelative(-172.0f)
                close()
            }
        }
        .build()
        return _flask!!
    }

private var _flask: ImageVector? = null
