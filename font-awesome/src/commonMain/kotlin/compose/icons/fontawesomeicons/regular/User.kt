package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.User: ImageVector
    get() {
        if (_user != null) {
            return _user!!
        }
        _user = Builder(name = "User", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(304.0f, 128.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 160.0f, 0.0f)
                close()
                moveTo(96.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, true, 96.0f, 128.0f)
                close()
                moveTo(49.3f, 464.0f)
                horizontalLineTo(398.7f)
                curveToRelative(-8.9f, -63.3f, -63.3f, -112.0f, -129.0f, -112.0f)
                horizontalLineTo(178.3f)
                curveToRelative(-65.7f, 0.0f, -120.1f, 48.7f, -129.0f, 112.0f)
                close()
                moveTo(0.0f, 482.3f)
                curveTo(0.0f, 383.8f, 79.8f, 304.0f, 178.3f, 304.0f)
                horizontalLineToRelative(91.4f)
                curveTo(368.2f, 304.0f, 448.0f, 383.8f, 448.0f, 482.3f)
                curveToRelative(0.0f, 16.4f, -13.3f, 29.7f, -29.7f, 29.7f)
                horizontalLineTo(29.7f)
                curveTo(13.3f, 512.0f, 0.0f, 498.7f, 0.0f, 482.3f)
                close()
            }
        }
        .build()
        return _user!!
    }

private var _user: ImageVector? = null
