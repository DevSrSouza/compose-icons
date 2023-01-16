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

public val MaterialDesignIcons.GlobeLightOutline: ImageVector
    get() {
        if (_globeLightOutline != null) {
            return _globeLightOutline!!
        }
        _globeLightOutline = Builder(name = "GlobeLightOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.08f)
                verticalLineTo(2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.08f)
                curveTo(7.61f, 8.57f, 5.0f, 11.47f, 5.0f, 15.0f)
                curveTo(5.0f, 18.87f, 8.13f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(19.0f, 18.87f, 19.0f, 15.0f)
                curveTo(19.0f, 11.47f, 16.39f, 8.57f, 13.0f, 8.08f)
                moveTo(12.0f, 20.0f)
                curveTo(9.24f, 20.0f, 7.0f, 17.76f, 7.0f, 15.0f)
                curveTo(7.0f, 13.87f, 7.39f, 12.84f, 8.03f, 12.0f)
                horizontalLineTo(15.97f)
                curveTo(16.61f, 12.84f, 17.0f, 13.87f, 17.0f, 15.0f)
                curveTo(17.0f, 17.76f, 14.76f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _globeLightOutline!!
    }

private var _globeLightOutline: ImageVector? = null
