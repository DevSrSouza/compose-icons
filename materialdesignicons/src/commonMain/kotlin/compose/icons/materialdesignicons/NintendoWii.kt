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

public val MaterialDesignIcons.NintendoWii: ImageVector
    get() {
        if (_nintendoWii != null) {
            return _nintendoWii!!
        }
        _nintendoWii = Builder(name = "NintendoWii", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.84f, 16.94f)
                horizontalLineTo(15.97f)
                verticalLineTo(10.79f)
                horizontalLineTo(17.84f)
                verticalLineTo(16.94f)
                moveTo(18.0f, 8.58f)
                curveTo(18.0f, 9.19f, 17.5f, 9.69f, 16.9f, 9.69f)
                arcTo(1.11f, 1.11f, 0.0f, false, true, 15.79f, 8.58f)
                curveTo(15.79f, 7.96f, 16.29f, 7.46f, 16.9f, 7.46f)
                curveTo(17.5f, 7.46f, 18.0f, 7.96f, 18.0f, 8.58f)
                moveTo(21.82f, 16.94f)
                horizontalLineTo(19.94f)
                verticalLineTo(10.79f)
                horizontalLineTo(21.82f)
                verticalLineTo(16.94f)
                moveTo(22.0f, 8.58f)
                curveTo(22.0f, 9.19f, 21.5f, 9.69f, 20.88f, 9.69f)
                arcTo(1.11f, 1.11f, 0.0f, false, true, 19.77f, 8.58f)
                curveTo(19.77f, 7.96f, 20.27f, 7.46f, 20.88f, 7.46f)
                curveTo(21.5f, 7.46f, 22.0f, 7.96f, 22.0f, 8.58f)
                moveTo(12.9f, 8.05f)
                horizontalLineTo(14.9f)
                lineTo(12.78f, 15.5f)
                curveTo(12.78f, 15.5f, 12.5f, 17.04f, 11.28f, 17.04f)
                curveTo(10.07f, 17.04f, 9.79f, 15.5f, 9.79f, 15.5f)
                lineTo(8.45f, 10.64f)
                lineTo(7.11f, 15.5f)
                curveTo(7.11f, 15.5f, 6.82f, 17.04f, 5.61f, 17.04f)
                curveTo(4.4f, 17.04f, 4.12f, 15.5f, 4.12f, 15.5f)
                lineTo(2.0f, 8.05f)
                horizontalLineTo(4.0f)
                lineTo(5.72f, 14.67f)
                lineTo(7.11f, 9.3f)
                curveTo(7.43f, 7.95f, 8.45f, 7.97f, 8.45f, 7.97f)
                curveTo(8.45f, 7.97f, 9.47f, 7.95f, 9.79f, 9.3f)
                lineTo(11.17f, 14.67f)
                lineTo(12.9f, 8.05f)
                close()
            }
        }
        .build()
        return _nintendoWii!!
    }

private var _nintendoWii: ImageVector? = null
