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

public val FilledGroup.ArrowImport: ImageVector
    get() {
        if (_arrowImport != null) {
            return _arrowImport!!
        }
        _arrowImport = Builder(name = "ArrowImport", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.25f, 4.5f)
                curveTo(21.6297f, 4.5f, 21.9435f, 4.7821f, 21.9932f, 5.1482f)
                lineTo(22.0f, 5.25f)
                verticalLineTo(18.75f)
                curveTo(22.0f, 19.1642f, 21.6642f, 19.5f, 21.25f, 19.5f)
                curveTo(20.8703f, 19.5f, 20.5565f, 19.2178f, 20.5069f, 18.8518f)
                lineTo(20.5f, 18.75f)
                verticalLineTo(5.25f)
                curveTo(20.5f, 4.8358f, 20.8358f, 4.5f, 21.25f, 4.5f)
                close()
                moveTo(12.2098f, 6.387f)
                lineTo(12.293f, 6.2928f)
                curveTo(12.6535f, 5.9324f, 13.2207f, 5.9047f, 13.613f, 6.2098f)
                lineTo(13.7072f, 6.293f)
                lineTo(18.7038f, 11.2906f)
                curveTo(19.064f, 11.6509f, 19.0919f, 12.2178f, 18.7873f, 12.6101f)
                lineTo(18.7042f, 12.7043f)
                lineTo(13.7076f, 17.7077f)
                curveTo(13.3173f, 18.0985f, 12.6842f, 18.0989f, 12.2934f, 17.7087f)
                curveTo(11.9327f, 17.3484f, 11.9045f, 16.7812f, 12.2093f, 16.3887f)
                lineTo(12.2924f, 16.2945f)
                lineTo(15.581f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4872f, 13.0f, 2.0645f, 12.614f, 2.0067f, 12.1166f)
                lineTo(2.0f, 12.0f)
                curveTo(2.0f, 11.4872f, 2.386f, 11.0645f, 2.8834f, 11.0067f)
                lineTo(3.0f, 11.0f)
                horizontalLineTo(15.584f)
                lineTo(12.2928f, 7.707f)
                curveTo(11.9324f, 7.3465f, 11.9047f, 6.7793f, 12.2098f, 6.387f)
                lineTo(12.293f, 6.2928f)
                lineTo(12.2098f, 6.387f)
                close()
            }
        }
        .build()
        return _arrowImport!!
    }

private var _arrowImport: ImageVector? = null
