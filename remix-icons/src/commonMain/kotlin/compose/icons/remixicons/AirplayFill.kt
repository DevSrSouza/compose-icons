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

public val RemixIcons.AirplayFill: ImageVector
    get() {
        if (_airplayFill != null) {
            return _airplayFill!!
        }
        _airplayFill = Builder(name = "AirplayFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4f, 13.533f)
                lineToRelative(5.0f, 6.667f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, 0.8f)
                horizontalLineTo(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.4f, -0.8f)
                lineToRelative(5.0f, -6.667f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.8f, 0.0f)
                close()
                moveTo(18.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.992f)
                arcTo(0.994f, 0.994f, 0.0f, false, true, 2.0f, 18.0f)
                verticalLineTo(4.0f)
                curveToRelative(0.0f, -0.552f, 0.455f, -1.0f, 0.992f, -1.0f)
                horizontalLineToRelative(18.016f)
                curveToRelative(0.548f, 0.0f, 0.992f, 0.445f, 0.992f, 1.0f)
                verticalLineToRelative(14.0f)
                curveToRelative(0.0f, 0.552f, -0.455f, 1.0f, -0.992f, 1.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _airplayFill!!
    }

private var _airplayFill: ImageVector? = null
