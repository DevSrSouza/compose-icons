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

public val MaterialDesignIcons.NintendoGameBoy: ImageVector
    get() {
        if (_nintendoGameBoy != null) {
            return _nintendoGameBoy!!
        }
        _nintendoGameBoy = Builder(name = "NintendoGameBoy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                curveTo(5.9f, 1.0f, 5.0f, 1.9f, 5.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 22.11f, 5.9f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(14.0f)
                curveTo(16.76f, 23.0f, 19.0f, 20.76f, 19.0f, 18.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.9f, 18.11f, 1.0f, 17.0f, 1.0f)
                horizontalLineTo(7.0f)
                moveTo(8.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                moveTo(9.0f, 14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                moveTo(16.0f, 15.0f)
                curveTo(16.55f, 15.0f, 17.0f, 15.45f, 17.0f, 16.0f)
                curveTo(17.0f, 16.55f, 16.55f, 17.0f, 16.0f, 17.0f)
                curveTo(15.45f, 17.0f, 15.0f, 16.55f, 15.0f, 16.0f)
                curveTo(15.0f, 15.45f, 15.45f, 15.0f, 16.0f, 15.0f)
                moveTo(14.0f, 17.0f)
                curveTo(14.55f, 17.0f, 15.0f, 17.45f, 15.0f, 18.0f)
                curveTo(15.0f, 18.55f, 14.55f, 19.0f, 14.0f, 19.0f)
                curveTo(13.45f, 19.0f, 13.0f, 18.55f, 13.0f, 18.0f)
                curveTo(13.0f, 17.45f, 13.45f, 17.0f, 14.0f, 17.0f)
                close()
            }
        }
        .build()
        return _nintendoGameBoy!!
    }

private var _nintendoGameBoy: ImageVector? = null
