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

public val RoundGroup.EventBusy: ImageVector
    get() {
        if (_eventBusy != null) {
            return _eventBusy!!
        }
        _eventBusy = Builder(name = "EventBusy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.84f, 16.47f)
                lineToRelative(1.91f, -1.91f)
                lineToRelative(1.91f, 1.91f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f)
                lineToRelative(-1.91f, -1.91f)
                lineToRelative(1.91f, -1.91f)
                curveToRelative(0.29f, -0.29f, 0.29f, -0.77f, 0.0f, -1.06f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f)
                lineToRelative(-1.91f, 1.91f)
                lineToRelative(-1.91f, -1.91f)
                curveToRelative(-0.29f, -0.29f, -0.77f, -0.29f, -1.06f, 0.0f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f)
                lineToRelative(1.91f, 1.91f)
                lineToRelative(-1.91f, 1.91f)
                curveToRelative(-0.29f, 0.29f, -0.29f, 0.77f, 0.0f, 1.06f)
                curveToRelative(0.29f, 0.29f, 0.77f, 0.29f, 1.06f, 0.0f)
                close()
                moveTo(19.0f, 3.0f)
                horizontalLineToRelative(-1.0f)
                lineTo(18.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(8.0f, 3.0f)
                lineTo(8.0f, 2.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 3.0f)
                curveToRelative(-1.11f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(3.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(14.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                lineTo(21.0f, 5.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(5.0f, 8.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                close()
            }
        }
        .build()
        return _eventBusy!!
    }

private var _eventBusy: ImageVector? = null
