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

public val MaterialDesignIcons.ScriptTextPlayOutline: ImageVector
    get() {
        if (_scriptTextPlayOutline != null) {
            return _scriptTextPlayOutline!!
        }
        _scriptTextPlayOutline = Builder(name = "ScriptTextPlayOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.7f)
                curveTo(13.9f, 15.8f, 13.9f, 15.9f, 13.8f, 16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                moveTo(9.0f, 12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                moveTo(9.0f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 4.4f, 7.4f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.8f)
                curveTo(16.6f, 13.4f, 17.3f, 13.2f, 18.0f, 13.1f)
                verticalLineTo(5.0f)
                curveTo(18.0f, 4.4f, 18.4f, 4.0f, 19.0f, 4.0f)
                reflectiveCurveTo(20.0f, 4.4f, 20.0f, 5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                curveTo(22.0f, 3.3f, 20.7f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.3f, 2.0f, 5.0f, 3.3f, 5.0f, 5.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                moveTo(13.0f, 19.0f)
                verticalLineTo(18.4f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.7f, 3.3f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(13.8f)
                curveTo(13.3f, 21.1f, 13.0f, 20.1f, 13.0f, 19.0f)
                moveTo(17.0f, 16.0f)
                verticalLineTo(22.0f)
                lineTo(22.0f, 19.0f)
                lineTo(17.0f, 16.0f)
                close()
            }
        }
        .build()
        return _scriptTextPlayOutline!!
    }

private var _scriptTextPlayOutline: ImageVector? = null
