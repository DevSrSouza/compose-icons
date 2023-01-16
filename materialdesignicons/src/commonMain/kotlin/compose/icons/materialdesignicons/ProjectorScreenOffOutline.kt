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

public val MaterialDesignIcons.ProjectorScreenOffOutline: ImageVector
    get() {
        if (_projectorScreenOffOutline != null) {
            return _projectorScreenOffOutline!!
        }
        _projectorScreenOffOutline = Builder(name = "ProjectorScreenOffOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(5.0f, 6.89f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.59f)
                lineTo(6.79f, 20.79f)
                lineTo(8.21f, 22.21f)
                lineTo(11.0f, 19.41f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.41f)
                lineTo(15.79f, 22.21f)
                lineTo(17.21f, 20.79f)
                lineTo(13.0f, 16.59f)
                verticalLineTo(14.89f)
                lineTo(20.84f, 22.73f)
                moveTo(7.0f, 12.0f)
                verticalLineTo(8.89f)
                lineTo(10.11f, 12.0f)
                horizontalLineTo(7.0f)
                moveTo(8.2f, 5.0f)
                lineTo(5.2f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 2.0f, 21.0f, 2.45f, 21.0f, 3.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 4.55f, 20.55f, 5.0f, 20.0f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.2f)
                lineTo(15.2f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.2f)
                close()
            }
        }
        .build()
        return _projectorScreenOffOutline!!
    }

private var _projectorScreenOffOutline: ImageVector? = null
