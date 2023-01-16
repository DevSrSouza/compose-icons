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

public val MaterialDesignIcons.NintendoSwitch: ImageVector
    get() {
        if (_nintendoSwitch != null) {
            return _nintendoSwitch!!
        }
        _nintendoSwitch = Builder(name = "NintendoSwitch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.04f, 20.4f)
                horizontalLineTo(7.12f)
                curveTo(6.19f, 20.4f, 5.3f, 20.0f, 4.64f, 19.36f)
                curveTo(4.0f, 18.7f, 3.6f, 17.81f, 3.6f, 16.88f)
                verticalLineTo(7.12f)
                curveTo(3.6f, 6.19f, 4.0f, 5.3f, 4.64f, 4.64f)
                curveTo(5.3f, 4.0f, 6.19f, 3.62f, 7.12f, 3.62f)
                horizontalLineTo(10.04f)
                verticalLineTo(20.4f)
                moveTo(7.12f, 2.0f)
                arcTo(5.12f, 5.12f, 0.0f, false, false, 2.0f, 7.12f)
                verticalLineTo(16.88f)
                curveTo(2.0f, 19.71f, 4.29f, 22.0f, 7.12f, 22.0f)
                horizontalLineTo(11.65f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.12f)
                moveTo(5.11f, 8.0f)
                curveTo(5.11f, 9.04f, 5.95f, 9.88f, 7.0f, 9.88f)
                curveTo(8.03f, 9.88f, 8.87f, 9.04f, 8.87f, 8.0f)
                curveTo(8.87f, 6.96f, 8.03f, 6.12f, 7.0f, 6.12f)
                curveTo(5.95f, 6.12f, 5.11f, 6.96f, 5.11f, 8.0f)
                moveTo(17.61f, 11.0f)
                curveTo(18.72f, 11.0f, 19.62f, 11.89f, 19.62f, 13.0f)
                curveTo(19.62f, 14.12f, 18.72f, 15.0f, 17.61f, 15.0f)
                curveTo(16.5f, 15.0f, 15.58f, 14.12f, 15.58f, 13.0f)
                curveTo(15.58f, 11.89f, 16.5f, 11.0f, 17.61f, 11.0f)
                moveTo(16.88f, 22.0f)
                arcTo(5.12f, 5.12f, 0.0f, false, false, 22.0f, 16.88f)
                verticalLineTo(7.12f)
                curveTo(22.0f, 4.29f, 19.71f, 2.0f, 16.88f, 2.0f)
                horizontalLineTo(13.65f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.88f)
                close()
            }
        }
        .build()
        return _nintendoSwitch!!
    }

private var _nintendoSwitch: ImageVector? = null
