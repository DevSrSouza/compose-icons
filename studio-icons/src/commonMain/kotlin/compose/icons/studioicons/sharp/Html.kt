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

public val SharpGroup.Html: ImageVector
    get() {
        if (_html != null) {
            return _html!!
        }
        _html = Builder(name = "Html", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(18.5f, 9.0f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(-3.51f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(9.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.75f)
                verticalLineTo(15.0f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(24.0f, 15.0f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(6.0f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _html!!
    }

private var _html: ImageVector? = null
