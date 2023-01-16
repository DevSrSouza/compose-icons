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

public val MaterialDesignIcons.MotherHeart: ImageVector
    get() {
        if (_motherHeart != null) {
            return _motherHeart!!
        }
        _motherHeart = Builder(name = "MotherHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(13.66f, 2.0f, 15.0f, 3.34f, 15.0f, 5.0f)
                reflectiveCurveTo(13.66f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(9.0f, 6.66f, 9.0f, 5.0f)
                reflectiveCurveTo(10.34f, 2.0f, 12.0f, 2.0f)
                moveTo(20.0f, 18.0f)
                lineTo(18.0f, 12.56f)
                curveTo(17.65f, 11.57f, 17.34f, 10.71f, 16.0f, 10.0f)
                curveTo(14.63f, 9.3f, 13.63f, 9.0f, 12.0f, 9.0f)
                curveTo(10.39f, 9.0f, 9.39f, 9.3f, 8.0f, 10.0f)
                curveTo(6.68f, 10.71f, 6.37f, 11.57f, 6.0f, 12.56f)
                lineTo(4.0f, 18.0f)
                curveTo(3.77f, 19.13f, 6.38f, 20.44f, 8.13f, 21.19f)
                curveTo(9.34f, 21.72f, 10.64f, 22.0f, 12.0f, 22.0f)
                curveTo(13.38f, 22.0f, 14.67f, 21.72f, 15.89f, 21.19f)
                curveTo(17.64f, 20.44f, 20.25f, 19.13f, 20.0f, 18.0f)
                moveTo(15.42f, 17.5f)
                lineTo(12.0f, 21.0f)
                lineTo(8.58f, 17.5f)
                curveTo(8.22f, 17.12f, 8.0f, 16.61f, 8.0f, 16.05f)
                curveTo(8.0f, 14.92f, 8.9f, 14.0f, 10.0f, 14.0f)
                curveTo(10.55f, 14.0f, 11.06f, 14.23f, 11.42f, 14.61f)
                lineTo(12.0f, 15.2f)
                lineTo(12.58f, 14.6f)
                curveTo(12.94f, 14.23f, 13.45f, 14.0f, 14.0f, 14.0f)
                curveTo(15.11f, 14.0f, 16.0f, 14.92f, 16.0f, 16.05f)
                curveTo(16.0f, 16.61f, 15.78f, 17.13f, 15.42f, 17.5f)
                close()
            }
        }
        .build()
        return _motherHeart!!
    }

private var _motherHeart: ImageVector? = null
