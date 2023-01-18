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

public val RegularGroup.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = Builder(name = "RotateLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0151f, 5.0f)
                curveTo(15.0986f, 5.0002f, 15.1818f, 5.0018f, 15.2645f, 5.0048f)
                curveTo(15.2703f, 5.005f, 15.2761f, 5.0052f, 15.2819f, 5.0054f)
                curveTo(16.4423f, 5.0501f, 17.5167f, 5.3696f, 18.4135f, 5.8875f)
                curveTo(19.9764f, 6.7901f, 21.0f, 8.2954f, 21.0f, 10.0f)
                curveTo(21.0f, 11.7078f, 19.9725f, 13.2157f, 18.4045f, 14.1177f)
                curveTo(17.4372f, 14.6741f, 16.2643f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(14.5f)
                curveTo(14.1806f, 15.0f, 13.9079f, 14.8004f, 13.7997f, 14.5192f)
                curveTo(13.7676f, 14.4357f, 13.75f, 14.3449f, 13.75f, 14.25f)
                curveTo(13.75f, 13.8358f, 14.0858f, 13.5f, 14.5f, 13.5f)
                horizontalLineTo(15.0f)
                curveTo(15.9633f, 13.5f, 16.856f, 13.2646f, 17.588f, 12.8636f)
                curveTo(18.7444f, 12.2302f, 19.5f, 11.1837f, 19.5f, 10.0f)
                curveTo(19.5f, 8.8163f, 18.7444f, 7.7698f, 17.588f, 7.1364f)
                curveTo(16.9132f, 6.7668f, 16.1019f, 6.5378f, 15.2246f, 6.5043f)
                lineTo(15.0f, 6.5f)
                horizontalLineTo(8.061f)
                lineTo(9.7813f, 8.2206f)
                curveTo(10.0732f, 8.5136f, 10.0729f, 8.9878f, 9.7803f, 9.2803f)
                curveTo(9.514f, 9.5466f, 9.0974f, 9.5708f, 8.8038f, 9.353f)
                lineTo(8.7196f, 9.2803f)
                lineTo(8.7188f, 9.2795f)
                lineTo(5.7196f, 6.2803f)
                curveTo(5.7136f, 6.2743f, 5.7077f, 6.2682f, 5.702f, 6.2621f)
                curveTo(5.4384f, 5.9803f, 5.4328f, 5.5449f, 5.6851f, 5.2566f)
                curveTo(5.6961f, 5.244f, 5.7076f, 5.2317f, 5.7196f, 5.2197f)
                lineTo(8.7187f, 2.2206f)
                lineTo(8.7196f, 2.2197f)
                lineTo(8.8038f, 2.147f)
                curveTo(9.0974f, 1.9292f, 9.514f, 1.9534f, 9.7803f, 2.2197f)
                curveTo(10.0729f, 2.5122f, 10.0732f, 2.9864f, 9.7813f, 3.2794f)
                lineTo(8.062f, 5.0f)
                horizontalLineTo(15.0f)
                curveTo(15.005f, 5.0f, 15.01f, 5.0f, 15.0151f, 5.0f)
                close()
                moveTo(20.389f, 20.0673f)
                curveTo(20.6279f, 20.2056f, 20.7095f, 20.5115f, 20.5711f, 20.7505f)
                curveTo(20.4818f, 20.9049f, 20.3169f, 21.0f, 20.1384f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4477f, 21.0f, 3.0f, 20.5523f, 3.0f, 20.0f)
                verticalLineTo(10.8672f)
                curveTo(3.0f, 10.5911f, 3.2239f, 10.3672f, 3.5f, 10.3672f)
                curveTo(3.588f, 10.3672f, 3.6744f, 10.3904f, 3.7505f, 10.4345f)
                lineTo(20.389f, 20.0673f)
                close()
                moveTo(16.4153f, 19.5f)
                lineTo(4.5f, 12.6017f)
                verticalLineTo(19.5f)
                horizontalLineTo(16.4153f)
                close()
            }
        }
        .build()
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
