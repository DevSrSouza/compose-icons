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

public val MaterialDesignIcons.HelpCircle: ImageVector
    get() {
        if (_helpCircle != null) {
            return _helpCircle!!
        }
        _helpCircle = Builder(name = "HelpCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.07f, 11.25f)
                lineTo(14.17f, 12.17f)
                curveTo(13.45f, 12.89f, 13.0f, 13.5f, 13.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.5f)
                curveTo(11.0f, 13.39f, 11.45f, 12.39f, 12.17f, 11.67f)
                lineTo(13.41f, 10.41f)
                curveTo(13.78f, 10.05f, 14.0f, 9.55f, 14.0f, 9.0f)
                curveTo(14.0f, 7.89f, 13.1f, 7.0f, 12.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 9.0f)
                horizontalLineTo(8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 9.0f)
                curveTo(16.0f, 9.88f, 15.64f, 10.67f, 15.07f, 11.25f)
                moveTo(13.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 22.0f, 12.0f)
                curveTo(22.0f, 6.47f, 17.5f, 2.0f, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _helpCircle!!
    }

private var _helpCircle: ImageVector? = null
