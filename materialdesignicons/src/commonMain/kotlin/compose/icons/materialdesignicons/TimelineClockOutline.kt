package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TimelineClockOutline: ImageVector
    get() {
        if (_timelineClockOutline != null) {
            return _timelineClockOutline!!
        }
        _timelineClockOutline = Builder(name = "TimelineClockOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                moveTo(2.0f, 22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 13.11f, 4.11f, 14.0f, 3.0f, 14.0f)
                curveTo(1.9f, 14.0f, 1.0f, 13.11f, 1.0f, 12.0f)
                curveTo(1.0f, 10.9f, 1.9f, 10.0f, 3.0f, 10.0f)
                curveTo(4.11f, 10.0f, 5.0f, 10.9f, 5.0f, 12.0f)
                moveTo(16.0f, 4.0f)
                curveTo(20.42f, 4.0f, 24.0f, 7.58f, 24.0f, 12.0f)
                curveTo(24.0f, 16.42f, 20.42f, 20.0f, 16.0f, 20.0f)
                curveTo(12.4f, 20.0f, 9.36f, 17.62f, 8.35f, 14.35f)
                lineTo(6.0f, 12.0f)
                lineTo(8.35f, 9.65f)
                curveTo(9.36f, 6.38f, 12.4f, 4.0f, 16.0f, 4.0f)
                moveTo(16.0f, 6.0f)
                curveTo(12.69f, 6.0f, 10.0f, 8.69f, 10.0f, 12.0f)
                curveTo(10.0f, 15.31f, 12.69f, 18.0f, 16.0f, 18.0f)
                curveTo(19.31f, 18.0f, 22.0f, 15.31f, 22.0f, 12.0f)
                curveTo(22.0f, 8.69f, 19.31f, 6.0f, 16.0f, 6.0f)
                moveTo(15.0f, 13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(12.2f)
                lineTo(19.5f, 14.0f)
                lineTo(18.68f, 15.26f)
                lineTo(15.0f, 13.0f)
                close()
            }
        }
        .build()
        return _timelineClockOutline!!
    }

private var _timelineClockOutline: ImageVector? = null
