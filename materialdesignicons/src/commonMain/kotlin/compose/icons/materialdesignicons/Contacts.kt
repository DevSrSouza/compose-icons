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

public val MaterialDesignIcons.Contacts: ImageVector
    get() {
        if (_contacts != null) {
            return _contacts!!
        }
        _contacts = Builder(name = "Contacts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 0.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(0.0f)
                moveTo(4.0f, 24.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(24.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 4.0f)
                moveTo(12.0f, 6.75f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 14.25f, 9.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 12.0f, 11.25f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 9.75f, 9.0f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 12.0f, 6.75f)
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.5f)
                curveTo(7.0f, 13.83f, 10.33f, 13.0f, 12.0f, 13.0f)
                curveTo(13.67f, 13.0f, 17.0f, 13.83f, 17.0f, 15.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _contacts!!
    }

private var _contacts: ImageVector? = null
