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

public val CssGgIcons.Piano: ImageVector
    get() {
        if (_piano != null) {
            return _piano!!
        }
        _piano = Builder(name = "Piano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 21.0f)
                curveTo(23.105f, 21.0f, 24.0f, 20.105f, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(24.0f, 3.895f, 23.105f, 3.0f, 22.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.895f, 3.0f, 1.0f, 3.895f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.105f, 1.895f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(11.0f, 5.0f)
                horizontalLineTo(8.985f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.985f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(18.015f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.015f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.015f)
                verticalLineTo(19.0f)
                close()
                moveTo(17.015f, 13.0f)
                horizontalLineTo(16.015f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.015f)
                verticalLineTo(13.0f)
                close()
                moveTo(6.985f, 19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.985f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                lineTo(3.0f, 19.0f)
                horizontalLineTo(6.985f)
                close()
            }
        }
        .build()
        return _piano!!
    }

private var _piano: ImageVector? = null
