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

public val FilledGroup.ShapeSubtract: ImageVector
    get() {
        if (_shapeSubtract != null) {
            return _shapeSubtract!!
        }
        _shapeSubtract = Builder(name = "ShapeSubtract", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.9048f)
                curveTo(2.3837f, 3.4962f, 2.0f, 4.3283f, 2.0f, 5.25f)
                verticalLineTo(13.25f)
                curveTo(2.0f, 13.3502f, 2.0045f, 13.4494f, 2.0134f, 13.5474f)
                curveTo(2.06f, 14.0608f, 2.226f, 14.5397f, 2.4833f, 14.9561f)
                curveTo(2.5065f, 14.9936f, 2.5304f, 15.0306f, 2.555f, 15.0671f)
                curveTo(3.1391f, 15.9316f, 4.1282f, 16.5f, 5.25f, 16.5f)
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
                curveTo(4.3767f, 2.0f, 3.584f, 2.3444f, 3.0f, 2.9048f)
                close()
                moveTo(9.0f, 10.75f)
                curveTo(9.0f, 9.7835f, 9.7835f, 9.0f, 10.75f, 9.0f)
                horizontalLineTo(18.75f)
                curveTo(19.7165f, 9.0f, 20.5f, 9.7835f, 20.5f, 10.75f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.7165f, 19.7165f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(10.75f)
                curveTo(9.7835f, 20.5f, 9.0f, 19.7165f, 9.0f, 18.75f)
                verticalLineTo(10.75f)
                close()
            }
        }
        .build()
        return _shapeSubtract!!
    }

private var _shapeSubtract: ImageVector? = null
