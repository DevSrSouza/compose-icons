package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.MarkAsUnread: ImageVector
    get() {
        if (_markAsUnread != null) {
            return _markAsUnread!!
        }
        _markAsUnread = Builder(name = "MarkAsUnread", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.83f, 7.0f)
                horizontalLineToRelative(-2.6f)
                lineTo(10.5f, 4.0f)
                lineTo(4.0f, 7.4f)
                lineTo(4.0f, 17.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                lineTo(2.0f, 7.17f)
                curveToRelative(0.0f, -0.53f, 0.32f, -1.09f, 0.8f, -1.34f)
                lineTo(10.5f, 2.0f)
                lineToRelative(7.54f, 3.83f)
                curveToRelative(0.43f, 0.23f, 0.73f, 0.7f, 0.79f, 1.17f)
                close()
                moveTo(20.0f, 8.0f)
                lineTo(7.0f, 8.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(20.0f, 11.67f)
                lineTo(13.5f, 15.0f)
                lineTo(7.0f, 11.67f)
                lineTo(7.0f, 10.0f)
                lineToRelative(6.5f, 3.33f)
                lineTo(20.0f, 10.0f)
                verticalLineToRelative(1.67f)
                close()
            }
        }
        .build()
        return _markAsUnread!!
    }

private var _markAsUnread: ImageVector? = null
