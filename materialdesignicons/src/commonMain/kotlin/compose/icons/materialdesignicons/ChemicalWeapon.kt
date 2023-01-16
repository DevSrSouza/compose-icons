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

public val MaterialDesignIcons.ChemicalWeapon: ImageVector
    get() {
        if (_chemicalWeapon != null) {
            return _chemicalWeapon!!
        }
        _chemicalWeapon = Builder(name = "ChemicalWeapon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 7.83f)
                curveTo(9.83f, 7.42f, 9.0f, 6.3f, 9.0f, 5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 5.0f)
                curveTo(15.0f, 6.31f, 14.16f, 7.42f, 13.0f, 7.83f)
                verticalLineTo(10.64f)
                curveTo(12.68f, 10.55f, 12.35f, 10.5f, 12.0f, 10.5f)
                curveTo(11.65f, 10.5f, 11.32f, 10.55f, 11.0f, 10.64f)
                verticalLineTo(7.83f)
                moveTo(18.3f, 21.1f)
                curveTo(17.16f, 20.45f, 16.62f, 19.18f, 16.84f, 17.96f)
                lineTo(14.4f, 16.55f)
                curveTo(14.88f, 16.09f, 15.24f, 15.5f, 15.4f, 14.82f)
                lineTo(17.84f, 16.23f)
                curveTo(18.78f, 15.42f, 20.16f, 15.26f, 21.29f, 15.91f)
                curveTo(22.73f, 16.74f, 23.22f, 18.57f, 22.39f, 20.0f)
                curveTo(21.56f, 21.44f, 19.73f, 21.93f, 18.3f, 21.1f)
                moveTo(2.7f, 15.9f)
                curveTo(3.83f, 15.25f, 5.21f, 15.42f, 6.15f, 16.22f)
                lineTo(8.6f, 14.81f)
                curveTo(8.76f, 15.5f, 9.11f, 16.08f, 9.6f, 16.54f)
                lineTo(7.15f, 17.95f)
                curveTo(7.38f, 19.17f, 6.83f, 20.45f, 5.7f, 21.1f)
                curveTo(4.26f, 21.93f, 2.43f, 21.44f, 1.6f, 20.0f)
                curveTo(0.77f, 18.57f, 1.26f, 16.73f, 2.7f, 15.9f)
                moveTo(14.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 16.0f)
                curveTo(10.89f, 16.0f, 10.0f, 15.1f, 10.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 12.0f)
                curveTo(13.11f, 12.0f, 14.0f, 12.9f, 14.0f, 14.0f)
                moveTo(17.0f, 14.0f)
                lineTo(16.97f, 14.57f)
                lineTo(15.5f, 13.71f)
                curveTo(15.4f, 12.64f, 14.83f, 11.71f, 14.0f, 11.12f)
                verticalLineTo(9.41f)
                curveTo(15.77f, 10.19f, 17.0f, 11.95f, 17.0f, 14.0f)
                moveTo(14.97f, 18.03f)
                curveTo(14.14f, 18.64f, 13.11f, 19.0f, 12.0f, 19.0f)
                curveTo(10.89f, 19.0f, 9.86f, 18.64f, 9.03f, 18.0f)
                lineTo(10.5f, 17.17f)
                curveTo(10.96f, 17.38f, 11.47f, 17.5f, 12.0f, 17.5f)
                curveTo(12.53f, 17.5f, 13.03f, 17.38f, 13.5f, 17.17f)
                lineTo(14.97f, 18.03f)
                moveTo(7.03f, 14.56f)
                lineTo(7.0f, 14.0f)
                curveTo(7.0f, 11.95f, 8.23f, 10.19f, 10.0f, 9.42f)
                verticalLineTo(11.13f)
                curveTo(9.17f, 11.71f, 8.6f, 12.64f, 8.5f, 13.7f)
                lineTo(7.03f, 14.56f)
                close()
            }
        }
        .build()
        return _chemicalWeapon!!
    }

private var _chemicalWeapon: ImageVector? = null
