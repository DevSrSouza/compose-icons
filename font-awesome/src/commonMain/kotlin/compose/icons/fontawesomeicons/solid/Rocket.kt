package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(505.12f, 19.094f)
                curveToRelative(-1.189f, -5.531f, -6.658f, -11.0f, -12.207f, -12.188f)
                curveTo(460.716f, 0.0f, 435.507f, 0.0f, 410.407f, 0.0f)
                curveTo(307.175f, 0.0f, 245.269f, 55.203f, 199.052f, 128.0f)
                horizontalLineTo(94.838f)
                curveToRelative(-16.348f, 0.016f, -35.557f, 11.875f, -42.887f, 26.484f)
                lineTo(2.516f, 253.297f)
                arcTo(28.4f, 28.4f, 0.0f, false, false, 0.0f, 264.0f)
                arcToRelative(24.009f, 24.009f, 0.0f, false, false, 24.006f, 24.0f)
                horizontalLineTo(127.816f)
                lineToRelative(-22.475f, 22.469f)
                curveToRelative(-11.365f, 11.361f, -12.996f, 32.258f, 0.0f, 45.25f)
                lineTo(156.246f, 406.625f)
                curveToRelative(11.156f, 11.188f, 32.156f, 13.156f, 45.277f, 0.0f)
                lineToRelative(22.475f, -22.469f)
                verticalLineTo(488.0f)
                arcToRelative(24.009f, 24.009f, 0.0f, false, false, 24.006f, 24.0f)
                arcToRelative(28.559f, 28.559f, 0.0f, false, false, 10.707f, -2.516f)
                lineToRelative(98.728f, -49.391f)
                curveToRelative(14.629f, -7.297f, 26.508f, -26.5f, 26.508f, -42.859f)
                verticalLineTo(312.797f)
                curveToRelative(72.598f, -46.313f, 128.035f, -108.406f, 128.035f, -211.094f)
                curveTo(512.075f, 76.5f, 512.075f, 51.297f, 505.12f, 19.094f)
                close()
                moveTo(384.04f, 168.0f)
                arcTo(40.0f, 40.0f, 0.0f, true, true, 424.05f, 128.0f)
                arcTo(40.023f, 40.023f, 0.0f, false, true, 384.04f, 168.0f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
