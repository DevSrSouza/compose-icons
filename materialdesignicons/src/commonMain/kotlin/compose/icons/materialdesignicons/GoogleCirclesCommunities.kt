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

public val MaterialDesignIcons.GoogleCirclesCommunities: ImageVector
    get() {
        if (_googleCirclesCommunities != null) {
            return _googleCirclesCommunities!!
        }
        _googleCirclesCommunities = Builder(name = "GoogleCirclesCommunities", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                curveTo(13.89f, 12.0f, 13.0f, 12.89f, 13.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 14.0f)
                curveTo(17.0f, 12.89f, 16.1f, 12.0f, 15.0f, 12.0f)
                moveTo(12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 4.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 20.0f, 12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 12.0f, 20.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 7.89f, 13.1f, 7.0f, 12.0f, 7.0f)
                curveTo(10.89f, 7.0f, 10.0f, 7.89f, 10.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 9.0f)
                moveTo(9.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 14.0f)
                curveTo(11.0f, 12.89f, 10.1f, 12.0f, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _googleCirclesCommunities!!
    }

private var _googleCirclesCommunities: ImageVector? = null
