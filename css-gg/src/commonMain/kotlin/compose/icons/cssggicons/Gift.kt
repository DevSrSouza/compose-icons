package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Gift: ImageVector
    get() {
        if (_gift != null) {
            return _gift!!
        }
        _gift = Builder(name = "Gift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.535f, 2.879f)
                curveTo(16.364f, 1.707f, 14.464f, 1.707f, 13.293f, 2.879f)
                lineTo(11.879f, 4.293f)
                curveTo(11.818f, 4.353f, 11.761f, 4.415f, 11.707f, 4.479f)
                curveTo(11.653f, 4.415f, 11.596f, 4.353f, 11.535f, 4.293f)
                lineTo(10.121f, 2.879f)
                curveTo(8.95f, 1.707f, 7.05f, 1.707f, 5.879f, 2.879f)
                curveTo(4.707f, 4.05f, 4.707f, 5.95f, 5.879f, 7.121f)
                lineTo(6.757f, 8.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.657f)
                lineTo(17.535f, 7.121f)
                curveTo(18.707f, 5.95f, 18.707f, 4.05f, 17.535f, 2.879f)
                close()
                moveTo(14.707f, 7.121f)
                lineTo(16.121f, 5.707f)
                curveTo(16.512f, 5.317f, 16.512f, 4.683f, 16.121f, 4.293f)
                curveTo(15.731f, 3.902f, 15.097f, 3.902f, 14.707f, 4.293f)
                lineTo(13.293f, 5.707f)
                curveTo(12.902f, 6.098f, 12.902f, 6.731f, 13.293f, 7.121f)
                curveTo(13.683f, 7.512f, 14.316f, 7.512f, 14.707f, 7.121f)
                close()
                moveTo(10.121f, 5.707f)
                lineTo(8.707f, 4.293f)
                curveTo(8.317f, 3.902f, 7.683f, 3.902f, 7.293f, 4.293f)
                curveTo(6.902f, 4.683f, 6.902f, 5.317f, 7.293f, 5.707f)
                lineTo(8.707f, 7.121f)
                curveTo(9.098f, 7.512f, 9.731f, 7.512f, 10.121f, 7.121f)
                curveTo(10.512f, 6.731f, 10.512f, 6.098f, 10.121f, 5.707f)
                close()
                moveTo(21.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(12.917f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.917f)
                verticalLineTo(14.0f)
                close()
                moveTo(11.083f, 14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.083f)
                close()
            }
        }
        .build()
        return _gift!!
    }

private var _gift: ImageVector? = null
