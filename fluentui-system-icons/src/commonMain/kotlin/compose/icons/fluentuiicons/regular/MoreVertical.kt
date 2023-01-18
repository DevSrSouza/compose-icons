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

public val RegularGroup.MoreVertical: ImageVector
    get() {
        if (_moreVertical != null) {
            return _moreVertical!!
        }
        _moreVertical = Builder(name = "MoreVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.75f)
                curveTo(11.0335f, 7.75f, 10.25f, 6.9665f, 10.25f, 6.0f)
                curveTo(10.25f, 5.0335f, 11.0335f, 4.25f, 12.0f, 4.25f)
                curveTo(12.9665f, 4.25f, 13.75f, 5.0335f, 13.75f, 6.0f)
                curveTo(13.75f, 6.9665f, 12.9665f, 7.75f, 12.0f, 7.75f)
                close()
                moveTo(12.0f, 13.75f)
                curveTo(11.0335f, 13.75f, 10.25f, 12.9665f, 10.25f, 12.0f)
                curveTo(10.25f, 11.0335f, 11.0335f, 10.25f, 12.0f, 10.25f)
                curveTo(12.9665f, 10.25f, 13.75f, 11.0335f, 13.75f, 12.0f)
                curveTo(13.75f, 12.9665f, 12.9665f, 13.75f, 12.0f, 13.75f)
                close()
                moveTo(10.25f, 18.0f)
                curveTo(10.25f, 18.9665f, 11.0335f, 19.75f, 12.0f, 19.75f)
                curveTo(12.9665f, 19.75f, 13.75f, 18.9665f, 13.75f, 18.0f)
                curveTo(13.75f, 17.0335f, 12.9665f, 16.25f, 12.0f, 16.25f)
                curveTo(11.0335f, 16.25f, 10.25f, 17.0335f, 10.25f, 18.0f)
                close()
            }
        }
        .build()
        return _moreVertical!!
    }

private var _moreVertical: ImageVector? = null
