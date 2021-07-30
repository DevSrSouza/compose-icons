package compose.icons.lineaicons.basicelaboration

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.BasicElaborationGroup

public val BasicElaborationGroup.TodolistFlagged: ImageVector
    get() {
        if (_todolistFlagged != null) {
            return _todolistFlagged!!
        }
        _todolistFlagged = Builder(name = "TodolistFlagged", defaultWidth = 64.0.dp, defaultHeight =
                64.0.dp, viewportWidth = 64.0f, viewportHeight = 64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(23.0f, 8.0f)
                lineToRelative(-13.0f, 0.0f)
                lineToRelative(0.0f, 55.0f)
                lineToRelative(44.0f, 0.0f)
                lineToRelative(0.0f, -55.0f)
                lineToRelative(-13.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(36.0f, 5.0f)
                lineToRelative(0.0f, -4.0f)
                lineToRelative(-8.0f, 0.0f)
                lineToRelative(0.0f, 4.0f)
                lineToRelative(-4.0f, 0.0f)
                lineToRelative(-2.0f, 8.0f)
                lineToRelative(20.0f, 0.0f)
                lineToRelative(-2.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.0f, 23.0f)
                lineTo(27.0f, 46.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(27.0f, 26.0f)
                lineToRelative(15.0f, 0.0f)
                lineToRelative(-2.516f, 4.0f)
                lineToRelative(2.516f, 4.0f)
                lineToRelative(-15.0f, 0.0f)
            }
        }
        .build()
        return _todolistFlagged!!
    }

private var _todolistFlagged: ImageVector? = null
