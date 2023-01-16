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

public val MaterialDesignIcons.TimelineQuestion: ImageVector
    get() {
        if (_timelineQuestion != null) {
            return _timelineQuestion!!
        }
        _timelineQuestion = Builder(name = "TimelineQuestion", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(24.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(24.0f, 19.11f, 23.11f, 20.0f, 22.0f, 20.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 20.0f, 8.0f, 19.11f, 8.0f, 18.0f)
                verticalLineTo(14.0f)
                lineTo(6.0f, 12.0f)
                lineTo(8.0f, 10.0f)
                verticalLineTo(6.0f)
                curveTo(8.0f, 4.89f, 8.9f, 4.0f, 10.0f, 4.0f)
                horizontalLineTo(22.0f)
                curveTo(23.11f, 4.0f, 24.0f, 4.89f, 24.0f, 6.0f)
                moveTo(16.5f, 15.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                moveTo(14.5f, 10.5f)
                verticalLineTo(10.0f)
                curveTo(14.5f, 9.17f, 15.17f, 8.5f, 16.0f, 8.5f)
                curveTo(16.83f, 8.5f, 17.5f, 9.18f, 17.5f, 10.0f)
                curveTo(17.5f, 10.47f, 17.27f, 10.9f, 16.88f, 11.16f)
                lineTo(16.59f, 11.35f)
                curveTo(15.6f, 12.0f, 15.0f, 13.11f, 15.0f, 14.3f)
                verticalLineTo(14.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(14.3f)
                curveTo(16.5f, 13.62f, 16.84f, 13.0f, 17.41f, 12.6f)
                lineTo(17.71f, 12.41f)
                curveTo(18.5f, 11.88f, 19.0f, 10.97f, 19.0f, 10.0f)
                curveTo(19.0f, 8.34f, 17.66f, 7.0f, 16.0f, 7.0f)
                curveTo(14.34f, 7.0f, 13.0f, 8.34f, 13.0f, 10.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _timelineQuestion!!
    }

private var _timelineQuestion: ImageVector? = null
