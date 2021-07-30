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

public val CssGgIcons.SmartHomeBoiler: ImageVector
    get() {
        if (_smartHomeBoiler != null) {
            return _smartHomeBoiler!!
        }
        _smartHomeBoiler = Builder(name = "SmartHomeBoiler", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 5.0f)
                curveTo(5.0f, 2.7909f, 6.7909f, 1.0f, 9.0f, 1.0f)
                horizontalLineTo(15.0f)
                curveTo(17.2091f, 1.0f, 19.0f, 2.7909f, 19.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.144f)
                lineTo(15.8865f, 22.9999f)
                horizontalLineTo(13.8865f)
                lineTo(13.144f, 21.0f)
                horizontalLineTo(11.144f)
                lineTo(11.8865f, 22.9999f)
                horizontalLineTo(9.8865f)
                lineTo(9.144f, 21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                close()
                moveTo(9.0f, 3.0f)
                horizontalLineTo(15.0f)
                curveTo(16.1046f, 3.0f, 17.0f, 3.8954f, 17.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                curveTo(7.0f, 3.8954f, 7.8954f, 3.0f, 9.0f, 3.0f)
                close()
                moveTo(7.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _smartHomeBoiler!!
    }

private var _smartHomeBoiler: ImageVector? = null
