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

public val MaterialDesignIcons.CameraSwitchOutline: ImageVector
    get() {
        if (_cameraSwitchOutline != null) {
            return _cameraSwitchOutline!!
        }
        _cameraSwitchOutline = Builder(name = "CameraSwitchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(16.8f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                lineTo(7.2f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 20.0f, 22.0f, 19.1f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                moveTo(9.9f, 4.0f)
                horizontalLineTo(14.1f)
                lineTo(15.9f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.1f)
                moveTo(15.0f, 11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.5f)
                lineTo(5.5f, 12.0f)
                lineTo(9.0f, 15.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.5f)
                lineTo(18.5f, 12.0f)
                lineTo(15.0f, 8.5f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _cameraSwitchOutline!!
    }

private var _cameraSwitchOutline: ImageVector? = null
