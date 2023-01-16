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

public val MaterialDesignIcons.ScriptTextPlay: ImageVector
    get() {
        if (_scriptTextPlay != null) {
            return _scriptTextPlay!!
        }
        _scriptTextPlay = Builder(name = "ScriptTextPlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.8f, 22.0f)
                horizontalLineTo(5.0f)
                curveTo(3.3f, 22.0f, 2.0f, 20.7f, 2.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.1f)
                curveTo(13.0f, 18.3f, 13.0f, 18.7f, 13.0f, 19.0f)
                curveTo(13.0f, 20.1f, 13.3f, 21.1f, 13.8f, 22.0f)
                moveTo(13.8f, 16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 3.3f, 6.3f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(19.0f)
                curveTo(20.7f, 2.0f, 22.0f, 3.3f, 22.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(5.0f)
                curveTo(20.0f, 4.4f, 19.6f, 4.0f, 19.0f, 4.0f)
                reflectiveCurveTo(18.0f, 4.4f, 18.0f, 5.0f)
                verticalLineTo(13.1f)
                curveTo(16.2f, 13.4f, 14.7f, 14.5f, 13.8f, 16.0f)
                moveTo(8.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                moveTo(8.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                moveTo(17.0f, 16.0f)
                verticalLineTo(22.0f)
                lineTo(22.0f, 19.0f)
                lineTo(17.0f, 16.0f)
                close()
            }
        }
        .build()
        return _scriptTextPlay!!
    }

private var _scriptTextPlay: ImageVector? = null
