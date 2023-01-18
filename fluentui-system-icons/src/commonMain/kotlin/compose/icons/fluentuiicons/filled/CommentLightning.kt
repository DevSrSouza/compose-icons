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

public val FilledGroup.CommentLightning: ImageVector
    get() {
        if (_commentLightning != null) {
            return _commentLightning!!
        }
        _commentLightning = Builder(name = "CommentLightning", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3177f, 1.0f)
                horizontalLineTo(21.1453f)
                curveTo(21.5277f, 1.0f, 21.7685f, 1.4118f, 21.5811f, 1.7451f)
                lineTo(19.7502f, 5.0f)
                horizontalLineTo(21.2463f)
                curveTo(21.8909f, 5.0f, 22.2352f, 5.7593f, 21.8105f, 6.2441f)
                lineTo(16.9867f, 11.7519f)
                curveTo(16.4821f, 12.328f, 15.544f, 11.8375f, 15.7292f, 11.0945f)
                lineTo(16.5002f, 8.0f)
                horizontalLineTo(13.4977f)
                curveTo(13.1313f, 8.0f, 12.8893f, 7.6189f, 13.0452f, 7.2873f)
                lineTo(15.8652f, 1.2873f)
                curveTo(15.9476f, 1.112f, 16.1239f, 1.0f, 16.3177f, 1.0f)
                close()
                moveTo(5.25f, 3.0f)
                horizontalLineTo(13.955f)
                lineTo(12.1399f, 6.862f)
                curveTo(11.6723f, 7.8568f, 12.3982f, 9.0f, 13.4974f, 9.0f)
                horizontalLineTo(15.2202f)
                lineTo(14.7586f, 10.8527f)
                curveTo(14.3198f, 12.6137f, 16.543f, 13.776f, 17.7387f, 12.4108f)
                lineTo(22.0f, 7.5453f)
                verticalLineTo(14.75f)
                curveTo(22.0f, 16.5449f, 20.5449f, 18.0f, 18.75f, 18.0f)
                horizontalLineTo(13.0f)
                lineTo(8.0f, 21.75f)
                curveTo(7.176f, 22.368f, 6.0f, 21.7801f, 6.0f, 20.75f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 18.0f, 2.0f, 16.5449f, 2.0f, 14.75f)
                verticalLineTo(6.25f)
                curveTo(2.0f, 4.4551f, 3.4551f, 3.0f, 5.25f, 3.0f)
                close()
            }
        }
        .build()
        return _commentLightning!!
    }

private var _commentLightning: ImageVector? = null
