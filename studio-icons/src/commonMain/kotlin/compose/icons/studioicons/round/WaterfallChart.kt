package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.WaterfallChart: ImageVector
    get() {
        if (_waterfallChart != null) {
            return _waterfallChart!!
        }
        _waterfallChart = Builder(name = "WaterfallChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 4.0f)
                lineTo(19.5f, 4.0f)
                curveTo(20.33f, 4.0f, 21.0f, 4.67f, 21.0f, 5.5f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-13.0f)
                curveTo(18.0f, 4.67f, 18.67f, 4.0f, 19.5f, 4.0f)
                close()
                moveTo(4.5f, 13.0f)
                lineTo(4.5f, 13.0f)
                curveTo(5.33f, 13.0f, 6.0f, 13.67f, 6.0f, 14.5f)
                verticalLineToRelative(4.0f)
                curveTo(6.0f, 19.33f, 5.33f, 20.0f, 4.5f, 20.0f)
                horizontalLineToRelative(0.0f)
                curveTo(3.67f, 20.0f, 3.0f, 19.33f, 3.0f, 18.5f)
                verticalLineToRelative(-4.0f)
                curveTo(3.0f, 13.67f, 3.67f, 13.0f, 4.5f, 13.0f)
                close()
                moveTo(15.5f, 4.0f)
                lineTo(15.5f, 4.0f)
                curveTo(16.33f, 4.0f, 17.0f, 4.67f, 17.0f, 5.5f)
                verticalLineToRelative(0.0f)
                curveTo(17.0f, 6.33f, 16.33f, 7.0f, 15.5f, 7.0f)
                horizontalLineToRelative(0.0f)
                curveTo(14.67f, 7.0f, 14.0f, 6.33f, 14.0f, 5.5f)
                verticalLineToRelative(0.0f)
                curveTo(14.0f, 4.67f, 14.67f, 4.0f, 15.5f, 4.0f)
                close()
                moveTo(11.5f, 5.0f)
                lineTo(11.5f, 5.0f)
                curveTo(12.33f, 5.0f, 13.0f, 5.67f, 13.0f, 6.5f)
                verticalLineToRelative(1.0f)
                curveTo(13.0f, 8.33f, 12.33f, 9.0f, 11.5f, 9.0f)
                horizontalLineToRelative(0.0f)
                curveTo(10.67f, 9.0f, 10.0f, 8.33f, 10.0f, 7.5f)
                verticalLineToRelative(-1.0f)
                curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f)
                close()
                moveTo(8.5f, 10.0f)
                lineTo(8.5f, 10.0f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(0.0f)
                curveTo(7.67f, 14.0f, 7.0f, 13.33f, 7.0f, 12.5f)
                verticalLineToRelative(-1.0f)
                curveTo(7.0f, 10.67f, 7.67f, 10.0f, 8.5f, 10.0f)
                close()
            }
        }
        .build()
        return _waterfallChart!!
    }

private var _waterfallChart: ImageVector? = null
