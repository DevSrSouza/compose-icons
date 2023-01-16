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

public val MaterialDesignIcons.NoteSearchOutline: ImageVector
    get() {
        if (_noteSearchOutline != null) {
            return _noteSearchOutline!!
        }
        _noteSearchOutline = Builder(name = "NoteSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(10.82f)
                curveTo(3.6f, 10.24f, 4.28f, 9.8f, 5.0f, 9.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.82f)
                curveTo(12.03f, 10.85f, 12.07f, 10.87f, 12.1f, 10.9f)
                curveTo(12.44f, 11.24f, 12.73f, 11.61f, 12.97f, 12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.97f)
                curveTo(12.73f, 19.39f, 12.44f, 19.76f, 12.1f, 20.1f)
                curveTo(11.74f, 20.45f, 11.35f, 20.74f, 10.94f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 21.0f, 21.0f, 20.11f, 21.0f, 19.0f)
                verticalLineTo(9.0f)
                lineTo(15.0f, 3.0f)
                moveTo(14.0f, 10.0f)
                verticalLineTo(4.5f)
                lineTo(19.5f, 10.0f)
                horizontalLineTo(14.0f)
                moveTo(7.5f, 11.0f)
                curveTo(5.0f, 11.0f, 3.0f, 13.0f, 3.0f, 15.5f)
                curveTo(3.0f, 16.38f, 3.25f, 17.21f, 3.69f, 17.9f)
                lineTo(0.61f, 21.0f)
                lineTo(2.0f, 22.39f)
                lineTo(5.12f, 19.32f)
                curveTo(5.81f, 19.75f, 6.63f, 20.0f, 7.5f, 20.0f)
                curveTo(10.0f, 20.0f, 12.0f, 18.0f, 12.0f, 15.5f)
                reflectiveCurveTo(10.0f, 11.0f, 7.5f, 11.0f)
                moveTo(7.5f, 18.0f)
                curveTo(6.12f, 18.0f, 5.0f, 16.88f, 5.0f, 15.5f)
                reflectiveCurveTo(6.12f, 13.0f, 7.5f, 13.0f)
                reflectiveCurveTo(10.0f, 14.12f, 10.0f, 15.5f)
                reflectiveCurveTo(8.88f, 18.0f, 7.5f, 18.0f)
                close()
            }
        }
        .build()
        return _noteSearchOutline!!
    }

private var _noteSearchOutline: ImageVector? = null
