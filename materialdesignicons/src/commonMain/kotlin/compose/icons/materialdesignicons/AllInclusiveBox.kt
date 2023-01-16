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

public val MaterialDesignIcons.AllInclusiveBox: ImageVector
    get() {
        if (_allInclusiveBox != null) {
            return _allInclusiveBox!!
        }
        _allInclusiveBox = Builder(name = "AllInclusiveBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(16.1f, 15.9f)
                curveTo(15.07f, 15.9f, 14.09f, 15.5f, 13.35f, 14.76f)
                lineTo(12.71f, 14.12f)
                lineTo(14.13f, 12.71f)
                lineTo(14.76f, 13.34f)
                curveTo(15.12f, 13.7f, 15.6f, 13.9f, 16.11f, 13.9f)
                curveTo(17.15f, 13.9f, 18.0f, 13.05f, 18.0f, 12.0f)
                reflectiveCurveTo(17.15f, 10.1f, 16.1f, 10.1f)
                curveTo(15.6f, 10.1f, 15.12f, 10.3f, 14.76f, 10.66f)
                lineTo(10.65f, 14.76f)
                curveTo(9.91f, 15.5f, 8.94f, 15.9f, 7.9f, 15.9f)
                curveTo(5.75f, 15.9f, 4.0f, 14.15f, 4.0f, 12.0f)
                reflectiveCurveTo(5.75f, 8.1f, 7.9f, 8.1f)
                curveTo(8.94f, 8.1f, 9.91f, 8.5f, 10.65f, 9.24f)
                lineTo(11.29f, 9.88f)
                lineTo(9.87f, 11.3f)
                lineTo(9.24f, 10.66f)
                curveTo(8.88f, 10.3f, 8.4f, 10.1f, 7.9f, 10.1f)
                curveTo(6.85f, 10.1f, 6.0f, 10.95f, 6.0f, 12.0f)
                reflectiveCurveTo(6.85f, 13.9f, 7.9f, 13.9f)
                curveTo(8.4f, 13.9f, 8.88f, 13.7f, 9.24f, 13.34f)
                lineTo(13.35f, 9.24f)
                curveTo(14.09f, 8.5f, 15.06f, 8.1f, 16.1f, 8.1f)
                curveTo(18.25f, 8.1f, 20.0f, 9.85f, 20.0f, 12.0f)
                reflectiveCurveTo(18.25f, 15.9f, 16.1f, 15.9f)
                close()
            }
        }
        .build()
        return _allInclusiveBox!!
    }

private var _allInclusiveBox: ImageVector? = null
