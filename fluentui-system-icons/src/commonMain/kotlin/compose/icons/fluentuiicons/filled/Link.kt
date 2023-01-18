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

public val FilledGroup.Link: ImageVector
    get() {
        if (_link != null) {
            return _link!!
        }
        _link = Builder(name = "Link", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                curveTo(9.5523f, 7.0f, 10.0f, 7.4477f, 10.0f, 8.0f)
                curveTo(10.0f, 8.5128f, 9.614f, 8.9355f, 9.1166f, 8.9933f)
                lineTo(9.0f, 9.0f)
                horizontalLineTo(7.0f)
                curveTo(5.3432f, 9.0f, 4.0f, 10.3431f, 4.0f, 12.0f)
                curveTo(4.0f, 13.5977f, 5.2489f, 14.9037f, 6.8237f, 14.9949f)
                lineTo(7.0f, 15.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 15.0f, 10.0f, 15.4477f, 10.0f, 16.0f)
                curveTo(10.0f, 16.5128f, 9.614f, 16.9355f, 9.1166f, 16.9933f)
                lineTo(9.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(4.2386f, 17.0f, 2.0f, 14.7614f, 2.0f, 12.0f)
                curveTo(2.0f, 9.3112f, 4.1223f, 7.1182f, 6.7831f, 7.0046f)
                lineTo(7.0f, 7.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(17.0f, 7.0f)
                curveTo(19.7614f, 7.0f, 22.0f, 9.2386f, 22.0f, 12.0f)
                curveTo(22.0f, 14.6888f, 19.8777f, 16.8818f, 17.2169f, 16.9954f)
                lineTo(17.0f, 17.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 17.0f, 14.0f, 16.5523f, 14.0f, 16.0f)
                curveTo(14.0f, 15.4872f, 14.386f, 15.0645f, 14.8834f, 15.0067f)
                lineTo(15.0f, 15.0f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 15.0f, 20.0f, 13.6569f, 20.0f, 12.0f)
                curveTo(20.0f, 10.4023f, 18.7511f, 9.0963f, 17.1763f, 9.0051f)
                lineTo(17.0f, 9.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 9.0f, 14.0f, 8.5523f, 14.0f, 8.0f)
                curveTo(14.0f, 7.4872f, 14.386f, 7.0645f, 14.8834f, 7.0067f)
                lineTo(15.0f, 7.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 11.0f, 18.0f, 11.4477f, 18.0f, 12.0f)
                curveTo(18.0f, 12.5128f, 17.614f, 12.9355f, 17.1166f, 12.9933f)
                lineTo(17.0f, 13.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 13.0f, 6.0f, 12.5523f, 6.0f, 12.0f)
                curveTo(6.0f, 11.4872f, 6.386f, 11.0645f, 6.8834f, 11.0067f)
                lineTo(7.0f, 11.0f)
                horizontalLineTo(17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _link!!
    }

private var _link: ImageVector? = null
