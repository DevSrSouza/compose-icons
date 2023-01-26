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

public val SharpGroup.NewLabel: ImageVector
    get() {
        if (_newLabel != null) {
            return _newLabel!!
        }
        _newLabel = Builder(name = "NewLabel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                lineToRelative(-4.97f, 7.0f)
                horizontalLineTo(12.0f)
                lineToRelative(0.0f, -2.0f)
                lineToRelative(0.0f, -4.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(13.03f)
                lineTo(21.0f, 12.0f)
                close()
                moveTo(10.0f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _newLabel!!
    }

private var _newLabel: ImageVector? = null
