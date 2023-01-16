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

public val MaterialDesignIcons.Mace: ImageVector
    get() {
        if (_mace != null) {
            return _mace!!
        }
        _mace = Builder(name = "Mace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.92f, 9.27f)
                curveTo(19.97f, 9.0f, 20.0f, 8.76f, 20.0f, 8.5f)
                reflectiveCurveTo(19.97f, 8.0f, 19.92f, 7.73f)
                lineTo(23.0f, 8.5f)
                lineTo(19.92f, 9.27f)
                moveTo(14.69f, 12.92f)
                lineTo(15.5f, 16.16f)
                lineTo(16.31f, 12.92f)
                curveTo(16.05f, 12.97f, 15.78f, 13.0f, 15.5f, 13.0f)
                reflectiveCurveTo(14.95f, 12.97f, 14.69f, 12.92f)
                moveTo(11.7f, 10.89f)
                lineTo(6.79f, 15.79f)
                lineTo(6.09f, 15.09f)
                lineTo(1.0f, 20.17f)
                lineTo(3.83f, 23.0f)
                lineTo(8.91f, 17.91f)
                lineTo(8.21f, 17.21f)
                lineTo(13.11f, 12.3f)
                curveTo(12.54f, 11.94f, 12.06f, 11.46f, 11.7f, 10.89f)
                moveTo(16.27f, 4.08f)
                lineTo(15.5f, 1.0f)
                lineTo(14.73f, 4.08f)
                curveTo(15.0f, 4.03f, 15.24f, 4.0f, 15.5f, 4.0f)
                reflectiveCurveTo(16.0f, 4.03f, 16.27f, 4.08f)
                moveTo(8.0f, 8.5f)
                lineTo(11.08f, 9.27f)
                curveTo(11.03f, 9.0f, 11.0f, 8.76f, 11.0f, 8.5f)
                reflectiveCurveTo(11.03f, 8.0f, 11.08f, 7.73f)
                lineTo(8.0f, 8.5f)
                moveTo(18.63f, 10.04f)
                curveTo(18.86f, 9.58f, 19.0f, 9.06f, 19.0f, 8.5f)
                reflectiveCurveTo(18.86f, 7.42f, 18.63f, 6.96f)
                lineTo(21.0f, 3.0f)
                lineTo(17.04f, 5.37f)
                curveTo(16.58f, 5.14f, 16.06f, 5.0f, 15.5f, 5.0f)
                reflectiveCurveTo(14.42f, 5.14f, 13.96f, 5.37f)
                lineTo(10.0f, 3.0f)
                lineTo(12.37f, 6.96f)
                curveTo(12.14f, 7.42f, 12.0f, 7.94f, 12.0f, 8.5f)
                curveTo(12.0f, 10.43f, 13.57f, 12.0f, 15.5f, 12.0f)
                curveTo(16.06f, 12.0f, 16.58f, 11.86f, 17.04f, 11.63f)
                lineTo(21.0f, 14.0f)
                lineTo(18.63f, 10.04f)
                close()
            }
        }
        .build()
        return _mace!!
    }

private var _mace: ImageVector? = null
