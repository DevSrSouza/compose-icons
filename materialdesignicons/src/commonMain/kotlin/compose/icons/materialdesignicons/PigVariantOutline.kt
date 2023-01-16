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

public val MaterialDesignIcons.PigVariantOutline: ImageVector
    get() {
        if (_pigVariantOutline != null) {
            return _pigVariantOutline!!
        }
        _pigVariantOutline = Builder(name = "PigVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                curveTo(15.0f, 9.45f, 15.45f, 9.0f, 16.0f, 9.0f)
                curveTo(16.55f, 9.0f, 17.0f, 9.45f, 17.0f, 10.0f)
                reflectiveCurveTo(16.55f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(15.0f, 10.55f, 15.0f, 10.0f)
                moveTo(22.0f, 7.5f)
                verticalLineTo(14.47f)
                lineTo(19.18f, 15.41f)
                lineTo(17.5f, 21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.5f)
                curveTo(4.5f, 21.0f, 2.0f, 12.54f, 2.0f, 9.5f)
                reflectiveCurveTo(4.46f, 4.0f, 7.5f, 4.0f)
                horizontalLineTo(12.5f)
                curveTo(13.41f, 2.79f, 14.86f, 2.0f, 16.5f, 2.0f)
                curveTo(17.33f, 2.0f, 18.0f, 2.67f, 18.0f, 3.5f)
                curveTo(18.0f, 3.71f, 17.96f, 3.9f, 17.88f, 4.08f)
                curveTo(17.74f, 4.42f, 17.62f, 4.81f, 17.56f, 5.23f)
                lineTo(19.83f, 7.5f)
                horizontalLineTo(22.0f)
                moveTo(20.0f, 9.5f)
                horizontalLineTo(19.0f)
                lineTo(15.5f, 6.0f)
                curveTo(15.5f, 5.35f, 15.59f, 4.71f, 15.76f, 4.09f)
                curveTo(14.79f, 4.34f, 14.0f, 5.06f, 13.67f, 6.0f)
                horizontalLineTo(7.5f)
                curveTo(5.57f, 6.0f, 4.0f, 7.57f, 4.0f, 9.5f)
                curveTo(4.0f, 11.38f, 5.22f, 16.15f, 6.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                lineTo(17.56f, 13.85f)
                lineTo(20.0f, 13.03f)
                verticalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _pigVariantOutline!!
    }

private var _pigVariantOutline: ImageVector? = null
