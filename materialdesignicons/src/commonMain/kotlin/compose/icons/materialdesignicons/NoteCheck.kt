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

public val MaterialDesignIcons.NoteCheck: ImageVector
    get() {
        if (_noteCheck != null) {
            return _noteCheck!!
        }
        _noteCheck = Builder(name = "NoteCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveTo(19.7f, 13.0f, 20.37f, 13.13f, 21.0f, 13.35f)
                verticalLineTo(9.0f)
                lineTo(15.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(13.35f)
                curveTo(13.13f, 20.37f, 13.0f, 19.7f, 13.0f, 19.0f)
                curveTo(13.0f, 15.69f, 15.69f, 13.0f, 19.0f, 13.0f)
                moveTo(14.0f, 4.5f)
                lineTo(19.5f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                moveTo(22.5f, 17.25f)
                lineTo(17.75f, 22.0f)
                lineTo(15.0f, 19.0f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
                close()
            }
        }
        .build()
        return _noteCheck!!
    }

private var _noteCheck: ImageVector? = null
