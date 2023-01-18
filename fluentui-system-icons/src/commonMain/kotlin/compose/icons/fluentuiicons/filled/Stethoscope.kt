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

public val FilledGroup.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.5f)
                curveTo(2.4477f, 2.5f, 2.0f, 2.9477f, 2.0f, 3.5f)
                lineTo(2.0f, 9.0001f)
                curveTo(2.0f, 10.7413f, 2.6144f, 12.2564f, 3.7106f, 13.3371f)
                curveTo(4.5831f, 14.1972f, 5.7209f, 14.743f, 7.0f, 14.9288f)
                verticalLineTo(15.7501f)
                curveTo(7.0f, 19.2019f, 9.7982f, 22.0001f, 13.25f, 22.0001f)
                curveTo(16.7018f, 22.0001f, 19.5f, 19.2019f, 19.5f, 15.7501f)
                verticalLineTo(15.0934f)
                curveTo(20.8056f, 14.6716f, 21.75f, 13.4461f, 21.75f, 12.0001f)
                curveTo(21.75f, 10.2052f, 20.2949f, 8.7501f, 18.5f, 8.7501f)
                curveTo(16.7051f, 8.7501f, 15.25f, 10.2052f, 15.25f, 12.0001f)
                curveTo(15.25f, 13.4461f, 16.1944f, 14.6716f, 17.5f, 15.0934f)
                verticalLineTo(15.7501f)
                curveTo(17.5f, 18.0974f, 15.5972f, 20.0001f, 13.25f, 20.0001f)
                curveTo(10.9028f, 20.0001f, 9.0f, 18.0974f, 9.0f, 15.7501f)
                verticalLineTo(14.9288f)
                curveTo(10.2791f, 14.743f, 11.4169f, 14.1972f, 12.2894f, 13.3371f)
                curveTo(13.3856f, 12.2564f, 14.0f, 10.7413f, 14.0f, 9.0001f)
                verticalLineTo(3.5f)
                curveTo(14.0f, 2.9477f, 13.5523f, 2.5f, 13.0f, 2.5f)
                horizontalLineTo(11.0023f)
                curveTo(10.45f, 2.5f, 10.0023f, 2.9477f, 10.0023f, 3.5f)
                curveTo(10.0023f, 4.0523f, 10.45f, 4.5f, 11.0023f, 4.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(9.0001f)
                curveTo(12.0f, 10.2588f, 11.5642f, 11.2436f, 10.8853f, 11.9129f)
                curveTo(10.2042f, 12.5843f, 9.2156f, 13.0f, 8.0f, 13.0f)
                curveTo(6.7845f, 13.0f, 5.7958f, 12.5843f, 5.1147f, 11.9129f)
                curveTo(4.4358f, 11.2436f, 4.0f, 10.2588f, 4.0f, 9.0001f)
                lineTo(4.0f, 4.5f)
                horizontalLineTo(5.0f)
                curveTo(5.5523f, 4.5f, 6.0f, 4.0523f, 6.0f, 3.5f)
                curveTo(6.0f, 2.9477f, 5.5523f, 2.5f, 5.0f, 2.5f)
                horizontalLineTo(3.0f)
                close()
                moveTo(18.5f, 10.7501f)
                curveTo(19.1904f, 10.7501f, 19.75f, 11.3098f, 19.75f, 12.0001f)
                curveTo(19.75f, 12.6905f, 19.1904f, 13.2501f, 18.5f, 13.2501f)
                curveTo(17.8096f, 13.2501f, 17.25f, 12.6905f, 17.25f, 12.0001f)
                curveTo(17.25f, 11.3098f, 17.8096f, 10.7501f, 18.5f, 10.7501f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
