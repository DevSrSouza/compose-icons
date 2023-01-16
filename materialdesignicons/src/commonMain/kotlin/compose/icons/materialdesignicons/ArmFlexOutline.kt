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

public val MaterialDesignIcons.ArmFlexOutline: ImageVector
    get() {
        if (_armFlexOutline != null) {
            return _armFlexOutline!!
        }
        _armFlexOutline = Builder(name = "ArmFlexOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 7.76f)
                verticalLineTo(16.25f)
                horizontalLineTo(11.08f)
                lineTo(11.68f, 15.34f)
                curveTo(12.84f, 13.55f, 14.93f, 12.75f, 16.47f, 12.75f)
                curveTo(17.0f, 12.75f, 17.45f, 12.84f, 17.79f, 13.0f)
                curveTo(18.7f, 13.41f, 18.95f, 14.18f, 19.0f, 14.74f)
                curveTo(19.08f, 15.87f, 18.5f, 17.03f, 17.5f, 17.71f)
                curveTo(16.6f, 18.33f, 14.44f, 19.0f, 11.87f, 19.0f)
                curveTo(10.12f, 19.0f, 7.61f, 18.69f, 5.12f, 17.3f)
                curveTo(5.41f, 14.85f, 6.0f, 10.88f, 7.0f, 7.76f)
                moveTo(7.0f, 3.0f)
                curveTo(4.0f, 7.09f, 3.0f, 18.34f, 3.0f, 18.34f)
                curveTo(5.9f, 20.31f, 9.08f, 21.0f, 11.87f, 21.0f)
                curveTo(14.86f, 21.0f, 17.39f, 20.21f, 18.64f, 19.36f)
                curveTo(21.64f, 17.32f, 21.94f, 12.71f, 18.64f, 11.18f)
                curveTo(18.0f, 10.89f, 17.26f, 10.75f, 16.47f, 10.75f)
                curveTo(14.17f, 10.75f, 11.5f, 11.96f, 10.0f, 14.25f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.09f)
                horizontalLineTo(11.0f)
                lineTo(12.0f, 4.0f)
                lineTo(7.0f, 3.0f)
                close()
            }
        }
        .build()
        return _armFlexOutline!!
    }

private var _armFlexOutline: ImageVector? = null
