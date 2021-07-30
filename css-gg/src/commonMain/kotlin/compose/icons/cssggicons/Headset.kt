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

public val CssGgIcons.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 21.0f)
                curveTo(15.8954f, 21.0f, 15.0f, 20.1046f, 15.0f, 19.0f)
                verticalLineTo(15.0f)
                curveTo(15.0f, 13.8954f, 15.8954f, 13.0f, 17.0f, 13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                curveTo(8.1046f, 13.0f, 9.0f, 13.8954f, 9.0f, 15.0f)
                verticalLineTo(19.0f)
                curveTo(9.0f, 20.1046f, 8.1046f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(19.0f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(7.0f, 15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
