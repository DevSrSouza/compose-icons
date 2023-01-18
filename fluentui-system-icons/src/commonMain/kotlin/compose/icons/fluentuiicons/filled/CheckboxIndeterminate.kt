package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.CheckboxIndeterminate: ImageVector
    get() {
        if (_checkboxIndeterminate != null) {
            return _checkboxIndeterminate!!
        }
        _checkboxIndeterminate = Builder(name = "CheckboxIndeterminate", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.25f, 3.0f)
                curveTo(4.4551f, 3.0f, 3.0f, 4.4551f, 3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.5449f, 4.4551f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 21.0f, 21.0f, 19.5449f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.4551f, 19.5449f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                close()
                moveTo(5.0f, 6.25f)
                curveTo(5.0f, 5.5596f, 5.5596f, 5.0f, 6.25f, 5.0f)
                horizontalLineTo(17.75f)
                curveTo(18.4404f, 5.0f, 19.0f, 5.5596f, 19.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(19.0f, 18.4404f, 18.4404f, 19.0f, 17.75f, 19.0f)
                horizontalLineTo(6.25f)
                curveTo(5.5596f, 19.0f, 5.0f, 18.4404f, 5.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(7.5f, 6.5f)
                curveTo(6.9477f, 6.5f, 6.5f, 6.9477f, 6.5f, 7.5f)
                verticalLineTo(16.5f)
                curveTo(6.5f, 17.0523f, 6.9477f, 17.5f, 7.5f, 17.5f)
                horizontalLineTo(16.5f)
                curveTo(17.0523f, 17.5f, 17.5f, 17.0523f, 17.5f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(17.5f, 6.9477f, 17.0523f, 6.5f, 16.5f, 6.5f)
                horizontalLineTo(7.5f)
                close()
            }
        }
        .build()
        return _checkboxIndeterminate!!
    }

private var _checkboxIndeterminate: ImageVector? = null
