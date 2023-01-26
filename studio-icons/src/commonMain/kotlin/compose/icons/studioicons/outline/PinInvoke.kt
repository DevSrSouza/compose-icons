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

public val OutlineGroup.PinInvoke: ImageVector
    get() {
        if (_pinInvoke != null) {
            return _pinInvoke!!
        }
        _pinInvoke = Builder(name = "PinInvoke", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(0.0f, 2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(22.0f, 7.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f)
                reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f)
                curveTo(20.66f, 10.0f, 22.0f, 8.66f, 22.0f, 7.0f)
                close()
                moveTo(9.34f, 12.0f)
                horizontalLineToRelative(2.24f)
                lineToRelative(-2.95f, 2.95f)
                lineToRelative(1.41f, 1.41f)
                lineTo(13.0f, 13.42f)
                verticalLineToRelative(2.24f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.34f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _pinInvoke!!
    }

private var _pinInvoke: ImageVector? = null