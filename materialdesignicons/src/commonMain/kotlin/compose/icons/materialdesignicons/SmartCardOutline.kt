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

public val MaterialDesignIcons.SmartCardOutline: ImageVector
    get() {
        if (_smartCardOutline != null) {
            return _smartCardOutline!!
        }
        _smartCardOutline = Builder(name = "SmartCardOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                horizontalLineTo(2.0f)
                arcTo(2.07f, 2.07f, 0.0f, false, false, 0.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.07f, 2.07f, 0.0f, false, false, 2.0f, 21.0f)
                horizontalLineTo(22.0f)
                arcTo(2.07f, 2.07f, 0.0f, false, false, 24.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.07f, 2.07f, 0.0f, false, false, 22.0f, 3.0f)
                moveTo(22.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                moveTo(14.0f, 17.0f)
                verticalLineTo(15.75f)
                curveTo(14.0f, 14.09f, 10.66f, 13.25f, 9.0f, 13.25f)
                reflectiveCurveTo(4.0f, 14.09f, 4.0f, 15.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                moveTo(9.0f, 7.0f)
                arcTo(2.5f, 2.5f, 0.0f, true, false, 11.5f, 9.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.0f, 7.0f)
                moveTo(15.0f, 10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
            }
        }
        .build()
        return _smartCardOutline!!
    }

private var _smartCardOutline: ImageVector? = null
