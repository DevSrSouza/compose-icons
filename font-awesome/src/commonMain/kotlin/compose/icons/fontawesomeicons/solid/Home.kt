package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Home: ImageVector
    get() {
        if (_home != null) {
            return _home!!
        }
        _home = Builder(name = "Home", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(280.37f, 148.26f)
                lineTo(96.0f, 300.11f)
                verticalLineTo(464.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineToRelative(112.06f, -0.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.92f, -16.0f)
                verticalLineTo(368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(95.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.05f)
                lineTo(464.0f, 480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(300.0f)
                lineTo(295.67f, 148.26f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, false, -15.3f, 0.0f)
                close()
                moveTo(571.6f, 251.47f)
                lineTo(488.0f, 182.56f)
                verticalLineTo(44.05f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineToRelative(-56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(72.61f)
                lineTo(318.47f, 43.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -61.0f, 0.0f)
                lineTo(4.34f, 251.47f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.6f, 16.9f)
                lineToRelative(25.5f, 31.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 45.15f, 301.0f)
                lineToRelative(235.22f, -193.74f)
                arcToRelative(12.19f, 12.19f, 0.0f, false, true, 15.3f, 0.0f)
                lineTo(530.9f, 301.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.9f, -1.6f)
                lineToRelative(25.5f, -31.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -1.7f, -16.93f)
                close()
            }
        }
        .build()
        return _home!!
    }

private var _home: ImageVector? = null
