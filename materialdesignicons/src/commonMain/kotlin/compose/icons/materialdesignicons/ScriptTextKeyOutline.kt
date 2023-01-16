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

public val MaterialDesignIcons.ScriptTextKeyOutline: ImageVector
    get() {
        if (_scriptTextKeyOutline != null) {
            return _scriptTextKeyOutline!!
        }
        _scriptTextKeyOutline = Builder(name = "ScriptTextKeyOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8f, 19.0f)
                curveTo(17.4f, 17.8f, 16.3f, 17.0f, 15.0f, 17.0f)
                curveTo(13.3f, 17.0f, 12.0f, 18.3f, 12.0f, 20.0f)
                reflectiveCurveTo(13.3f, 23.0f, 15.0f, 23.0f)
                curveTo(16.3f, 23.0f, 17.4f, 22.2f, 17.8f, 21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.8f)
                moveTo(15.0f, 21.3f)
                curveTo(14.3f, 21.3f, 13.7f, 20.7f, 13.7f, 20.0f)
                reflectiveCurveTo(14.3f, 18.7f, 15.0f, 18.7f)
                reflectiveCurveTo(16.3f, 19.3f, 16.3f, 20.0f)
                reflectiveCurveTo(15.7f, 21.3f, 15.0f, 21.3f)
                moveTo(9.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(10.0f)
                moveTo(9.0f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 4.4f, 7.4f, 4.0f, 8.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.1f)
                curveTo(16.7f, 15.3f, 17.4f, 15.6f, 18.0f, 16.0f)
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
                moveTo(10.0f, 20.0f)
                curveTo(10.0f, 19.3f, 10.1f, 18.6f, 10.4f, 18.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 20.7f, 3.3f, 22.0f, 5.0f, 22.0f)
                horizontalLineTo(10.4f)
                curveTo(10.1f, 21.4f, 10.0f, 20.7f, 10.0f, 20.0f)
                moveTo(9.0f, 16.0f)
                horizontalLineTo(12.0f)
                curveTo(12.6f, 15.6f, 13.3f, 15.2f, 14.0f, 15.1f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _scriptTextKeyOutline!!
    }

private var _scriptTextKeyOutline: ImageVector? = null
