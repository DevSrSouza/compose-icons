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

public val RegularGroup.DocumentLandscape: ImageVector
    get() {
        if (_documentLandscape != null) {
            return _documentLandscape!!
        }
        _documentLandscape = Builder(name = "DocumentLandscape", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.5f)
                curveTo(3.725f, 5.5f, 3.5f, 5.724f, 3.5f, 6.0f)
                lineTo(3.5f, 18.0f)
                curveTo(3.5f, 18.276f, 3.725f, 18.5f, 4.0f, 18.5f)
                horizontalLineTo(20.0f)
                curveTo(20.275f, 18.5f, 20.5f, 18.276f, 20.5f, 18.0f)
                verticalLineTo(12.0f)
                lineTo(16.0f, 12.0f)
                curveTo(14.896f, 12.0f, 14.0f, 11.104f, 14.0f, 10.0f)
                verticalLineTo(5.5f)
                lineTo(4.0f, 5.5f)
                close()
                moveTo(19.379f, 10.5f)
                lineTo(15.5f, 6.622f)
                verticalLineTo(10.0f)
                curveTo(15.5f, 10.276f, 15.725f, 10.5f, 16.0f, 10.5f)
                horizontalLineTo(19.379f)
                close()
                moveTo(15.586f, 4.586f)
                lineTo(21.414f, 10.415f)
                curveTo(21.44f, 10.441f, 21.46f, 10.473f, 21.484f, 10.5f)
                curveTo(21.548f, 10.571f, 21.611f, 10.641f, 21.664f, 10.719f)
                curveTo(21.691f, 10.759f, 21.709f, 10.805f, 21.732f, 10.847f)
                curveTo(21.772f, 10.918f, 21.816f, 10.988f, 21.848f, 11.063f)
                curveTo(21.93f, 11.26f, 21.971f, 11.472f, 21.986f, 11.687f)
                curveTo(21.989f, 11.734f, 22.0f, 11.78f, 22.0f, 11.828f)
                verticalLineTo(18.0f)
                curveTo(22.0f, 19.104f, 21.104f, 20.0f, 20.0f, 20.0f)
                horizontalLineTo(4.0f)
                curveTo(2.896f, 20.0f, 2.0f, 19.104f, 2.0f, 18.0f)
                lineTo(2.0f, 6.0f)
                curveTo(2.0f, 4.896f, 2.896f, 4.0f, 4.0f, 4.0f)
                lineTo(14.172f, 4.0f)
                curveTo(14.702f, 4.0f, 15.211f, 4.211f, 15.586f, 4.586f)
                close()
            }
        }
        .build()
        return _documentLandscape!!
    }

private var _documentLandscape: ImageVector? = null
