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

public val RemixIcons.GitlabLine: ImageVector
    get() {
        if (_gitlabLine != null) {
            return _gitlabLine!!
        }
        _gitlabLine = Builder(name = "GitlabLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.68f, 7.314f)
                lineToRelative(-1.82f, 5.914f)
                lineTo(12.0f, 19.442f)
                lineToRelative(8.14f, -6.214f)
                lineToRelative(-1.82f, -5.914f)
                lineTo(16.643f, 11.0f)
                horizontalLineTo(7.356f)
                lineTo(5.681f, 7.314f)
                close()
                moveTo(15.357f, 9.0f)
                lineToRelative(2.888f, -6.354f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.747f, 0.048f)
                lineToRelative(3.367f, 10.945f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.174f, 0.544f)
                lineTo(12.0f, 21.958f)
                lineTo(1.816f, 14.183f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.174f, -0.544f)
                lineTo(5.009f, 2.694f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.747f, -0.048f)
                lineTo(8.644f, 9.0f)
                horizontalLineToRelative(6.712f)
                close()
            }
        }
        .build()
        return _gitlabLine!!
    }

private var _gitlabLine: ImageVector? = null
