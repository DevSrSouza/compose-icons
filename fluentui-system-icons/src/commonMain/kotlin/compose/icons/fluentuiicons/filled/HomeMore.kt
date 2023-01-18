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

public val FilledGroup.HomeMore: ImageVector
    get() {
        if (_homeMore != null) {
            return _homeMore!!
        }
        _homeMore = Builder(name = "HomeMore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4399f, 2.5319f)
                curveTo(12.6012f, 1.8248f, 11.3747f, 1.8257f, 10.537f, 2.534f)
                lineTo(3.7973f, 8.2319f)
                curveTo(3.2917f, 8.6595f, 3.0f, 9.288f, 3.0f, 9.9502f)
                verticalLineTo(19.25f)
                curveTo(3.0f, 20.2165f, 3.7835f, 21.0f, 4.75f, 21.0f)
                horizontalLineTo(19.25f)
                curveTo(20.2165f, 21.0f, 21.0f, 20.2165f, 21.0f, 19.25f)
                verticalLineTo(9.9515f)
                curveTo(21.0f, 9.2882f, 20.7073f, 8.6587f, 20.2002f, 8.2312f)
                lineTo(13.4399f, 2.5319f)
                close()
                moveTo(9.0f, 11.75f)
                curveTo(9.0f, 12.4404f, 8.4404f, 13.0f, 7.75f, 13.0f)
                curveTo(7.0596f, 13.0f, 6.5f, 12.4404f, 6.5f, 11.75f)
                curveTo(6.5f, 11.0596f, 7.0596f, 10.5f, 7.75f, 10.5f)
                curveTo(8.4404f, 10.5f, 9.0f, 11.0596f, 9.0f, 11.75f)
                close()
                moveTo(13.25f, 11.75f)
                curveTo(13.25f, 12.4404f, 12.6904f, 13.0f, 12.0f, 13.0f)
                curveTo(11.3096f, 13.0f, 10.75f, 12.4404f, 10.75f, 11.75f)
                curveTo(10.75f, 11.0596f, 11.3096f, 10.5f, 12.0f, 10.5f)
                curveTo(12.6904f, 10.5f, 13.25f, 11.0596f, 13.25f, 11.75f)
                close()
                moveTo(17.5f, 11.75f)
                curveTo(17.5f, 12.4404f, 16.9404f, 13.0f, 16.25f, 13.0f)
                curveTo(15.5596f, 13.0f, 15.0f, 12.4404f, 15.0f, 11.75f)
                curveTo(15.0f, 11.0596f, 15.5596f, 10.5f, 16.25f, 10.5f)
                curveTo(16.9404f, 10.5f, 17.5f, 11.0596f, 17.5f, 11.75f)
                close()
                moveTo(9.0f, 15.75f)
                curveTo(9.0f, 16.4404f, 8.4404f, 17.0f, 7.75f, 17.0f)
                curveTo(7.0596f, 17.0f, 6.5f, 16.4404f, 6.5f, 15.75f)
                curveTo(6.5f, 15.0596f, 7.0596f, 14.5f, 7.75f, 14.5f)
                curveTo(8.4404f, 14.5f, 9.0f, 15.0596f, 9.0f, 15.75f)
                close()
                moveTo(12.0f, 17.0f)
                curveTo(11.3096f, 17.0f, 10.75f, 16.4404f, 10.75f, 15.75f)
                curveTo(10.75f, 15.0596f, 11.3096f, 14.5f, 12.0f, 14.5f)
                curveTo(12.6904f, 14.5f, 13.25f, 15.0596f, 13.25f, 15.75f)
                curveTo(13.25f, 16.4404f, 12.6904f, 17.0f, 12.0f, 17.0f)
                close()
                moveTo(16.25f, 17.0f)
                curveTo(15.5596f, 17.0f, 15.0f, 16.4404f, 15.0f, 15.75f)
                curveTo(15.0f, 15.0596f, 15.5596f, 14.5f, 16.25f, 14.5f)
                curveTo(16.9404f, 14.5f, 17.5f, 15.0596f, 17.5f, 15.75f)
                curveTo(17.5f, 16.4404f, 16.9404f, 17.0f, 16.25f, 17.0f)
                close()
            }
        }
        .build()
        return _homeMore!!
    }

private var _homeMore: ImageVector? = null
