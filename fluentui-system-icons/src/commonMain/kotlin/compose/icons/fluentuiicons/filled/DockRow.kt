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

public val FilledGroup.DockRow: ImageVector
    get() {
        if (_dockRow != null) {
            return _dockRow!!
        }
        _dockRow = Builder(name = "DockRow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 12.0293f)
                curveTo(21.2165f, 12.0293f, 22.0f, 12.8128f, 22.0f, 13.7793f)
                verticalLineTo(16.2793f)
                curveTo(22.0f, 17.2458f, 21.2165f, 18.0293f, 20.25f, 18.0293f)
                horizontalLineTo(17.75f)
                curveTo(16.7835f, 18.0293f, 16.0f, 17.2458f, 16.0f, 16.2793f)
                verticalLineTo(13.7793f)
                curveTo(16.0f, 12.8128f, 16.7835f, 12.0293f, 17.75f, 12.0293f)
                horizontalLineTo(20.25f)
                close()
                moveTo(6.25f, 12.0293f)
                curveTo(7.2165f, 12.0293f, 8.0f, 12.8128f, 8.0f, 13.7793f)
                verticalLineTo(16.2793f)
                curveTo(8.0f, 17.2458f, 7.2165f, 18.0293f, 6.25f, 18.0293f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 18.0293f, 2.0f, 17.2458f, 2.0f, 16.2793f)
                verticalLineTo(13.7793f)
                curveTo(2.0f, 12.8128f, 2.7835f, 12.0293f, 3.75f, 12.0293f)
                horizontalLineTo(6.25f)
                close()
                moveTo(13.25f, 12.0293f)
                curveTo(14.2165f, 12.0293f, 15.0f, 12.8128f, 15.0f, 13.7793f)
                verticalLineTo(16.2793f)
                curveTo(15.0f, 17.2458f, 14.2165f, 18.0293f, 13.25f, 18.0293f)
                horizontalLineTo(10.75f)
                curveTo(9.7835f, 18.0293f, 9.0f, 17.2458f, 9.0f, 16.2793f)
                verticalLineTo(13.7793f)
                curveTo(9.0f, 12.8128f, 9.7835f, 12.0293f, 10.75f, 12.0293f)
                horizontalLineTo(13.25f)
                close()
                moveTo(13.25f, 5.0293f)
                curveTo(14.2165f, 5.0293f, 15.0f, 5.8128f, 15.0f, 6.7793f)
                verticalLineTo(9.2793f)
                curveTo(15.0f, 10.2458f, 14.2165f, 11.0293f, 13.25f, 11.0293f)
                horizontalLineTo(10.75f)
                curveTo(9.7835f, 11.0293f, 9.0f, 10.2458f, 9.0f, 9.2793f)
                verticalLineTo(6.7793f)
                curveTo(9.0f, 5.8128f, 9.7835f, 5.0293f, 10.75f, 5.0293f)
                horizontalLineTo(13.25f)
                close()
                moveTo(20.25f, 5.0293f)
                curveTo(21.2165f, 5.0293f, 22.0f, 5.8128f, 22.0f, 6.7793f)
                verticalLineTo(9.2793f)
                curveTo(22.0f, 10.2458f, 21.2165f, 11.0293f, 20.25f, 11.0293f)
                horizontalLineTo(17.75f)
                curveTo(16.7835f, 11.0293f, 16.0f, 10.2458f, 16.0f, 9.2793f)
                verticalLineTo(6.7793f)
                curveTo(16.0f, 5.8128f, 16.7835f, 5.0293f, 17.75f, 5.0293f)
                horizontalLineTo(20.25f)
                close()
                moveTo(6.25f, 5.0293f)
                curveTo(7.2165f, 5.0293f, 8.0f, 5.8128f, 8.0f, 6.7793f)
                verticalLineTo(9.2793f)
                curveTo(8.0f, 10.2458f, 7.2165f, 11.0293f, 6.25f, 11.0293f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 11.0293f, 2.0f, 10.2458f, 2.0f, 9.2793f)
                verticalLineTo(6.7793f)
                curveTo(2.0f, 5.8611f, 2.7071f, 5.1081f, 3.6065f, 5.0351f)
                lineTo(3.75f, 5.0293f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _dockRow!!
    }

private var _dockRow: ImageVector? = null
