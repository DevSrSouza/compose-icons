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

public val RegularGroup.Reward: ImageVector
    get() {
        if (_reward != null) {
            return _reward!!
        }
        _reward = Builder(name = "Reward", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 1.999f)
                curveTo(21.2165f, 1.999f, 22.0f, 2.7825f, 22.0f, 3.749f)
                verticalLineTo(6.7917f)
                curveTo(22.0f, 7.8159f, 21.4309f, 8.7552f, 20.5231f, 9.2293f)
                lineTo(14.2413f, 12.5097f)
                curveTo(15.8773f, 13.3314f, 17.0f, 15.0248f, 17.0f, 16.9804f)
                curveTo(17.0f, 19.7418f, 14.7614f, 21.9804f, 12.0f, 21.9804f)
                curveTo(9.2386f, 21.9804f, 7.0f, 19.7418f, 7.0f, 16.9804f)
                curveTo(7.0f, 15.0248f, 8.1227f, 13.3314f, 9.7587f, 12.5097f)
                lineTo(3.4769f, 9.2293f)
                curveTo(2.5691f, 8.7552f, 2.0f, 7.8159f, 2.0f, 6.7917f)
                verticalLineTo(3.749f)
                curveTo(2.0f, 2.7825f, 2.7835f, 1.999f, 3.75f, 1.999f)
                horizontalLineTo(20.25f)
                close()
                moveTo(12.0f, 13.4804f)
                curveTo(10.067f, 13.4804f, 8.5f, 15.0474f, 8.5f, 16.9804f)
                curveTo(8.5f, 18.9134f, 10.067f, 20.4804f, 12.0f, 20.4804f)
                curveTo(13.933f, 20.4804f, 15.5f, 18.9134f, 15.5f, 16.9804f)
                curveTo(15.5f, 15.0474f, 13.933f, 13.4804f, 12.0f, 13.4804f)
                close()
                moveTo(15.5f, 3.498f)
                horizontalLineTo(8.5f)
                verticalLineTo(10.16f)
                lineTo(11.8843f, 11.9279f)
                curveTo(11.9568f, 11.9658f, 12.0432f, 11.9658f, 12.1157f, 11.9279f)
                lineTo(15.5f, 10.159f)
                verticalLineTo(3.498f)
                close()
                moveTo(7.0f, 3.498f)
                lineTo(3.75f, 3.499f)
                curveTo(3.6119f, 3.499f, 3.5f, 3.6109f, 3.5f, 3.749f)
                verticalLineTo(6.7917f)
                curveTo(3.5f, 7.2573f, 3.7587f, 7.6842f, 4.1713f, 7.8997f)
                lineTo(7.0f, 9.376f)
                verticalLineTo(3.498f)
                close()
                moveTo(20.25f, 3.499f)
                lineTo(17.0f, 3.498f)
                verticalLineTo(9.376f)
                lineTo(19.8287f, 7.8997f)
                curveTo(20.2413f, 7.6842f, 20.5f, 7.2573f, 20.5f, 6.7917f)
                verticalLineTo(3.749f)
                curveTo(20.5f, 3.6109f, 20.3881f, 3.499f, 20.25f, 3.499f)
                close()
            }
        }
        .build()
        return _reward!!
    }

private var _reward: ImageVector? = null
