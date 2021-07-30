package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Substack: ImageVector
    get() {
        if (_substack != null) {
            return _substack!!
        }
        _substack = Builder(name = "Substack", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.539f, 8.242f)
                horizontalLineTo(1.46f)
                verticalLineTo(5.406f)
                horizontalLineToRelative(21.08f)
                verticalLineToRelative(2.836f)
                close()
                moveTo(1.46f, 10.812f)
                verticalLineTo(24.0f)
                lineTo(12.0f, 18.11f)
                lineTo(22.54f, 24.0f)
                verticalLineTo(10.812f)
                horizontalLineTo(1.46f)
                close()
                moveTo(22.54f, 0.0f)
                horizontalLineTo(1.46f)
                verticalLineToRelative(2.836f)
                horizontalLineToRelative(21.08f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _substack!!
    }

private var _substack: ImageVector? = null
