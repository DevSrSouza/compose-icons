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

public val RegularGroup.PersonCircle: ImageVector
    get() {
        if (_personCircle != null) {
            return _personCircle!!
        }
        _personCircle = Builder(name = "PersonCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.5f)
                curveTo(17.0f, 12.6716f, 16.3284f, 12.0f, 15.5f, 12.0f)
                horizontalLineTo(8.5f)
                curveTo(7.6716f, 12.0f, 7.0f, 12.6716f, 7.0f, 13.5f)
                verticalLineTo(14.0f)
                curveTo(7.0f, 15.9714f, 8.8595f, 18.0f, 12.0f, 18.0f)
                curveTo(15.1405f, 18.0f, 17.0f, 15.9714f, 17.0f, 14.0f)
                verticalLineTo(13.5f)
                close()
                moveTo(14.75f, 8.25f)
                curveTo(14.75f, 6.7312f, 13.5188f, 5.5f, 12.0f, 5.5f)
                curveTo(10.4812f, 5.5f, 9.25f, 6.7312f, 9.25f, 8.25f)
                curveTo(9.25f, 9.7688f, 10.4812f, 11.0f, 12.0f, 11.0f)
                curveTo(13.5188f, 11.0f, 14.75f, 9.7688f, 14.75f, 8.25f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                curveTo(20.5f, 7.3056f, 16.6944f, 3.5f, 12.0f, 3.5f)
                curveTo(7.3056f, 3.5f, 3.5f, 7.3056f, 3.5f, 12.0f)
                curveTo(3.5f, 16.6944f, 7.3056f, 20.5f, 12.0f, 20.5f)
                curveTo(16.6944f, 20.5f, 20.5f, 16.6944f, 20.5f, 12.0f)
                close()
            }
        }
        .build()
        return _personCircle!!
    }

private var _personCircle: ImageVector? = null
