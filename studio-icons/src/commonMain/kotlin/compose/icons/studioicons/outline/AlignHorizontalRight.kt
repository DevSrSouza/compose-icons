package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AlignHorizontalRight: ImageVector
    get() {
        if (_alignHorizontalRight != null) {
            return _alignHorizontalRight!!
        }
        _alignHorizontalRight = Builder(name = "AlignHorizontalRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(2.0f, 10.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                close()
                moveTo(8.0f, 17.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _alignHorizontalRight!!
    }

private var _alignHorizontalRight: ImageVector? = null
