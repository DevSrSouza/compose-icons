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

public val FilledGroup.BookTheta: ImageVector
    get() {
        if (_bookTheta != null) {
            return _bookTheta!!
        }
        _bookTheta = Builder(name = "BookTheta", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1153f, 14.0068f)
                curveTo(14.4873f, 13.4954f, 14.7811f, 12.8058f, 14.9173f, 12.0f)
                horizontalLineTo(10.0827f)
                curveTo(10.2189f, 12.8058f, 10.5127f, 13.4954f, 10.8847f, 14.0068f)
                curveTo(11.4039f, 14.7207f, 11.9936f, 15.0f, 12.5f, 15.0f)
                curveTo(13.0064f, 15.0f, 13.5961f, 14.7207f, 14.1153f, 14.0068f)
                close()
                moveTo(14.1153f, 7.9932f)
                curveTo(14.5621f, 8.6075f, 14.8962f, 9.479f, 14.9797f, 10.5f)
                horizontalLineTo(10.0203f)
                curveTo(10.1038f, 9.479f, 10.4379f, 8.6075f, 10.8847f, 7.9932f)
                curveTo(11.4039f, 7.2793f, 11.9936f, 7.0f, 12.5f, 7.0f)
                curveTo(13.0064f, 7.0f, 13.5961f, 7.2793f, 14.1153f, 7.9932f)
                close()
                moveTo(4.0f, 4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.3807f, 2.0f, 20.5f, 3.1193f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(12.5f, 16.5f)
                curveTo(14.7091f, 16.5f, 16.5f, 14.0376f, 16.5f, 11.0f)
                curveTo(16.5f, 7.9624f, 14.7091f, 5.5f, 12.5f, 5.5f)
                curveTo(10.2909f, 5.5f, 8.5f, 7.9624f, 8.5f, 11.0f)
                curveTo(8.5f, 14.0376f, 10.2909f, 16.5f, 12.5f, 16.5f)
                close()
            }
        }
        .build()
        return _bookTheta!!
    }

private var _bookTheta: ImageVector? = null
