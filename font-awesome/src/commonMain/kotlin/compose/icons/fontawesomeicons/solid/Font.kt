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

public val SolidGroup.Font: ImageVector
    get() {
        if (_font != null) {
            return _font!!
        }
        _font = Builder(name = "Font", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 416.0f)
                horizontalLineToRelative(-23.41f)
                lineTo(277.88f, 53.69f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 247.58f, 32.0f)
                horizontalLineToRelative(-47.16f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -30.3f, 21.69f)
                lineTo(39.41f, 416.0f)
                horizontalLineTo(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-19.58f)
                lineToRelative(23.3f, -64.0f)
                horizontalLineToRelative(152.56f)
                lineToRelative(23.3f, 64.0f)
                horizontalLineTo(304.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(176.85f, 272.0f)
                lineTo(224.0f, 142.51f)
                lineTo(271.15f, 272.0f)
                close()
            }
        }
        .build()
        return _font!!
    }

private var _font: ImageVector? = null
