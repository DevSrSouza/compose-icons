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

public val MaterialDesignIcons.ContentSaveEditOutline: ImageVector
    get() {
        if (_contentSaveEditOutline != null) {
            return _contentSaveEditOutline!!
        }
        _contentSaveEditOutline = Builder(name = "ContentSaveEditOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 3.9f, 2.89f, 3.0f, 4.0f, 3.0f)
                horizontalLineTo(16.0f)
                lineTo(20.0f, 7.0f)
                verticalLineTo(9.12f)
                lineTo(18.0f, 11.12f)
                verticalLineTo(7.83f)
                lineTo(15.17f, 5.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 10.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                moveTo(20.42f, 12.3f)
                curveTo(20.31f, 12.19f, 20.18f, 12.13f, 20.04f, 12.13f)
                curveTo(19.9f, 12.13f, 19.76f, 12.19f, 19.65f, 12.3f)
                lineTo(18.65f, 13.3f)
                lineTo(20.7f, 15.35f)
                lineTo(21.7f, 14.35f)
                curveTo(21.92f, 14.14f, 21.92f, 13.79f, 21.7f, 13.58f)
                lineTo(20.42f, 12.3f)
                moveTo(12.0f, 19.94f)
                verticalLineTo(22.0f)
                horizontalLineTo(14.06f)
                lineTo(20.12f, 15.93f)
                lineTo(18.07f, 13.88f)
                lineTo(12.0f, 19.94f)
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 13.34f, 12.66f, 12.0f, 11.0f, 12.0f)
                reflectiveCurveTo(8.0f, 13.34f, 8.0f, 15.0f)
                reflectiveCurveTo(9.34f, 18.0f, 11.0f, 18.0f)
                curveTo(11.04f, 18.0f, 11.08f, 18.0f, 11.13f, 18.0f)
                lineTo(14.0f, 15.13f)
                curveTo(14.0f, 15.09f, 14.0f, 15.05f, 14.0f, 15.0f)
            }
        }
        .build()
        return _contentSaveEditOutline!!
    }

private var _contentSaveEditOutline: ImageVector? = null
