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

public val FilledGroup.CheckboxUnchecked: ImageVector
    get() {
        if (_checkboxUnchecked != null) {
            return _checkboxUnchecked!!
        }
        _checkboxUnchecked = Builder(name = "CheckboxUnchecked", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                curveTo(3.0f, 4.4551f, 4.4551f, 3.0f, 6.25f, 3.0f)
                horizontalLineTo(17.75f)
                curveTo(19.5449f, 3.0f, 21.0f, 4.4551f, 21.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(21.0f, 19.5449f, 19.5449f, 21.0f, 17.75f, 21.0f)
                horizontalLineTo(6.25f)
                curveTo(4.4551f, 21.0f, 3.0f, 19.5449f, 3.0f, 17.75f)
                verticalLineTo(6.25f)
                close()
                moveTo(6.25f, 5.0f)
                curveTo(5.5596f, 5.0f, 5.0f, 5.5596f, 5.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(5.0f, 18.4404f, 5.5596f, 19.0f, 6.25f, 19.0f)
                horizontalLineTo(17.75f)
                curveTo(18.4404f, 19.0f, 19.0f, 18.4404f, 19.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(19.0f, 5.5596f, 18.4404f, 5.0f, 17.75f, 5.0f)
                horizontalLineTo(6.25f)
                close()
            }
        }
        .build()
        return _checkboxUnchecked!!
    }

private var _checkboxUnchecked: ImageVector? = null
