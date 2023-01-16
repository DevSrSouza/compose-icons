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

public val MaterialDesignIcons.HelpRhombusOutline: ImageVector
    get() {
        if (_helpRhombusOutline != null) {
            return _helpRhombusOutline!!
        }
        _helpRhombusOutline = Builder(name = "HelpRhombusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 15.5f)
                horizontalLineTo(12.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.5f)
                moveTo(12.0f, 6.95f)
                curveTo(14.7f, 7.06f, 15.87f, 9.78f, 14.28f, 11.81f)
                curveTo(13.86f, 12.31f, 13.19f, 12.64f, 12.85f, 13.07f)
                curveTo(12.5f, 13.5f, 12.5f, 14.0f, 12.5f, 14.5f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 13.65f, 11.0f, 12.94f, 11.35f, 12.44f)
                curveTo(11.68f, 11.94f, 12.35f, 11.64f, 12.77f, 11.31f)
                curveTo(14.0f, 10.18f, 13.68f, 8.59f, 12.0f, 8.46f)
                curveTo(11.18f, 8.46f, 10.5f, 9.13f, 10.5f, 9.97f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 8.3f, 10.35f, 6.95f, 12.0f, 6.95f)
                moveTo(12.0f, 2.0f)
                curveTo(11.5f, 2.0f, 11.0f, 2.19f, 10.59f, 2.59f)
                lineTo(2.59f, 10.59f)
                curveTo(1.8f, 11.37f, 1.8f, 12.63f, 2.59f, 13.41f)
                lineTo(10.59f, 21.41f)
                curveTo(11.37f, 22.2f, 12.63f, 22.2f, 13.41f, 21.41f)
                lineTo(21.41f, 13.41f)
                curveTo(22.2f, 12.63f, 22.2f, 11.37f, 21.41f, 10.59f)
                lineTo(13.41f, 2.59f)
                curveTo(13.0f, 2.19f, 12.5f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                lineTo(20.0f, 12.0f)
                lineTo(12.0f, 20.0f)
                lineTo(4.0f, 12.0f)
                close()
            }
        }
        .build()
        return _helpRhombusOutline!!
    }

private var _helpRhombusOutline: ImageVector? = null
