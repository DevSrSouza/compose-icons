package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.UserMinus: ImageVector
    get() {
        if (_userMinus != null) {
            return _userMinus!!
        }
        _userMinus = Builder(name = "UserMinus", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 128.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcTo(128.0f, 128.0f, 0.0f, true, true, 96.0f, 128.0f)
                close()
                moveTo(0.0f, 482.3f)
                curveTo(0.0f, 383.8f, 79.8f, 304.0f, 178.3f, 304.0f)
                horizontalLineToRelative(91.4f)
                curveTo(368.2f, 304.0f, 448.0f, 383.8f, 448.0f, 482.3f)
                curveToRelative(0.0f, 16.4f, -13.3f, 29.7f, -29.7f, 29.7f)
                horizontalLineTo(29.7f)
                curveTo(13.3f, 512.0f, 0.0f, 498.7f, 0.0f, 482.3f)
                close()
                moveTo(472.0f, 200.0f)
                horizontalLineTo(616.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(472.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _userMinus!!
    }

private var _userMinus: ImageVector? = null
