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

public val MaterialDesignIcons.CheckUnderlineCircleOutline: ImageVector
    get() {
        if (_checkUnderlineCircleOutline != null) {
            return _checkUnderlineCircleOutline!!
        }
        _checkUnderlineCircleOutline = Builder(name = "CheckUnderlineCircleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 2.0f)
                moveTo(12.0f, 20.0f)
                curveTo(7.59f, 20.0f, 4.0f, 16.41f, 4.0f, 12.0f)
                curveTo(4.0f, 7.59f, 7.59f, 4.0f, 12.0f, 4.0f)
                curveTo(16.41f, 4.0f, 20.0f, 7.59f, 20.0f, 12.0f)
                curveTo(20.0f, 16.41f, 16.41f, 20.0f, 12.0f, 20.0f)
                moveTo(7.0f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                moveTo(10.3f, 11.2f)
                lineTo(8.4f, 9.3f)
                lineTo(7.0f, 10.7f)
                lineTo(10.3f, 14.0f)
                lineTo(17.0f, 7.3f)
                lineTo(15.6f, 5.9f)
                lineTo(10.3f, 11.2f)
                close()
            }
        }
        .build()
        return _checkUnderlineCircleOutline!!
    }

private var _checkUnderlineCircleOutline: ImageVector? = null
