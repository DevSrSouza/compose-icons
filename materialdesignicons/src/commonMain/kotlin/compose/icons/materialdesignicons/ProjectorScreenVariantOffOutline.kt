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

public val MaterialDesignIcons.ProjectorScreenVariantOffOutline: ImageVector
    get() {
        if (_projectorScreenVariantOffOutline != null) {
            return _projectorScreenVariantOffOutline!!
        }
        _projectorScreenVariantOffOutline = Builder(name = "ProjectorScreenVariantOffOutline",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.11f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(3.0f, 8.55f, 3.45f, 9.0f, 4.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(7.0f, 16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.11f)
                lineTo(14.11f, 16.0f)
                horizontalLineTo(7.0f)
                moveTo(12.2f, 9.0f)
                lineTo(9.2f, 6.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 6.0f, 21.0f, 6.45f, 21.0f, 7.0f)
                verticalLineTo(8.0f)
                curveTo(21.0f, 8.55f, 20.55f, 9.0f, 20.0f, 9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.8f)
                lineTo(17.0f, 13.8f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.2f)
                close()
            }
        }
        .build()
        return _projectorScreenVariantOffOutline!!
    }

private var _projectorScreenVariantOffOutline: ImageVector? = null
