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

public val MaterialDesignIcons.Lingerie: ImageVector
    get() {
        if (_lingerie != null) {
            return _lingerie!!
        }
        _lingerie = Builder(name = "Lingerie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.34f)
                lineTo(12.0f, 6.91f)
                lineTo(6.0f, 4.34f)
                verticalLineTo(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.05f)
                curveTo(4.3f, 11.25f, 6.19f, 13.0f, 8.5f, 13.0f)
                curveTo(9.92f, 13.0f, 11.18f, 12.33f, 12.0f, 11.3f)
                curveTo(12.83f, 12.33f, 14.08f, 13.0f, 15.5f, 13.0f)
                curveTo(17.81f, 13.0f, 19.7f, 11.25f, 19.95f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                moveTo(8.5f, 11.0f)
                curveTo(7.12f, 11.0f, 6.0f, 9.88f, 6.0f, 8.5f)
                verticalLineTo(6.5f)
                lineTo(11.0f, 8.65f)
                curveTo(10.9f, 9.96f, 9.83f, 11.0f, 8.5f, 11.0f)
                moveTo(18.0f, 8.5f)
                curveTo(18.0f, 9.88f, 16.88f, 11.0f, 15.5f, 11.0f)
                curveTo(14.17f, 11.0f, 13.1f, 9.96f, 13.0f, 8.65f)
                lineTo(18.0f, 6.5f)
                verticalLineTo(8.5f)
                moveTo(2.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                curveTo(5.97f, 17.0f, 8.43f, 19.17f, 8.91f, 22.0f)
                horizontalLineTo(15.09f)
                curveTo(15.57f, 19.17f, 18.03f, 17.0f, 21.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                moveTo(13.59f, 20.0f)
                horizontalLineTo(10.41f)
                curveTo(9.94f, 18.84f, 9.21f, 17.82f, 8.29f, 17.0f)
                horizontalLineTo(15.71f)
                curveTo(14.79f, 17.82f, 14.06f, 18.84f, 13.59f, 20.0f)
                close()
            }
        }
        .build()
        return _lingerie!!
    }

private var _lingerie: ImageVector? = null
