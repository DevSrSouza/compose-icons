package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Kanban: ImageVector
    get() {
        if (_kanban != null) {
            return _kanban!!
        }
        _kanban = Builder(name = "Kanban", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(88.0f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(102.0f, 158.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(18.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 50.0f)
                close()
                moveTo(210.0f, 114.0f)
                lineTo(166.0f, 114.0f)
                lineTo(166.0f, 62.0f)
                horizontalLineToRelative(44.0f)
                close()
                moveTo(90.0f, 62.0f)
                verticalLineToRelative(52.0f)
                lineTo(46.0f, 114.0f)
                lineTo(46.0f, 62.0f)
                close()
                moveTo(90.0f, 208.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 126.0f)
                lineTo(90.0f, 126.0f)
                close()
                moveTo(102.0f, 146.0f)
                lineTo(102.0f, 62.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(84.0f)
                close()
                moveTo(208.0f, 178.0f)
                lineTo(168.0f, 178.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(166.0f, 126.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(50.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.0f, 178.0f)
                close()
            }
        }
        .build()
        return _kanban!!
    }

private var _kanban: ImageVector? = null
