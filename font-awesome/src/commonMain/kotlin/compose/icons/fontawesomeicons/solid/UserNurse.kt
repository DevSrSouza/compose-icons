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

public val SolidGroup.UserNurse: ImageVector
    get() {
        if (_userNurse != null) {
            return _userNurse!!
        }
        _userNurse = Builder(name = "UserNurse", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(319.41f, 320.0f)
                lineTo(224.0f, 415.39f)
                lineTo(128.59f, 320.0f)
                curveTo(57.1f, 323.1f, 0.0f, 381.6f, 0.0f, 453.79f)
                arcTo(58.21f, 58.21f, 0.0f, false, false, 58.21f, 512.0f)
                horizontalLineTo(389.79f)
                arcTo(58.21f, 58.21f, 0.0f, false, false, 448.0f, 453.79f)
                curveTo(448.0f, 381.6f, 390.9f, 323.1f, 319.41f, 320.0f)
                close()
                moveTo(224.0f, 304.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, false, 352.0f, 176.0f)
                verticalLineTo(65.82f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -20.76f, -30.0f)
                lineTo(246.47f, 4.07f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -44.94f, 0.0f)
                lineTo(116.76f, 35.86f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 96.0f, 65.82f)
                verticalLineTo(176.0f)
                arcTo(128.0f, 128.0f, 0.0f, false, false, 224.0f, 304.0f)
                close()
                moveTo(184.0f, 71.67f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(21.67f)
                verticalLineTo(45.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, -5.0f)
                horizontalLineToRelative(16.66f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineTo(66.67f)
                horizontalLineTo(259.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 5.0f, 5.0f)
                verticalLineTo(88.33f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineTo(237.33f)
                verticalLineTo(115.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, 5.0f)
                horizontalLineTo(215.67f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                verticalLineTo(93.33f)
                horizontalLineTo(189.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -5.0f, -5.0f)
                close()
                moveTo(144.0f, 160.0f)
                horizontalLineTo(304.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -160.0f, 0.0f)
                close()
            }
        }
        .build()
        return _userNurse!!
    }

private var _userNurse: ImageVector? = null
