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

public val RegularGroup.ArrowRotateCounterclockwise: ImageVector
    get() {
        if (_arrowRotateCounterclockwise != null) {
            return _arrowRotateCounterclockwise!!
        }
        _arrowRotateCounterclockwise = Builder(name = "ArrowRotateCounterclockwise", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                curveTo(3.0f, 15.0777f, 4.5593f, 17.865f, 7.0231f, 19.5009f)
                lineTo(5.25f, 19.5f)
                curveTo(4.8358f, 19.5f, 4.5f, 19.8358f, 4.5f, 20.25f)
                curveTo(4.5f, 20.6297f, 4.7821f, 20.9435f, 5.1482f, 20.9932f)
                lineTo(5.25f, 21.0f)
                horizontalLineTo(9.25f)
                curveTo(9.6297f, 21.0f, 9.9435f, 20.7178f, 9.9931f, 20.3518f)
                lineTo(10.0f, 20.25f)
                verticalLineTo(16.25f)
                curveTo(10.0f, 15.8358f, 9.6642f, 15.5f, 9.25f, 15.5f)
                curveTo(8.8703f, 15.5f, 8.5565f, 15.7822f, 8.5069f, 16.1482f)
                lineTo(8.5f, 16.25f)
                lineTo(8.499f, 18.635f)
                curveTo(6.0759f, 17.3557f, 4.5f, 14.8247f, 4.5f, 12.0f)
                curveTo(4.5f, 7.8579f, 7.8579f, 4.5f, 12.0f, 4.5f)
                curveTo(16.1421f, 4.5f, 19.5f, 7.8579f, 19.5f, 12.0f)
                curveTo(19.5f, 12.4142f, 19.8358f, 12.75f, 20.25f, 12.75f)
                curveTo(20.6642f, 12.75f, 21.0f, 12.4142f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 9.25f)
                curveTo(10.4812f, 9.25f, 9.25f, 10.4812f, 9.25f, 12.0f)
                curveTo(9.25f, 13.5188f, 10.4812f, 14.75f, 12.0f, 14.75f)
                curveTo(13.5188f, 14.75f, 14.75f, 13.5188f, 14.75f, 12.0f)
                curveTo(14.75f, 10.4812f, 13.5188f, 9.25f, 12.0f, 9.25f)
                close()
                moveTo(12.0f, 10.75f)
                curveTo(12.6904f, 10.75f, 13.25f, 11.3096f, 13.25f, 12.0f)
                curveTo(13.25f, 12.6904f, 12.6904f, 13.25f, 12.0f, 13.25f)
                curveTo(11.3096f, 13.25f, 10.75f, 12.6904f, 10.75f, 12.0f)
                curveTo(10.75f, 11.3096f, 11.3096f, 10.75f, 12.0f, 10.75f)
                close()
            }
        }
        .build()
        return _arrowRotateCounterclockwise!!
    }

private var _arrowRotateCounterclockwise: ImageVector? = null
