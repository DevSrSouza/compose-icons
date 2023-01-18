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

public val RegularGroup.ArrowUndo: ImageVector
    get() {
        if (_arrowUndo != null) {
            return _arrowUndo!!
        }
        _arrowUndo = Builder(name = "ArrowUndo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 2.0f)
                curveTo(5.1297f, 2.0f, 5.4435f, 2.2822f, 5.4932f, 2.6482f)
                lineTo(5.5f, 2.75f)
                verticalLineTo(8.44f)
                lineTo(10.0743f, 3.8801f)
                curveTo(12.5163f, 1.4382f, 16.4385f, 1.3786f, 18.9526f, 3.7015f)
                lineTo(19.1385f, 3.8801f)
                curveTo(21.6415f, 6.3831f, 21.6415f, 10.4413f, 19.1385f, 12.9443f)
                lineTo(10.2933f, 21.7835f)
                curveTo(10.0003f, 22.0762f, 9.5256f, 22.0759f, 9.2327f, 21.783f)
                curveTo(8.9398f, 21.4901f, 8.9401f, 21.0151f, 9.2331f, 20.7223f)
                lineTo(18.0778f, 11.8836f)
                curveTo(19.995f, 9.9664f, 19.995f, 6.858f, 18.0778f, 4.9408f)
                curveTo(16.2187f, 3.0817f, 13.2395f, 3.0254f, 11.3118f, 4.7725f)
                lineTo(11.1342f, 4.9416f)
                lineTo(6.562f, 9.5f)
                lineTo(12.25f, 9.5002f)
                curveTo(12.6297f, 9.5002f, 12.9435f, 9.7823f, 12.9932f, 10.1484f)
                lineTo(13.0f, 10.2502f)
                curveTo(13.0f, 10.6299f, 12.7178f, 10.9437f, 12.3518f, 10.9933f)
                lineTo(12.25f, 11.0002f)
                horizontalLineTo(4.75f)
                curveTo(4.3703f, 11.0002f, 4.0565f, 10.718f, 4.0068f, 10.352f)
                lineTo(4.0f, 10.2502f)
                verticalLineTo(2.75f)
                curveTo(4.0f, 2.3358f, 4.3358f, 2.0f, 4.75f, 2.0f)
                close()
            }
        }
        .build()
        return _arrowUndo!!
    }

private var _arrowUndo: ImageVector? = null
