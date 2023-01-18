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

public val RemixIcons.Translate2: ImageVector
    get() {
        if (_translate2 != null) {
            return _translate2!!
        }
        _translate2 = Builder(name = "Translate2", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 10.0f)
                lineToRelative(4.4f, 11.0f)
                horizontalLineToRelative(-2.155f)
                lineToRelative(-1.201f, -3.0f)
                horizontalLineToRelative(-4.09f)
                lineToRelative(-1.199f, 3.0f)
                horizontalLineToRelative(-2.154f)
                lineTo(16.5f, 10.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(10.0f, 2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.968f)
                arcToRelative(18.222f, 18.222f, 0.0f, false, true, -3.62f, 6.301f)
                arcToRelative(14.864f, 14.864f, 0.0f, false, false, 2.336f, 1.707f)
                lineToRelative(-0.751f, 1.878f)
                arcTo(17.015f, 17.015f, 0.0f, false, true, 9.0f, 13.725f)
                arcToRelative(16.676f, 16.676f, 0.0f, false, true, -6.201f, 3.548f)
                lineToRelative(-0.536f, -1.929f)
                arcToRelative(14.7f, 14.7f, 0.0f, false, false, 5.327f, -3.042f)
                arcTo(18.078f, 18.078f, 0.0f, false, true, 4.767f, 8.0f)
                horizontalLineToRelative(2.24f)
                arcTo(16.032f, 16.032f, 0.0f, false, false, 9.0f, 10.877f)
                arcToRelative(16.165f, 16.165f, 0.0f, false, false, 2.91f, -4.876f)
                lineTo(2.0f, 6.0f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(6.0f)
                lineTo(8.0f, 2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(17.5f, 12.885f)
                lineTo(16.253f, 16.0f)
                horizontalLineToRelative(2.492f)
                lineTo(17.5f, 12.885f)
                close()
            }
        }
        .build()
        return _translate2!!
    }

private var _translate2: ImageVector? = null
