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

public val MaterialDesignIcons.TagArrowDownOutline: ImageVector
    get() {
        if (_tagArrowDownOutline != null) {
            return _tagArrowDownOutline!!
        }
        _tagArrowDownOutline = Builder(name = "TagArrowDownOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 5.0f)
                curveTo(5.67f, 5.0f, 5.0f, 5.67f, 5.0f, 6.5f)
                reflectiveCurveTo(5.67f, 8.0f, 6.5f, 8.0f)
                reflectiveCurveTo(8.0f, 7.33f, 8.0f, 6.5f)
                reflectiveCurveTo(7.33f, 5.0f, 6.5f, 5.0f)
                moveTo(6.5f, 5.0f)
                curveTo(5.67f, 5.0f, 5.0f, 5.67f, 5.0f, 6.5f)
                reflectiveCurveTo(5.67f, 8.0f, 6.5f, 8.0f)
                reflectiveCurveTo(8.0f, 7.33f, 8.0f, 6.5f)
                reflectiveCurveTo(7.33f, 5.0f, 6.5f, 5.0f)
                moveTo(21.41f, 11.58f)
                lineTo(12.41f, 2.58f)
                curveTo(12.04f, 2.21f, 11.53f, 2.0f, 11.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 11.53f, 2.21f, 12.04f, 2.59f, 12.42f)
                lineTo(3.0f, 12.82f)
                curveTo(3.64f, 12.44f, 4.35f, 12.19f, 5.08f, 12.08f)
                lineTo(4.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                lineTo(20.0f, 13.0f)
                lineTo(13.0f, 20.0f)
                lineTo(11.92f, 18.92f)
                curveTo(11.82f, 19.66f, 11.56f, 20.36f, 11.18f, 21.0f)
                lineTo(11.59f, 21.41f)
                curveTo(11.96f, 21.79f, 12.47f, 22.0f, 13.0f, 22.0f)
                curveTo(13.53f, 22.0f, 14.04f, 21.79f, 14.41f, 21.41f)
                lineTo(21.41f, 14.41f)
                curveTo(21.79f, 14.04f, 22.0f, 13.53f, 22.0f, 13.0f)
                curveTo(22.0f, 12.47f, 21.79f, 11.96f, 21.41f, 11.58f)
                moveTo(6.5f, 5.0f)
                curveTo(5.67f, 5.0f, 5.0f, 5.67f, 5.0f, 6.5f)
                reflectiveCurveTo(5.67f, 8.0f, 6.5f, 8.0f)
                reflectiveCurveTo(8.0f, 7.33f, 8.0f, 6.5f)
                reflectiveCurveTo(7.33f, 5.0f, 6.5f, 5.0f)
                moveTo(8.0f, 18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                lineTo(7.0f, 21.0f)
                lineTo(10.0f, 18.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _tagArrowDownOutline!!
    }

private var _tagArrowDownOutline: ImageVector? = null
