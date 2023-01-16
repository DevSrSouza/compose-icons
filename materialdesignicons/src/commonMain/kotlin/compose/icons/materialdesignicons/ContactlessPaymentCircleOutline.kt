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

public val MaterialDesignIcons.ContactlessPaymentCircleOutline: ImageVector
    get() {
        if (_contactlessPaymentCircleOutline != null) {
            return _contactlessPaymentCircleOutline!!
        }
        _contactlessPaymentCircleOutline = Builder(name = "ContactlessPaymentCircleOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(16.41f, 4.0f, 20.0f, 7.59f, 20.0f, 12.0f)
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(4.0f, 16.41f, 4.0f, 12.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(8.43f, 14.44f)
                lineTo(7.07f, 13.83f)
                curveTo(7.35f, 13.27f, 7.5f, 12.67f, 7.5f, 12.05f)
                curveTo(7.5f, 11.39f, 7.35f, 10.76f, 7.07f, 10.17f)
                lineTo(8.43f, 9.56f)
                curveTo(8.81f, 10.37f, 9.0f, 11.2f, 9.0f, 12.05f)
                curveTo(9.0f, 12.8f, 8.81f, 13.6f, 8.43f, 14.44f)
                moveTo(11.53f, 15.94f)
                lineTo(10.22f, 15.29f)
                curveTo(10.75f, 14.16f, 11.0f, 13.0f, 11.0f, 11.86f)
                curveTo(11.0f, 10.73f, 10.75f, 9.69f, 10.22f, 8.71f)
                lineTo(11.53f, 7.96f)
                curveTo(12.19f, 9.12f, 12.5f, 10.42f, 12.5f, 11.86f)
                curveTo(12.5f, 13.33f, 12.19f, 14.69f, 11.53f, 15.94f)
                moveTo(14.68f, 17.35f)
                lineTo(13.31f, 16.65f)
                curveTo(14.1f, 15.11f, 14.5f, 13.57f, 14.5f, 12.0f)
                reflectiveCurveTo(14.1f, 8.87f, 13.31f, 7.31f)
                lineTo(14.68f, 6.65f)
                curveTo(15.55f, 8.43f, 16.0f, 10.22f, 16.0f, 12.0f)
                curveTo(16.0f, 13.82f, 15.55f, 15.6f, 14.68f, 17.35f)
                close()
            }
        }
        .build()
        return _contactlessPaymentCircleOutline!!
    }

private var _contactlessPaymentCircleOutline: ImageVector? = null
