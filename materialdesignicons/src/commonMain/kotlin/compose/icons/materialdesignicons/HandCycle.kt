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

public val MaterialDesignIcons.HandCycle: ImageVector
    get() {
        if (_handCycle != null) {
            return _handCycle!!
        }
        _handCycle = Builder(name = "HandCycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 13.0f)
                curveTo(18.18f, 13.0f, 17.05f, 13.74f, 16.45f, 14.81f)
                lineTo(13.23f, 12.18f)
                lineTo(10.96f, 13.0f)
                lineTo(9.87f, 11.32f)
                lineTo(11.21f, 11.69f)
                lineTo(13.87f, 9.5f)
                lineTo(12.93f, 8.36f)
                lineTo(10.9f, 10.03f)
                lineTo(7.96f, 9.0f)
                curveTo(7.96f, 9.0f, 7.96f, 9.0f, 7.95f, 9.0f)
                curveTo(7.54f, 8.85f, 7.08f, 8.89f, 6.69f, 9.14f)
                curveTo(6.04f, 9.56f, 5.83f, 10.39f, 6.16f, 11.07f)
                curveTo(5.95f, 11.03f, 5.73f, 11.0f, 5.5f, 11.0f)
                curveTo(3.0f, 11.0f, 1.0f, 13.0f, 1.0f, 15.5f)
                reflectiveCurveTo(3.0f, 20.0f, 5.5f, 20.0f)
                reflectiveCurveTo(10.0f, 18.0f, 10.0f, 15.5f)
                curveTo(10.0f, 15.37f, 9.97f, 15.25f, 9.96f, 15.12f)
                lineTo(13.0f, 14.0f)
                lineTo(16.0f, 16.5f)
                lineTo(16.0f, 16.5f)
                curveTo(16.0f, 18.43f, 17.57f, 20.0f, 19.5f, 20.0f)
                reflectiveCurveTo(23.0f, 18.43f, 23.0f, 16.5f)
                reflectiveCurveTo(21.43f, 13.0f, 19.5f, 13.0f)
                moveTo(5.5f, 18.5f)
                curveTo(3.85f, 18.5f, 2.5f, 17.15f, 2.5f, 15.5f)
                reflectiveCurveTo(3.85f, 12.5f, 5.5f, 12.5f)
                reflectiveCurveTo(8.5f, 13.85f, 8.5f, 15.5f)
                reflectiveCurveTo(7.15f, 18.5f, 5.5f, 18.5f)
                moveTo(19.5f, 18.5f)
                curveTo(18.4f, 18.5f, 17.5f, 17.6f, 17.5f, 16.5f)
                reflectiveCurveTo(18.4f, 14.5f, 19.5f, 14.5f)
                reflectiveCurveTo(21.5f, 15.4f, 21.5f, 16.5f)
                reflectiveCurveTo(20.6f, 18.5f, 19.5f, 18.5f)
                moveTo(6.44f, 7.57f)
                curveTo(5.85f, 7.0f, 5.85f, 6.06f, 6.44f, 5.5f)
                curveTo(7.03f, 4.89f, 7.97f, 4.89f, 8.56f, 5.5f)
                curveTo(9.15f, 6.06f, 9.15f, 7.0f, 8.56f, 7.57f)
                curveTo(7.97f, 8.15f, 7.03f, 8.15f, 6.44f, 7.57f)
            }
        }
        .build()
        return _handCycle!!
    }

private var _handCycle: ImageVector? = null
