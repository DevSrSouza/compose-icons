package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AccountBoxFill: ImageVector
    get() {
        if (_accountBoxFill != null) {
            return _accountBoxFill!!
        }
        _accountBoxFill = Builder(name = "AccountBoxFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.995f)
                curveTo(3.0f, 3.893f, 3.893f, 3.0f, 4.995f, 3.0f)
                horizontalLineToRelative(14.01f)
                curveTo(20.107f, 3.0f, 21.0f, 3.893f, 21.0f, 4.995f)
                verticalLineToRelative(14.01f)
                arcTo(1.995f, 1.995f, 0.0f, false, true, 19.005f, 21.0f)
                horizontalLineTo(4.995f)
                arcTo(1.995f, 1.995f, 0.0f, false, true, 3.0f, 19.005f)
                verticalLineTo(4.995f)
                close()
                moveTo(6.357f, 18.0f)
                horizontalLineToRelative(11.49f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, false, -5.745f, -3.0f)
                arcToRelative(6.992f, 6.992f, 0.0f, false, false, -5.745f, 3.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, false, 0.0f, -7.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, 7.0f)
                close()
            }
        }
        .build()
        return _accountBoxFill!!
    }

private var _accountBoxFill: ImageVector? = null
