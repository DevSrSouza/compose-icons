package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.AlignVerticalBottom: ImageVector
    get() {
        if (_alignVerticalBottom != null) {
            return _alignVerticalBottom!!
        }
        _alignVerticalBottom = Builder(name = "AlignVerticalBottom", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(10.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(17.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _alignVerticalBottom!!
    }

private var _alignVerticalBottom: ImageVector? = null
