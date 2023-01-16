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

public val MaterialDesignIcons.ProjectorScreenOff: ImageVector
    get() {
        if (_projectorScreenOff != null) {
            return _projectorScreenOff!!
        }
        _projectorScreenOff = Builder(name = "ProjectorScreenOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 14.89f)
                verticalLineTo(16.59f)
                lineTo(17.21f, 20.79f)
                lineTo(15.79f, 22.21f)
                lineTo(13.0f, 19.41f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.41f)
                lineTo(8.21f, 22.21f)
                lineTo(6.79f, 20.79f)
                lineTo(11.0f, 16.59f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.89f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(13.0f, 14.89f)
                moveTo(19.0f, 14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 5.0f, 21.0f, 4.55f, 21.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(21.0f, 2.45f, 20.55f, 2.0f, 20.0f, 2.0f)
                horizontalLineTo(5.2f)
                lineTo(17.2f, 14.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _projectorScreenOff!!
    }

private var _projectorScreenOff: ImageVector? = null
