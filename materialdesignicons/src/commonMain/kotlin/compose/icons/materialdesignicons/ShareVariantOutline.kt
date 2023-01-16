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

public val MaterialDesignIcons.ShareVariantOutline: ImageVector
    get() {
        if (_shareVariantOutline != null) {
            return _shareVariantOutline!!
        }
        _shareVariantOutline = Builder(name = "ShareVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 16.08f)
                curveTo(17.24f, 16.08f, 16.56f, 16.38f, 16.04f, 16.85f)
                lineTo(8.91f, 12.7f)
                curveTo(8.96f, 12.47f, 9.0f, 12.24f, 9.0f, 12.0f)
                reflectiveCurveTo(8.96f, 11.53f, 8.91f, 11.3f)
                lineTo(15.96f, 7.19f)
                curveTo(16.5f, 7.69f, 17.21f, 8.0f, 18.0f, 8.0f)
                curveTo(19.66f, 8.0f, 21.0f, 6.66f, 21.0f, 5.0f)
                reflectiveCurveTo(19.66f, 2.0f, 18.0f, 2.0f)
                reflectiveCurveTo(15.0f, 3.34f, 15.0f, 5.0f)
                curveTo(15.0f, 5.24f, 15.04f, 5.47f, 15.09f, 5.7f)
                lineTo(8.04f, 9.81f)
                curveTo(7.5f, 9.31f, 6.79f, 9.0f, 6.0f, 9.0f)
                curveTo(4.34f, 9.0f, 3.0f, 10.34f, 3.0f, 12.0f)
                reflectiveCurveTo(4.34f, 15.0f, 6.0f, 15.0f)
                curveTo(6.79f, 15.0f, 7.5f, 14.69f, 8.04f, 14.19f)
                lineTo(15.16f, 18.34f)
                curveTo(15.11f, 18.55f, 15.08f, 18.77f, 15.08f, 19.0f)
                curveTo(15.08f, 20.61f, 16.39f, 21.91f, 18.0f, 21.91f)
                reflectiveCurveTo(20.92f, 20.61f, 20.92f, 19.0f)
                curveTo(20.92f, 17.39f, 19.61f, 16.08f, 18.0f, 16.08f)
                moveTo(18.0f, 4.0f)
                curveTo(18.55f, 4.0f, 19.0f, 4.45f, 19.0f, 5.0f)
                reflectiveCurveTo(18.55f, 6.0f, 18.0f, 6.0f)
                reflectiveCurveTo(17.0f, 5.55f, 17.0f, 5.0f)
                reflectiveCurveTo(17.45f, 4.0f, 18.0f, 4.0f)
                moveTo(6.0f, 13.0f)
                curveTo(5.45f, 13.0f, 5.0f, 12.55f, 5.0f, 12.0f)
                reflectiveCurveTo(5.45f, 11.0f, 6.0f, 11.0f)
                reflectiveCurveTo(7.0f, 11.45f, 7.0f, 12.0f)
                reflectiveCurveTo(6.55f, 13.0f, 6.0f, 13.0f)
                moveTo(18.0f, 20.0f)
                curveTo(17.45f, 20.0f, 17.0f, 19.55f, 17.0f, 19.0f)
                reflectiveCurveTo(17.45f, 18.0f, 18.0f, 18.0f)
                reflectiveCurveTo(19.0f, 18.45f, 19.0f, 19.0f)
                reflectiveCurveTo(18.55f, 20.0f, 18.0f, 20.0f)
                close()
            }
        }
        .build()
        return _shareVariantOutline!!
    }

private var _shareVariantOutline: ImageVector? = null
