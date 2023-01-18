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

public val RegularGroup.AlertBadge: ImageVector
    get() {
        if (_alertBadge != null) {
            return _alertBadge!!
        }
        _alertBadge = Builder(name = "AlertBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9876f, 1.9962f)
                curveTo(13.4351f, 1.9962f, 14.7878f, 2.4031f, 15.9353f, 3.1107f)
                curveTo(15.5934f, 3.476f, 15.329f, 3.9144f, 15.1682f, 4.4f)
                curveTo(14.2457f, 3.8263f, 13.1554f, 3.4958f, 11.9876f, 3.4958f)
                curveTo(8.663f, 3.4958f, 5.98f, 6.1693f, 5.9795f, 9.4942f)
                verticalLineTo(13.9026f)
                lineTo(4.6337f, 16.9959f)
                horizontalLineTo(19.3502f)
                lineTo(17.9958f, 13.9036f)
                lineTo(17.9959f, 9.507f)
                lineTo(17.9921f, 9.2819f)
                curveTo(17.9884f, 9.1736f, 17.9818f, 9.066f, 17.9725f, 8.9592f)
                curveTo(18.1435f, 8.9848f, 18.3185f, 8.9981f, 18.4966f, 8.9981f)
                curveTo(18.8347f, 8.9981f, 19.1616f, 8.9503f, 19.4709f, 8.8611f)
                curveTo(19.4816f, 8.9876f, 19.4892f, 9.115f, 19.4936f, 9.2433f)
                lineTo(19.4978f, 9.4942f)
                verticalLineTo(13.5901f)
                lineTo(20.8797f, 16.7452f)
                curveTo(20.9489f, 16.9031f, 20.9846f, 17.0736f, 20.9846f, 17.2459f)
                curveTo(20.9846f, 17.936f, 20.4241f, 18.4955f, 19.7329f, 18.4955f)
                lineTo(14.9917f, 18.497f)
                curveTo(14.9917f, 20.1534f, 13.6467f, 21.4962f, 11.9876f, 21.4962f)
                curveTo(10.3878f, 21.4962f, 9.08f, 20.2476f, 8.9887f, 18.6733f)
                lineTo(8.9831f, 18.4948f)
                lineTo(4.252f, 18.4955f)
                curveTo(4.0804f, 18.4955f, 3.9107f, 18.4603f, 3.7533f, 18.3921f)
                curveTo(3.1193f, 18.1171f, 2.8285f, 17.381f, 3.1039f, 16.748f)
                lineTo(4.4775f, 13.591f)
                verticalLineTo(9.4941f)
                curveTo(4.4781f, 5.3404f, 7.8341f, 1.9962f, 11.9876f, 1.9962f)
                close()
                moveTo(13.4892f, 18.4948f)
                lineTo(10.4856f, 18.497f)
                curveTo(10.4856f, 19.3252f, 11.1581f, 19.9966f, 11.9876f, 19.9966f)
                curveTo(12.7684f, 19.9966f, 13.41f, 19.4019f, 13.4828f, 18.6414f)
                lineTo(13.4892f, 18.4948f)
                close()
                moveTo(16.033f, 5.0528f)
                curveTo(16.1282f, 4.5256f, 16.3889f, 4.056f, 16.7595f, 3.6993f)
                curveTo(17.2097f, 3.2661f, 17.822f, 2.9997f, 18.4966f, 2.9997f)
                curveTo(19.8792f, 2.9997f, 21.0f, 4.1187f, 21.0f, 5.4991f)
                curveTo(21.0f, 6.5919f, 20.2974f, 7.521f, 19.3185f, 7.8605f)
                curveTo(19.0611f, 7.9499f, 18.7845f, 7.9984f, 18.4966f, 7.9984f)
                curveTo(18.2482f, 7.9984f, 18.0083f, 7.9623f, 17.7818f, 7.895f)
                curveTo(16.7475f, 7.5879f, 15.9932f, 6.6314f, 15.9932f, 5.4991f)
                curveTo(15.9932f, 5.3467f, 16.0069f, 5.1976f, 16.033f, 5.0528f)
                close()
            }
        }
        .build()
        return _alertBadge!!
    }

private var _alertBadge: ImageVector? = null
