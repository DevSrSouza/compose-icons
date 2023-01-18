package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ShareScreenPersonOverlayInside: ImageVector
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
                moveTo(16.0f, 12.0f)
                curveTo(17.1046f, 12.0f, 18.0f, 11.1046f, 18.0f, 10.0f)
                curveTo(18.0f, 8.8954f, 17.1046f, 8.0f, 16.0f, 8.0f)
                curveTo(14.8954f, 8.0f, 14.0f, 8.8954f, 14.0f, 10.0f)
                curveTo(14.0f, 11.1046f, 14.8954f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(13.0f, 14.0f)
                curveTo(13.0f, 13.4477f, 13.4477f, 13.0f, 14.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 13.0f, 19.0f, 13.4477f, 19.0f, 14.0f)
                verticalLineTo(14.25f)
                curveTo(19.0f, 15.7688f, 17.7688f, 17.0f, 16.25f, 17.0f)
                horizontalLineTo(15.75f)
                curveTo(14.2312f, 17.0f, 13.0f, 15.7688f, 13.0f, 14.25f)
                verticalLineTo(14.0f)
                close()
                moveTo(6.25f, 7.0f)
                curveTo(5.5596f, 7.0f, 5.0f, 7.5596f, 5.0f, 8.25f)
                verticalLineTo(11.75f)
                curveTo(5.0f, 12.4404f, 5.5596f, 13.0f, 6.25f, 13.0f)
                horizontalLineTo(10.75f)
                curveTo(11.4404f, 13.0f, 12.0f, 12.4404f, 12.0f, 11.75f)
                verticalLineTo(8.25f)
                curveTo(12.0f, 7.5596f, 11.4404f, 7.0f, 10.75f, 7.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(5.25f, 4.0f)
                curveTo(3.4551f, 4.0f, 2.0f, 5.4551f, 2.0f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(2.0f, 18.5449f, 3.4551f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 20.0f, 22.0f, 18.5449f, 22.0f, 16.75f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 5.4551f, 20.5449f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(5.25f)
                close()
                moveTo(3.5f, 7.25f)
                curveTo(3.5f, 6.2835f, 4.2835f, 5.5f, 5.25f, 5.5f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 5.5f, 20.5f, 6.2835f, 20.5f, 7.25f)
                verticalLineTo(16.75f)
                curveTo(20.5f, 17.7165f, 19.7165f, 18.5f, 18.75f, 18.5f)
                horizontalLineTo(5.25f)
                curveTo(4.2835f, 18.5f, 3.5f, 17.7165f, 3.5f, 16.75f)
                verticalLineTo(7.25f)
                close()
            }
        }
        .build()
        return _shareScreenPersonOverlayInside!!
    }

private var _shareScreenPersonOverlayInside: ImageVector? = null
