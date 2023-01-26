package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.MarkAsUnread: ImageVector
    get() {
        if (_markAsUnread != null) {
            return _markAsUnread!!
        }
        _markAsUnread = Builder(name = "MarkAsUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.23f, 7.0f)
                lineToRelative(4.12f, 0.0f)
                lineToRelative(-9.85f, -5.0f)
                lineToRelative(-8.5f, 4.21f)
                lineToRelative(0.0f, 10.79f)
                lineToRelative(2.0f, 0.0f)
                lineToRelative(0.0f, -9.6f)
                lineToRelative(6.5f, -3.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 8.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(20.0f, 12.0f)
                lineToRelative(-6.5f, 3.33f)
                lineTo(7.0f, 12.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(6.5f, 3.33f)
                lineTo(20.0f, 10.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _markAsUnread!!
    }

private var _markAsUnread: ImageVector? = null
