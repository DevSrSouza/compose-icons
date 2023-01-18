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

public val RemixIcons.HomeGearFill: ImageVector
    get() {
        if (_homeGearFill != null) {
            return _homeGearFill!!
        }
        _homeGearFill = Builder(name = "HomeGearFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                lineTo(5.0f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-9.0f)
                lineTo(1.0f, 11.0f)
                lineToRelative(10.327f, -9.388f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.346f, 0.0f)
                lineTo(23.0f, 11.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(9.0f)
                close()
                moveTo(8.592f, 13.808f)
                lineToRelative(-0.991f, 0.572f)
                lineToRelative(1.0f, 1.733f)
                lineToRelative(0.993f, -0.573f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.405f, 0.811f)
                verticalLineToRelative(1.145f)
                horizontalLineToRelative(2.002f)
                lineTo(13.001f, 16.35f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 1.405f, -0.81f)
                lineToRelative(0.992f, 0.572f)
                lineTo(16.4f, 14.38f)
                lineToRelative(-0.991f, -0.572f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, 0.0f, -1.62f)
                lineToRelative(0.991f, -0.573f)
                lineToRelative(-1.0f, -1.733f)
                lineToRelative(-0.993f, 0.573f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 13.0f, 9.645f)
                lineTo(13.0f, 8.5f)
                horizontalLineToRelative(-2.002f)
                verticalLineToRelative(1.144f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, -1.405f, 0.811f)
                lineToRelative(-0.992f, -0.573f)
                lineTo(7.6f, 11.616f)
                lineToRelative(0.991f, 0.572f)
                arcToRelative(3.504f, 3.504f, 0.0f, false, false, 0.0f, 1.62f)
                close()
                moveTo(12.0f, 14.498f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.002f, -3.001f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.002f, 3.0f)
                close()
            }
        }
        .build()
        return _homeGearFill!!
    }

private var _homeGearFill: ImageVector? = null
