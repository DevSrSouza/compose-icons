package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.TableRestaurant: ImageVector
    get() {
        if (_tableRestaurant != null) {
            return _tableRestaurant!!
        }
        _tableRestaurant = Builder(name = "TableRestaurant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.96f, 9.73f)
                lineToRelative(-1.43f, -5.0f)
                curveTo(20.41f, 4.3f, 20.02f, 4.0f, 19.57f, 4.0f)
                horizontalLineTo(4.43f)
                curveTo(3.98f, 4.0f, 3.59f, 4.3f, 3.47f, 4.73f)
                lineToRelative(-1.43f, 5.0f)
                curveTo(1.86f, 10.36f, 2.34f, 11.0f, 3.0f, 11.0f)
                horizontalLineToRelative(2.2f)
                lineToRelative(-1.05f, 7.88f)
                curveTo(4.07f, 19.47f, 4.53f, 20.0f, 5.13f, 20.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.5f, 0.0f, 0.92f, -0.37f, 0.98f, -0.86f)
                lineTo(6.67f, 15.0f)
                horizontalLineToRelative(10.67f)
                lineToRelative(0.55f, 4.14f)
                curveToRelative(0.07f, 0.49f, 0.49f, 0.86f, 0.98f, 0.86f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.6f, 0.0f, 1.06f, -0.53f, 0.98f, -1.12f)
                lineTo(18.8f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.66f, 11.0f, 22.14f, 10.36f, 21.96f, 9.73f)
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
