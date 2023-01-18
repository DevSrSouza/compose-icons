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

public val RegularGroup.ArrowRedo: ImageVector
    get() {
        if (_arrowRedo != null) {
            return _arrowRedo!!
        }
        _arrowRedo = Builder(name = "ArrowRedo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.2501f, 2.0f)
                curveTo(18.8704f, 2.0f, 18.5566f, 2.2822f, 18.507f, 2.6482f)
                lineTo(18.5001f, 2.75f)
                verticalLineTo(8.44f)
                lineTo(13.9258f, 3.8801f)
                curveTo(11.4838f, 1.4382f, 7.5616f, 1.3786f, 5.0475f, 3.7015f)
                lineTo(4.8616f, 3.8801f)
                curveTo(2.3586f, 6.3831f, 2.3586f, 10.4413f, 4.8616f, 12.9443f)
                lineTo(13.7068f, 21.7835f)
                curveTo(13.9998f, 22.0762f, 14.4745f, 22.0759f, 14.7674f, 21.783f)
                curveTo(15.0603f, 21.4901f, 15.06f, 21.0151f, 14.767f, 20.7223f)
                lineTo(5.9223f, 11.8836f)
                curveTo(4.0051f, 9.9664f, 4.0051f, 6.858f, 5.9223f, 4.9408f)
                curveTo(7.7814f, 3.0817f, 10.7606f, 3.0254f, 12.6883f, 4.7725f)
                lineTo(12.8659f, 4.9416f)
                lineTo(17.4381f, 9.5f)
                lineTo(11.7501f, 9.5002f)
                curveTo(11.3704f, 9.5002f, 11.0566f, 9.7823f, 11.007f, 10.1484f)
                lineTo(11.0001f, 10.2502f)
                curveTo(11.0001f, 10.6299f, 11.2823f, 10.9437f, 11.6483f, 10.9933f)
                lineTo(11.7501f, 11.0002f)
                horizontalLineTo(19.2501f)
                curveTo(19.6298f, 11.0002f, 19.9436f, 10.718f, 19.9933f, 10.352f)
                lineTo(20.0001f, 10.2502f)
                verticalLineTo(2.75f)
                curveTo(20.0001f, 2.3358f, 19.6643f, 2.0f, 19.2501f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowRedo!!
    }

private var _arrowRedo: ImageVector? = null
