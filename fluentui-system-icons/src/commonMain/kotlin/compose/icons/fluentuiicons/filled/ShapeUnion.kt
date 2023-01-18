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

public val FilledGroup.ShapeUnion: ImageVector
    get() {
        if (_shapeUnion != null) {
            return _shapeUnion!!
        }
        _shapeUnion = Builder(name = "ShapeUnion", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.25f, 2.0f)
                curveTo(3.4551f, 2.0f, 2.0f, 3.4551f, 2.0f, 5.25f)
                verticalLineTo(13.25f)
                curveTo(2.0f, 15.0449f, 3.4551f, 16.5f, 5.25f, 16.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(18.75f)
                curveTo(7.5f, 20.5449f, 8.9551f, 22.0f, 10.75f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 22.0f, 22.0f, 20.5449f, 22.0f, 18.75f)
                verticalLineTo(10.75f)
                curveTo(22.0f, 8.9551f, 20.5449f, 7.5f, 18.75f, 7.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(5.25f)
                curveTo(16.5f, 3.4551f, 15.0449f, 2.0f, 13.25f, 2.0f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _shapeUnion!!
    }

private var _shapeUnion: ImageVector? = null
