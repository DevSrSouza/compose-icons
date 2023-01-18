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

public val RegularGroup.ArrowRotateClockwise: ImageVector
    get() {
        if (_arrowRotateClockwise != null) {
            return _arrowRotateClockwise!!
        }
        _arrowRotateClockwise = Builder(name = "ArrowRotateClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 15.0777f, 19.4407f, 17.865f, 16.9769f, 19.5009f)
                lineTo(18.75f, 19.5f)
                curveTo(19.1642f, 19.5f, 19.5f, 19.8358f, 19.5f, 20.25f)
                curveTo(19.5f, 20.6297f, 19.2178f, 20.9435f, 18.8518f, 20.9932f)
                lineTo(18.75f, 21.0f)
                horizontalLineTo(14.75f)
                curveTo(14.3703f, 21.0f, 14.0565f, 20.7178f, 14.0068f, 20.3518f)
                lineTo(14.0f, 20.25f)
                verticalLineTo(16.25f)
                curveTo(14.0f, 15.8358f, 14.3358f, 15.5f, 14.75f, 15.5f)
                curveTo(15.1297f, 15.5f, 15.4435f, 15.7822f, 15.4932f, 16.1482f)
                lineTo(15.5f, 16.25f)
                lineTo(15.501f, 18.635f)
                curveTo(17.9241f, 17.3557f, 19.5f, 14.8247f, 19.5f, 12.0f)
                curveTo(19.5f, 7.8579f, 16.1421f, 4.5f, 12.0f, 4.5f)
                curveTo(7.8579f, 4.5f, 4.5f, 7.8579f, 4.5f, 12.0f)
                curveTo(4.5f, 12.4142f, 4.1642f, 12.75f, 3.75f, 12.75f)
                curveTo(3.3358f, 12.75f, 3.0f, 12.4142f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 9.25f)
                curveTo(13.5188f, 9.25f, 14.75f, 10.4812f, 14.75f, 12.0f)
                curveTo(14.75f, 13.5188f, 13.5188f, 14.75f, 12.0f, 14.75f)
                curveTo(10.4812f, 14.75f, 9.25f, 13.5188f, 9.25f, 12.0f)
                curveTo(9.25f, 10.4812f, 10.4812f, 9.25f, 12.0f, 9.25f)
                close()
                moveTo(12.0f, 10.75f)
                curveTo(11.3096f, 10.75f, 10.75f, 11.3096f, 10.75f, 12.0f)
                curveTo(10.75f, 12.6904f, 11.3096f, 13.25f, 12.0f, 13.25f)
                curveTo(12.6904f, 13.25f, 13.25f, 12.6904f, 13.25f, 12.0f)
                curveTo(13.25f, 11.3096f, 12.6904f, 10.75f, 12.0f, 10.75f)
                close()
            }
        }
        .build()
        return _arrowRotateClockwise!!
    }

private var _arrowRotateClockwise: ImageVector? = null
