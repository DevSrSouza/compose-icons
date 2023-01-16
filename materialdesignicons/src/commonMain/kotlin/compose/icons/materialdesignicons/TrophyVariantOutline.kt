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

public val MaterialDesignIcons.TrophyVariantOutline: ImageVector
    get() {
        if (_trophyVariantOutline != null) {
            return _trophyVariantOutline!!
        }
        _trophyVariantOutline = Builder(name = "TrophyVariantOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 12.1f, 2.9f, 13.0f, 4.0f, 13.0f)
                horizontalLineTo(7.1f)
                curveTo(7.5f, 14.96f, 9.04f, 16.5f, 11.0f, 16.9f)
                verticalLineTo(19.08f)
                curveTo(8.0f, 19.54f, 8.0f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 22.0f, 16.0f, 19.54f, 13.0f, 19.08f)
                verticalLineTo(16.9f)
                curveTo(14.96f, 16.5f, 16.5f, 14.96f, 16.9f, 13.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 13.0f, 22.0f, 12.1f, 22.0f, 11.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                moveTo(4.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                lineTo(4.0f, 11.0f)
                moveTo(15.0f, 12.0f)
                curveTo(15.0f, 13.65f, 13.65f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(9.0f, 13.65f, 9.0f, 12.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                moveTo(20.0f, 11.0f)
                lineTo(17.0f, 11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                lineTo(20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _trophyVariantOutline!!
    }

private var _trophyVariantOutline: ImageVector? = null
