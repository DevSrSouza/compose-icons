package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Difference: ImageVector
    get() {
        if (_difference != null) {
            return _difference!!
        }
        _difference = Builder(name = "Difference", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 23.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(23.0f)
                close()
                moveTo(15.0f, 1.0f)
                horizontalLineTo(6.01f)
                lineTo(6.0f, 19.0f)
                horizontalLineToRelative(15.0f)
                verticalLineTo(7.0f)
                lineTo(15.0f, 1.0f)
                close()
                moveTo(16.5f, 15.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(16.5f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _difference!!
    }

private var _difference: ImageVector? = null