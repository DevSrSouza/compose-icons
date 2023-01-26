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

public val SharpGroup.ViewCompact: ImageVector
    get() {
        if (_viewCompact != null) {
            return _viewCompact!!
        }
        _viewCompact = Builder(name = "ViewCompact", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(4.0f, 13.25f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.25f)
                close()
                moveTo(4.0f, 8.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.5f)
                close()
                moveTo(17.5f, 6.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.5f)
                close()
                moveTo(13.0f, 8.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.5f)
                close()
                moveTo(17.5f, 18.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(17.5f, 13.25f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(13.25f)
                close()
                moveTo(8.5f, 18.0f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(18.0f)
                close()
                moveTo(13.0f, 18.0f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(8.5f, 8.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.5f)
                verticalLineTo(8.5f)
                close()
                moveTo(13.0f, 13.25f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.25f)
                close()
                moveTo(8.5f, 13.25f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-2.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(13.25f)
                close()
            }
        }
        .build()
        return _viewCompact!!
    }

private var _viewCompact: ImageVector? = null
