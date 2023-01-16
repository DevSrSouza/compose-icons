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

public val MaterialDesignIcons.NoteAlertOutline: ImageVector
    get() {
        if (_noteAlertOutline != null) {
            return _noteAlertOutline!!
        }
        _noteAlertOutline = Builder(name = "NoteAlertOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(1.89f, 3.0f, 1.0f, 3.89f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.1f, 1.89f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.11f, 21.0f, 19.0f, 20.11f, 19.0f, 19.0f)
                verticalLineTo(9.0f)
                lineTo(13.0f, 3.0f)
                horizontalLineTo(3.0f)
                moveTo(17.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 10.0f)
                verticalLineTo(4.5f)
                lineTo(17.5f, 10.0f)
                horizontalLineTo(12.0f)
                moveTo(23.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                moveTo(21.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _noteAlertOutline!!
    }

private var _noteAlertOutline: ImageVector? = null
