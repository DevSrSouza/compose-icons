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

public val FilledGroup.Pipeline: ImageVector
    get() {
        if (_pipeline != null) {
            return _pipeline!!
        }
        _pipeline = Builder(name = "Pipeline", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                curveTo(2.0f, 4.8954f, 2.8954f, 4.0f, 4.0f, 4.0f)
                curveTo(5.1046f, 4.0f, 6.0f, 4.8954f, 6.0f, 6.0f)
                verticalLineTo(17.0f)
                curveTo(6.0f, 18.1046f, 5.1046f, 19.0f, 4.0f, 19.0f)
                curveTo(2.8954f, 19.0f, 2.0f, 18.1046f, 2.0f, 17.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(18.0f, 6.0f)
                curveTo(18.0f, 4.8954f, 18.8954f, 4.0f, 20.0f, 4.0f)
                curveTo(21.1046f, 4.0f, 22.0f, 4.8954f, 22.0f, 6.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 18.1046f, 21.1046f, 19.0f, 20.0f, 19.0f)
                curveTo(18.8954f, 19.0f, 18.0f, 18.1046f, 18.0f, 17.0f)
                verticalLineTo(6.0f)
                close()
                moveTo(16.5f, 6.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _pipeline!!
    }

private var _pipeline: ImageVector? = null
