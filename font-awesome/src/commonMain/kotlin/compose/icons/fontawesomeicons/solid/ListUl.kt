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

public val SolidGroup.ListUl: ImageVector
    get() {
        if (_listUl != null) {
            return _listUl!!
        }
        _listUl = Builder(name = "ListUl", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                close()
                moveTo(48.0f, 208.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                close()
                moveTo(48.0f, 368.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 48.0f, 48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -48.0f, -48.0f)
                close()
                moveTo(496.0f, 384.0f)
                lineTo(176.0f, 384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(496.0f, 64.0f)
                lineTo(176.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(512.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
                moveTo(496.0f, 224.0f)
                lineTo(176.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(320.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _listUl!!
    }

private var _listUl: ImageVector? = null
