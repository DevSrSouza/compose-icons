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

public val RegularGroup.Mention: ImageVector
    get() {
        if (_mention != null) {
            return _mention!!
        }
        _mention = Builder(name = "Mention", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                verticalLineTo(13.75f)
                curveTo(22.0f, 15.8211f, 20.3211f, 17.5f, 18.25f, 17.5f)
                curveTo(16.7458f, 17.5f, 15.4485f, 16.6144f, 14.851f, 15.3362f)
                curveTo(14.0329f, 16.3552f, 12.84f, 17.0f, 11.5f, 17.0f)
                curveTo(8.9924f, 17.0f, 7.0f, 14.742f, 7.0f, 12.0f)
                curveTo(7.0f, 9.258f, 8.9924f, 7.0f, 11.5f, 7.0f)
                curveTo(12.659f, 7.0f, 13.7079f, 7.4824f, 14.501f, 8.2719f)
                lineTo(14.5f, 7.75f)
                curveTo(14.5f, 7.3358f, 14.8358f, 7.0f, 15.25f, 7.0f)
                curveTo(15.6297f, 7.0f, 15.9435f, 7.2821f, 15.9932f, 7.6482f)
                lineTo(16.0f, 7.75f)
                verticalLineTo(13.75f)
                curveTo(16.0f, 14.9926f, 17.0074f, 16.0f, 18.25f, 16.0f)
                curveTo(19.4409f, 16.0f, 20.4156f, 15.0748f, 20.4948f, 13.904f)
                lineTo(20.5f, 13.75f)
                verticalLineTo(12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12.0f, 20.5f)
                curveTo(13.033f, 20.5f, 14.0395f, 20.316f, 14.9852f, 19.9612f)
                curveTo(15.373f, 19.8158f, 15.8053f, 20.0122f, 15.9508f, 20.4f)
                curveTo(16.0963f, 20.7878f, 15.8998f, 21.2202f, 15.512f, 21.3657f)
                curveTo(14.3985f, 21.7834f, 13.2136f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.4292f, 2.0f, 21.8479f, 6.3267f, 21.9962f, 11.7201f)
                lineTo(22.0f, 12.0f)
                verticalLineTo(13.75f)
                verticalLineTo(12.0f)
                close()
                moveTo(11.5f, 8.5f)
                curveTo(9.8655f, 8.5f, 8.5f, 10.0476f, 8.5f, 12.0f)
                curveTo(8.5f, 13.9524f, 9.8655f, 15.5f, 11.5f, 15.5f)
                curveTo(13.1345f, 15.5f, 14.5f, 13.9524f, 14.5f, 12.0f)
                curveTo(14.5f, 10.0476f, 13.1345f, 8.5f, 11.5f, 8.5f)
                close()
            }
        }
        .build()
        return _mention!!
    }

private var _mention: ImageVector? = null
