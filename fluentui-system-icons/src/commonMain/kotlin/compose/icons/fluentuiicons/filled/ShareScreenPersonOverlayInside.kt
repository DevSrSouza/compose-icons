package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ShareScreenPersonOverlayInside: ImageVector
    get() {
        if (_shareScreenPersonOverlayInside != null) {
            return _shareScreenPersonOverlayInside!!
        }
        _shareScreenPersonOverlayInside = Builder(name = "ShareScreenPersonOverlayInside",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.25f)
                curveTo(2.0f, 5.4551f, 3.4551f, 4.0f, 5.25f, 4.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 4.0f, 22.0f, 5.4551f, 22.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 18.5449f, 20.5449f, 20.0f, 18.75f, 20.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 20.0f, 2.0f, 18.5449f, 2.0f, 16.75f)
                verticalLineTo(7.25f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(17.1046f, 12.0f, 18.0f, 11.1046f, 18.0f, 10.0f)
                curveTo(18.0f, 8.8954f, 17.1046f, 8.0f, 16.0f, 8.0f)
                curveTo(14.8954f, 8.0f, 14.0f, 8.8954f, 14.0f, 10.0f)
                curveTo(14.0f, 11.1046f, 14.8954f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(5.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 12.5523f, 5.4477f, 13.0f, 6.0f, 13.0f)
                horizontalLineTo(11.0f)
                curveTo(11.5523f, 13.0f, 12.0f, 12.5523f, 12.0f, 12.0f)
                verticalLineTo(8.0f)
                curveTo(12.0f, 7.4477f, 11.5523f, 7.0f, 11.0f, 7.0f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 7.0f, 5.0f, 7.4477f, 5.0f, 8.0f)
                close()
                moveTo(14.0f, 13.0f)
                curveTo(13.4477f, 13.0f, 13.0f, 13.4477f, 13.0f, 14.0f)
                verticalLineTo(14.25f)
                curveTo(13.0f, 15.7688f, 14.2312f, 17.0f, 15.75f, 17.0f)
                horizontalLineTo(16.25f)
                curveTo(17.7688f, 17.0f, 19.0f, 15.7688f, 19.0f, 14.25f)
                verticalLineTo(14.0f)
                curveTo(19.0f, 13.4477f, 18.5523f, 13.0f, 18.0f, 13.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _shareScreenPersonOverlayInside!!
    }

private var _shareScreenPersonOverlayInside: ImageVector? = null
