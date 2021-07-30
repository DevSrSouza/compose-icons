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

public val SolidGroup.Pager: ImageVector
    get() {
        if (_pager != null) {
            return _pager!!
        }
        _pager = Builder(name = "Pager", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 64.0f)
                lineTo(64.0f, 64.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, 64.0f)
                verticalLineToRelative(256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, 64.0f)
                horizontalLineToRelative(384.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(512.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -64.0f, -64.0f)
                close()
                moveTo(160.0f, 368.0f)
                lineTo(80.0f, 368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(288.0f, 352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineToRelative(-80.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
                moveTo(448.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(96.0f, 256.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                verticalLineToRelative(-64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, -32.0f)
                horizontalLineToRelative(320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _pager!!
    }

private var _pager: ImageVector? = null
