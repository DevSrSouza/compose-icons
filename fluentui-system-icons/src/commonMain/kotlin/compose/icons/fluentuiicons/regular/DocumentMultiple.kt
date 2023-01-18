package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.DocumentMultiple: ImageVector
    get() {
        if (_documentMultiple != null) {
            return _documentMultiple!!
        }
        _documentMultiple = Builder(name = "DocumentMultiple", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(10.6312f)
                curveTo(11.2279f, 2.0f, 11.8002f, 2.2371f, 12.2221f, 2.659f)
                lineTo(16.841f, 7.2779f)
                curveTo(17.2629f, 7.6998f, 17.5f, 8.2721f, 17.5f, 8.8688f)
                verticalLineTo(17.25f)
                curveTo(17.5f, 18.4926f, 16.4926f, 19.5f, 15.25f, 19.5f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 19.5f, 4.0f, 18.4926f, 4.0f, 17.25f)
                verticalLineTo(4.25f)
                close()
                moveTo(6.25f, 3.5f)
                curveTo(5.8358f, 3.5f, 5.5f, 3.8358f, 5.5f, 4.25f)
                verticalLineTo(17.25f)
                curveTo(5.5f, 17.6642f, 5.8358f, 18.0f, 6.25f, 18.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 18.0f, 16.0f, 17.6642f, 16.0f, 17.25f)
                verticalLineTo(8.9975f)
                horizontalLineTo(12.7539f)
                curveTo(11.5113f, 8.9975f, 10.5039f, 7.9902f, 10.5039f, 6.7475f)
                verticalLineTo(3.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(12.0039f, 4.5621f)
                verticalLineTo(6.7475f)
                curveTo(12.0039f, 7.1617f, 12.3397f, 7.4975f, 12.7539f, 7.4975f)
                horizontalLineTo(14.9393f)
                lineTo(12.0039f, 4.5621f)
                close()
            }
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.6289f, 20.5f)
                curveTo(6.9378f, 21.3739f, 7.7712f, 22.0f, 8.7509f, 22.0f)
                horizontalLineTo(15.2509f)
                curveTo(17.8742f, 22.0f, 20.0009f, 19.8734f, 20.0009f, 17.25f)
                verticalLineTo(11.3689f)
                curveTo(20.0009f, 10.7721f, 19.7638f, 10.1998f, 19.3419f, 9.7779f)
                lineTo(18.5009f, 8.9369f)
                verticalLineTo(17.25f)
                curveTo(18.5009f, 19.0449f, 17.0458f, 20.5f, 15.2509f, 20.5f)
                horizontalLineTo(6.6289f)
                close()
            }
        }
        .build()
        return _documentMultiple!!
    }

private var _documentMultiple: ImageVector? = null
