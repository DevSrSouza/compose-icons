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

public val FilledGroup.Production: ImageVector
    get() {
        if (_production != null) {
            return _production!!
        }
        _production = Builder(name = "Production", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 5.25f)
                curveTo(4.5f, 4.2835f, 5.2835f, 3.5f, 6.25f, 3.5f)
                horizontalLineTo(8.75f)
                curveTo(9.7165f, 3.5f, 10.5f, 4.2835f, 10.5f, 5.25f)
                verticalLineTo(7.75f)
                curveTo(10.5f, 8.7165f, 9.7165f, 9.5f, 8.75f, 9.5f)
                horizontalLineTo(6.25f)
                curveTo(5.2835f, 9.5f, 4.5f, 8.7165f, 4.5f, 7.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(15.25f, 3.5f)
                curveTo(14.2835f, 3.5f, 13.5f, 4.2835f, 13.5f, 5.25f)
                verticalLineTo(7.75f)
                curveTo(13.5f, 8.7165f, 14.2835f, 9.5f, 15.25f, 9.5f)
                horizontalLineTo(17.75f)
                curveTo(18.7165f, 9.5f, 19.5f, 8.7165f, 19.5f, 7.75f)
                verticalLineTo(5.25f)
                curveTo(19.5f, 4.2835f, 18.7165f, 3.5f, 17.75f, 3.5f)
                horizontalLineTo(15.25f)
                close()
                moveTo(15.0f, 5.25f)
                curveTo(15.0f, 5.1119f, 15.1119f, 5.0f, 15.25f, 5.0f)
                horizontalLineTo(17.75f)
                curveTo(17.8881f, 5.0f, 18.0f, 5.1119f, 18.0f, 5.25f)
                verticalLineTo(7.75f)
                curveTo(18.0f, 7.8881f, 17.8881f, 8.0f, 17.75f, 8.0f)
                horizontalLineTo(15.25f)
                curveTo(15.1119f, 8.0f, 15.0f, 7.8881f, 15.0f, 7.75f)
                verticalLineTo(5.25f)
                close()
                moveTo(2.0f, 16.0f)
                curveTo(2.0f, 13.5147f, 4.0147f, 11.5f, 6.5f, 11.5f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 11.5f, 22.0f, 13.5147f, 22.0f, 16.0f)
                curveTo(22.0f, 18.4853f, 19.9853f, 20.5f, 17.5f, 20.5f)
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 20.5f, 2.0f, 18.4853f, 2.0f, 16.0f)
                close()
                moveTo(8.5f, 16.0f)
                curveTo(8.5f, 15.1716f, 7.8284f, 14.5f, 7.0f, 14.5f)
                curveTo(6.1716f, 14.5f, 5.5f, 15.1716f, 5.5f, 16.0f)
                curveTo(5.5f, 16.8284f, 6.1716f, 17.5f, 7.0f, 17.5f)
                curveTo(7.8284f, 17.5f, 8.5f, 16.8284f, 8.5f, 16.0f)
                close()
                moveTo(13.5f, 16.0f)
                curveTo(13.5f, 15.1716f, 12.8284f, 14.5f, 12.0f, 14.5f)
                curveTo(11.1716f, 14.5f, 10.5f, 15.1716f, 10.5f, 16.0f)
                curveTo(10.5f, 16.8284f, 11.1716f, 17.5f, 12.0f, 17.5f)
                curveTo(12.8284f, 17.5f, 13.5f, 16.8284f, 13.5f, 16.0f)
                close()
                moveTo(17.0f, 17.5f)
                curveTo(17.8284f, 17.5f, 18.5f, 16.8284f, 18.5f, 16.0f)
                curveTo(18.5f, 15.1716f, 17.8284f, 14.5f, 17.0f, 14.5f)
                curveTo(16.1716f, 14.5f, 15.5f, 15.1716f, 15.5f, 16.0f)
                curveTo(15.5f, 16.8284f, 16.1716f, 17.5f, 17.0f, 17.5f)
                close()
            }
        }
        .build()
        return _production!!
    }

private var _production: ImageVector? = null
