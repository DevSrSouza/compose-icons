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

public val RegularGroup.MatchAppLayout: ImageVector
    get() {
        if (_matchAppLayout != null) {
            return _matchAppLayout!!
        }
        _matchAppLayout = Builder(name = "MatchAppLayout", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.2817f, 8.0f)
                curveTo(10.2482f, 8.0f, 11.0317f, 8.7835f, 11.0317f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(11.0317f, 15.2165f, 10.2482f, 16.0f, 9.2817f, 16.0f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 16.0f, 2.0f, 15.2165f, 2.0f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(2.0f, 8.8318f, 2.7071f, 8.0788f, 3.6065f, 8.0058f)
                lineTo(3.75f, 8.0f)
                horizontalLineTo(9.2817f)
                close()
                moveTo(20.25f, 8.0f)
                curveTo(21.2165f, 8.0f, 22.0f, 8.7835f, 22.0f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(22.0f, 15.2165f, 21.2165f, 16.0f, 20.25f, 16.0f)
                horizontalLineTo(14.7183f)
                curveTo(13.7518f, 16.0f, 12.9683f, 15.2165f, 12.9683f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(12.9683f, 8.7835f, 13.7518f, 8.0f, 14.7183f, 8.0f)
                horizontalLineTo(20.25f)
                close()
                moveTo(9.2817f, 9.5f)
                horizontalLineTo(3.75f)
                lineTo(3.6927f, 9.5066f)
                curveTo(3.5822f, 9.5325f, 3.5f, 9.6316f, 3.5f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(3.5f, 14.3881f, 3.6119f, 14.5f, 3.75f, 14.5f)
                horizontalLineTo(9.2817f)
                curveTo(9.4198f, 14.5f, 9.5317f, 14.3881f, 9.5317f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(9.5317f, 9.6119f, 9.4198f, 9.5f, 9.2817f, 9.5f)
                close()
                moveTo(20.25f, 9.5f)
                horizontalLineTo(14.7183f)
                curveTo(14.5802f, 9.5f, 14.4683f, 9.6119f, 14.4683f, 9.75f)
                verticalLineTo(14.25f)
                curveTo(14.4683f, 14.3881f, 14.5802f, 14.5f, 14.7183f, 14.5f)
                horizontalLineTo(20.25f)
                curveTo(20.3881f, 14.5f, 20.5f, 14.3881f, 20.5f, 14.25f)
                verticalLineTo(9.75f)
                curveTo(20.5f, 9.6119f, 20.3881f, 9.5f, 20.25f, 9.5f)
                close()
            }
        }
        .build()
        return _matchAppLayout!!
    }

private var _matchAppLayout: ImageVector? = null
