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

public val BaselineGroup.AreaChart: ImageVector
    get() {
        if (_areaChart != null) {
            return _areaChart!!
        }
        _areaChart = Builder(name = "AreaChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 13.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-1.5f)
                lineToRelative(-9.0f, -7.0f)
                lineTo(8.0f, 17.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(3.0f, 7.0f)
                lineToRelative(4.0f, 3.0f)
                lineToRelative(5.0f, -7.0f)
                lineToRelative(5.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.97f)
                lineToRelative(-9.4f, -7.31f)
                lineToRelative(-3.98f, 5.48f)
                lineTo(3.0f, 10.44f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _areaChart!!
    }

private var _areaChart: ImageVector? = null
