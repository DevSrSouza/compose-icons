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

public val MaterialDesignIcons.ScriptText: ImageVector
    get() {
        if (_scriptText != null) {
            return _scriptText!!
        }
        _scriptText = Builder(name = "ScriptText", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8f, 20.0f)
                curveTo(17.4f, 21.2f, 16.3f, 22.0f, 15.0f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3f, 22.0f, 2.0f, 20.7f, 2.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(5.0f)
                lineTo(14.2f, 18.0f)
                curveTo(14.6f, 19.2f, 15.7f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(17.8f)
                moveTo(19.0f, 2.0f)
                curveTo(20.7f, 2.0f, 22.0f, 3.3f, 22.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 4.4f, 19.6f, 4.0f, 19.0f, 4.0f)
                curveTo(18.4f, 4.0f, 18.0f, 4.4f, 18.0f, 5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                curveTo(16.4f, 18.0f, 16.0f, 17.6f, 16.0f, 17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 3.3f, 6.3f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(19.0f)
                moveTo(8.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                moveTo(8.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _scriptText!!
    }

private var _scriptText: ImageVector? = null
