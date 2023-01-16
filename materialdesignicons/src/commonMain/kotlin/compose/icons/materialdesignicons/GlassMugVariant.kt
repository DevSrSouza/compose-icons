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

public val MaterialDesignIcons.GlassMugVariant: ImageVector
    get() {
        if (_glassMugVariant != null) {
            return _glassMugVariant!!
        }
        _glassMugVariant = Builder(name = "GlassMugVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 3.0f)
                curveTo(7.56f, 3.0f, 5.85f, 4.24f, 5.23f, 6.08f)
                curveTo(3.36f, 6.44f, 2.0f, 8.09f, 2.0f, 10.0f)
                curveTo(2.0f, 12.21f, 3.79f, 14.0f, 6.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 20.0f, 21.0f, 19.55f, 21.0f, 19.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 10.45f, 20.55f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 5.79f, 16.21f, 4.0f, 14.0f, 4.0f)
                horizontalLineTo(12.32f)
                curveTo(11.5f, 3.35f, 10.53f, 3.0f, 9.5f, 3.0f)
                moveTo(9.5f, 5.0f)
                curveTo(10.29f, 5.0f, 11.03f, 5.37f, 11.5f, 6.0f)
                horizontalLineTo(14.0f)
                curveTo(15.11f, 6.0f, 16.0f, 6.9f, 16.0f, 8.0f)
                horizontalLineTo(12.0f)
                curveTo(10.0f, 8.0f, 9.32f, 9.13f, 8.5f, 10.63f)
                curveTo(7.68f, 12.13f, 6.0f, 12.0f, 6.0f, 12.0f)
                curveTo(4.89f, 12.0f, 4.0f, 11.11f, 4.0f, 10.0f)
                curveTo(4.0f, 8.9f, 4.89f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.5f)
                curveTo(7.0f, 6.12f, 8.12f, 5.0f, 9.5f, 5.0f)
                moveTo(17.0f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _glassMugVariant!!
    }

private var _glassMugVariant: ImageVector? = null
