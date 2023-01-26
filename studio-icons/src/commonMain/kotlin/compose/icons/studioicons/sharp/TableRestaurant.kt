package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TableRestaurant: ImageVector
    get() {
        if (_tableRestaurant != null) {
            return _tableRestaurant!!
        }
        _tableRestaurant = Builder(name = "TableRestaurant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.33f, 11.0f)
                lineToRelative(-2.0f, -7.0f)
                horizontalLineTo(3.67f)
                lineToRelative(-2.0f, 7.0f)
                horizontalLineTo(5.2f)
                lineTo(4.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(0.67f, -5.0f)
                horizontalLineToRelative(10.67f)
                lineTo(18.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-1.2f, -9.0f)
                horizontalLineTo(22.33f)
                close()
                moveTo(6.93f, 13.0f)
                lineToRelative(0.27f, -2.0f)
                horizontalLineToRelative(9.6f)
                lineToRelative(0.27f, 2.0f)
                horizontalLineTo(6.93f)
                close()
            }
        }
        .build()
        return _tableRestaurant!!
    }

private var _tableRestaurant: ImageVector? = null
