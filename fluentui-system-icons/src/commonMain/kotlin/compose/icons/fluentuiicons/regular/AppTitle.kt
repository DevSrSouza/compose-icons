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

public val RegularGroup.AppTitle: ImageVector
    get() {
        if (_appTitle != null) {
            return _appTitle!!
        }
        _appTitle = Builder(name = "AppTitle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 20.5f)
                horizontalLineTo(19.25f)
                curveTo(19.6642f, 20.5f, 20.0f, 20.8358f, 20.0f, 21.25f)
                curveTo(20.0f, 21.6297f, 19.7178f, 21.9435f, 19.3518f, 21.9932f)
                lineTo(19.25f, 22.0f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 22.0f, 4.0f, 21.6642f, 4.0f, 21.25f)
                curveTo(4.0f, 20.8703f, 4.2821f, 20.5565f, 4.6482f, 20.5068f)
                lineTo(4.75f, 20.5f)
                horizontalLineTo(19.25f)
                horizontalLineTo(4.75f)
                close()
                moveTo(16.25f, 3.0f)
                curveTo(18.3211f, 3.0f, 20.0f, 4.6789f, 20.0f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(20.0f, 17.3211f, 18.3211f, 19.0f, 16.25f, 19.0f)
                horizontalLineTo(7.75f)
                curveTo(5.6789f, 19.0f, 4.0f, 17.3211f, 4.0f, 15.25f)
                verticalLineTo(6.75f)
                curveTo(4.0f, 4.6789f, 5.6789f, 3.0f, 7.75f, 3.0f)
                horizontalLineTo(16.25f)
                close()
                moveTo(16.25f, 4.5f)
                horizontalLineTo(7.75f)
                curveTo(6.5074f, 4.5f, 5.5f, 5.5074f, 5.5f, 6.75f)
                verticalLineTo(15.25f)
                curveTo(5.5f, 16.4926f, 6.5074f, 17.5f, 7.75f, 17.5f)
                horizontalLineTo(16.25f)
                curveTo(17.4926f, 17.5f, 18.5f, 16.4926f, 18.5f, 15.25f)
                verticalLineTo(6.75f)
                curveTo(18.5f, 5.5074f, 17.4926f, 4.5f, 16.25f, 4.5f)
                close()
            }
        }
        .build()
        return _appTitle!!
    }

private var _appTitle: ImageVector? = null
