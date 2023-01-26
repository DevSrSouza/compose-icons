package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.WaterfallChart: ImageVector
    get() {
        if (_waterfallChart != null) {
            return _waterfallChart!!
        }
        _waterfallChart = Builder(name = "WaterfallChart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3.0f, 13.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(7.0f)
                lineTo(3.0f, 20.0f)
                close()
                moveTo(14.0f, 4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(10.0f, 5.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(4.0f)
                lineTo(7.0f, 14.0f)
                close()
            }
        }
        .build()
        return _waterfallChart!!
    }

private var _waterfallChart: ImageVector? = null
