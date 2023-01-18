package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MacFill: ImageVector
    get() {
        if (_macFill != null) {
            return _macFill!!
        }
        _macFill = Builder(name = "MacFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(2.0f, 1.0f)
                verticalLineToRelative(1.0f)
                horizontalLineTo(8.0f)
                lineToRelative(-0.004f, -0.996f)
                lineTo(10.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(2.992f)
                arcTo(0.998f, 0.998f, 0.0f, false, true, 2.0f, 16.993f)
                verticalLineTo(4.007f)
                curveTo(2.0f, 3.451f, 2.455f, 3.0f, 2.992f, 3.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.449f, 0.992f, 1.007f)
                verticalLineToRelative(12.986f)
                curveToRelative(0.0f, 0.556f, -0.455f, 1.007f, -0.992f, 1.007f)
                horizontalLineTo(14.0f)
                close()
                moveTo(4.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _macFill!!
    }

private var _macFill: ImageVector? = null
