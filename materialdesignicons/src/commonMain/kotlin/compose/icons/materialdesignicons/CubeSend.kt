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

public val MaterialDesignIcons.CubeSend: ImageVector
    get() {
        if (_cubeSend != null) {
            return _cubeSend!!
        }
        _cubeSend = Builder(name = "CubeSend", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(9.0f, 8.04f)
                verticalLineTo(15.96f)
                lineTo(16.0f, 20.0f)
                lineTo(23.0f, 15.96f)
                verticalLineTo(8.04f)
                moveTo(16.0f, 6.31f)
                lineTo(19.8f, 8.5f)
                lineTo(16.0f, 10.69f)
                lineTo(12.21f, 8.5f)
                moveTo(0.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(11.0f, 10.11f)
                lineTo(15.0f, 12.42f)
                verticalLineTo(17.11f)
                lineTo(11.0f, 14.81f)
                moveTo(21.0f, 10.11f)
                verticalLineTo(14.81f)
                lineTo(17.0f, 17.11f)
                verticalLineTo(12.42f)
                moveTo(2.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                moveTo(4.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
            }
        }
        .build()
        return _cubeSend!!
    }

private var _cubeSend: ImageVector? = null
