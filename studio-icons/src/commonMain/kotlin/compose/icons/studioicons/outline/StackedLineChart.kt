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

public val OutlineGroup.StackedLineChart: ImageVector
    get() {
        if (_stackedLineChart != null) {
            return _stackedLineChart!!
        }
        _stackedLineChart = Builder(name = "StackedLineChart", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 19.99f)
                lineToRelative(7.5f, -7.51f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(7.09f, -7.97f)
                lineTo(22.0f, 9.92f)
                lineToRelative(-8.5f, 9.56f)
                lineToRelative(-4.0f, -4.0f)
                lineToRelative(-6.0f, 6.01f)
                lineTo(2.0f, 19.99f)
                close()
                moveTo(3.5f, 15.49f)
                lineToRelative(6.0f, -6.01f)
                lineToRelative(4.0f, 4.0f)
                lineTo(22.0f, 3.92f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-7.09f, 7.97f)
                lineToRelative(-4.0f, -4.0f)
                lineTo(2.0f, 13.99f)
                lineTo(3.5f, 15.49f)
                close()
            }
        }
        .build()
        return _stackedLineChart!!
    }

private var _stackedLineChart: ImageVector? = null
