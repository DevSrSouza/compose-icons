package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.NintendoWiiu: ImageVector
    get() {
        if (_nintendoWiiu != null) {
            return _nintendoWiiu!!
        }
        _nintendoWiiu = Builder(name = "NintendoWiiu", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.96f)
                curveTo(2.0f, 18.19f, 3.54f, 19.5f, 5.79f, 19.5f)
                horizontalLineTo(18.57f)
                curveTo(20.47f, 19.5f, 22.0f, 18.2f, 22.0f, 16.32f)
                verticalLineTo(6.97f)
                curveTo(22.0f, 5.83f, 21.15f, 4.6f, 20.11f, 4.6f)
                horizontalLineTo(17.15f)
                verticalLineTo(12.3f)
                curveTo(17.15f, 18.14f, 6.97f, 18.09f, 6.97f, 12.41f)
                verticalLineTo(4.5f)
                horizontalLineTo(4.72f)
                curveTo(3.26f, 4.5f, 2.0f, 5.41f, 2.0f, 6.85f)
                verticalLineTo(15.96f)
                moveTo(9.34f, 11.23f)
                curveTo(9.34f, 15.74f, 14.66f, 15.09f, 14.66f, 11.94f)
                verticalLineTo(4.5f)
                horizontalLineTo(9.34f)
                verticalLineTo(11.23f)
                close()
            }
        }
        .build()
        return _nintendoWiiu!!
    }

private var _nintendoWiiu: ImageVector? = null
