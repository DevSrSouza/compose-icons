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

public val MaterialDesignIcons.BasketCheck: ImageVector
    get() {
        if (_basketCheck != null) {
            return _basketCheck!!
        }
        _basketCheck = Builder(name = "BasketCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.63f, 16.27f)
                lineTo(17.76f, 20.17f)
                lineTo(16.41f, 18.8f)
                lineTo(15.0f, 20.22f)
                lineTo(17.75f, 23.0f)
                lineTo(23.03f, 17.68f)
                lineTo(21.63f, 16.27f)
                moveTo(13.0f, 20.0f)
                curveTo(13.0f, 16.69f, 15.69f, 14.0f, 19.0f, 14.0f)
                curveTo(20.0f, 14.0f, 20.92f, 14.24f, 21.74f, 14.67f)
                lineTo(22.96f, 10.29f)
                lineTo(23.0f, 10.0f)
                curveTo(23.0f, 9.45f, 22.55f, 9.0f, 22.0f, 9.0f)
                horizontalLineTo(17.42f)
                lineTo(12.83f, 2.44f)
                curveTo(12.65f, 2.17f, 12.34f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(11.36f, 2.17f, 11.18f, 2.43f)
                lineTo(6.58f, 9.0f)
                horizontalLineTo(2.0f)
                curveTo(1.45f, 9.0f, 1.0f, 9.45f, 1.0f, 10.0f)
                lineTo(1.1f, 10.44f)
                lineTo(3.71f, 19.9f)
                curveTo(4.04f, 20.55f, 4.72f, 21.0f, 5.5f, 21.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 20.67f, 13.0f, 20.34f, 13.0f, 20.0f)
                moveTo(12.0f, 4.74f)
                lineTo(15.0f, 9.0f)
                horizontalLineTo(9.0f)
                lineTo(12.0f, 4.74f)
                moveTo(10.0f, 15.0f)
                curveTo(10.0f, 13.9f, 10.9f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(14.0f, 13.9f, 14.0f, 15.0f)
                reflectiveCurveTo(13.11f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(10.0f, 16.11f, 10.0f, 15.0f)
                close()
            }
        }
        .build()
        return _basketCheck!!
    }

private var _basketCheck: ImageVector? = null
