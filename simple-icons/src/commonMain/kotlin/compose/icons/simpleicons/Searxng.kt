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

public val SimpleIcons.Searxng: ImageVector
    get() {
        if (_searxng != null) {
            return _searxng!!
        }
        _searxng = Builder(name = "Searxng", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(13.716f, 17.261f)
                lineToRelative(6.873f, 6.582f)
                lineTo(24.0f, 20.282f)
                lineToRelative(-6.824f, -6.536f)
                arcToRelative(9.11f, 9.11f, 0.0f, false, false, 1.143f, -4.43f)
                curveToRelative(0.0f, -5.055f, -4.105f, -9.159f, -9.16f, -9.159f)
                reflectiveCurveTo(0.0f, 4.261f, 0.0f, 9.316f)
                curveToRelative(0.0f, 5.055f, 4.104f, 9.159f, 9.159f, 9.159f)
                arcToRelative(9.11f, 9.11f, 0.0f, false, false, 4.557f, -1.214f)
                close()
                moveTo(9.159f, 2.773f)
                arcToRelative(6.546f, 6.546f, 0.0f, false, true, 6.543f, 6.543f)
                arcToRelative(6.545f, 6.545f, 0.0f, false, true, -6.543f, 6.542f)
                arcToRelative(6.545f, 6.545f, 0.0f, false, true, -6.542f, -6.542f)
                arcToRelative(6.545f, 6.545f, 0.0f, false, true, 6.542f, -6.543f)
                close()
                moveTo(7.26f, 5.713f)
                arcToRelative(4.065f, 4.065f, 0.0f, false, true, 4.744f, 0.747f)
                arcToRelative(4.064f, 4.064f, 0.0f, false, true, 0.707f, 4.749f)
                lineToRelative(1.157f, 0.611f)
                arcToRelative(5.376f, 5.376f, 0.0f, false, false, -0.935f, -6.282f)
                arcToRelative(5.377f, 5.377f, 0.0f, false, false, -6.274f, -0.987f)
                lineToRelative(0.601f, 1.162f)
                close()
            }
        }
        .build()
        return _searxng!!
    }

private var _searxng: ImageVector? = null
